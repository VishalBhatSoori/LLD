package singleResponsibility;
public class UserAuthenticator extends UserManager {
    @Override
    public void userAuthenticaton(){
        System.out.println("This classes single responsibility is to do user authentication");
    }
}
