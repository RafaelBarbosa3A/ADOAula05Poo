/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoaula05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.text.DateFormatter;

/**
 *
 * @author rafael
 */
public class Main {
    static LinkedList<Produto> lista = new LinkedList();
    

    public static void main(String[] args) {
        Produto novo = new Produto("danone", 99, 1.65, 1.78, "09 / 11 / 2017");
        Produto novo1 = new Produto("yakult", 98, 1.65, 1.78, "11 / 11 / 2017");
        Produto novo2 = new Produto("lampada", 97, 1.65, 1.78, "indeterminada");
        Produto novo3 = new Produto("chuveiro", 96, 1.65, 1.78, "indeterminada");
        Produto novo4 = new Produto("arroz", 95, 1.65, 1.78, "25 / 04 / 2018");
        Produto novo5 = new Produto("lasanha", 94, 1.65, 1.78, "25 / 05 / 2018");
        Produto novo6 = new Produto("pernil", 93, 1.65, 1.78, "25 / 06 / 2018");
        Produto novo7 = new Produto("carne", 92, 1.65, 1.78, "25 / 07 / 2018");
        Produto novo8 = new Produto("flores", 91, 1.65, 1.78, "indeterminada");
        Produto novo9 = new Produto("pneu", 90, 1.65, 1.78, "indeterminada");

        
        lista.add(novo);
        lista.add(novo1);
        lista.add(novo2);
        lista.add(novo3);
        lista.add(novo4);
        lista.add(novo5);
        lista.add(novo6);
        lista.add(novo7);
        lista.add(novo8);
        lista.add(novo9);
        
        for (Produto p : lista){
            
            System.out.print("\nnome " + p.getNome() + "; metro " + p.getMetro() + "; peso " 
                    + p.getPeso() + "; quantidade " + p.getQtdade() + "; validade " + p.getValidade());
            System.out.println("");
        }
        
        System.out.println(novo.alertaVencimento());
        
        
    }
    

}
