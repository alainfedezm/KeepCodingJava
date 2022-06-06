package com.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.tacos.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
