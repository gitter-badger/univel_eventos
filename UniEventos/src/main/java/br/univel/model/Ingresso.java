/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univel.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juliano
 */
@Entity
@XmlRootElement
public class Ingresso implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Ing_Codigo", updatable = false, nullable = false)
  private Long ingCodigo;
  
  @JoinColumn(name = "Evn_Codigo", referencedColumnName = "Evn_Codigo")
  @ManyToOne
  private Evento evento;
  
  @JoinColumn(name = "Prt_Codigo", referencedColumnName = "Prt_Codigo")
  @ManyToOne
  private Participante participante;

  public Long getIngCodigo() {
    return ingCodigo;
  }

  public void setIngCodigo(Long ingCodigo) {
    this.ingCodigo = ingCodigo;
  }

  public Evento getEvento() {
    return evento;
  }

  public void setEvento(Evento evento) {
    this.evento = evento;
  }

  public Participante getParticipante() {
    return participante;
  }

  public void setParticipante(Participante participante) {
    this.participante = participante;
  }
  
  
  
}
