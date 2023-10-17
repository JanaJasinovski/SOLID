package ua.com.fok.solid.dip;

public class SimpleLogin implements  Authenticator{

    //low level class

    public boolean authenticate(User user){
        // logic - database

        return true;
    }
}
