package br.univel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.univel.model.repository.Entidade;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Gerenciador de eventos da UNIVEL
 *
 * Pessoa Responsável por ministrar o dia de evento
 *
 * @author aureo <aureojr1@gmail.com>
 * @since 09/05/2016 1:19
 */
@Entity
@Table(name = "GEV_MINISTRADOR")
public class Ministrador implements Entidade {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @OneToOne
  @JoinColumn(name = "id_ministrante", referencedColumnName = "id")
  private Pessoa ministrante;

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

  public Pessoa getMinistrante() {
    return ministrante;
  }

  public void setMinistrante(Pessoa ministrante) {
    this.ministrante = ministrante;
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
