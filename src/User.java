import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {

    // private String name;
    // private String fatherName;
    // private String phoneNumber;
    // private String address;
    // private int age;
    // private String gender;
    // private String password;
    private String message;

    public String create(String[]  info){

        try (Connection connection = DatabaseConnection.getConnection()) {
            
            String sql = "INSERT INTO users (name, father_name, phone_number, address, age, gender, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, info[0]);
            statement.setString(2, info[1]);
            statement.setString(3, info[2]);
            statement.setString(4, info[3]);
            statement.setString(5, info[4]);
            statement.setString(6, info[5]);
            statement.setString(7, info[6]);

            statement.executeUpdate();

            this.message = "Registration Successful";
            // return this.message;

        } catch (SQLException e) {

            this.message =  e.getMessage();
            // return this.message;

        }

        return this.message;

    }

    public String login(String[] credentials){
        try {

            String name = credentials[0];
            String password = credentials[1];

            if ( name.equals("ali") && password.equals("admin")) {
                
                this.message = "Login Successful";

            } else {
                
                this.message = "Invalid user name or password";
            }
        

            return this.message;
            // return credentials[0] + credentials[1];
            

        } catch (Exception e) {

            // TODO: handle exception

            this.error();
            this.message = "Something went wrong, please try again later!";

            return this.message;

        }

    }

    // public String[] show(int info){
    //     String[] user_record = new String[2];
    //     try {

    //         user_record[0] = "name";
    //         user_record[1] = "father name";

    //         return user_record;

    //     } catch (Exception e) {

    //         // TODO: handle exception

    //         String[] error = new String[2];
    //         error[0] = this.error();
    //         error[1] = "Something went wrong, please try again later!";

    //         return error;

    //     }

    // }

    public String error(){

        return this.message;

    }



}