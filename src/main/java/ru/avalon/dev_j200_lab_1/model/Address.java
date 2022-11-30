package ru.avalon.dev_j200_lab_1.model;

public class Address {

    private final String ip;
    private final String mac;
    private final String model;
    private final String address;
    private final Client client;

    public Address(String ip, String mac, String model, String address, Client client) {
        this.ip = ip;
        this.mac = mac;
        this.model = model;
        this.address = address;
        this.client = client;
    }

    public String getIp() {
        return ip;
    }

    public String getMac() {
        return mac;
    }

    public String getModel() {
        return model;
    }

    public String getAddress() {
        return address;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Address{" +
                "ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", model='" + model + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
