/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoaula05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author rafael
 */
public class Produto implements Metodos {

    String nome;
    int qtdade;
    double metro, peso;
    String validade;

    public Produto(String nome, int qtdade, double metro, double peso,
            String validade) {
        this.nome = nome;
        this.qtdade = qtdade;
        this.metro = metro;
        this.peso = peso;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdade() {
        return qtdade;
    }

    public void setQtdade(int qtdade) {
        this.qtdade = qtdade;
    }

    public double getMetro() {
        return metro;
    }

    public void setMetro(double metro) {
        this.metro = metro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(int dia, int mes, int ano) {
        this.validade = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
    }

    static GregorianCalendar dataAtual = new GregorianCalendar();
    //static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    //static Date dt = new Date();

    @Override
    public boolean verificarVencido() {

        if (dataFormatada.toString().equalsIgnoreCase(this.validade)) {
            System.out.println("produto vencido");
        }
        return false;
    }

    @Override
    public boolean alertaVencimento() {
        GregorianCalendar dia = new GregorianCalendar();
        int dataFutura = dia.get(GregorianCalendar.DAY_OF_MONTH) + 7;
        
        if (this.validade.equalsIgnoreCase(dataFutura) || this.validade.equalsIgnoreCase(dataAtual)){
            System.out.println("produto vencerá em até 7 dias");
        }
        
        return false;
    }

}
