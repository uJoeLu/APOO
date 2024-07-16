public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new ClienteBuilder()
            .setNome("Joel Neves")
            .setCpf("12345678911")
            .setIdade(27)
            .setEmail("joelneves@gmail.com")
            .build();
             CadCliente<Cliente> cadCliente = CadCliente.getInstancia();
             cadCliente.cadastrarCliente(cliente);

    for (Cliente cliente1 : cadCliente.getListaDeClientes()) {
        System.out.println(cliente1.getNome());
    }

    }
}
