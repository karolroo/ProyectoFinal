package col.com.consultoriovita.modelo;

import java.util.Date;

public class CitaModelo extends PacienteModelo{
    private int idCita;
    private Date fechaCita;
    private String descripcionConsulta;

    public CitaModelo(){

    }

    public CitaModelo(int idCita, Date fechaCita, String descripcionConsulta) {
        this.idCita= idCita;
        this.fechaCita = fechaCita;
        this.descripcionConsulta = descripcionConsulta;
    }
    public int getIdCita(){
        return idCita;
     
    public void setIdCita(int idCita){
        this.idCita=idCita;
    }    

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getDescripcionConsulta() {
        return descripcionConsulta;
    }

    public void setDescripcionConsulta(String descripcionConsulta) {
        this.descripcionConsulta = descripcionConsulta;
    }


}
