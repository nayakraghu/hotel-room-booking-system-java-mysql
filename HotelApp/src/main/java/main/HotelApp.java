package main; import java.util.Scanner; import dao.*; import model.Room;
public class HotelApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);RoomDAO dao=new RoomDAO();UserDAO u=new UserDAO();
        System.out.println("===== Admin Login =====");System.out.print("Username: ");String user=sc.nextLine();System.out.print("Password: ");String pass=sc.nextLine();
        if(!u.login(user,pass)){System.out.println("Invalid credentials");return;}System.out.println("Login Successful");
        while(true){
            System.out.println("\n===== Hotel Room Booking System =====");
            System.out.println("1.Add Room / Book\n2.View All Rooms\n3.Search by ID\n4.Available Rooms\n5.Check-Out\n6.Delete Room\n7.Count Rooms\n8.Occupancy Report\n9.Sort by Price\n10.Exit");
            System.out.print("Choice: ");int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("Room Number: ");String rn=sc.nextLine();System.out.print("Type (Single/Double/Suite): ");String t=sc.nextLine();System.out.print("Guest Name: ");String g=sc.nextLine();System.out.print("Price/Night: ");double p=sc.nextDouble();sc.nextLine();System.out.print("Check-In Date: ");String ci=sc.nextLine();System.out.print("Check-Out Date: ");String co=sc.nextLine();System.out.print("Status (Booked/Available): ");String st=sc.nextLine();System.out.println(dao.add(new Room(rn,t,g,p,ci,co,st))?"Room Added/Booked":"Failed");break;
                case 2:dao.viewAll();break;case 3:System.out.print("ID: ");dao.searchById(sc.nextInt());break;
                case 4:dao.availableRooms();break;
                case 5:System.out.print("Room ID: ");System.out.println(dao.checkOut(sc.nextInt())?"Checked Out Successfully":"Failed");break;
                case 6:System.out.print("ID: ");System.out.println(dao.delete(sc.nextInt())?"Deleted":"Failed");break;
                case 7:dao.count();break;case 8:dao.occupancyReport();break;case 9:dao.sortByPrice();break;
                case 10:System.out.println("Thank you!");return;default:System.out.println("Invalid");
            }
        }
    }
}
