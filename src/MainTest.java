
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


    class MainTest {

        String Name = "Kyle";                //Enter Name
        String Surname = "Cheddar";          //Enter Surname
        String Username = "kyl_1";           // Enter test Username (Valid: "kyl_1" ,Invalid: "Kyle!!!!!!!")
        String Password = "Ch&&sec@ke99!";   // Enter test Password (Valid: "Ch&&sec@ke99!" ,Invalid: "password")

        //Declaring
        //Password
        String validPassword = "Ch&&sec@ke99!";
        String invalidPassword = "password";
        //Username
        String  validUsername = "kyl_1";
        String  invalidUsername = "kyle!!!!!!!";

        @Test
        public void ValidUsername(){
            SwingUtilities.invokeLater(() -> {
                assertEquals("kyl_1", validUsername);
                System.out.println("Username captured successfully.");
            });}

        @Test
        public void invalidUsername() {
            assertEquals("kyle!!!!!!!", Username);
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");

        }

        @Test
        public void Valid_Password(){
            assertEquals("Ch&&sec@ke99!", Password);
            System.out.println("Password successfully captured.");
        }

        @Test
        public void invalidPassword(){
            assertEquals("password", Password);
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");

        }

        @Test
        public void Login_Success() {
            boolean login = Username.equals(validUsername) && Password.equals(validPassword);

            System.out.println("Login Successful");
            System.out.println("Welcome " + Name + " " + Surname + ", good to see.");
            assertTrue(login);}

        @Test
        public void Login_Failed() {
            boolean flogin = Username.equals(invalidUsername) && Password.equals(invalidPassword);
            System.out.println("Login Unsuccessful");
            assertFalse(flogin);

        }
        //Checks to see if Username is Correct/True and displays True or False
        @Test
        public void LoginInvalidUsername() {
            String username = Username;
            validUsername = "kyl_1";
            invalidUsername = "kyle!!!!!!!";
            boolean unsuccessful = (username.equals(validUsername));

            assertFalse(unsuccessful);
        }

        @Test
        public void LoginInvalidPassword() {
            String password = Password;
            validPassword = "Ch&&sec@ke99!";
            invalidPassword= "password";
            boolean unsuccessful = (password.equals(validPassword ));

            assertFalse(unsuccessful);


        }}
