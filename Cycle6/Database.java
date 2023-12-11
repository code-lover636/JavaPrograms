import java.sql.*;

public class Database {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost/CODINGGROUND";
        String username = "your_username";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM your_table_name";
            
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String column1Value = resultSet.getString("column1");
                String column2Value = resultSet.getString("column2");
                System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
