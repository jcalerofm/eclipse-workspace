package es.calero.conexHibernate;

import java.lang.annotation.Inherited;

import javax.persistence.*;

@Entity
@Table(name = "detalle_cliente")
public class DetalleCliente {

  @Id
  @Column(name = "id")
  private int id;
  @Column(name = "web")
  private String web;
  @Column(name = "telefono")
  private String telefono;
  @Column(name = "comentarios")
  private String comentarios;

  public DetalleCliente(String id, String web, String telefono, String comentarios) {
    this.web = web;
    this.telefono = telefono;
    this.comentarios = comentarios;
  }

  public DetalleCliente() {
  }

  @Override
  public String toString() {
    return "DetalleCliente [id=" + id + ", web=" + web + ", telefono=" + telefono
        + ", comentarios=" + comentarios + "]";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getComentarios() {
    return comentarios;
  }

  public void setComentarios(String comentarios) {
    this.comentarios = comentarios;
  }

}
