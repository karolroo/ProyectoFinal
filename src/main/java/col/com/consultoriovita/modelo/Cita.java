package col.com.consultoriovita.modelo;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Cita {
    Scanner sc=new Scanner(System.in);
    private int idCita;
    private Date fechaCita;
    private Time horaConsulta;

    public Cita() {

    }

    public Cita(int idCita, Date fechaCita, String descripcionConsulta) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaConsulta = horaConsulta;
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

    public Time getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Time horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public void programarCita() {

    }


    public void eliminarCita() {
        //ELiminar una cita
        System.out.println("Indique el id de la cita que desea eliminar: ");
        int idCita = sc.nextInt();
        //CitaDao.eliminarCitaDB(idCita);


    }


    public void reprogramarCita() {
//Actualizacion de citas (llamado desde la carpeta dao)
        System.out.println("Indique la fecha a actualizar: ");
        String fechaCita=sc.nextLine();
        System.out.println("Indique la hora");
        //Time horaConsulta= sc.next();
        System.out.println("Indique el id de la cita a actualizar");
        int idCita=sc.nextInt();

        Cita actualizacion = new Cita();
       // actualizacion.setFechaCita(fechaCita);
        actualizacion.setHoraConsulta(horaConsulta);
        actualizacion.setIdCita(idCita);

       // CitaDAO.actualizarCitaDB(actualizacion);


    }
    public void consultarCita(Paciente paciente) {




    }
}