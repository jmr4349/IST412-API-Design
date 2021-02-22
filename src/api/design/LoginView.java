
package api.design;

import java.awt.Button;
import java.awt.TextField;
import javax.swing.JLabel;

/** Represents the view for the login screen
 * @author Griffin Sullivan
*/
public class LoginView {
    private Button loginButton;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private TextField emailField;
    private TextField passwordField;
    private Button signUpButton;
    
    /** Authenticates the user when they attempt to login
     * @param email The user's email address
     * @param password The user's password
     * If successful the user will be taken to their dashboard
    */
    private void authenticate(String email, String password) {
        
    }
    
    /** New user sign up page
     * @param email The user's email
     * @param password The user's password
     * @param firstName The user's firstName
     * @param lastName The user's lastName
     * @param age The user's age
     * Creates a new customer and takes them to the customer dashboard
     */
    private void signUp(String email, String password, String firstName, String lastName, int age) {
        
    } 
}
