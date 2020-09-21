package br.edu.uepb;

import br.edu.uepb.models.Turma;
import br.edu.uepb.repositories.TurmaRepository;

public class Driver {

    private static Turma turma;
    private static TurmaRepository turmaRepository = new TurmaRepository();

    public static void main(String args[]) {
        turma = turmaRepository.getById(10);
        System.out.println(turma);
    }
    
}
