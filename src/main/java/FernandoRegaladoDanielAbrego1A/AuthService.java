package FernandoRegaladoDanielAbrego1A;

import java.util.HashMap;

public class AuthService {

    private HashMap<String, Usuarios> usuarios = new HashMap<>();

    public void registrarUsuario(String username, String password,
                                 String nombreCompleto, String email) {

        if (usuarios.containsKey(username)) {
            System.out.println("El username ya existe");
        } else {
            Usuarios usuario =
                    new Usuarios(username, password, nombreCompleto, email);

            usuarios.put(username, usuario);

            System.out.println("Usuario registrado correctamente");
        }
    }

    public void iniciarSesion(String username, String password) {

        if (usuarios.containsKey(username)) {

            Usuarios usuarioEncontrado = usuarios.get(username);

            if (usuarioEncontrado.getPassword().equals(password)) {
                System.out.println("Inicio de sesion correcto");
            } else {
                System.out.println("Contraseña incorrecta");
            }

        } else {
            System.out.println("El usuario no existe");
        }
    }

    public void eliminarCuenta(String username) {

        if (usuarios.containsKey(username)) {
            usuarios.remove(username);
            System.out.println("Cuenta eliminada correctamente");
        } else {
            System.out.println("El usuario no existe");
        }
    }

    public boolean verificarDisponibilidad(String username) {

        if (usuarios.containsKey(username)) {
            System.out.println("El username ya está ocupado");

            return false;
        } else {
            System.out.println("El username esta disponible");

            return true;
        }
    }
}
