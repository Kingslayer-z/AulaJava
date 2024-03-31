package ex04;
public class Jogador {
    

    String nome;
    int pontuacao;
    int nivel;


    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public void atualizarPontuacao(int novaPontuacao) {
        this.pontuacao = novaPontuacao;
    }


    public void atualizarNivel(int novoNivel) {
        this.nivel = novoNivel;
    }
}