package br.edu.uepb.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.edu.uepb.models.Turma;

public class TurmaRepository {
    private static HashMap<Integer, Turma> turmas = new HashMap<>();

    public List<Turma> getAll() {
        return new ArrayList<Turma>(turmas.values());
    }

    public Turma getById(int id) {
        return turmas.get(id);
    }

    public void create(Turma turma) {
        if (turma.getId() == 0)
            turma.setId(generateId(turmas.size() + 1));
        turmas.put(turma.getId(), turma);
    }

    private int generateId(final int possible) {
        if (turmas.containsKey(possible))
            return generateId(possible + 1);
        return possible;
    }
}
