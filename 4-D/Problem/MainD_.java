/*
 * Imaginemos que queremos autenticarnos con algun servicio
 * Por ahora usaremos Google
 * Pero que pasaria si luego queremos usar otro servicio?
 * Tendriamos que cambiar la implementacion del authenticator dentro del servicio pues este depende directamente
 * de la clase GoogleAuth.
 * Esto incumple el 5to principio SOLID (Dependency Inversion) que dice que los objectos deben depender de
 * abstracciones y no de clases concretas como este caso (GoogleAuth)
 */

public class MainD_ {

    private static AuthService_ authService;

    public static void main(String[] args) {
        authService = new AuthService_(new GoogleAuth_());

        authService.login("UsuarioX", "ContraseñaX");
    }
}
