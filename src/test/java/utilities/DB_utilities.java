package utilities;

import java.sql.*;

public class DB_utilities {
    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;

    public void getConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://212.47.242.13:6336/hypnotes",
                    "hypnotes",
                    "hypnotes"

            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void tearDatabase() {
        try {

            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
