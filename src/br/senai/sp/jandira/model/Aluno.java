package br.senai.sp.jandira.model;

public class Aluno extends Pessoas {

    private int matricula;
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void passarTempo(){
        System.out.println(getNome() + " está fazendo atividade de JAVA");

    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
