package fr.aelion.user;

import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;

public class LoginManager {
    private String login;
    private String password;
    private StudentRepository studentRepository = new StudentRepository();
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public LoginManager(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String login(){
        if (this.login.equals(null) || this.password.equals(null)){
            return "403 Forbidden";
        }
        return this.studentRepository.findByLoginAndPassword(this.login, this.password) ? "200 ok" : "404 Not Found";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }





    public void logout(){

    }
}
