import java.time.format.DateTimeFormatter;

/**
 * Clase para modelar los vehiculos del transporte
 * de la CDMX
 * @version 1.0 Septiembre 2019
 */

public class Vehiculo {
  private DateTimeFormatter fecha;
  private int idVehiculo;
  private String combustible;
  private int capacidad;

  public Vehiculo(DateTimeFormatter fecha, int idVehiculo, String combustible,
                  int capacidad) {
                    this.fecha = fecha;
                    this.idVehiculo = idVehiculo;
                    this.combustible = combustible;
                    this.capacidad = capacidad;
                  }


    /**
    Obtener la fecha del vehiculo
    @return fecha del vehiculo
     */
  public DateTimeFormatter getFecha(){
            return fecha;
          }
  /**
    Asignar fecha al vehiculo
    @param fecha a asignar al vehiculo
     */
  public void setFecha(DateTimeFormatter fecha){
    this.fecha = fecha;
  }

    /**
    Obtener el identificador del vehiculo
    @return fecha del vehiculo
     */
  public int getIdVehiculo(){
            return idVehiculo;
          }
  /**
    Asignar identificador al vehiculo
    @param idVehiculo a asignar al vehiculo
     */
  public void setFecha(int idVehiculo){
    this.idVehiculo = idVehiculo;
  }
    /**
    Obtener el tipo de combustible que requiere el vehiculo
    @return combustible del vehiculo
     */
  public String getCombustible(){
            return combustible;
          }
  /**
    Asignar tipo de combustible al vehiculo
    @param combustible a asignar al vehiculo
     */
  public void setCombustible(String combustible){
    this.combustible = combustible;
  }

    /**
    Obtener la capacidad de pasajeros del vehiculo
    @return capacidad del vehiculo
     */
  public int getCapacidad(){
            return capacidad;
          }
  /**
    Asignar capacidad al vehiculo
    @param capacidad a asignar al vehiculo
     */
  public void setCapacidad(int capacidad){
    this.capacidad = capacidad;
  }
}
