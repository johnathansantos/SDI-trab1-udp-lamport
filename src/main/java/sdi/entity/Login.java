package sdi.entity;

/**
 *
 * @author Johnathan Douglas S. Santos
 */
public class Login {

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Login{" + "username=" + username + ", password=" + password + '}';
    }
}
