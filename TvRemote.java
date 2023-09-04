// create a television class with aggregarated remote class and vice versa , 
// the television class has attributes no_of_chanels, resolution, size, usb_ports, 
// hdmi_ports, bt_support, . the remote and television class have same methods.
//  except that remote class methods should call television class methods from
//   within their methods definitoins,
// 1) public void power_on()
// 2) public void power_off(
// 3) public void change_channel()
// 4) public void volume_up()
// 5) public void volume_down()
// 6) public void change_setting()
// initialize the remote and television class objects via constructors , call all 
// the methods of remote class object to operate the initialized television object in
//  the main function .create a Television class and a Remote class with the specified
// attributes and methods, ensuring that the methods in the Remote class call the 
// corresponding methods in the Television class.


class Television {
    private int numberOfChannels;
    private String resolution;
    private double size;
    private int usbPorts;
    private int hdmiPorts;
    private boolean btSupport;

    public Television(int numberOfChannels, String resolution, double size, int usbPorts, int hdmiPorts, boolean btSupport) {
        this.numberOfChannels = numberOfChannels;
        this.resolution = resolution;
        this.size = size;
        this.usbPorts = usbPorts;
        this.hdmiPorts = hdmiPorts;
        this.btSupport = btSupport;
    }

    public void powerOn() {
        System.out.println("Television is powered on.");
    }

    public void powerOff() {
        System.out.println("Television is powered off.");
    }

    public void changeChannel() {
        System.out.println("Changing channel.");
    }

    public void volumeUp() {
        System.out.println("Volume up.");
    }

    public void volumeDown() {
        System.out.println("Volume down.");
    }

    public void changeSetting() {
        System.out.println("Changing settings.");
    }
}

class Remote {
    private Television tv;

    public Remote(Television tv) {
        this.tv = tv;
    }

    public void powerOn() {
        tv.powerOn();
    }

    public void powerOff() {
        tv.powerOff();
    }

    public void changeChannel() {
        tv.changeChannel();
    }

    public void volumeUp() {
        tv.volumeUp();
    }

    public void volumeDown() {
        tv.volumeDown();
    }

    public void changeSetting() {
        tv.changeSetting();
    }
}


public class TvRemote {
    public static void main(String[] args) {
        // Create a Television object
        Television myTV = new Television(100, "4K", 55.0, 3, 4, true);

        // Create a Remote object and associate it with the Television
        Remote myRemote = new Remote(myTV);

        // Use the Remote to control the Television
        myRemote.powerOn();
        myRemote.changeChannel();
        myRemote.volumeUp();
        myRemote.volumeDown();
        myRemote.changeSetting();
        myRemote.powerOff();
    }
}
