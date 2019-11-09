/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
 */
package com.mycompany.aplicacao;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Augusto
 */
public class Banco {

    Estoque tabela;
    Gson gson;

    // converte objetos Java para JSON
    String json;

    /**
     * @param estoque - Recebe o estoque
     */
    public Banco(Estoque estoque) {
        tabela = new Estoque();
        tabela = estoque;
        gson = new Gson();
        json = gson.toJson(tabela);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            //Apenas no windows, tem q mudar qnd for pro Linux
            FileWriter writer = new FileWriter("/ice/NetBeansProjects/Orientacao-a-Objetos/estoque.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public Estoque pegaArquivo() throws IOException {
        try {
            //Apenas no windows, tem q mudar qnd for pro Linux
            BufferedReader br = new BufferedReader(new FileReader("/ice/NetBeansProjects/Orientacao-a-Objetos/estoque.json"));

            tabela = gson.fromJson(br, Estoque.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tabela;
    }
}