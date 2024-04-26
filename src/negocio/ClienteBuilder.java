public class ClienteBuilder {
    private Cliente cliente;

    public ClienteBuilder(){
        cliente = new Cliente(null, null, 0, null);
    }
    public ClienteBuilder  setNome(String nome){
        this.cliente.setNome(nome);
        return this;
    }
    public ClienteBuilder setCpf(String cpf) throws Exception{
        if (cpf == null) throw new Exception("CPF inválido");
        this.cliente.setCpf(cpf);
        return this;
    }
    public ClienteBuilder setIdade(int idade){
        this.cliente.setIdade(idade);
        return this;
        }
    
    public Cliente build() {
        return cliente;
    }
}
