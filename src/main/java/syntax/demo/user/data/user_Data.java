package syntax.demo.user.data;

//class
public class user_Data {
    private String userName;
    private String passwordUnescure;
    public String userType;

//constructor
    public user_Data(String userName, String passwordUnescure, String userType) {
        this.userType = userType;
        this.userName = userName;
        this.passwordUnescure = passwordUnescure;
    }

    //method
    public String update_userType(String updated_userType) {
        this.userType = updated_userType;
        return this.userType;
    }

    //objects

    user_Data Dan = new user_Data("Dan","09876","admin");
}
