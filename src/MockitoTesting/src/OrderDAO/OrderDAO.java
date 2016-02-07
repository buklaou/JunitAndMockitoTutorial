package MockitoTesting.src.OrderDAO;

import MockitoTesting.src.OrderDTO.Order;

import java.sql.SQLException;

/**
 * Created by Raffi on 2/6/2016.
 */
public interface OrderDAO {

    int create(Order order) throws SQLException;

    Order read(int id) throws SQLException;

    int update(Order order) throws SQLException;

    int delete(int id) throws SQLException;
}
