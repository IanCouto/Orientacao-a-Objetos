/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
*/
package com.mycompany.trabalho;
import java.util.ArrayList;
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
    void removeProdutoQuantidade(Integer quantidade){
        for(int i = 0; i < produtos.size(); i++ ){
            if(produtos.get(i).getQuantidade() == quantidade){
                lixo.add(produtos.get(i));
                produtos.remove(i);
            }
        }
    }
    
    void limpaLixo(){
        lixo.clear();
    }
}
