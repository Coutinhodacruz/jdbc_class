import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.testng.Assert.assertNotNull;


public class DatabaseTest {

    @Test
    public void testDatabaseConnectivity(){

        try(Connection connection =
                    DriverManager.getConnection("jdbc:mysql//localhost/elites",
                            "root","Coutinho10@")){

            assertNotNull(connection);
            System.out.println(connection);
        }catch (SQLException exception){
            System.err.println("ERROR Connecting to database-> " + exception.getMessage() );
        }
    }

}
