import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {
    
    private JTextField nameField;
    private JTextField fatherNameField;
    private JTextField phoneNumberField;
    private JTextField addressField;
    private JTextField ageField;
    private JComboBox<String> genderComboBox;
    private JPasswordField passwordField;
    
    //fatherName

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(1500, 800);

        // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // // Set the JFrame size to the screen size
        // setSize(screenSize.width, screenSize.height);
        // // Optional: Set the JFrame to fullscreen mode
        // setExtendedState(JFrame.MAXIMIZED_BOTH);

        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 10, 10));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));


        nameField = new JTextField();
        fatherNameField = new JTextField();
        phoneNumberField = new JTextField();
        addressField = new JTextField();
        ageField = new JTextField();

        String[] genders = {"Male", "Female", "Other"};
        genderComboBox = new JComboBox<>(genders);

        passwordField = new JPasswordField();

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String[] data = new String[7];

                data[0] = nameField.getText();
                data[1] = fatherNameField.getText();
                data[2] = phoneNumberField.getText();
                data[3] = addressField.getText();
                data[4] = ageField.getText();
                data[5] = (String) genderComboBox.getSelectedItem();
                data[6] = new String(passwordField.getPassword());
                onSubmit(data);
            }
        });

        panel.add(new JLabel("Name:"));
        panel.add(nameField);

        panel.add(new JLabel("Father Name:"));
        panel.add(fatherNameField);
        
        panel.add(new JLabel("Phone Number:"));
        panel.add(phoneNumberField);

        panel.add(new JLabel("Address:"));
        panel.add(addressField);

        panel.add(new JLabel("Age:"));
        panel.add(ageField);

        panel.add(new JLabel("Gender:"));
        panel.add(genderComboBox);

        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        panel.add(new JLabel());
            buttonPanel.add(new JLabel());
            buttonPanel.add(submitButton);
        panel.add(buttonPanel);

        add(panel);
        setVisible(true);
    }

    public void onSubmit(String[] data) {

        UserController reg = new UserController();
        
        String response =  reg.registration(data);

        JOptionPane.showMessageDialog(this,
                "Name: " + data[0] + "\n" +
                "Father Name: " + data[1] + "\n" +
                "Phone Number: " + data[2] + "\n" +
                "Address: " + data[3] + "\n" +
                "Age: " + data[4] + "\n" +
                "Gender: " + data[5] + "\n" +
                "Password: " + data[6]+ "\n" +
                "Message: " + response,
                //  + "\n" +
                // "Warnings: " + info.error(),
                //fatherName
                "Registration Successful", JOptionPane.INFORMATION_MESSAGE);

                
                new  LoginForm();
    }
}
 