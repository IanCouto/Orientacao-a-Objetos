/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
*/

/**
 *
 * @author Gam3MasAlvaro
 */

package Clientes;
import java.util.ArrayList;
import java.util.Objects;
public class Clientes {
    private ArrayList<Cliente> clientes;
    private ArrayList<Cliente> lixo;

    public Clientes() {
        this.clientes = new ArrayList();
        this.lixo = new ArrayList();
    }

    public void adicionaCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public Cliente getCliente (int indice){
        return clientes.get(indice);
    }
    public void removeClienteNome(String nome){
        for(int i = 0; i < clientes.size(); i++ ){
            if(clientes.get(i).getNome().equals(nome)){
                lixo.add(clientes.get(i));
                clientes.remove(i);
            }
        }
    }

    /**
     *
     * @param cpf
     */
    public void removeClienteCPF(Integer cpf){
        for(int i = 0; i < clientes.size(); i++ ){
            if(Objects.equals(clientes.get(i).getCPF(), cpf)){
                lixo.add(clientes.get(i));
                clientes.remove(i);
            }
        }
    }
    
    public void limpaLixo(){
        lixo.clear();
    }
    
    public void limpaClientes(){
        for (int i = 0; i < clientes.size(); i++) {
            lixo.add(getCliente(i));
        }
        clientes.clear();
    }
    
    public void recuperaLixo(){
        clientes.clear();
        for (int i = 0; i < lixo.size(); i++) {
            clientes.add(lixo.get(i));
        }
    }
    
    public ArrayList<Cliente> listaClientes(){
        return clientes;
    }
    
}
