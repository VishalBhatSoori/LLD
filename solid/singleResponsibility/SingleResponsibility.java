package singleResponsibility;
public class SingleResponsibility{
    public static void main(String[]args){
        UserManager manager = new UserAuthenticator();
        manager.userAuthenticaton();

        UserManager manager2 = new EmailNotifier();
        manager2.emailNotification();

        UserManager manager3 = new UpdateProfile();
        manager3.updateProfile();
    }
}