/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.eunapolis.eda20152trabalho.modelo;

/**
 *
 * @author Aluno
 */
public class ItemCompra {
    
    private Produto produto;
    private Float quantidade;

    public ItemCompra(Produto produto, Float quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Double getTotalItemCompra(){
        throw new UnsupportedOperationException("Método ainda não implemntado");
    }

    @Override
    public String toString() {
        return "ItemCompra{" + "produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
