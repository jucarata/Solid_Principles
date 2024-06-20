/*
 * Ahora miremos la solucion:
 * Al ahora depende de abstracciones y no de clases concretas es tan facil como cambiar el tipo de authenticator
 * que se envia al servicio y ya esta.
 */

public class MainD {

    private static AuthService authService;

    public static void main(String[] args) {
        authService = new AuthService(new GoogleAuth());
        // OR
        authService = new AuthService(new AppleAuth());

        authService.login("UsuarioX", "ContraseñaX");
    }
}
