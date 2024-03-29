import java.time.format.DateTimeFormatter;


/**
 * Clase para modelar a los empleados del transporte
 * de la CDMX
 * @version 1.0 Septiembre 2019
 */
public class Empleado {
<<<<<<< HEAD
  private Date fecha;
  private double salario;
=======
  private DateTimeFormatter fecha;
>>>>>>> 1904f36be4a25e19655175b9c83d2cdeb0ffd5e1
  private int idEmpleado;
  private String nombre;
  private String aPaterno;
  private String aMaterno;
  private String sexo;
  private String estudio;
  private String horario;
  private String direccion;
  Licencia licencia;
  ExamenMedico examedico;

  public Empleado(int idEmpleado, String nombre, String aPaterno, String aMaterno,
                  String sexo, String estudio, String direccion, DateTimeFormatter fecha) {
          this.idEmpleado = idEmpleado;
          this.nombre = nombre;
          this.aPaterno = aPaterno;
          this.aMaterno = aMaterno;
          this.sexo  = sexo;
          this.estudio = estudio;
          this.direccion = direccion;
          this.fecha = fecha;
      }

   /**
      Obtener el ID del empleado
      @return ID del empleado
       */
  public int getID(){
    return idEmpleado;
  }

    /**
      Obtener el nombre del empleado
      @return Nombre del empleado
       */
  public String getNombre(){
            return nombre;
          }
    /**
      Asignar el nombre al empleado
      @param nombre a asignar al empleado
       */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

   /**
      Obtener el apellido paterno del empleado
      @return Apellido paterno del empleado
       */
  public String getPaterno(){
            return aPaterno;
  }
    /**
       Asignar el apellido paterno del empleado
       @param aPaterno paterno del empleado
        */
  public void setPaterno(String aPaterno){
    this.aPaterno = aPaterno;
  }

   /**
      Obtener el apellido materno del empleado
      @return Apellido materno del empleado
  */
  public String getMaterno(){
            return aMaterno;
          }
  /**
     Asignar el apellido materno del empleado
     @param aMaterno segundo apellido del empleado
      */
  public void setMaterno(String aMaterno){
    this.aMaterno = aMaterno;
  }

   /**
      Obtener el sexo del empleado
      @return sexo del empleado
  */
  public String getSexo(){
            return sexo;
          }
  /**
     Asignar al empleado el sexo
     @param sexo del empleado
  */
  public void setSexo(String sexo){
    this.sexo = sexo;
  }
  /**
     Obtener el grado máximo de estudios del Empleado
     @return estudio del empleado
 */
  public String getEstudio(){
    return this.estudio;
  }

  /**
     Asignar el grado máximo de estudios del Empleado
     @param estudio del empleado
 */
  public void setEstudio(String estudio){
    this.estudio = estudio;
  }

  /**
     Obtener el horario del empleado
     @return horario del empleado
 */
  public String getHorario(){
    return this.horario;
  }

  /**
     Asignar el horario  del empleado
     @param horario del empleado
 */
  public void setHorario(String horario){
    this.horario = horario;
  }

  /**
     Obtener la direccion del empleado
     @return direccion del empleado
 */
  public String getDireccion(){
    return this.direccion;
  }

  /**
     Asignar direccion del empleado
     @param direccion del empleado
 */
  public void setDireccion(String direccion){
    this.direccion = direccion;
  }

  /**
     Obtener la licencia del empleado
     @return licencia del empleado
 */
  public Licencia getLicencia(){
    return this.licencia;
  }

  /**
    Asignar licencia al empleado
    @param licencia del empleado
 */
  public void setLicencia(Licencia licencia){
    this.licencia = licencia;
  }

  /**
     Obtener el examen medico del empleado
     @return examedico del empleado
 */
  public ExamenMedico getExamed(){
    return this.examedico;
  }

  /**
     Asignar examen medico al empleado
     @param examedico del empleado
 */
  public void setExamed(ExamenMedico examedico){
    this.examedico = examedico;
  }

  /**
   * Obtener fecha de nacimiento del empleado
   */
  public Date getFecha(){
    return this.fecha;
  }

  /**
   * Obtener salario del empleado
   */
  public double getSalario(){
    return this.salario;
  }

  /**
   * Asignar salario del empleado
   * @param s salario del empleado
   */
  public void setSalario(double s){
    this.salario = s;
  }

}
