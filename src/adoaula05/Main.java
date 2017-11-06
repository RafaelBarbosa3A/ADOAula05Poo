/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoaula05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rafael
 */
public class Main extends Produto{

    public Main(String nome, int qtdade, double metro, double peso, Date fabricacao) {
        super(nome, qtdade, metro, peso, fabricacao);
        
    }
    public static void main(String[] args) {
        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Produto novo = new Produto(nome, qtdade, metro, peso, validade);
        //System.out.println(formatter.format(novo.getFabricacao()));
        System.out.println(formatter.format(novo.getValidade()));
    }

}
