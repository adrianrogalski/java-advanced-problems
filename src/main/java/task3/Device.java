package task3;

public abstract class Device {
    // Pola producer i batteryCapacity po utworzeniu maja pozostac niezmienne
    final String producer;
    final int batteryCapacity;
    // pole isWifi bedzie package-driven
    boolean isWiFi;

    // Każdy obiekt dziedziczący będzie miał domyślny konstruktor z 2 polami
    public Device(String producer, int batteryCapacity) {
        this.producer = producer;
        this.batteryCapacity = batteryCapacity;
    }

    // Kazdy obiekt dziedziczący będzie miał metode obliczającą jego max czas pracy
    public int maxWorkTime(int consumptionPerHour){
        return batteryCapacity/consumptionPerHour;
    }

    public String getProducer() {
        return producer;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    public void setWiFi(boolean wiFi) {
        isWiFi = wiFi;
    }

    public abstract String sendsSMS(String sms);
}
