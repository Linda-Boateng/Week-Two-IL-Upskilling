package org.example.TestingWithMockito.UnitTesting;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class OrderServiceImplTest {
    @Mock
    private OrderRepository orderRepository;

    @Test
    void testSaveOrder() {

        OrderServiceImpl orderService = new OrderServiceImpl(orderRepository);

        Order order = new Order();
        order.setOrderId(123);

        Mockito.doNothing().when(orderRepository).save(Mockito.any(Order.class));

        orderService.saveOrder(order);

        Mockito.verify(orderRepository).save(order);
    }
}
