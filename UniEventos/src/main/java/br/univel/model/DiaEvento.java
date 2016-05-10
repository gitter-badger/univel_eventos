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
 * Gerenciador de eventos da UNIVEL
 *
 * Entidade Dias do evento, tem as informações de cada dia do evento
 *
 * @author aureo <aureojr1@gamil.com>
 * @since 08/05/2016 22:22
 */
@Entity
@Table(name = "GEV_DIA_EVENTO")
public class DiaEvento implements Entidade {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "descricao_dia")
  private String descricaoDia;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_evento")
  private Date dataEvento;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "inicio_evento")
  private Date inicioEvento;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fim_evento")
  private Date fimEvento;

  @Column(name = "carga_horaria")
  private Date cargaHoraria;

  @OneToMany
  @JoinColumn(name = "ministrador", referencedColumnName = "id")
  private List<Ministrador> listaMinistradores;

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

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricaoDia() {
    return descricaoDia;
  }

  public void setDescricaoDia(String descricaoDia) {
    this.descricaoDia = descricaoDia;
  }

  public Date getDataEvento() {
    return dataEvento;
  }

  public void setDataEvento(Date dataEvento) {
    this.dataEvento = dataEvento;
  }

  public Date getInicioEvento() {
    return inicioEvento;
  }

  public void setInicioEvento(Date inicioEvento) {
    this.inicioEvento = inicioEvento;
  }

  public Date getFimEvento() {
    return fimEvento;
  }

  public void setFimEvento(Date fimEvento) {
    this.fimEvento = fimEvento;
  }

  public Date getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(Date cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public List<Ministrador> getListaMinistradores() {
    return listaMinistradores;
  }

  public void setListaMinistradores(List<Ministrador> listaMinistradores) {
    this.listaMinistradores = listaMinistradores;
  }

}
