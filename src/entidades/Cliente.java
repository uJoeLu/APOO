public class Cliente {
    private String nome;
    private String  cpf;
    private int idade;
    private String  email;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
       if (idade >0 )
           this.idade = idade;
       else System.out.println("Erro! Idade não pode ser negativa ou zero.");
    }
    
}
