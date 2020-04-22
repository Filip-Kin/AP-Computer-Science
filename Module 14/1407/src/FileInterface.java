/**
 * File interfacing API
 * 
 * @author Filip Kin
 * @version 2020-03-26
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileInterface {
    File f;
    FileWriter w;
    Scanner r;
    String mode;

    public static boolean exists(String path) {
        return new File(path).exists();
    }

    FileInterface(String path, String mode) throws IOException {
        this.mode = mode;
        f = new File(path);
        if (!f.exists()) f.createNewFile();
        if (mode.indexOf("r") > -1) r = new Scanner(f);
        if (mode.indexOf("w") > -1) w = new FileWriter(path);
    }

    public void write(String contents) throws IOException {
        w.write(contents);
    }

    public String readLine() {
        return r.nextLine();
    }

    public String readFile() {
        StringBuilder out = new StringBuilder();
        while (r.hasNextLine()) {
            out.append(r.nextLine());
        }
        return out.toString();
    }
    
    public void close() throws IOException {
        if (mode.indexOf("r") > -1) r.close();
        if (mode.indexOf("w") > -1) w.close();
    }

    public File getFile() {
        return f;
    }

    public Scanner getScanner() {
        return r;
    }

    public FileWriter getFileWriter() {
        return w;
    }

    public String getMode() {
        return mode;
    }
}