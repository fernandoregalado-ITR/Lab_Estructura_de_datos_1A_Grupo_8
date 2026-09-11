package FernandoRegaladoDanielAbrego1A;
public class Usuarios {

    private String username;
    private String password;
    private String nombreCompleto;
    private String email;

    public Usuarios(String username, String password,
                   String nombreCompleto, String email) {
        this.username = username;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }
}
