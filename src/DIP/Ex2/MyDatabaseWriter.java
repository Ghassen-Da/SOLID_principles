package DIP.Ex2;

public class MyDatabaseWriter implements IWriter {
	
	public void write(String str) {
		MyDatabase database = new MyDatabase();
        database.write(str);
	}
	
}
