package oop.project;

public class BookingManager{
    Room[] rooms = new Room[10];
    public BookingManager() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1); 
        }
    }

    public void bookRoom(int numroom, Customer customer) {
        if (!rooms[numroom-1].isBooked) {
            rooms[numroom-1].isBooked = true;
            customer.numroom=numroom;
            System.out.println("Room " + rooms[numroom-1].roomNumber + " booked successfully.");
        } else {
            System.out.println("Room already booked.");
        }
    }

    public void cancelRoom(int numroom) {
        if (rooms[numroom-1].isBooked) {
            rooms[numroom-1].isBooked = false;
            System.out.println("Booking for room " + rooms[numroom-1].roomNumber + " cancelled.");
        } else {
            System.out.println("Room is not booked.");
        }
    }


    public void searchAvailableRooms() {

        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room: " + room.getRoomNumber());
            }
        }
    }
    public void numavailable(){
                       for(int i=0;i<rooms.length;i++){
            for(int j=1;j<rooms.length-i;j++){
                if(rooms[j-1].index<rooms[j].index){
                    int temp =rooms[j-1].index;
                    rooms[j-1].index=rooms[j].index;
                    rooms[j].index=temp;
                }
                    
                }
            }
        
        
         for (Room room : rooms) {
            if (!room.isBooked) {
                System.out.println("Room: " + (room.index));
            }
        }
    }
    
}
