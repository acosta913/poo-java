package inheritance_reader.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ActionReader extends BufferedReader {

    public ActionReader(Reader in) {
        super(in);
    }

    public ActionReader() {
        super(new InputStreamReader(System.in));
    }

    public int ReadInt() throws IOException {
        return Integer.parseInt(readLine());
    }

    public double ReadDouble() throws IOException {
        return Double.parseDouble(readLine());
    }
}
