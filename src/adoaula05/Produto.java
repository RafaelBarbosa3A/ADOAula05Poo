/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoaula05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author rafael
 */
public class Produto {

    static String nome;
    int qtdade;
    double metro, peso;
    static String fabricacao;
    //System.out.println(data.get(data.DAY_OF_MONTH)+" / "+(data.get(data.MONTH)+1)+" / "+data.get(data.YEAR));

    public Produto(String nome, int qtdade, double metro, double peso, String fabricacao) {
        this.nome = nome;
        this.qtdade = qtdade;
        this.metro = metro;
        this.peso = peso;
        this.fabricacao = fabricacao;
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

    public String getFabricacao() {
        return fabricacao;
    }

    public void setValidade(String fabricacao) {
        int dia = GregorianCalendar.DAY_OF_MONTH;
        int mes = ((GregorianCalendar.MONTH) + 1);
        int ano = GregorianCalendar.YEAR;
        this.fabricacao = dia + " / " + mes + " / " + ano;
    }
    
    


}
