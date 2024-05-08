package org.example.TestingWithMockito.UnitTesting;

public class OrderServiceImpl {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void saveOrder(Order order) {

        orderRepository.save(order);
    }
}
