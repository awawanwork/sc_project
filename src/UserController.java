public class UserController {
    
    // private String name;
    // private String fatherName;
    // private String phoneNumber;
    // private String address;
    // private int age;
    // private String gender;
    // private String password;
    private String message;

    public String registration(String[]  info){
        try {
            User user = new User();

            message = user.create(info);

            return this.message;

        } catch (Exception e) {
            // TODO: handle exception

            this.message = "Something went wrong, please try again later!";

            return this.message;
        }  

    }

    public String login(String[]  credentials){
        try {
            User user = new User();

            message = user.login(credentials);

            return this.message;

        } catch (Exception e) {
            // TODO: handle exception
            
            this.message = "Something went wrong, please try again later!";

            return this.message;
        }  

    }

    // public String[] show(int  id){
        
    //     try {
    //         String[] user_record = new String[2];

    //         User user = new User();

    //         user_record = user.show(id);

    //         return user_record;

    //     } catch (Exception e) {
    //         // TODO: handle exception

    //         String[] error = new String[2];

    //         error[0] = "Something went wrong, please try again later!";

    //         return error;
    //     }  

    // }

}
