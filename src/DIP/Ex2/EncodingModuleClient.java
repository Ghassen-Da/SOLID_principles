package DIP.Ex2;

import java.io.IOException;

public class EncodingModuleClient
{
	public static void main(String[] args) throws IOException 
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader("src/DIP/Ex2/beforeEncryption.txt");
        IWriter writer = new MyFileWriter("src/DIP/Ex2/afterEncryption.txt");
        encodingModule.encode(reader, writer);

        reader = new MyDatabaseReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}
