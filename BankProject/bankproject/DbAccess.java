package bankproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

class DbAccess{
  private Connection connect = null;
      private Statement statement = null;
      private PreparedStatement preparedStatement = null;
      private ResultSet resultSet = null;

public DbAccess (){
  try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/bankproject?"
                            + "user=zee&password=zeeshan");

}
catch(Exception ex){
  System.out.println(ex.toString());
}
}

public void addCustomer(Customer c){
  try{
  statement = connect.createStatement();
  preparedStatement = connect.prepareStatement("insert into customers values (?, ?, ?, ?, ? , ?)");
    preparedStatement.setString(1, c.fname);
    preparedStatement.setString(2, c.lname);
    preparedStatement.setString(3, c.address);
    preparedStatement.setString(4, "3232423423423");
    preparedStatement.setString(5, "3434343");
    preparedStatement.setString(6, "45522555");
    preparedStatement.executeUpdate();

}
catch(Exception eee){
  System.out.println(eee.toString());
}
}
  public static void main(String[] args) {
DbAccess db=new DbAccess();
db.addCustomer();
//db.connect();
  }


}
