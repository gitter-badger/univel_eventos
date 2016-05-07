/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univel.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juliano
 */
@Entity
@XmlRootElement
public class Pessoa implements Serializable{
  
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Pss_Codigo", updatable = false, nullable = false)
	private Long pssCodigo;
  
  @Column(name = "Pss_Nome")
  private String pssNome;
  
  @Column(name = "Pss_Cpf")
  private String pssCpf;

  @Temporal(TemporalType.DATE)
  @Column(name = "Pss_Idade")
  private Date pssIdade;

  public Date getPssIdade() {
    return pssIdade;
  }

  public void setPssIdade(Date pssIdade) {
    this.pssIdade = pssIdade;
  }
  
  
  
  public String getPssCpf() {
    return pssCpf;
  }

  public void setPssCpf(String pssCpf) {
    this.pssCpf = pssCpf;
  }

  public String getPssNome() {
    return pssNome;
  }

  public void setPssNome(String pssNome) {
    this.pssNome = pssNome;
  }

  public Long getPssCodigo() {
    return pssCodigo;
  }

  public void setPssCodigo(Long pssCodigo) {
    this.pssCodigo = pssCodigo;
  }
}
