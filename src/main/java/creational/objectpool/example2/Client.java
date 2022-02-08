package creational.objectpool.example2;

import java.sql.Connection;

class Client {
    public static void main(String[] args)
    {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
                "sa", "password");

        // Get a connection:
        Connection con = pool.checkOut();
        // Return the connection:
        pool.checkIn(con);
    }
}
