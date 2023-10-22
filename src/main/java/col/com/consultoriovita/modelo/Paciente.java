package col.com.consultoriovita.modelo;

public class Paciente extends User {
    private int docPaciente;
    private String genero;
    private String motivoConsulta;
    private String ciudad;

    public Paciente(){

    }


    public Paciente(int idUSer, String name, String lastname, String email, String password, int docPaciente, String genero, String motivoConsulta, String direccion) {
        super(idUSer, name, lastname, email, password);
        this.docPaciente = docPaciente;
        this.genero = genero;
        this.motivoConsulta = motivoConsulta;
        this.ciudad = direccion;
    }

    public int getDocPaciente() {
        return docPaciente;
    }

    public void setDocPaciente(int docPaciente) {
        this.docPaciente = docPaciente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String ciudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public void registrarUsuario(Paciente paciente) {
        super.registrarUsuario();
    }
}
