package modelo;

public class Clientes {
  private String Id;
  private String Nombre;
  private String Telefono;
  private String Email;

  public Clientes() {
    Id = "";
    Nombre = "";
    Email = "";
    Telefono = "";
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    Nombre = nombre;
  }

  public String getTelefono() {
    return Telefono;
  }

  public void setTelefono(String telefono) {
    Telefono = telefono;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }



}
