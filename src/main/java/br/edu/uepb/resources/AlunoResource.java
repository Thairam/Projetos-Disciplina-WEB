package br.edu.uepb.resources;

import br.edu.uepb.models.Aluno;
import br.edu.uepb.repositories.AlunoRepository;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("alunos")
public class AlunoResource {

    private AlunoRepository alunoRepository = new AlunoRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlunos() {
        return Response.ok(alunoRepository.getAll()).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlunoById(@PathParam("id") int id) {
        return Response.ok(alunoRepository.getById(id)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAluno(Aluno aluno) {
        alunoRepository.create(aluno);
        return Response.status(Response.Status.CREATED).entity(aluno).build();
    }
}
