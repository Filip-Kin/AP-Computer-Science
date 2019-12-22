public class Question4 {
    public static void main(String[] args) {

    }
}

class DiskDrive {
    // declare instance variables
    private double capacity, used, free;

    // postcondition: all instance variables are initialized
    public DiskDrive(double sizeCapacity) {
        capacity = sizeCapacity;
    }

    // postcondition: the disk space occupied is increased by the amount given by the
    // parameter and cannot exceed the maximum
    public void addFile(double size) {
        used += size;
        free = capacity-used;
    }

    // postcondition: the disk space occupied is decreased by the amount given by the
    // parameter and cannot be negative
    public void deleteFile(double size) {
        used -= size;
        free = capacity-used;
    }

    // postcondition: a quantity equal to the unoccupied disk space is provided and is
    // not negative
    public double getFreeSpace() {
        return free;
    }

    // other methods not shown
}