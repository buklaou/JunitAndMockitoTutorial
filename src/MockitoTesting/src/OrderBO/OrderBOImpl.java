package MockitoTesting.src.OrderBO;

import MockitoTesting.src.OrderBOException.BOException;
import MockitoTesting.src.OrderDAO.OrderDAO;
import MockitoTesting.src.OrderDTO.Order;

import java.sql.SQLException;

/**
 * Created by Raffi on 2/6/2016.
 */
public class OrderBOImpl implements OrderBO {

   private OrderDAO dao;

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }

    @Override
    public boolean placeOrder(Order order) throws BOException {
        try {
         int result = dao.create(order);
            if(result ==0) {
                return false;
            }
        } catch (SQLException e) {
            throw new BOException(e);
        }
        return true;
    }

    @Override
    public boolean cancelOrder(int id) throws BOException {

        try {
            Order order = dao.read(id);
            order.setStatus("Cancelled.");
            int result = dao.update(order);

            if(result == 0) {
                return false;
            }
        } catch (SQLException e) {
            throw new BOException(e);
        }
        return true;
    }

    @Override
    public boolean deleteOrder(int id) throws BOException {
        try {
            int result = dao.delete(id);
            if(result == 0) {
                return false;
            }
        } catch (SQLException e) {
            throw new BOException(e);
        }
        return true;
    }
}
