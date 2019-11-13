/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
*/
package Clientes;

/**
 *
 * @author Gam3MasAlvaro
 */
public class Cliente {
    

    private String nome;
    private Integer id = 0;
    private Integer cpf;


    public Cliente(String nome, int cpf, Integer id) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;

    }

    public Cliente() {
        this.nome = new String();
        this.id = 0;
        this.cpf = null;

    }

    public Integer getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public Integer getCPF() {
        return cpf;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    
    }
