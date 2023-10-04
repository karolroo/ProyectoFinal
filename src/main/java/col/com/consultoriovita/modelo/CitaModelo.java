package col.com.consultoriovita.modelo;

import java.util.Date;

public class CitaModelo extends PacienteModelo{
    private Date fechaCita;
    private String descripcionConsulta;

    public CitaModelo(){

    }

    public CitaModelo(Date fechaCita, String descripcionConsulta) {
        this.fechaCita = fechaCita;
        this.descripcionConsulta = descripcionConsulta;
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
