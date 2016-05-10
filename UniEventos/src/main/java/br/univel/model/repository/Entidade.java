package br.univel.model.repository;

import java.io.Serializable;
import java.util.Date;

/**
 * Gerenciamentos de Eventos da UNIVEL
 *
 * Interface Entidade para marcar as classes que são entidades do sistema para
 * garantir a implentação de alguns campos
 *
 * <li> Id </li>
 * <li> created At </li>
 * <li> updated At </li>
 *
 * @author aureo
 * @since 8/05/2016 21:02
 *
 */
public interface Entidade extends Serializable {
 
  public abstract Long getId();

  public abstract void setId(Long id);

  public Date getCreatedAt();

  public void setCreatedAt(Date createdAt);

  public Date getUpdatedAt();

  public void setUpdatedAt(Date updatedAt);
}
