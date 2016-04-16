/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.eda20152trabalho;

import br.edu.ifba.eunapolis.eda20152trabalho.compras.Caixa;
import br.edu.ifba.eunapolis.eda20152trabalho.compras.CaixaImpl;
import br.edu.ifba.eunapolis.eda20152trabalho.modelo.Compra;
import br.edu.ifba.eunapolis.eda20152trabalho.modelo.ItemCompra;
import br.edu.ifba.eunapolis.eda20152trabalho.modelo.Produto;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caixa caixa = new CaixaImpl();
        
        Calendar data = GregorianCalendar.getInstance();
        data.set(GregorianCalendar.YEAR, 2016);
        data.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY);
        data.set(GregorianCalendar.DAY_OF_MONTH, 1);
        for (int q = 0; q < 5; q++) {
            for (int i = 0; i < 1000; i++) {
                if(i % 20 == 0){
                    data.add(GregorianCalendar.DAY_OF_MONTH, 1);
                }
                
                Compra compra = new Compra("Clinte "+i, String.format("%011d", i), data.getTime());
                
                for (int j = 0; j < ((Math.random() * 100) % 100) +1 ; j++) {
                   compra.addItemCompra(new ItemCompra(new Produto(1, "Produto A", new Float(Math.random() * 3)), new Float(((Math.random() * 5) % 10)+1)));
                }
                caixa.registrarCompra(compra);
            }
        }
        String CPF = String.format("%011d", 15);
        data.set(GregorianCalendar.YEAR, 2016);
        data.set(GregorianCalendar.MONTH, GregorianCalendar.MARCH);
        data.set(GregorianCalendar.DAY_OF_MONTH, 1);

        caixa.exibirCompra(CPF, data.getTime());
        caixa.exibirCompras(data.getTime());
        caixa.exibirCompras(CPF);
        
    }
    
}
