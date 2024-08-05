package jdbc;

public class Connection {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mySql.cj.jdbc.Driver");
		System.out.println("driver class loaded sucessfully");
		
	}
}
