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
public class Cliente extends Pessoa{
    
    Integer id;
    
    /**
     * 
     * @param nom - nome do cliente
     * @param i - numero de identificação do cliente
     * @param cp - cpf do cliente
     * @param log - logradouro (Rua, Avenida, Sítio...) da casa/prédio do cliente
     * @param bai - bairro da casa/prédio do cliente
     * @param cid - cidade da casa/prédio do cliente
     * @param num - número da casa/prédio do cliente
     * @param com - complemento (apartamento, casa, bloco, km...) da casa/prédio do cliente
     * @param tel - telefone celular da cliente
     */
    @Override
    public <T> void insereDados(String nom, T i, Integer cp, String log, String bai, String cid, Integer num, String com, Integer tel){
        nome = nom;
        id = (Integer) i;
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
     * @param nom - nome do cliente
     * @param cp - cpf do cliente
     * @param log - logradouro (Rua, Avenida, Sítio...) da casa/prédio do cliente
     * @param bai - bairro da casa/prédio do cliente
     * @param cid - cidade da casa/prédio do cliente
     * @param num - número da casa/prédio do cliente
     * @param com - complemento (apartamento, casa, bloco, km...) da casa/prédio do cliente
     * @param tel - telefone celular da cliente
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
