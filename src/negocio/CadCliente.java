import java.util.List;

public class CadCliente<T extends Cliente> {
    private static CadCliente<?> instancia;
    private IClienteDAO<T> clienteDAO;
    
    private CadCliente() {
        clienteDAO = new ClienteDAO<>();
    }

    @SuppressWarnings("unchecked")
    public static <T extends Cliente> CadCliente<T> getInstancia() {
        if (instancia == null) {
            instancia = new CadCliente<>();
        }
        return (CadCliente<T>) instancia;
    }

    // Métodos CRUD
    public void cadastrarCliente(T cliente) throws Exception {
        try {
            clienteDAO.cadastrarCliente(cliente);
        } catch (Exception e) {
            throw new Exception("Erro ao cadastrar o cliente: " + e.getMessage());
        }
    }

    public List<T> getListaDeClientes() throws ClassNotFoundException {
        return clienteDAO.getListaDeClientes();
    }

    public void alterarDadosDoCliente(String nome, String cpf, int idade, String email) throws Exception {
        @SuppressWarnings("unchecked")
        T clienteAlterado = (T) new Cliente(nome, cpf, idade, email);
        clienteDAO.alterarDadosDoCliente(clienteAlterado);
    }

    public void excluirCliente(String cpf) throws Exception {
        clienteDAO.excluirCliente(cpf);
    }
}