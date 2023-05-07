import java.sql.*;

public class JavaDatabaseConnectivity {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyRecord", "root","root");
			Statement stmt = con.createStatement();
			System.out.println("Inserting Records");
			String sql = "insert into student values(2, 'Mayank Roy', 8)";
			stmt.executeUpdate(sql);
			
			// Displaying Table data
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getInt(3));
				
			}ed
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
