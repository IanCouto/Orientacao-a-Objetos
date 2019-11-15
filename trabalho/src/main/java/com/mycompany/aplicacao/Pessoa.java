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
    String nome;
    Integer cpf;
    String logradouro;
    String bairro;
    String cidade;
    Integer numero;
    String complemento;
    Integer telefone;
    Integer compras; //indica o número de compras já realizadas por aquele cliente
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
    
}
