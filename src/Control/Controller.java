/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import Model.Boleto;
import Model.Conta;
import Model.Evento;
import DAO.BoletoDAO;
import DAO.ContaDAO;
import DAO.EventoDAO;
import java.text.DecimalFormat;

/**
 *
 * @author Leandro
 */
public class Controller {

    ContaDAO contaDAO = new ContaDAO();
    BoletoDAO boletoDAO = new BoletoDAO();
    EventoDAO eventoDAO = new EventoDAO();

    Conta contaLogada;
    Conta contaDestinataria;
    Boleto boleto;
    List<Evento> listaEventos;
    Evento evento;

    // Metodos GETS_________________________________________________________________________________________
    //======================================================================================================
    public String getSenha() {
        return this.contaLogada.getSenha();
    }

    public double getSaldo() {
        return this.contaLogada.getSaldo();
    }

    public String getNome() {
        return this.contaLogada.getUsuario().getNome();
    }

    public Boleto getBoleto() {
        return this.boleto;
    }

    // Uteis_________________________________________________________________________________________
    //======================================================================================================
    public Date zeraHora(Date data) {
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        data = c.getTime();
        return data;
    }

    public int diasEntre(Date dataAtual, Date data) {
        dataAtual = zeraHora(dataAtual);
        data = zeraHora(data);

        Calendar cA = Calendar.getInstance();
        cA.setTime(dataAtual);
        cA.set(Calendar.HOUR_OF_DAY, 0);
        cA.set(Calendar.MINUTE, 0);
        cA.set(Calendar.SECOND, 0);
        cA.set(Calendar.MILLISECOND, 0);

        Calendar c = Calendar.getInstance();
        c.setTime(data);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return (int) ((cA.getTimeInMillis() - c.getTimeInMillis()) / (1000 * 60 * 60 * 24));

    }

    // Validação Usuario_________________________________________________________________________________________
    //======================================================================================================
    public boolean existeContaLogin(String banco, String agencia, String cc) {
        Conta conta = this.contaDAO.buscaConta(banco, agencia, cc);
        if (conta != null) {
            this.contaLogada = conta;
            return true;

        }
        return false;
    }

    // Saque e Deposito_________________________________________________________________________________________
    //======================================================================================================
    public void efetuaDeposito(double valor) {
        this.contaLogada.setSaldo(this.contaLogada.getSaldo() + valor);
        this.contaDAO.atualiza(this.contaLogada);
        salvaDeposito(valor);
    }

