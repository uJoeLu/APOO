import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    @Override
    public void cadastrarCliente(Cliente cliente) {
        List<Cliente>  lista = DAOFactory.getClientesDAO().listarTodos();
    }

    @Override
    public List<Cliente> listagemDeClientes() {
        return Cliente.getClientes();
    }

    @Override
    public void excluirCliente(String cpf) {
        List<Cliente> clientes = Cliente.getClientes();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf() == cpf) {
                clientes.remove(i);
                break;
            }
        }
    }

    @Override
    public void alterarDadosDoCliente(Cliente clienteAlterado) {
        String cpfAntigo = clienteAlterado.getCpf();
        List<Cliente> clientes = Cliente.getClientes();
        boolean encontrou = false;
        for (Cliente cli : clientes) {
            if (cli.getCpf().equals(cpfAntigo)) {
                int posicao = clientes.indexOf(cli);
                clientes.set(posicao, clienteAlterado);
                encontrou = true;
            }
        }
    }

}
