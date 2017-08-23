import java.util.Calendar;

public class TestMe {

	public TestMe() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar calendar = Calendar.getInstance();
	    java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());
	    
	    System.out.println(ourJavaTimestampObject);

	}

}
