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

             Cliente cliente1 = new ClienteBuilder()
             .setNome("Marcos Gomes")
             .setCpf("123456789")
             .setIdade(29)
             .setEmail("marcosgomes@gmail.com")
             .build();
              CadCliente<Cliente> cadCliente1 = CadCliente.getInstancia();
              cadCliente1.cadastrarCliente(cliente1);
              
              Cliente cliente2 = new ClienteBuilder()
             .setNome("Jadeilson Martin")
             .setCpf("987654321")
             .setIdade(22)
             .setEmail("jadinho@gmail.com")
             .build();
              CadCliente<Cliente> cadClientes = CadCliente.getInstancia();
              cadClientes.cadastrarCliente(cliente2);

    for (Cliente clientes : cadCliente.getListaDeClientes()) {
        System.out.println("\nNOME: " +clientes.getNome()+ " \nCPF: " +clientes.getCpf()+ "\nIDADE: " + clientes.getIdade()+ "\nEMAIL: " + clientes.getEmail());
    }

    }
}
