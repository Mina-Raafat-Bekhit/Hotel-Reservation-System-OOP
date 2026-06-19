package oop.project;

import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookingManager system = new BookingManager();
        RoomFee fee = new RoomFee();
        CheckInOut check = new CheckInOut();
        LoginSystem log = new LoginSystem();
        Account a=new Account("admin","123");
         Customer c=new Customer(a);
        do{
            System.out.println("1 : to create account");
            System.out.println("2 : to login account");
            int x=sc.nextInt();
            if(x==1){
                    System.out.println("enter username");
                    String email=sc.next();
                    System.out.println("enter password");
                    String password=sc.next();
                    System.out.println("");
                    Account account=new Account(email,password);
                    c.setAccount(account);
                    
            }else if (x==2){
                System.out.println("enter your email");
                    String t= sc.next(); 
                    System.out.println("enter your password");
                    String y=sc.next(); 
                    System.out.println("");
                    log.login(t,y,c);
            }
        }while(!log.isLogedin);
        
                while(true){
                System.out.println("welcome how we can help you?");
                System.out.println("1: to check available rooms");
                System.out.println("2: to know room fee");
                System.out.println("3: to book room");
                System.out.println("4: to cancel booking room");  
                System.out.println("5: to checkin/out");
                System.out.println("6: to calculate your total fee");
                System.out.println("7: to number available");
                System.out.println("0: to exit application");
                System.out.print("your choise: ");
            int choice = sc.nextInt(); 
            switch (choice) {
                case 1:
                    System.out.println("the available rooms:");
                    system.searchAvailableRooms(); 
                   

                    break;
                case 2:
                    
                    fee.displayRoomFee(); 
                    break;
                case 3:
                    System.out.println("enter room number you want to book");
                    int e= sc.nextInt();
                    system.bookRoom(e,c);
                    break;
                case 4:
                    System.out.println("enter room number you want to cancel booking");
                    int r=sc.nextInt(); 
                    system.cancelRoom(r);
                    break;
                case 5:
                    System.out.println("enter room number");
                    int k=sc.nextInt();
                    System.out.println("1: to check In \n 2: to check out");
                    int z= sc.nextInt();
                    if (z==1) {
                        if(system.rooms[k-1].isBooked&&c.numroom==k)
                            check.checkIn(k);
                        else
                            System.out.println("not booked");
                    }
                    else if (z==2) {
                        if(system.rooms[k-1].isBooked&&c.numroom==k)
                        check.checkOut(k);
                        system.cancelRoom(k);
                    }
                    break;
                    
                case 6:
                    System.out.println("how many nights you booked?");
                    int o=sc.nextInt();
                    System.out.println("total fee= " + fee.calculateRoomFee(o,c));
             
                    break;
                case 7:
              
                    system.numavailable();
                    break;
                case 0:
                    System.out.println("good bye");
                    break;
            
                default:
                    System.out.println("wrong choise");
                    break;
                    
            }
                  System.out.println("");
                  System.out.println("any thing else ?");
                  System.out.println("1:Yes");
                  System.out.println("2:No");
                  int y=sc.nextInt();
                  if(y==2)
                      break;
                      
        }

        sc.close();
    }
}
