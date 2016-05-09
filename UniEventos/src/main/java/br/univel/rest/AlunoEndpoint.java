package br.univel.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;

import br.univel.model.Aluno;

/**
 * 
 */
@Stateless
@Path("/alunos")
public class AlunoEndpoint {
	@PersistenceContext(unitName = "UniEventos-persistence-unit")
	private EntityManager em;

	@GET
	@Path("buscar/{q}")
	@Consumes("application/json")
	public Response buscar(@PathParam("q") String q) {
		em.persist(Aluno.class);
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT a.nome,");
		sb.append("       a.ra,");
		sb.append("		  a.turma");
		sb.append("	 FROM Aluno a");
		sb.append(" WHERE  1=1 AND");
		sb.append(" a.nome like :nome ");
		sb.append(" ORDER BY a.turma limit 5");
		
		TypedQuery<Aluno> buscarAlunos = em
				.createQuery(sb.toString(),Aluno.class)
					.setParameter("nome", q);
		
		List<Aluno> listaAlunos;
		try {
			listaAlunos = buscarAlunos.getResultList();
		} catch (NoResultException nre) {
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.ok(listaAlunos).build();		
	}

	
	@POST
	@Path("lancarHoras")
	@Consumes("application/json")
	public Response lancarHoras(Aluno aluno) {
		em.persist(aluno);

		if(horasLancadas(aluno)){
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.created(
				UriBuilder.fromResource(AlunoEndpoint.class)
						.path(String.valueOf(aluno.getId())).build()).build();
	}


	/**
	 * 
	 * Verifica se ass horas do aluno já foram lançadas
	 * 
	 * @return boolean
	 */
	private boolean horasLancadas(Aluno aluno) {
		
		// Agora é com você -- Gaviões do forro
		
		return true;
	}
	
	/**
	 * 
	 * Verifica se ass horas do aluno já foram lançadas
	 * 
	 * @return boolean
	 */
	private boolean participouDoEvento(Aluno aluno) {
		
		// O difícil como vocês sabem, não ẽ fácil  -- Internet
		
		return true;
	}
}
