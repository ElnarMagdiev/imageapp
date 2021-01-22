package ru.magdiev.imageapp.repo;

import org.springframework.data.repository.CrudRepository;
import ru.magdiev.imageapp.entity.Order;

import java.util.List;

public interface OrderRepo extends CrudRepository<Order, Long> {
    Order findByGuid(String guid);
    List<Order> findByActiveTrue();
}
