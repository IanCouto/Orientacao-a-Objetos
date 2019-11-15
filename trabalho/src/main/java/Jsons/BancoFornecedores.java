/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jsons;

import com.google.gson.Gson;
import com.mycompany.aplicacao.Cliente;
import com.mycompany.aplicacao.Fornecedor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Augusto
 */
public class BancoFornecedores {
    private ArrayList<Fornecedor> listaFornecedores;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     *
     * @param c - Lista de clientes
     */
    public BancoFornecedores(ArrayList<Fornecedor> f) {
        listaFornecedores = new ArrayList<>();
        listaFornecedores = f;
        gson = new Gson();

        json = gson.toJson(listaFornecedores);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            //Apenas no windows, tem q mudar qnd for pro Linux
            FileWriter writer = new FileWriter("clientes.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return tabela - retona o estoque que foi traduzido para Java
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public ArrayList pegaArquivo() throws IOException {
        try {
            //Apenas no windows, tem q mudar qnd for pro Linux
            BufferedReader br = new BufferedReader(new FileReader("estoque.json"));

            listaFornecedores = gson.fromJson(br, ArrayList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaFornecedores;
    }
}
