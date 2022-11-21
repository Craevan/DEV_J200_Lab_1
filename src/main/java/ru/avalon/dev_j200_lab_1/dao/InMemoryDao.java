package ru.avalon.dev_j200_lab_1.dao;

import ru.avalon.dev_j200_lab_1.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryDao implements ClientDao {

    private final AtomicInteger counter = new AtomicInteger();

    private final Map<Integer, Client> clients = new ConcurrentHashMap<>();

    //only for test
    {
        clients.put(counter.incrementAndGet(), new Client("Ivan"));
        clients.put(counter.incrementAndGet(), new Client("Pasha"));
        clients.put(counter.incrementAndGet(), new Client("Masha"));
    }

    @Override
    public void create(Client client) {
        clients.put(counter.incrementAndGet(), client);
    }

    @Override
    public List<Client> read() {
        return new ArrayList<>(clients.values());
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Client client) {

    }
}
