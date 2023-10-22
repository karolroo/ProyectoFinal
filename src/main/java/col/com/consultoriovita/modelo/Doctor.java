package col.com.consultoriovita.modelo;

public class Doctor extends User {

    private int idMedico;
    private String especialidad;

    public Doctor() {
    }

    public Doctor(int idUSer, String name, String lastName, int age, String email, int password, int idMedico, String especialidad) {
        super(idUSer, name, lastName, email, password);
        this.idMedico = idMedico;
        this.especialidad = especialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public void registrarCitaDisponibles(){

    }
}



