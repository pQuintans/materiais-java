public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;

        if(qtdAtual >= 0){
            this.qtdAtual = qtdAtual;
        } else {
            this.qtdAtual = 0;
        }

        if(qtdMinima >= 0){
            this.qtdMinima = qtdMinima;
        } else {
            this.qtdMinima = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void repor(int qtd) {
        this.qtdAtual += qtd;
    }

    public void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }

    public String mostra() {
        return "Nome: " + nome + ", Quantidade mínima: " + qtdMinima + ", Quantidade atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }
}
