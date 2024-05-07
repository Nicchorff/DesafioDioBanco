import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private final List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void buscarContaPeloNumero(int numero){
        Conta contaTemporaria = null;
        if(!contas.isEmpty()){
            for(var conta : contas){
                if(conta.getNumero() == numero){
                    contaTemporaria = conta;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
