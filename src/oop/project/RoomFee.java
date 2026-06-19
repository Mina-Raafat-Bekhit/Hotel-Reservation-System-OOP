package oop.project;

import java.util.Scanner;

public class RoomFee {
    public void displayRoomFee() {
        Scanner sc=new Scanner(System.in);
        System.out.println( "1 : single fee ");
        System.out.println(" 2 : douple fee ");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("50 per night");
        }else if(num==2){
            System.out.println("100 per night");
        }else{
            System.out.println("no option valid");
        }
        
    }
        
    
        
    public double calculateRoomFee(int nights , Customer c){
        if(c.numroom%2==0){            
        return nights*100;
        }else{
            return nights*50;
        }
    }
    
}
