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

    public Produto(String nome, int quantidade, float valor, String fornecedor) {
        this.nome = nome;
        this.id = 0;
        this.quantidade = quantidade;
        this.preco = valor;
        this.fornecedor = fornecedor;
    }

    public Produto() {
        this.nome = new String();
        this.id = null;
        this.quantidade = null;
        this.preco = null;
        this.fornecedor = new String();
    }

    public Integer getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int qtd) {
        this.quantidade = qtd;
    }

    public Float getValor() {
        return preco;
    }

    public void setValor(float val) {
        this.preco = val;
    }
    public String getFornecedor(){
        return fornecedor;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }

}
