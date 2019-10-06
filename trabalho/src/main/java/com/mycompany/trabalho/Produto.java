/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho;

/**
 *
 * @author icout
 */
public class Produto {
    private String nome;
    private Integer id;
    private Integer quantidade;
    private Float valor;
    
    Produto(String nome, int id, int quantidade, float valor){
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    Produto(){
        this.nome = new String();
        this.id = null;
        this.quantidade = null;
        this.valor = null; 
    }
    Integer getId(){
        return id;
    }
    
    String getNome(){
        return nome;
    }
    
    Integer getQuantidade(){
        return quantidade;
    }
    
    Float getValor(){
        return valor;
    }
}
