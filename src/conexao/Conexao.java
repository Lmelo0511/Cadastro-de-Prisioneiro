
package conexao;

import java.sql.*;

public class Conexao {
    private final static String connurl="jdbc:sqlserver://localhost:1433;databaseName=PrisionalBD;encrypt=true;trustServerCertificate=true;integratedSecurity=true";
    
    private static Connection conexao;
    
    public static Connection conectar(){
        try{
        conexao = DriverManager.getConnection(connurl);
    }catch (SQLException e){
        e.printStackTrace();
    }
        return conexao;
}
    public static void desconectar(){
        try{
            conexao.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}