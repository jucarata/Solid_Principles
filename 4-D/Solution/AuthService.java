/*
 * En este caso ahora depende de una abstraccion y no de una clase concreta
 */
public class AuthService {
    private IAuthenticator authenticator;

    public AuthService(IAuthenticator authenticator){
        this.authenticator = authenticator;
    }

    public void login(String user, String pass){
        authenticator.login(user, pass);
    }
 
}