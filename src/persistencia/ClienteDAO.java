import java.util.List;

public interface ClienteDAO {

    public void cadastrarCliente(Cliente cliente);

    public List<Cliente> listagemDeClientes();

    public void excluirCliente(String cpf);

    public void alterarDadosDoCliente(Cliente clienteAlterado);

}
