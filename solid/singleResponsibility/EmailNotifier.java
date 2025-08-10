package singleResponsibility;

public class EmailNotifier extends UserManager {
    @Override
    public void emailNotification() {
        System.out.println("This class's single responsibility is to send email notifications");
    }
}