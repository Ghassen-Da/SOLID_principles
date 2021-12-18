package DIP.Ex2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter implements IWriter{

	private String fileName;

    public MyFileWriter(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void write(String encodedLine) throws IOException 
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(encodedLine);
        writer.close();
    }

}
