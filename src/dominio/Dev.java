package dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;

    private List<Conteudo> conteudosInscritos = new ArrayList<>();

    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

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

    public void inscrever(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            System.err.println("Você já se inscreveu nesse conteúdo");
        } else {
            conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp) {
        bootcamp.getConteudos().stream().forEach(this::inscrever);
    }

}


