package model;

import com.test.util.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {


    public static boolean addUsers (
            String FirstName,
            int Birthday,
            String Email,
            String UserName,
            String Password)
    {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(
                    DBCredentials.DB_ADDRESS,
                    DBCredentials.USERNAME,
                    DBCredentials.PASSWORD);

            String addUsersCommand = "INSERT INTO Users " +
                    "(FirstName, Birthday, Email, UserName,Password) " +
                    "VALUES ('" +
                    FirstName + "', '" +
                    Birthday + "', '" +
                    Email + "', '" +
                    UserName + "', '" +
                    Password + "')";
            System.out.println("SQL Query " + addUsersCommand);

            Statement st = mysqlConnection.createStatement();// creates the statement

            int results = st.executeUpdate(addUsersCommand);// executes the statement

            //if (result == 1)
            return true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return false; //null result indicates an issue
        }
    }
}
