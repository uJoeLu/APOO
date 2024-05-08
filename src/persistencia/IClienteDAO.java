import java.util.List;

public interface IClienteDAO<T> {

    public void cadastrarCliente(T cliente);

    public List<T> getListaDeClientes();

    public void excluirCliente(String cpf);

    public void alterarDadosDoCliente(T clienteAlterado);

}
