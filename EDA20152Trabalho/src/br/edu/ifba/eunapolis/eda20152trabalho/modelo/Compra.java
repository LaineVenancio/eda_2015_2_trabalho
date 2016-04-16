/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.eda20152trabalho.modelo;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Compra {

    private String nome;
    private String CPF;
    private Date dataCompra;

    public Compra(String nome, String CPF, Date dataCompra) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataCompra = dataCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    public Double getTotalCompra(){
        throw new UnsupportedOperationException("Método ainda não implemntado");
    }
    
    public void addItemCompra(ItemCompra itemCompra){
        throw new UnsupportedOperationException("Método ainda não implemntado");
    }

}
