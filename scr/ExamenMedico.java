import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class ExamenMedico {
  private int idEmpleado;
  private double peso;
  private double estatura;
  private String presion;
  private String status;
  private DateTime fechaH;

  public ExamenMedico(int idEmpleado, double peso, double estatura, String presion,
                      String status, DateTimeFormatter fechaH) {
                        this.idEmpleado = idEmpleado;
                        this.peso = peso;
                        this.estatura = estatura;
                        this.presion = presion;
                        this.status = status;
                        this.fechaH = fechaH;
                      }
    /**
       Obtener el ID del empleado
       @return ID del empleado
        */
   public int getID(){
     return idEmpleado;
   }
    /**
    Obtener el peso del empleado
    @return Nombre del empleado
     */
  public double getPeso(){
            return peso;
          }
  /**
    Asignar peso al  empleado
    @param peso a asignar al empleado
     */
  public void setPeso(double peso){
    this.peso = peso;
  }

  /**
    Obtener la estatura del Empleado
    @return estatura del empleado
     */
  public double getEstatura(){
            return estatura;
          }
  /**
    Asignar estatura al empleado
    @param estatura del empleado
     */
  public void setEstatura(double estatura){
    this.estatura = estatura;
  }


  /**
    Obtener la presion arterial del empleado
    @return presion del empleado
     */
  public String getPresion(){
            return presion;
          }
  /**
    Asignar la presion arterial al empleado
    @param presion a asignar al empleado
     */
  public void setPresion(String presion){
    this.presion = presion;
  }

  /**
    Obtener el status del empleado
    @return status del empleado
     */
  public String getStatus(){
            return status;
          }
  /**
    Asignar el status al empleado
    @param status a asignar al empleado
     */
  public void setStatus(String status){
    this.status = status;
  }
  /**
   * Obtener fecha del examen
   */
  public DateTimeFormatter getFechaH(){
    return this.fechaH;
  }
  /**
   * Asignar fecha del examen
   */
  public void setFechaH(DateTime dt){
    this.fechaH = dt;
  }
}
