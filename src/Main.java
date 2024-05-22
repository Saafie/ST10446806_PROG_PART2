//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        //Declaring
        SwingUtilities.invokeLater(() -> {
            String Name = JOptionPane.showInputDialog("Enter name");
            String Surname = JOptionPane.showInputDialog("Surname");
            String Username = JOptionPane.showInputDialog("Enter Username");
            String Password;
            String registerUser;
            int Unsuccessful;
            int Successful;
            int valid = 0;
            int invalid = 0;

            //Validating if Username is or is not successful
            int length = Username.length();
            if (length == 5 && Username.contains("_")) {
                valid += 1;
            } else {
                invalid = 1;
            }

            boolean checkUsername = (valid > invalid);


            //Password validation
            Password = JOptionPane.showInputDialog("Enter Password");
            Successful = 0;
            Unsuccessful = 0;
            if (Password.length() >= 8 && (Password.matches(".*[A-Z].*") && Password.matches(".*\\d.*") && Password.matches(".*[!@#$%^&].*"))) {
                Successful = 1;
            } else {
                Unsuccessful = 1;
            }
            boolean checkUserPasswordComplexity = (Successful > Unsuccessful);

            registerUser = (checkUsername ? "Name: " + Name + "\n" + "Surname: " + Surname : "Resubmit") + "\n" + "\n"
                    + (checkUsername ? "Username Successfully Captured" : """
                            Username must be 5 character long
                            contain Underscore (_)
                            """) +
//             Display if Password Successful or Unsuccessful
                    "\n" + (checkUserPasswordComplexity ? "Password Successfully captured" : """
                            Must contain at least 8 characters
                            Contain a capital letter
                            Contain a Number
                            Contain a Special Character
                            """);
            JOptionPane.showMessageDialog(null, registerUser);


            if (Successful > Unsuccessful) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        LoginSystem loginSystem = new LoginSystem(Username, Password, Name, Surname);

                    }});
            }});}
}