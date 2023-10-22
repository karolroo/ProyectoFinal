package col.com.consultoriovita.service;

import col.com.consultoriovita.modelo.Paciente;

import java.util.Scanner;

public class PacienteService extends Paciente {
    Scanner sc=new Scanner(System.in);

    public void registrarUsuario(Paciente paciente) {
        System.out.println("Ingrese el numero de documento");
        int docPaciente = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del cliente:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el correo del cliente:");
        String correo = sc.nextLine();
        System.out.println("Ingrese la contraseña del cliente");
        String contrasena = sc.nextLine();


       paciente.setDocPaciente(docPaciente);
       paciente.
    }
}
