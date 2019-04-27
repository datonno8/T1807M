package java2_asm6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {
    public Connection conn;

    public static Connector instance;

    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/hao";
            this.conn = DriverManager.getConnection(URL,"hao99","haohao");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connector getInstance(){
        if(instance == null){
            instance = new Connector();
        }
        return  instance;
    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeQuery(sql);
    }

    public int updateQuery(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeUpdate(sql);
    }

    public void close() throws Exception{
        this.conn.close();
    }
}
