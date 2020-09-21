package br.edu.uepb.models;

public class Aluno {
    private int id;
    private String nome;
    private String curso;
    private Turma turma;

    private int idTurma;

    public Aluno() {
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
        this.turma = new Turma();
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
