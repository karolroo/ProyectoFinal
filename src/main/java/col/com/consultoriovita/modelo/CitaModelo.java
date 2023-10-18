package col.com.consultoriovita.modelo;

import java.util.Date;
import java.util.Scanner;

public class CitaModelo extends PacienteModelo {
    Scanner sc=new Scanner(System.in);
    private int idCita;
    private Date fechaCita;
    private String descripcionConsulta;

    public CitaModelo() {

    }

    public CitaModelo(int idCita, Date fechaCita, String descripcionConsulta) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.descripcionConsulta = descripcionConsulta;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
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

    public void progrmarCita() {

    }


    public void eliminarCita() {
        //ELiminar una cita
        System.out.println("Indique el id de la cita que desea eliminar: ");
        int idCita = sc.nextInt();
        CitaDAO.eliminarCitaDB(idCita);


    }


    public void reprogramarCita() {
//Actualizacion de citas (llamado desde la carpeta dao)
        System.out.println("Indique la fecha a actualizar: ");
        String fechaCita=sc.nextLine();
        System.out.println("Indique el id de la cita a actualizar");
        int idCita=sc.nextInt();

        CitaModelo actualizacion = new CitaModelo();
        actualizacion.setfechaCita(fechaCita);
        actualizacion.setIdCita(idCita);

        CitaDAO.actualizarCitaDB(actualizacion);


    }
}