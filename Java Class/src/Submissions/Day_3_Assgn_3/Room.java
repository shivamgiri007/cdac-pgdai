package Submissions.Day_3_Assgn_3;
//Q 3 Write a program to create a room class, the attributes of this class is roomno, roomtype, 
//roomarea and ACmachine. In this class the member functions are setdata and displaydata.

class Room {
    // Attributes of the Room class
    private int roomno;
    private String roomtype;
    private double roomarea;
    private boolean ACmachine;

    // Method to set room data
    public void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    // Method to display room data
    public void displayData() {
        System.out.println("Room Number: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq. ft.");
        System.out.println("AC Machine: " + (ACmachine ? "Yes" : "No"));
    }

    // Main method to demonstrate the Room class
    public static void main(String[] args) {
        // Create a Room object
        Room room = new Room();

        // Set room data
        room.setData(101, "Deluxe", 450.0, true);

        // Display room data
        room.displayData();
    }
}
