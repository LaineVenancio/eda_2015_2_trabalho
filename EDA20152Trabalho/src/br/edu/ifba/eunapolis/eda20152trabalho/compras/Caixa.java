/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.eda20152trabalho.compras;

import br.edu.ifba.eunapolis.eda20152trabalho.modelo.Compra;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public interface Caixa {
    
    public void registrarCompra(Compra compra);
    public void exibirCompra(String CPF, Date data);
    public void exibirCompras(Date data);
    public void exibirCompras(String CPF);
    
}
