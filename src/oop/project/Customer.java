package oop.project;

 public class Customer extends User {
    Account account;
    int numroom;
    public Customer(){
        
    }
    public Customer(Account account) {
        
        this.account=account;
    }

    public int getNumroom() {
        return numroom;
    }

    public void setNumroom(int numroom) {
        this.numroom = numroom;
    }
    
    public void setAccount(Account account){
        this.account=account;
    }
    @Override
    public void displayInfo() {
        System.out.println("Customer: " + username);
    }
}
