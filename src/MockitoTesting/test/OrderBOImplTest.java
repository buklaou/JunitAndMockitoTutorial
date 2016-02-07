package MockitoTesting.test;

import MockitoTesting.src.OrderBO.OrderBOImpl;
import MockitoTesting.src.OrderBOException.BOException;
import MockitoTesting.src.OrderDAO.OrderDAO;
import MockitoTesting.src.OrderDTO.Order;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by Raffi on 2/6/2016.
 */
public class OrderBOImplTest {

    @Mock
    OrderDAO dao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }



    @Test
    public void test() throws SQLException, BOException {
        /* placeOrder should create an order*/
        OrderBOImpl bo = new OrderBOImpl();
        bo.setDao(dao);
        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer(1));

        boolean result = bo.placeOrder(order);
        assertTrue(result);
        verify(dao).create(order);

    }
}
