import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    
    public MainFrame() {
        setTitle("Main Screen");
        setSize(1500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the menu
        JMenu menu = new JMenu("Menu");

        // Create menu items
        JMenuItem loginItem = new JMenuItem("Login");
        JMenuItem registrationItem = new JMenuItem("Registration");

        // Add action listeners for menu items
        loginItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginForm();
            }
        });

        registrationItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegistrationForm();
            }
        });

        // Add menu items to the menu
        menu.add(loginItem);
        menu.add(registrationItem);

        // Add the menu to the menu bar
        menuBar.add(menu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Create the main content panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create and add the title label
        JLabel titleLabel = new JLabel("Welcome to the Registration and Login Application", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create and add the description label
        JLabel descriptionLabel = new JLabel("<html><div style='text-align: center;'>"
                + "<p>This application allows users to register and login.</p>"
                + "<p>Use the menu above to navigate to the registration or login pages.</p>"
                + "</div></html>", SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        panel.add(descriptionLabel, BorderLayout.CENTER);

        // Add the panel to the frame
        add(panel);

        // Set the frame to be visible
        setVisible(true);
    }

}
