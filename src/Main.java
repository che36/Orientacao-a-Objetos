import dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Básico");
        cursoJavaBasico.setDescricao("Aprenda Conceitos Basicos de Java.");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo("Java .Net");
        cursoDotNet.setDescricao("Aprenda Conceitos Basicos de C#");
        cursoDotNet.setCargaHoraria(10);

        Curso cursoJavaAvançado = new Curso();
        cursoJavaAvançado.setTitulo("Java Avançado");
        cursoJavaAvançado.setDescricao("Aprenda os conceitos avançados sobre Java.");
        cursoJavaAvançado.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientação a Objetos");
        mentoria.setDescricao("Imersao sobre os pilares da Orientação a Objetos.");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Start");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio());
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaBasico, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev felipao = new Dev();
        felipao.setNome("Felipao");
        felipao.inscrever(cursoDotNet);

        Dev Cesar = new Dev();
        Cesar.setNome("Cesar");
        Cesar.inscrever(bootcamp);
        Cesar.progredir();

        System.out.println(String.format("XP Felipao: %.2f", felipao.calcularTotalXp()));
        System.out.println(String.format("XP Felipao: %.2f", felipao.calcularTotalXp()));
    }
}