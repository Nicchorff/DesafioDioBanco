public class Cliente {

    private String nome;
    private final boolean isContaCorrente;

    public Cliente(String nome, boolean isContaCorrente) {
        this.nome = nome;
        this.isContaCorrente = isContaCorrente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isContaCorrente() {
        return isContaCorrente;
    }
}
