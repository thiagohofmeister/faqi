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

    public Connection getConnection() throws SQLException {
        //localiza e carrega o driver do mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Falha ao conectar.");
        }

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/bancohoras",
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
