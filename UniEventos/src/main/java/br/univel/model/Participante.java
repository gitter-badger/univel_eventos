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
public class Participante implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Prt_Codigo", updatable = false, nullable = false)
  private Long prtCodigo;
  
  @JoinColumn(name = "Evn_Codigo", referencedColumnName = "Evn_Codigo")
  @ManyToOne
  private Evento evento;
  
  @JoinColumn(name = "Pss_Codigo", referencedColumnName = "Pss_Codigo")
  @ManyToOne
  private Pessoa pessoa;

  
  public Long getPrtCodigo() {
    return prtCodigo;
  }

  public void setPrtCodigo(Long prtCodigo) {
    this.prtCodigo = prtCodigo;
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
  
  
  
}
