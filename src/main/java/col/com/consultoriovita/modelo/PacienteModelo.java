package col.com.consultoriovita.modelo;

import col.com.consultoriovita.util.User;

public class PacienteModelo extends User {
    private String genero;
    private String motivoConsulta;
    private String direccion;

    public PacienteModelo(){

    }


    public PacienteModelo(int idUSer, String name, String lastname, String email, int password, String genero, String motivoConsulta, String direccion) {
        super(idUSer, name, lastname, email, password);
        this.genero = genero;
        this.motivoConsulta = motivoConsulta;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public void registrarUsuario() {

    }

    @Override
    public void actualizarUsuario() {

    }

    @Override
    public void loginUsuario() {

    }
}
