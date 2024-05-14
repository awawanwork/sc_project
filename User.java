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
        try {

            this.message = "Registration Successful";

            return this.message;

        } catch (Exception e) {
            // TODO: handle exception

            this.error();
            this.message = "Something went wrong, please try again later!";

            return this.message;
        }  

    }

    public String login(String[] credentials){
        try {

            if(credentials[0] == "ali" && credentials[1] == "admin" ){
                
                this.message = "Login Successful";

            }else{

                this.message = "Invalid user name or password";
            }

            return this.message;
            

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