package usbdevice;

public class MemoryStick implements USBDevice  {
    public MemoryStick(String name) {
        this.name = name;
    }

    private String name;
    private boolean ejected = false;
    @Override
    public boolean connect() {
        System.out.println("connected memory stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Please eject Memory stick first");
            return false;
        } else {
            System.out.println("Memory Stick disconnected");
            return true;
        }
    }
    public void eject(){
        System.out.println("ejecting Memory Stick");
        ejected =true;
    }

    @Override
    public String getName() {
        return null;
    }
}
