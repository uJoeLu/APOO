public class DefaultClienteFactory implements  ClienteFactory {

    @Override
    public Cliente creatCliente() {
        return new Cliente(null, null, 0, null);
    }
}
