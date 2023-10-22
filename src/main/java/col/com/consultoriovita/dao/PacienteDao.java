package col.com.consultoriovita.dao;

import col.com.consultoriovita.conexion.Conexion;
import col.com.consultoriovita.modelo.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PacienteDao {

    public static void registrarUsuarioDB(Paciente paciente){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO usuario(doc_identidad, nombre_usuario, apellido_usuario, correo, contrasena) values(?,?,?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1,paciente.getDocPaciente());
                ps.setString(2,paciente.getName());
                ps.setString(3,paciente.getLastName());
                ps.setString(4, paciente.getEmail());
                ps.setString(5, paciente.getPassword());

                ps.executeUpdate();

                System.out.println("Se ha registrado el usuario correctamente");


            }catch (SQLException e){

                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }





    }

}
