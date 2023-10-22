package col.com.consultoriovita.service;

import col.com.consultoriovita.dao.PacienteDao;
import col.com.consultoriovita.modelo.Paciente;

import java.util.Scanner;

public class PacienteService extends Paciente {
    Scanner sc=new Scanner(System.in);

    public void registrarUsuario(Paciente paciente) {
        System.out.println("Ingrese el numero de documento");
        int docPaciente = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el apellido:");
        String lastName = sc.nextLine();
        System.out.println("Ingrese el correo:");
        String email = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String password = sc.nextLine();

       paciente.setDocPaciente(docPaciente);
       paciente.setName(name);
       paciente.setLastName(lastName);
       paciente.setEmail(email);
       paciente.setPassword(password);

        PacienteDao.registrarUsuarioDB(paciente);
    }
}
