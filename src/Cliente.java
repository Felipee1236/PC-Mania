public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] comprados = new Computador[3];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador pc : comprados) {
            if (pc != null) total += pc.preco;
        }
        return total;
    }
}