package MockitoTesting.src.OrderBO;

import MockitoTesting.src.OrderBOException.BOException;
import MockitoTesting.src.OrderDTO.Order;

/**
 * Created by Raffi on 1/27/2016.
 */
public interface OrderBO {

    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;
}
