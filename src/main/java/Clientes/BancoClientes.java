/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
 */
package Clientes;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Gam3MasAlvaro
 */
public class BancoClientes {

    Clientes tabelaClientes;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     * @param estoque - Recebe o estoque
     */
    public BancoClientes(Clientes clientes) {
        tabelaClientes = new Clientes();
        tabelaClientes = clientes;
        gson = new Gson();
        json = gson.toJson(tabelaClientes);
    }
    
    /**
     * @throws IOException -
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
     * @return tabelaClientes - retona o estoque que foi traduzido para Java
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public Clientes pegaArquivo() throws IOException {
        try {
            //Apenas no windows, tem q mudar qnd for pro Linux
            BufferedReader br = new BufferedReader(new FileReader("clientes.json"));

            tabelaClientes = gson.fromJson(br, Clientes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tabelaClientes;
    }
}
