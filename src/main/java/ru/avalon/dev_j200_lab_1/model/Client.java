package ru.avalon.dev_j200_lab_1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private final int id;
    private final String name;
    private final String type;
    private final Date added;
    private final List<Address> addresses;

    public Client(int id, String name, String type, Date added) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.added = added;
        this.addresses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getAdded() {
        return added;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", added=" + added +
                ", addresses=" + addresses +
                '}';
    }
}
