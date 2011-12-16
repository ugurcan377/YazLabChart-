/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yazlabwebapp;
import java.io.IOException;
import java.util.*;
import java.lang.Math;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import yazLabChartLib.*;

/**
 *
 * @author ugurcan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
                yazLabChartMain asas = new yazLabChartMain();
        try {
          Class.forName("org.postgresql.Driver");}
       catch (ClassNotFoundException cnfe) {
          System.err.println("Couldn't find driver class:");
        }
        Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5432/deneme","postgres","090202003");
        Statement stmt = con.createStatement();
        String SQL = "SELECT * FROM TEST";
        ResultSet rs = stmt.executeQuery(SQL);
        asas.dataSource = rs;
        JFrame f = new JFrame("Pie Chart");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,600);
        f.setLocation(300,300);
        f.setVisible(true);
        asas.chartType = asas.chartType.Pie;
        asas.DataBind(f);
    }

}
