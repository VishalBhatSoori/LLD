package singleResponsibility;
public class UpdateProfile extends UserManager{
    @Override
    public void updateProfile(){
        System.out.println("The single responsibility of this class is to update profile");
    }
}
