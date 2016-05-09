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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.univel.model.repository.Entidade;

/**
 * 
 * 	Gerenciador de eventos da UNIVEL
 * 
 * 	Entidade Evento, armazena as configurações básicas de um evento
 * 
 * @author Juliano Grans
 * @author Aureo Junior <aureojr1@gmail.com>
 *
 */
@Entity
@Table(name = "GEV_EVENTO")
public class Evento implements Entidade {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	/**
	 * 
	 * Valor total do evento, uma espécie de pacote completo, em casos onde as pessoas 
	 * pederão comprar dias do evento, ou palestras específicas que não se aplicam esse
	 * valor.
	 * 
	 */
	@Column(name = "valor_base")
	private float valorBase;	
	
	@OneToOne
	@JoinColumn(name = "id_organizacao_evento", referencedColumnName ="id")
	private OrganizacaoEvento organizacaoEvento;
	
	@OneToMany
	@JoinColumn(name = "id_dias_evento", referencedColumnName ="id")
	private List<DiaEvento> listaDiasEvento;
	
	@OneToOne
	@JoinColumn(name = "id_configuracoes_evento", referencedColumnName ="id")
	private ConfiguracoesEvento configuracoesEvento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at")
	private Date updatedAt;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorBase() {
		return valorBase;
	}

	public void setValorBase(float valorBase) {
		this.valorBase = valorBase;
	}

	public OrganizacaoEvento getOrganizacaoEvento() {
		return organizacaoEvento;
	}

	public void setOrganizacaoEvento(OrganizacaoEvento organizacaoEvento) {
		this.organizacaoEvento = organizacaoEvento;
	}

	public List<DiaEvento> getListaDiasEvento() {
		return listaDiasEvento;
	}

	public void setListaDiasEvento(List<DiaEvento> listaDiasEvento) {
		this.listaDiasEvento = listaDiasEvento;
	}

	public ConfiguracoesEvento getConfiguracoesEvento() {
		return configuracoesEvento;
	}

	public void setConfiguracoesEvento(ConfiguracoesEvento configuracoesEvento) {
		this.configuracoesEvento = configuracoesEvento;
	}

	@Override
	public String toString() {
		return "Eventos ";
	}

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