package TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static final String DB_NAME="testjava.db";
	public static final String CONNECTION_STRING="jdbc:sqlite:C:\\Work\\Projects\\database\\"+DB_NAME;
	public static final String TABLE_CONTACTS="contacts";
	public static final String COLUMN_NAME="name";
	public static final String COLUMN_PHONE="phone";
	public static final String COLUMN_EMAIL="email";
	
	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection(CONNECTION_STRING);
			Statement statement = conn.createStatement();
			statement.execute("DROP TABLE IF EXISTS "+TABLE_CONTACTS);
			statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_CONTACTS+" ("+ COLUMN_NAME + " text, "+ COLUMN_PHONE + " integer, "+COLUMN_EMAIL+" text)");
			statement.execute("INSERT INTO "+TABLE_CONTACTS+" VALUES('TOM','12345','tom@test.com')");
			statement.execute("INSERT INTO "+TABLE_CONTACTS+" VALUES('ALVIN','11111','alvin@test.com')");
			statement.execute("INSERT INTO "+TABLE_CONTACTS+" VALUES('FRANCES','22222','frances@test.com')");
			statement.execute("UPDATE "+TABLE_CONTACTS+" SET "+COLUMN_PHONE+" =55555"+" WHERE "+COLUMN_NAME+" ='FRANCES'");
			
			ResultSet results = statement.executeQuery("SELECT * FROM contacts");
			while(results.next()) {
				System.out.println(results.getString("name")+" "+results.getInt("phone")+" "+results.getString("email"));
			}
	
			statement.close();
			conn.close();
		} catch(SQLException e) {
			System.out.println("Something went wrong"+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
