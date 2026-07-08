package model;
public class Room {
    private int id; private String roomNumber,type,guestName,checkIn,checkOut; private double pricePerNight; private String status;
    public Room(){}
    public Room(String roomNumber,String type,String guestName,double pricePerNight,String checkIn,String checkOut,String status){this.roomNumber=roomNumber;this.type=type;this.guestName=guestName;this.pricePerNight=pricePerNight;this.checkIn=checkIn;this.checkOut=checkOut;this.status=status;}
    public int getId(){return id;} public void setId(int i){this.id=i;}
    public String getRoomNumber(){return roomNumber;} public void setRoomNumber(String r){this.roomNumber=r;}
    public String getType(){return type;} public void setType(String t){this.type=t;}
    public String getGuestName(){return guestName;} public void setGuestName(String g){this.guestName=g;}
    public double getPricePerNight(){return pricePerNight;} public void setPricePerNight(double p){this.pricePerNight=p;}
    public String getCheckIn(){return checkIn;} public void setCheckIn(String c){this.checkIn=c;}
    public String getCheckOut(){return checkOut;} public void setCheckOut(String c){this.checkOut=c;}
    public String getStatus(){return status;} public void setStatus(String s){this.status=s;}
}
