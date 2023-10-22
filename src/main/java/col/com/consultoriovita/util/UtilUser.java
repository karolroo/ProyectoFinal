package col.com.consultoriovita.util;

import col.com.consultoriovita.modelo.Paciente;

public interface UtilUser {

    public void registrarUsuario();
    public void registrarUsuario(Paciente paciente);
    public void actualizarUsuario();
    public void loginUsuario();
    public void eliminarUsuario();

    public void verUsuario();
}

