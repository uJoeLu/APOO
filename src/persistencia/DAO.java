import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteDAO<T extends Cliente> implements IClienteDAO<T> {
    private List<T> listaDeClientes;

    public ClienteDAO() {
        this.listaDeClientes = new ArrayList<>();
    }

    @Override
    public void alterarDadosDoCliente(T clienteAlterado) {
        // ALTERAR DADOS DO CLIENTE ATRAVEIS DO CPF CADASTRADO
        for (T cliente : getListaDeClientes()) {
            if (cliente.getCpf().equalsIgnoreCase(clienteAlterado.getCpf())) {
                int indice = listaDeClientes.indexOf(cliente);
                listaDeClientes.set(indice, clienteAlterado);
                break;
            }
        }
    }

    @Override
    public void cadastrarCliente(T cliente) {
        listaDeClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    @Override
    public void excluirCliente(String cpf) {
        for (T cliente : getListaDeClientes()) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                int indice = listaDeClientes.indexOf(cliente);
                listaDeClientes.remove(indice);
                break;
            }
        }
    }

    @Override
    public List<T> getListaDeClientes() {

        return listaDeClientes.stream()
                .sorted((c1, c2) -> c1.getNome().compareTo(c2.getNome()))
                .collect(Collectors.toList());
    }
}
