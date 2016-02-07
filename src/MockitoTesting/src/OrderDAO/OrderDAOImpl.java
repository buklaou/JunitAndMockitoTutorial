package MockitoTesting.src.OrderDAO;

import MockitoTesting.src.OrderDTO.Order;

import java.sql.SQLException;

/**
 * Created by Raffi on 2/6/2016.
 */
public class OrderDAOImpl implements OrderDAO{


    @Override
    public int create(Order order) throws SQLException {
        return 0;
    }

    @Override
    public Order read(int id) throws SQLException {
        return null;
    }

    @Override
    public int update(Order order) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }
}
