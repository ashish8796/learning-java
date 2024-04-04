package designPattern.behaviouralDesignPattern.ObserverDesignPattern.Lecture;

import java.util.ArrayList;
import java.util.List;

// publisher
public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscriberList;

    public Amazon() {
        this.orderPlacedSubscriberList = new ArrayList<>();
    }

    public void orderPlaced() {
        /// order place business logic
        for(OrderPlacedSubscriber o : orderPlacedSubscriberList) {
            o.oderPlacedEvent();
        }
    }

    public void addOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void removeOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }
}
