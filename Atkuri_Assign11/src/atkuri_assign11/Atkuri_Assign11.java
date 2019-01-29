/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atkuri_assign11;

import java.sql.*;

/**
 *
 * @author Ashok Atkuri
 */
public class Atkuri_Assign11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.0.110:1521/orcl";
        String username = "ashok";
        String password = "ashok";
        Statement dbStatement = null;
        ResultSet resultSet = null;
        Connection conn = null;

        try {
            conn
                    = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful.");
            System.out.println("*************************************");
        } catch (SQLException ex) {
            System.out.println("Problems with connection" + ex);
        }

        String query
                = "select s_id,math_score,reading_score,writing_score,total_score from studentmarks";

        try {
            dbStatement
                    = conn.createStatement();

        } catch (SQLException ex) {
            System.out.println("Problems creating statement" + ex);
        }
        try {
            resultSet = dbStatement.executeQuery(query);

        } catch (SQLException ex) {
            System.out.println("Problems executing statement" + ex);
        }
        try {
            while (resultSet.next()) {
                int sId = resultSet.getInt("s_id");
                int mathScore = resultSet.getInt("math_score");
                int readingScore = resultSet.getInt("reading_score");
                int writingScore = resultSet.getInt("writing_score");
                int totalScore = resultSet.getInt("total_score");

                int sumOfScores = mathScore + readingScore + writingScore;
                if (totalScore != sumOfScores) {
                    System.out.println("update CALL EXECUTED on");
                    System.out.println("S_ID:- " + sId + " Sum of scores:- " + sumOfScores + " TotalScore:- " + totalScore);
                    try {
                        CallableStatement updateTotalScore
                                = conn.prepareCall("{call check_total(?, ?)}");
                        updateTotalScore.setString(1, sId + "");
                        updateTotalScore.setString(2, totalScore + "");
                        updateTotalScore.executeUpdate();
                    } catch (SQLException ex) {
                        System.out.println("Problems with CallableStatement");
                    }

                }

            }
        } catch (SQLException ex) {
            System.out.println(
                    "SQLException occurred while displaying results.\n"
                    + ex);
        }

        try {
            System.out.println("*************************************");
            dbStatement.close();

        } catch (SQLException ex) {
            System.out.println("Problem closing statement.");
        }
        try {
            conn.close();
            System.out.println("closing connection");
        } catch (SQLException ex) {
            System.out.println("Problem closing connection.");
        }
        finally{
            conn.close();
        }
    }
}
