// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // new RegistrationForm();
                    // new LoginForm();
                    new MainFrame().setVisible(true);
                    // new MainFrame().setVisible(true);
                }
            });


    //     String url = "jdbc:mysql://localhost:3306/cross_border";
    //     String user = "root"; // Change this to your MySQL username
    //     String password = ""; // Change this to your MySQL password

    //     try {
    //         Connection connection = DriverManager.getConnection(url, user, password);
    //         if (connection != null) {
    //             System.out.println("Connected to the database!");
    //         }
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
        
    }
    
}
