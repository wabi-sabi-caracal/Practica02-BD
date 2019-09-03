import java.time.format.DateTimeFormatter;

public class Licencia {
  private DateTimeFormatter fechaExp;
  private DateTimeFormatter vigencia;
  private DateTimeFormatter antiguedad;
  private String nacionalidad;
  private String tipoSangre;
  private String tipoLicencia;

  public Licencia(DateTimeFormatter fechaExp, DateTimeFormatter vigencia, DateTimeFormatter antiguedad,
                  String nacionalidad, String tipoSangre, String tipoLicencia) {
                    this.fechaExp = fechaExp;
                    this.vigencia = vigencia;
                    this.antiguedad = antiguedad;
                    this.nacionalidad = nacionalidad;
                    this.tipoSangre = tipoSangre;
                    this.tipoLicencia = tipoLicencia;
                  }
    /**
    Obtener la fecha de expedicion de la Licencia
    @return fecha de expedicion de la Licencia
     */
  public DateTimeFormatter getFechaExp(){
            return fechaExp;
          }
  /**
    Asignar fecha de expedición a la Licencia
    @param fechaExp a asignar a la Licencia
     */
  public void setFechaExp(DateTimeFormatter fechaExp){
    this.fechaExp = fechaExp;
  }

    /**
    Obtener la vigencia de la Licencia
    @return vigencia de la Licencia
     */
  public DateTimeFormatter getVigencia(){
            return vigencia;
          }
  /**
    Asignar vigencia a la Licencia
    @param vigencia a asignar a la Licencia
     */
  public void setVigencia(DateTimeFormatter vigencia){
    this.vigencia = vigencia;
  }

    /**
    Obtener la antiguedad de la Licencia
    @return antiguedad de la Licencia
     */
  public DateTimeFormatter getAntiguedad(){
            return antiguedad;
          }
  /**
    Asignar antiguedad a la Licencia
    @param antiguedad a asignar a la Licencia
     */
  public void setAntiguedad(DateTimeFormatter antiguedad){
    this.antiguedad = antiguedad;
  }

    /**
    Obtener la nacionalidad de la Licencia
    @return nacionalidad
     */
  public String getNacionalidad(){
            return nacionalidad;
          }
  /**
    Asignar nacionalidad a la Licencia
    @param nacionalidad a asignar a la Licencia
     */
  public void setNacionalidad(String nacionalidad){
    this.nacionalidad = nacionalidad;
  }

    /**
    Obtener el tipoSangre
    @return tipoSangre
     */
  public String getTipoSangre(){
            return tipoSangre;
          }
  /**
    Asignar tipoSangre a la Licencia
    @param tipoSangre a asignar a la Licencia
     */
  public void setTipoSangre(String tipoSangre){
    this.tipoSangre = tipoSangre;
  }

  /**
  Obtener el tipoLicencia
  @return tipoLicencia
   */
  public String getTipoLicencia(){
          return tipoLicencia;
        }
  /**
  Asignar tipoLicencia a la Licencia
  @param tipoLicencia a asignar a la Licencia
   */
  public void setTipoLicencia(String tipoLicencia){
  this.tipoLicencia = tipoLicencia;
  }

}
