import java.util.List;

public interface IDAO<T> {

    public void cadastrar(T objeto);

    public List<T> exibirCadastro();

    public void excluir(String cpf);

    public void atualizar(T objeto);

}
