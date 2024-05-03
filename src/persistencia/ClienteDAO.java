import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {
    private List<Cliente> listaDeClientes;
    
    public ClienteDAO(){
        this.listaDeClientes = new ArrayList<>();
    }

    @Override
    public void alterarDadosDoCliente(Cliente clienteAlterado) {
        // ALTERAR DADOS DO CLIENTE ATRAVEIS DO CPF CADASTRADO
        for (Cliente cliente : getListaDeClientes()) {
            if (cliente.getCpf().equalsIgnoreCase(clienteAlterado.getCpf())) {
                int indice = listaDeClientes.indexOf(cliente);
                listaDeClientes.set(indice, clienteAlterado);
                break;
            }
        }
    }

    @Override
    public void cadastrarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);

    }

    @Override
    public void excluirCliente(String cpf) {
        for (Cliente cliente : getListaDeClientes()) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                int indice = listaDeClientes.indexOf(cliente);
                listaDeClientes.remove(indice);
                break;
            }
        }
    }

    @Override
    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

}
