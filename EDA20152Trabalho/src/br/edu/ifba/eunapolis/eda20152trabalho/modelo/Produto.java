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
public class Produto {
    
    private Integer codigo;
    private String nome;
    private Float valor;

    public Produto(Integer codigo, String nome, Float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + '}';
    }
    
    
    
    
}
