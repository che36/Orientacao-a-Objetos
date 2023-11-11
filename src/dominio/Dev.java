package dominio;

import java.util.List;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosInscritos;
    private List<Conteudo> conteudosConcluidos;

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
