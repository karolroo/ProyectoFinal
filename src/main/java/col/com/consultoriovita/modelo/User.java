package col.com.consultoriovita.modelo;

import col.com.consultoriovita.util.UtilUser;

import java.util.Scanner;

public abstract class User implements UtilUser {
    Scanner sc = new Scanner(System.in);
    protected int idUSer;
    protected String name;
    protected String lastName;
    protected String email;
    protected int password;


    public User() {

    }

    public User(int idUSer, String name, String lastname, String email, int password) {
        this.idUSer = idUSer;
        this.name = name;
        this.lastName = lastname;
        this.email = email;
        this.password = password;
    }


    public int getIdUSer() {
        return idUSer;
    }

    public void setIdUSer(int idUSer) {
        this.idUSer = idUSer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public void registrarUsuario() {
        System.out.println("Ingrese su documento de identidad");
        int docPaciente = sc.nextInt();
        sc.skip("\n");

        System.out.println("Registre nombre");
        String name = sc.next();

        System.out.println("Registre apellido");
        String lastName=sc.nextLine();

        System.out.println("Registre email");
        String email = sc.next();

        System.out.println("Cree contraseña");
        int password = sc.nextInt();
    }

    @Override
    public void loginUsuario() {
        System.out.println("Ingrese su ID");
        int idUser= sc.nextInt();
        sc.skip("\n");

        System.out.println("Ingrese nombre");
        String name=sc.next();

        System.out.println("Ingrese email");
        String email=sc.next();

        System.out.println("Ingrese contraseña");
        int password=sc.nextInt();
    }

    @Override
    public void actualizarUsuario() {

    }

    @Override
    public void eliminarUsuario() {

    }

    @Override
    public void verUsuario() {
        System.out.println("ID" + idUSer+ "\n" +
                "Nombre" + name + "\n" +
                "Apellido" + lastName+ "\n" +
                "Email" + email + "\n");
    }
}