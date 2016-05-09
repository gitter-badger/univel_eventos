package br.univel.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.univel.model.repository.Entidade;

/**
 * 
 * 	Gerenciador de eventos da UNIVEL
 * 
 * 	Entidade Dias do evento, tem as informações de cada dia do evento
 * 
 * @author aureo <aureojr1@gamil.com>
 * @since 08/05/2016 22:22
 */
@Entity
@Table(name ="GEV_DIA_EVENTO")
public class DiaEvento implements Entidade{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "descricao_dia")
	private String descricaoDia;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_evento")
	private Date dataEvento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="inicio_evento")
	private Date inicioEvento;
		
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fim_evento")
	private Date fimEvento;
		
	@Column(name="carga_horaria")
	private Date cargaHoraria;
	
	@OneToMany
	@JoinColumn(name= "ministrador", referencedColumnName = "id")
	private List<Ministrador> listaMinistradores;

	@Override
	public int getId() {
		
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
		
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
