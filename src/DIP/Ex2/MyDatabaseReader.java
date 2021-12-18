package DIP.Ex2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class MyDatabaseReader implements IReader{
	
	private String protocol;
    private String host;
    private String file;

    public MyDatabaseReader(String protocol, String host, String file)
    {
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }

    public String read() throws IOException 
    {
        URL url = new URL(protocol, host, file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c = reader.read();
        while (c != -1) {
            inputString.append((char) c);
            c = reader.read();
        }
        return inputString.toString();
    }

}
