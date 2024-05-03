
public class Cliente {
    private String nome;
    private String  cpf;
    private int idade;
    private String  email;

    public  Cliente(String n, String c ,int i, String e){
        this.nome = n;
        this.cpf=c;
        this.idade =i;
        this.email = e;
    }

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
