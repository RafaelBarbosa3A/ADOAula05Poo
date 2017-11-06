/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoaula05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author rafael
 */
public class Produto {

    static String nome;
    static int qtdade;
    static double metro, peso;
    static Date validade = new Date();
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    

    public Produto(String nome, int qtdade, double metro, double peso, Date validade) {
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date fabricacao) {
        this.validade = fabricacao;
    }

}
