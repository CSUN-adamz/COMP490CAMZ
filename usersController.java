public class usersController extends users {

    public void user(String user, String pass){
        userName = user;
        password = pass;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String user){
        userName = user;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String pass){
        password = pass;
    }

    public int getID(){
        return ID;
    }

    // NEEDS DATABSE WORK
}
