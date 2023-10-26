package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {

        //Exemplo POO
        Pessoas pessoas1 = new Pessoas("Felipe", 33);
        Pessoas pessoas2 = new Pessoas("Davi", 1);

        //Exemplo Encapsulamento
        System.out.println(pessoas1.getNome());
        System.out.println(pessoas2.getNome());

        //Exemplo Herança
        Pessoas aluno1 = new Aluno("Gustavo", 8, 1910);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());

        //Exemplo Polimorfismo
        aluno1.passarTempo();
        System.out.println(aluno1.getSaldo());

        //Exemplo Abstração
        aluno1.notaFinal(8, 7);


    }
}
