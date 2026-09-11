package FernandoRegaladoDanielAbrego1A;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService auth = new AuthService();

        String opcion = "";

        while (!opcion.equals("5")) {

            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Eliminar cuenta");
            System.out.println("4. Verificar username");
            System.out.println("5. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {

                case "1":
                    System.out.println("Ingrese username:");
                    String username = scanner.nextLine();

                    System.out.println("Ingrese password:");
                    String password = scanner.nextLine();

                    System.out.println("Ingrese nombre completo:");
                    String nombreCompleto = scanner.nextLine();

                    System.out.println("Ingrese email:");
                    String email = scanner.nextLine();

                    auth.registrarUsuario(
                            username,
                            password,
                            nombreCompleto,
                            email
                    );
                    break;

                case "2":
                    System.out.println("Ingrese username:");
                    String usernameLogin = scanner.nextLine();

                    System.out.println("Ingrese password:");
                    String passwordLogin = scanner.nextLine();

                    auth.iniciarSesion(usernameLogin, passwordLogin);
                    break;

                case "3":
                    System.out.println("Ingrese username:");
                    String usernameEliminar = scanner.nextLine();

                    auth.eliminarCuenta(usernameEliminar);
                    break;

                case "4":
                    System.out.println("Ingrese username:");
                    String usernameVerificar = scanner.nextLine();

                    auth.verificarDisponibilidad(usernameVerificar);

                    break;

                case "5":
                    System.out.println("Saliedno del sistema");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
