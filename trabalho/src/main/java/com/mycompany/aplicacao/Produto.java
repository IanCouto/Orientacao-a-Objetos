/*
 Álvaro Domingues de Freitas     Matrícula: 201876007
 Arthur Rodrigues Fernandes      Matrícula: 201835005
 Augusto Castilho Medeiros       Matrícula: 201876044
 Ian Couto de Paula		 Matrícula: 201876002
 Matheus Henrique Rubio		 Matrícula: 201876036
 */
package com.mycompany.aplicacao;

public class Produto{

    private String nome;
    private Integer id;
    private Integer quantidade;
    private Float preco;
    private String fornecedor;

    Produto(String nome, int id, int quantidade, float valor, String fornecedor) {
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = valor;
        this.fornecedor = fornecedor;
    }

    Produto() {
        this.nome = new String();
        this.id = null;
        this.quantidade = null;
        this.preco = null;
        this.fornecedor = new String();
    }

    Integer getId() {
        return id;
    }

    void setId(int newId) {
        this.id = newId;
    }

    String getNome() {
        return nome;
    }

    void setNome(String newNome) {
        this.nome = newNome;
    }

    Integer getQuantidade() {
        return quantidade;
    }

    void setQuantidade(int qtd) {
        this.quantidade = qtd;
    }

    Float getValor() {
        return preco;
    }

    void setValor(float val) {
        this.preco = val;
    }
    String getFornecedor(){
        return fornecedor;
    }
    void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    
}
