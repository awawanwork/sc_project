import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {

    private JTextField nameField;
    private JPasswordField passwordField;

    public LoginForm() {
        setTitle("Login Form");
        setSize(600, 400);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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


        // Create the main panel with GridBagLayout to center the form
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create the form panel with GridBagLayout for flexible layout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setPreferredSize(new Dimension(300, 200)); // Decrease the size of input fields
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        // Create and style components
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameField = new JTextField(15);
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));
        Color buttonBgColor = new Color(70, 130, 180);
        Color buttonFgColor = Color.WHITE;
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] data = new String[2];
                data[0] = nameField.getText();
                data[1] = new String(passwordField.getPassword());
                onSubmit(data);
            }
        });

        // Arrange components in the form panel
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding between components
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        formPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        formPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        formPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        formPanel.add(passwordField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(submitButton, gbc);

        // Add form panel to the main panel
        mainPanel.add(formPanel, new GridBagConstraints());

        // Add main panel to the frame
        add(mainPanel);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public void onSubmit(String[] data) {
        UserController reg = new UserController();
        String response = reg.login(data);

        JOptionPane.showMessageDialog(this,
                "Name: " + data[0] + "\n" +
                "Password: " + data[1] + "\n" +
                "Message: " + response,
                "Login Response", JOptionPane.INFORMATION_MESSAGE);
    }

}

