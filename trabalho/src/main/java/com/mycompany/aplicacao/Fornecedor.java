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
public class Fornecedor extends Pessoa{
    String razao;

    /**
     * 
     * @param <T> - tipo genérico
     * @param nom - nome fantasia do fornecedor
     * @param raz - razão social
     * @param cp - cnpj do fornecedor
     * @param log - logradouro (Rua, Avenida, Sítio...) da casa/prédio do fornecedor
     * @param bai - bairro da casa/prédio do fonecedor
     * @param cid - cidade da casa/prédio do forcedor
     * @param num - número da casa/prédio do fornecedor
     * @param com - complemento (apartamento, casa, bloco, km...) da casa/prédio do forcedor
     * @param tel - telefone celular da pessoa
     */
    @Override
    public <T> void insereDados(String nom, T raz, Integer cp, String log, String bai, String cid, Integer num, String com, Integer tel) {
        nome = nom;
        razao = (String) raz;
        cpf = cp;
        logradouro = log;
        bairro = bai;
        cidade = cid;
        numero = num;
        complemento = com;
        telefone = tel;
        
    }
    /**
     * 
     * @param nom - nome do fornecedor
     * @param cp - cnpj do fornecedor
     * @param log - logradouro (Rua, Avenida, Sítio...) da casa/prédio do fornecedor
     * @param bai - bairro da casa/prédio do fonecedor
     * @param cid - cidade da casa/prédio do forcedor
     * @param num - número da casa/prédio do fornecedor
     * @param com - complemento (apartamento, casa, bloco, km...) da casa/prédio do forcedor
     * @param tel - telefone celular da pessoa
     */
    @Override
    public void alteraDados(String nom, Integer cp, String log, String bai, String cid, Integer num, String com, Integer tel) {
        nome = nom;
        cpf = cp;
        logradouro = log;
        bairro = bai;
        cidade = cid;
        numero = num;
        complemento = com;
        telefone = tel;
    }
    
}
