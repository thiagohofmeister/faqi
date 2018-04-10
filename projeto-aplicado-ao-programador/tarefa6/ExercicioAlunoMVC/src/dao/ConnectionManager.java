/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class ConnectionManager {

    private static ConnectionManager conn;

    private ConnectionManager() {
    }

    public static ConnectionManager getInstance() {
        if (conn == null) {
            conn = new ConnectionManager();
        }

        return conn;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //localiza e carrega o driver do mysql
        Class.forName("com.mysql.jdbc.Driver");
        
        //faz a conexão com o banco de dados
        return DriverManager.getConnection(
            "jdbc:mysql://localhost/bancohoras",
            "root", 
            "usbw"
        );
    }

    public void closeAll() throws ClassNotFoundException, SQLException {
        if (getInstance().getConnection() != null) {
            getInstance().getConnection().close();
        }
    }
}
