/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacao;

import java.util.ArrayList;

/**
 *
 * @author Augusto
 */
public class Cliente {
    private String nome;
    private Integer cpf;
    private String logradouro;
    private String bairro;
    private String cidade;
    private Integer numero;
    private String complemento;
    private Integer telefone;
    private Integer compras; //indica o número de compras já realizadas por aquele cliente
    
    public Cliente(){
        nome = new String();
        logradouro = new String();
        bairro = new String();
        cidade = new String();
        complemento = new String();
    }
    
    //Geters
    public String getNome(){
        return nome;
    }
    public Integer getCpf(){
        return cpf;
    }
    public String getLogradouro(){
        return logradouro;
    }
    public String getBairro(){
        return bairro;
    }
    public Integer getNumero(){
        return numero;
    }
    public String getComplemento(){
        return complemento;
    }
    public Integer getTelefone(){
        return telefone;
    }
    public Integer getCompras(){
        return compras;
    }
    
    //Seters
    /**
     * 
     * @param n - nome do cliente
     */
    public void setNome(String n){
        nome = n;
    }
    /**
     * 
     * @param c - cpf do cliente
     */
    public void setCpf(Integer c){
        cpf = c;
    }
    /**
     * 
     * @param l - Logradouro da casa/prédio do cliente (rua, avenida, estrada...)
     */
    public void setLogradouro(String l){
        logradouro = l;
    }
    /**
     * 
     * @param b - bairro da casa/prédio do cliente
     */
    public void setBairro(String b){
        bairro = b;
    }
    /**
     * 
     * @param c - cidade do cliente
     */
    public void setCidade(String c){
        cidade = c;
    }
    /**
     * 
     * @param n - numero da casa/prédio do cliente
     */
    public void setNumero(Integer n){
        numero = n;
    }
    /**
     * 
     * @param c - complento da casa do cliente(apartamento, casa, sitio...)
     */
    public void setComplemento(String c){
        complemento = c;
    }
    /**
     * 
     * @param t - telefone celular do cliente
     */
    public void setTelefone(Integer t){
        telefone = t;
    }
    
    public class RegistroClientes extends Cliente{
        private ArrayList<Cliente> clientes;
    }
}
