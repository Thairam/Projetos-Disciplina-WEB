package br.edu.uepb.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.edu.uepb.models.Aluno;

public class AlunoRepository {
    private static HashMap<Integer, Aluno> alunos = new HashMap<>();

    public List<Aluno> getAll() {
        return new ArrayList<Aluno>(alunos.values());
    }

    public Aluno getById(int id) {
        return alunos.get(id);
    }

    public void create(Aluno aluno) {
        if (aluno.getId() == 0)
            aluno.setId(generateId(alunos.size() + 1));
        alunos.put(aluno.getId(), aluno);
    }

    private int generateId(final int possible) {
        if (alunos.containsKey(possible))
            return generateId(possible + 1);
        return possible;
    }
}
