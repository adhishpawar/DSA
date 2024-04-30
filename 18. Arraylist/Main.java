import java.util.*;
public class Main {
    // Java code for a hotel room class
    public static void main(String args[])
{
    public class Room {
        private int roomNumber;
        private String roomType;
        private boolean isOccupied;
        private double rate;
        
        public Room(int roomNumber, String roomType, double rate) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.rate = rate;
            this.isOccupied = false;
        }
        
        public int getRoomNumber() {
            return roomNumber;
        }
        
        public String getRoomType() {
            return roomType;
        }
        
        public boolean isOccupied() {
            return isOccupied;
        }
        
        public double getRate() {
            return rate;
        }
        
        public void setOccupied(boolean occupied) {
            isOccupied = occupied;
        }
    }

    // Java code for a hotel reservation class
    public class Reservation {
        private int reservationId;
        private String customerName;
        private int roomNumber;
        private Date checkInDate;
        private Date checkOutDate;
        private double totalPrice;
        
        public Reservation(int reservationId, String customerName, int roomNumber, Date checkInDate, Date checkOutDate, double totalPrice) {
            this.reservationId = reservationId;
            this.customerName = customerName;
            this.roomNumber = roomNumber;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.totalPrice = totalPrice;
        }
        
        public int getReservationId() {
            return reservationId;
        }
        
        public String getCustomerName() {
            return customerName;
        }
        
        public int getRoomNumber() {
            return roomNumber;
        }
        
        public Date getCheckInDate() {
            return checkInDate;
        }
        
        public Date getCheckOutDate() {
            return checkOutDate;
        }
        
        public double getTotalPrice() {
            return totalPrice;
        }
    }

    // Java code for a hotel management system class
    public class HotelManagementSystem {
        private ArrayList<Room> rooms;
        private ArrayList<Reservation> reservations;
        
        public HotelManagementSystem()
        {

        }

    }
}
}
