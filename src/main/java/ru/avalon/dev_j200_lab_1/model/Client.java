package ru.avalon.dev_j200_lab_1.model;

public class Client {
    private final String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