    public boolean efetuaSaque(double valor) {
        if (this.contaLogada.getSaldo() >= valor) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - valor);
            this.contaDAO.atualiza(this.contaLogada);
            salvaSaque(valor);
            return true;
        } else {
            return false;
        }
    }

    // Transferencias_________________________________________________________________________________________
    //======================================================================================================
    public int existeContaECpf(String banco, String agencia, String cc, String cpf) {
        if (!this.contaLogada.getBanco().equals(banco) && !this.contaLogada.getAgencia().equals(agencia) && !this.contaLogada.getNumConta().equals(cc)) {
            Conta conta = this.contaDAO.buscaConta(banco, agencia, cc);
            if (conta != null) {
                if (conta.getUsuario().getCpf().equals(cpf)) {
                    this.contaDestinataria = conta;
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 2;
            }
        }
        return 3;
    }

    public boolean efetuaTransferencia(double valor) {
        if (this.contaLogada.getSaldo() >= valor) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - valor);
            this.contaDestinataria.setSaldo(this.contaDestinataria.getSaldo() + valor);
            this.contaDAO.atualiza(this.contaLogada);
            this.contaDAO.atualiza(this.contaDestinataria);
            salvaTransferencia(valor);
            return true;
        } else {
            return false;
        }
    }

    // Pagamentos_________________________________________________________________________________________
    //======================================================================================================
    public boolean existeBoleto(String codigo) {
        Boleto boleto = this.boletoDAO.buscaBoleto(codigo);
        if (boleto != null) {
            this.boleto = boleto;
            return true;
        } else {
            return false;
        }
    }

    public boolean efetuaPagamento() {
        if (this.contaLogada.getSaldo() >= this.boleto.getValor()) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - this.boleto.getValor());
            this.contaDestinataria = this.boleto.getConta();
            this.contaDestinataria.setSaldo(this.contaDestinataria.getSaldo() + this.boleto.getValor());
            this.contaDAO.atualiza(this.contaLogada);
            this.contaDAO.atualiza(this.contaDestinataria);
            salvaPagamento(this.boleto.getValor());
            return true;
        } else {
            return false;
        }
    }

    // Extrato_________________________________________________________________________________________
    //======================================================================================================
    public ArrayList<String> getListaEventos(int dias) {
        ArrayList<String> listaFinal = new ArrayList<String>();
        List<Evento> listaEventos = this.eventoDAO.buscaEventos(this.contaLogada);
        String string;
        Evento ev;
        Date data = calculaData(dias);
        for (int i = 0; i < listaEventos.size(); i++) {
            ev = listaEventos.get(i);
            if (ev.getData().after(data) || dias == 0) {
                if (ev.getId().contains("SA")) {
                    string = formataData(ev.getData()) + "  "
                            + ev.getId() + "  "
                            + "SAQUE";
                    for (int j = 0; j < 35; j++) {
                        string += " ";
                    }
                    string += "-" + String.valueOf(ev.getValor());
                    listaFinal.add(string);
                }
                if (ev.getId().contains("DE")) {
                    string = formataData(ev.getData()) + "  "
                            + ev.getId() + "  "
                            + "DEPOSITO";
                    for (int j = 0; j < 32; j++) {
                        string += " ";
                    }
                    string += "+" + String.valueOf(ev.getValor());
                    listaFinal.add(string);
                }
                if (ev.getId().contains("PA")) {
                    if (this.comparaContas(this.contaLogada, ev.getConta())) {
                        string = formataData(ev.getData()) + "  "
                                + ev.getId() + "  "
                                + "PAGAMENTO PARA:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getNumConta();
                        for (int j = 0; j < 10; j++) {
                            string += " ";
                        }
                        string += "-" + String.valueOf(ev.getValor());
                        listaFinal.add(string);
                    }
                    if (this.comparaContas(this.contaLogada, ev.getContaDestino())) {
                        string = formataData(ev.getData()) + "  "
                                + ev.getId() + "  "
                                + "PAGAMENTO DE:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getNumConta();
                        for (int j = 0; j < 12; j++) {
                            string += " ";
                        }
                        string += "+" + String.valueOf(ev.getValor());
                        listaFinal.add(string);
                    }
                }
                if (ev.getId().contains("TR")) {
                    if (this.comparaContas(this.contaLogada, ev.getConta())) {
                        string = formataData(ev.getData()) + "  "
                                + ev.getId() + "  "
                                + "TRANSFERENCIA PARA:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getNumConta();
                        for (int j = 0; j < 6; j++) {
                            string += " ";
                        }
                        string += "-" + String.valueOf(ev.getValor());
                        listaFinal.add(string);
                    }
                    if (this.comparaContas(this.contaLogada, ev.getContaDestino())) {
                        string = formataData(ev.getData()) + "  "
                                + ev.getId() + "  "
                                + "TRANSFERENCIA DE:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getNumConta();
                        for (int j = 0; j < 8; j++) {
                            string += " ";
                        }
                        string += "+" + String.valueOf(ev.getValor());
                        listaFinal.add(string);
                    }
                }
            }
        }
        return listaFinal;
    }
    //dd/mm/aaaaxxSA12345678xxTransferenciaxPara:001/0001/000001xxxxxx-100000,00
    //       10|           24|                                     40|       50|

    private String formataData(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
    
    private String formataData2(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
        return sdf.format(data);
    }

    private boolean comparaContas(Conta conta1, Conta conta2) {
        if (conta1.getBanco().equals(conta2.getBanco())) {
            if (conta1.getAgencia().equals(conta2.getAgencia())) {
                if (conta1.getNumConta().equals(conta2.getNumConta())) {
                    return true;
                }
            }
        }
        return false;
    }

    // Eventos_________________________________________________________________________________________
    //======================================================================================================
    private void salvaSaque(double valor) {
        String id = "SA" + geraRandom();
        while (this.eventoDAO.buscaEvento(id) != null) {
            id = "SA" + geraRandom();
        }
        Date data = new Date();
        data = zeraHora(data);
        Evento ev = new Evento(id, this.contaLogada, null, valor, data);
        this.eventoDAO.salvar(ev);

    }

    private void salvaDeposito(double valor) {
        String id = "DE" + geraRandom();
        while (this.eventoDAO.buscaEvento(id) != null) {
            id = "DE" + geraRandom();
        }
        Date data = new Date();
        data = zeraHora(data);
        Evento ev = new Evento(id, this.contaLogada, null, valor, data);
        this.eventoDAO.salvar(ev);
    }

    private void salvaPagamento(double valor) {
        String id = "PA" + geraRandom();
        while (this.eventoDAO.buscaEvento(id) != null) {
            id = "PA" + geraRandom();
        }
        Date data = new Date();
        data = zeraHora(data);
        Evento ev = new Evento(id, this.contaLogada, this.contaDestinataria, valor, data);
        this.eventoDAO.salvar(ev);
    }

    private void salvaTransferencia(double valor) {
        String id = "TR" + geraRandom();
        while (this.eventoDAO.buscaEvento(id) != null) {
            id = "TR" + geraRandom();
        }
        Date data = new Date();
        data = zeraHora(data);
        Evento ev = new Evento(id, this.contaLogada, this.contaDestinataria, valor, data);
        this.eventoDAO.salvar(ev);
    }

    private String geraRandom() {
        Random r = new Random();
        return String.format("%08d", r.nextInt(99999999));

    }

    private Date calculaData(int dias) {
        Date dataHoje = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataHoje);
        cal.add(Calendar.DATE, -dias);
        return cal.getTime();
    }
    
    
    // ENCONTRA TODOS OS DEPOSITOS FEITO NA POUPANCA
    public ArrayList<String> depositosP() {
        
        ArrayList<String> listaFinal = new ArrayList<String>();
        int indice = 0;
        //listaFinal.add("");
        List<Evento> listaEventos = this.eventoDAO.buscaEventos(this.contaLogada);
        String string="";
        Evento ev;
        //Date data = calculaData(dias);
        
        boolean continua = true;
        
        for (int k = 0; k < listaEventos.size(); k++) {
            int i = k-1;
            while(continua){
                i++;
                if(i>=listaEventos.size()){
                    continua = false;
                }else{
                ev = listaEventos.get(i);
                    if (ev.getId().contains("DP")) {
                        string = formataData2(ev.getData());
                                //+ ev.getId() + "  "
                                //+ "DEPOSITO";
                        /*for (int j = 0; j < 32; j++) {
                            string += " ";
                        }*/
                        string +=String.valueOf(ev.getValor());
                        listaFinal.add(indice, string);
                        indice++;
                        
                    }
                }                
            }
        }
        return listaFinal;
    }
    
    // CALCULA OS RENDIMENTOS DE CADA DEPOSITO NA POUPANCA ATE O MOMENTO
    public ArrayList<Double> calculoP(){
        
        
        List<String> datas = depositosP();
        int qtd = 0;
        
        ArrayList<Double> rendimentos = new ArrayList<Double>();
        rendimentos.add(0, 0.0);
        int indice = 0;
        int total=0;
        
        Date dataHoje = new Date(System.currentTimeMillis());
        int mes = dataHoje.getMonth();
        int ano = dataHoje.getYear();
        
        for (int i = 0 ; i<datas.size();i++){
            //System.out.println(datas.get(i));
            int mesA = Integer.parseInt(datas.get(i).substring(0, 2));
            int diaA = Integer.parseInt(datas.get(i).substring(2, 4));  
            int mesB = Integer.parseInt(formataData2(dataHoje).substring(0, 2));
            // PARA TESTAR:
            //mesB = 06;  
            int diaB = Integer.parseInt(formataData2(dataHoje).substring(2, 4));  
            
            double n = Double.parseDouble(datas.get(i).substring(4));
            System.out.println("VALORE DEPOSITADO NO DIA "+diaA+"/"+mesA+"/2016: R$"+n);
            //System.out.println(n);
            total +=n;
            
            if(mesB-mesA >0){
                qtd = mesB-mesA-1;
                if(diaB>diaA){
                    qtd++;                   
                }
                n = calculaJuros(n,qtd);
                
                rendimentos.add(indice, n);
                indice++;
            }
            
        }
        System.out.println("TOTAL DEPOSITADO NA POUPANCA: R$"+total);
        return rendimentos;
    }
    
    // RETORNA VALORES DO RENDIMENTO DE CADA DEPOSITO ATE O MOMENTO
    public void mostrarP(){
        
        List<Double> v = calculoP();
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        for(int i = 0;i<v.size();i++)
            System.out.println(df.format(v.get(i)));
        
    }
    
    public void totalP(){
        List<Double> v = calculoP();
        DecimalFormat df = new DecimalFormat("###,##0.00");
        double total = 0;
        
        for(int i = 0;i<v.size();i++){            
            total += v.get(i);   
        }
        
        System.out.println("TOTAL POUPADO COM OS JUROS ATE O MOMENTO: R$"+ df.format(total));
        //System.out.println(df.format(total));
    }

    // CALCULA JUROS DA POUPANCA
    private double calculaJuros(double n, int qtd) {
        
        double a  = n;
        for(int i = 0;i<qtd;i++){
            a = a*1.06;
        }
        return a;
    
    }

}
