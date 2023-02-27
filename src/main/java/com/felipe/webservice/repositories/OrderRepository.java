package com.felipe.webservice.repositories;

import com.felipe.webservice.entities.Order;
import com.felipe.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//we do not need to implement this interface, because Jpa already does this for us
public interface OrderRepository extends JpaRepository<Order, Long> {

}
