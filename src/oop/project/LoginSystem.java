package oop.project;

public class LoginSystem {

    boolean isLogedin;
    
    public void login(String email,String password,Customer customer ) {
        if(customer.account.email.equals(email)&&customer.account.password.equals(password)){
            isLogedin=true;
            System.out.println("login succses");
        }else{
            isLogedin=false;
            System.out.println("try again");
        }
        
    }
}
