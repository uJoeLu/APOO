import java.util.List;

public class CadCliente {
    
    private static CadCliente instancia;
    private ClienteDAO clienteDAO;

    private CadCliente(){
        clienteDAO = new ClienteDAOImpl();
    }
    public static CadCliente getInstacia(){
        if(instancia == null){
            instancia = new CadCliente();
        }
        return instancia;
    }
    //metodos CRUD
    public void cadastrarCliente (Cliente cliente) throws Exception{
        try{
           clienteDAO.cadastrarCliente(cliente);  
        }catch(Exception e){
            throw new Exception("Erro ao cadastrar o cliente: "+e.getMessage());
        }  
    }
    public List<Cliente> listagemDeClientes() throws ClassNotFoundException{
         return clienteDAO.listagemDeClientes();  
    } 
    public void alterarDadosDoCliente(String nome, String cpf ,int idade, String email)throws Exception{
       Cliente clienteAlterado = new Cliente(nome, cpf, idade, email);
       clienteDAO.alterarDadosDoCliente(clienteAlterado);
    }
    public void excluirCliente(String cpf)throws Exception{
        clienteDAO.excluirCliente(cpf);
    }
}

