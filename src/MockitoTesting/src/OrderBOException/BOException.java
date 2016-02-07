package MockitoTesting.src.OrderBOException;

import java.sql.SQLException;

/**
 * Created by Raffi on 2/6/2016.
 */

public class BOException extends Exception {
    public BOException(SQLException e) {
        super(e);
    }
}
