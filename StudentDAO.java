package Application2;

import java.sql.*;
import java.util.ArrayList;
public class StudentDAO {
    static Connection con = null;

        static {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee?user=root&password=sql@123");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        public int insert(StudentDto d1) {
            int count = 0;
            PreparedStatement psmt = null;
            String query = "insert into student values(?,?,?)";

            try {
                psmt = con.prepareStatement(query);
                psmt.setInt(1, d1.getRollno());
                psmt.setString(2, d1.getName());
                psmt.setDouble(2, d1.getMarks());
                count = psmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return count;
        }

        public ResultSet viewBooks() {
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            String query = "select * from book1_info";
            try {
                pstmt = con.prepareCall(query);
                rs = pstmt.executeQuery();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return rs;
        }


        public int delete(StudentDto d1) {
            int count = 0;
            PreparedStatement psmt = null;
            String query = "delete from book1_info where book id=?";
            try {
                psmt = con.prepareStatement(query);
                psmt.setInt(1, d1.getRollno());
                psmt.setString(2, d1.getName());
                psmt.setDouble(3, d1.getMarks());

                count = psmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return count;
        }
    }






