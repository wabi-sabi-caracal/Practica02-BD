public class Empleado {
  private String nombre;
  private String aPaterno;
  private String aMaterno;
  private String puesto;
  private int salario;
  private int idEmpleado;


  public Empleado(String nombre, String aPaterno, String aMaterno,
      String puesto, int salario) {
          this.nombre = nombre;
          this.apellidoPaterno = aPaterno;
          this.apellidoMaterno = aMaterno;
          this.puesto = puesto;
          this.salario = salario;
          idEmpleado += 1;
      }

    /**
      Obtener el nombre del empleado
      @return Nombre del empleado
       */
  public String getNombre(){
            return nombre;
          }
}
