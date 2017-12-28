package PastQuestionPro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kapersky
 */
public class DBFunctions {

    public static String getQuestion(int id, String sub) {
        String question = null;
        try {

            Connection con = database.getConnection();
            String query = "SELECT  Question FROM CoursesTable where SN = " + id + "  and Subject = '" + sub + "';";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                question = rs.getString("Question");
            }
        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return question;
    }

    public static String getAnswerA(String question) {
        String AnswerA = null;
        try {

            Connection con = database.getConnection();
            String query = "SELECT  AnswerA FROM CoursesTable where Subject = '" + question + "';";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                AnswerA = rs.getString("AnswerA");
            }
        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return AnswerA;
    }

    public static String getAnswerB(String sub) {
        String question = null;
        try {

            Connection con = database.getConnection();
            String query = "SELECT  AnswerB FROM CoursesTable where Subject = '" + sub + "';";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                question = rs.getString("AnswerB");
            }
        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return question;
    }

    public static String getAnswerC(String sub) {
        String question = null;
        try {

            Connection con = database.getConnection();
            String query = "SELECT  AnswerC FROM CoursesTable where Subject = '" + sub + "';";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                question = rs.getString("AnswerC");
            }
        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return question;
    }

    public static String getAnswerD(String sub) {
        String question = null;
        try {

            Connection con = database.getConnection();
            String query = "SELECT  AnswerD FROM CoursesTable where Subject = '" + sub + "';";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                question = rs.getString("AnswerD");
            }
        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return question;
    }

    public static String getAnswerE(String sub) {
        String question = null;
        try {

            Connection con = database.getConnection();
            String query = "SELECT  AnswerE FROM CoursesTable where Subject = '" + sub + "';";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                question = rs.getString("AnswerE");

            }
        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return question;
    }

}
