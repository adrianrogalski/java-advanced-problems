package task3;

public class Laptop extends Device {
    final String dvdDrive;
    final int powerSupply;

    public Laptop(int batteryCapacity, String dvdDrive, int powerSupply, String producer) {
        super(producer, batteryCapacity);
        this.dvdDrive = dvdDrive;
        this.powerSupply = powerSupply;

    }


    public String getDvdDrive() {
        return dvdDrive;
    }

    public int getPowerSupply() {
        return powerSupply;
    }


    @Override
    public String sendsSMS(String sms) {
        if (isWiFi){
            return "Your laptop is sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }


}