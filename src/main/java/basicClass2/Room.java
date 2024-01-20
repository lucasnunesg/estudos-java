package basicClass2;

public class Room {
    private String name;
    private String email;
    private int roomNumber;

    public Room(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return String.format("%s, %s%n", name, email);
    }
}
