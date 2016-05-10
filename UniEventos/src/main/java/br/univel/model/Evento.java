package br.univel.model;

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

import br.univel.model.repository.Entidade;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Gerenciador de eventos da UNIVEL
 *
 * Entidade Evento, armazena as configurações básicas de um evento
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
  private Long id;

  @Column(name = "nome")
  private String nome;

  /**
   *
   * Valor total do evento, uma espécie de pacote completo, em casos onde as
   * pessoas pederão comprar dias do evento, ou palestras específicas que não se
   * aplicam esse valor.
   *
   */
  @Column(name = "valor_base")
  private float valorBase;

  @OneToOne
  @JoinColumn(name = "id_organizacao_evento", referencedColumnName = "id")
  private OrganizacaoEvento organizacaoEvento;

  @OneToMany
  @JoinColumn(name = "id_dias_evento", referencedColumnName = "id")
  private List<DiaEvento> listaDiasEvento;

  @OneToOne
  @JoinColumn(name = "id_configuracao_evento", referencedColumnName = "id")
  private ConfiguracaoEvento configuracaoEventos;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at")
  protected Date createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at")
  protected Date updatedAt;

  @Override
  public Date getCreatedAt() {
    return this.createdAt;
  }

  @Override
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public Date getUpdatedAt() {
    return this.updatedAt;
  }

  @Override
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ConfiguracaoEvento getConfiguracaoEventos() {
    return configuracaoEventos;
  }

  public void setConfiguracaoEventos(ConfiguracaoEvento configuracaoEventos) {
    this.configuracaoEventos = configuracaoEventos;
  }

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

  @Override
  public String toString() {
    return "Eventos ";
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

}
