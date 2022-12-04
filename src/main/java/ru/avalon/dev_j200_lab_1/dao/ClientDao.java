package ru.avalon.dev_j200_lab_1.dao;

import ru.avalon.dev_j200_lab_1.model.Client;

import java.util.List;

public interface ClientDao {
    void create(Client client);

    List<Client> read();

    void update(int id);

    void delete(int id);

}
