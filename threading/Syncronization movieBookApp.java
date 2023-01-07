class BookTheaterSeat{
   int total_seats=20;
  /*/*synchronized*/ public void Bookseats(int seats){
if(total_seats>=seats){
System.out.println(seats+ "   Seats booked succefully");
total_seats=total_seats-seats;
System.out.println(total_seats+"   seats are left");
}
else{
    System.out.println("seats can not be booked");
    System.out.println("seats lefts "+total_seats);
}
    }
}
class movieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
   public void run(){
        b.Bookseats(seats);
    }
    public static void main(String[] args) {
        b =new BookTheaterSeat();
        movieBookApp m=new movieBookApp();
        m.seats=18;
        m.start();
        movieBookApp n=new movieBookApp();
        n.seats=4;
        n.start();
    }
}*/
public void BookSeats(seat){
if(Total-seats>=seat){
System.out.println(seat+"seats booked successfully");
Total_seats=Total_seats-seat;
System.out.println(seat+"seats left");
}
else{
Syste.out.println("u cant not book the seats "+seat+"seats left");
}
}
}
}
class