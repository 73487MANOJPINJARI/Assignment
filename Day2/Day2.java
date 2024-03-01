 class Room {
    double height;
    double width;
    double breadth;

    // Method to calculate volume
    public double volume() {
        return height * width * breadth;
    }

    public static void main(String[] args) {
        // Creating an instance of Room
        Room room = new Room();

        // Assigning values directly to the fields
        room.height = 3.0;
        room.width = 4.2;
        room.breadth = 2.8;

        // Displaying the volume of the room
        System.out.println("Volume of the room: " + room.volume());
    }
}
