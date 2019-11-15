/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacao;

/**
 *
 * @author Augusto
 */
public abstract class Pessoa {
    protected String nome;
    protected Integer cpf;
    protected String logradouro;
    protected String bairro;
    protected String cidade;
    protected Integer numero;
    protected String complemento;
    protected Integer telefone;
    protected Integer compras; //indica o número de compras já realizadas por aquele cliente ou pelo usuário com aquele fornecedor
    /**
     * 
     * @param <T> - tipo genérico para inserção de informações diferentes
     * @param nom - nome da pessoa
     * @param t - id ou razão social
     * @param cp - cpf ou cnpj da pessoa
     * @param log - logradouro (Rua, Avenida, Sítio...) casa/prédio da pessoa
     * @param bai - bairro da casa/prédio da pessoa
     * @param cid - cidade da casa/prédio da pessoa
     * @param num - número da casa/prédio da pessoa
     * @param com - complemento (apartamento, casa, bloco, km...) da casa/prédio da pessoa
     * @param tel - telefone celular da pessoa
     */
    public abstract <T> void insereDados(String nom, T t, Integer cp, String log, String bai, String cid, Integer num, String com, Integer tel);
    /**
     * 
     * @param nom - nome da pessoa
     * @param cp - cpf ou cnpj da pessoa
     * @param log - logradouro (Rua, Avenida, Sítio...) casa/prédio da pessoa
     * @param bai - bairro da casa/prédio da pessoa
     * @param cid - cidade da casa/prédio da pessoa
     * @param num - número da casa/prédio da pessoa
     * @param com - complemento (apartamento, casa, bloco, km...) da casa/prédio da pessoa
     * @param tel  - telefone celular da pessoa
     */
    public abstract void alteraDados(String nom, Integer cp, String log, String bai, String cid, Integer num, String com, Integer tel);
    
    public abstract String getNome();
    public abstract Integer getCpf();
    public abstract String getLogradouro();
    public abstract String getBairro();
    public abstract String getCidade();
    public abstract Integer getNumero();
    public abstract String getComplemento();
    public abstract Integer getTelefone();
    public abstract Integer getCompras();
    
}
