package helpers;

public class Authenticator {

    private String password;

    public Authenticator(String password) {
        this.password = password;
    }

    public boolean validar(){
        if ("1234".equals(password)) return true;
        return false;
    }
}
