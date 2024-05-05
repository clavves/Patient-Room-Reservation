/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package patientroomreserve;

/**
 *
 * @author 90554
 */
public class User extends Person{

    private String username;
    private String password;

    
    public User(String firstName, String lastName, String username, String password) {
        super(firstName, lastName);
        this.username = username;
        this.password = password;
    }
    
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
