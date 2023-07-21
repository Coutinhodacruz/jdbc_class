package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try(Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost/elites?createDatabaseIfNotExist=true",
                        "root","Coutinho10@")){

            System.out.println(connection);
        }catch (SQLException exception){
            System.err.println("ERROR Connecting to database-> " + exception.getMessage() );
        }
    }
}
