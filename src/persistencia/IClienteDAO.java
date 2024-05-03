import java.util.List;

public interface IClienteDAO {

    public void cadastrarCliente(Cliente cliente);

    public List<Cliente> getListaDeClientes();

    public void excluirCliente(String cpf);

    public void alterarDadosDoCliente(Cliente clienteAlterado);

}
