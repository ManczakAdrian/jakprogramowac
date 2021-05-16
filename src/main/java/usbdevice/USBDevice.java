package usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconect();
    String getName();
}
