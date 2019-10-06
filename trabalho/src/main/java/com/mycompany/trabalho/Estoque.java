/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho;
import java.util.ArrayList;

/**
 *
 * @author icout
 */
public class Estoque {
    private ArrayList<Produto> produtos;
    private ArrayList<Produto> lixo;
    Estoque(Produto produto){
        this.produtos = new ArrayList();
    }
    
    void adicionaProduto(Produto produto){
        produtos.add(produto);
    }
    void removeProdutoNome(String nome){
        for(int i = 0; i < produtos.size(); i++ ){
            if(produtos.get(i).getNome().equals(nome)){
                lixo.add(produtos.get(i));
                produtos.remove(i);
            }
        }
    }
    void removeProdutoId(Integer id){
        for(int i = 0; i < produtos.size(); i++ ){
            if(produtos.get(i).getId() == id){
                lixo.add(produtos.get(i));
                produtos.remove(i);
            }
        }
    }
    
    void limpaLixo(){
        lixo.clear();
    }
}
