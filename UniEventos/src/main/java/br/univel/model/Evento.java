package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

@Entity 
@XmlRootElement
public class Evento implements Serializable {

	/**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Version
	@Column(name = "version")
	private int version;

	@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Evn_Codigo", updatable = false, nullable = false)
	private Long evnCodigo;
  
  @Column(name = "Evn_Nome")
  private String evnNome;
  
  @JoinColumn(name = "EvnCrd_Codigo", referencedColumnName = "Pss_Codigo")
  @ManyToOne
  private Pessoa evnCoordenador;

  public Pessoa getEvnCoordenador() {
    return evnCoordenador;
  }

  public void setEvnCoordenador(Pessoa evnCoordenador) {
    this.evnCoordenador = evnCoordenador;
  }

  public Long getEvnCodigo() {
    return evnCodigo;
  }

  public void setEvnCodigo(Long evnCodigo) {
    this.evnCodigo = evnCodigo;
  }

  public String getEvnNome() {
    return evnNome;
  }

  public void setEvnNome(String evnNome) {
    this.evnNome = evnNome;
  }


	public Long getEvn_Codigo() {
    return evnCodigo;
  }

  public void setEvn_Codigo(Long evn_Codigo) {
    evnCodigo = evn_Codigo;
  }

  public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}


	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (evnCodigo != null)
			result += "Evn_Codigo: " + evnCodigo;
		return result;
	}
}