package ru.avalon.dev_j200_lab_1.dao;

import ru.avalon.dev_j200_lab_1.model.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryDao implements ClientDao {

    private final AtomicInteger counter = new AtomicInteger();

    private final Map<Integer, Client> clients = new ConcurrentHashMap<>();

    //only for test
    {
        Client ivan = new Client(counter.incrementAndGet(), "Ivan", "fiz", new Date());
        Client pasha = new Client(counter.incrementAndGet(), "Pasha", "fiz", new Date());
        Client masha = new Client(counter.incrementAndGet(), "Masha", "ur", new Date());
        clients.put(ivan.getId(), ivan);
        clients.put(pasha.getId(), pasha);
        clients.put(masha.getId(), masha);
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
