package MyCrud.project.users;

public class UsuarioPadrao {

    private Integer id;
    private String login;
    private String password;

    public UsuarioPadrao(){}

    public UsuarioPadrao(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UsuarioPadrao{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
