/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univel.model;

import br.univel.model.repository.Entidade;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juliano
 */
@Entity
@XmlRootElement
public class Participante implements Entidade {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", updatable = false, nullable = false)
  private Long id;

  @JoinColumn(name = "id_evento", referencedColumnName = "id")
  @ManyToOne
  private Evento evento;

  @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
  @ManyToOne
  private Pessoa pessoa;

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

  public Evento getEvento() {
    return evento;
  }

  public void setEvento(Evento evento) {
    this.evento = evento;
  }

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
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
