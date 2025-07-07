import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso Javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp ();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" +devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila" +devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" +devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" +devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" +devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" +devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
