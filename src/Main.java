import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJR = new Dev();
        devJR.setNome("Isaac");
        devJR.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos Inscritos "+devJR.getNome()+":" + devJR.getConteudoInscritos());
        devJR.progredir();
        devJR.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devJR.getNome()+":" + devJR.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos "+devJR.getNome()+":" + devJR.getConteudosConcluidos());
        System.out.println("XP:" + devJR.calcularTotaXPl());

        System.out.println("-------");

        Dev devPL = new Dev();
        devPL.setNome("Alex");
        devPL.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos Inscritos "+devPL.getNome()+":" + devPL.getConteudoInscritos());
        devPL.progredir();
        devPL.progredir();
        devPL.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devPL.getNome()+":" + devPL.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos "+devPL.getNome()+":" + devPL.getConteudosConcluidos());
        System.out.println("XP:" + devPL.calcularTotaXPl());


    }
}