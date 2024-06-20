/*
 * AuthService depende directamente de la clase GoogleAuth, lo cual incumple Dependency Inversion Principle
 */
public class AuthService_ {
    private GoogleAuth_ authenticator;

    public AuthService_(GoogleAuth_ authenticator){
        this.authenticator = authenticator;
    }

    public void login(String user, String pass){
        authenticator.login(user, pass);
    }
 
}
