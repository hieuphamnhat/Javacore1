import java.io.*;

public class HandleFile {
    public static void main(String[] args) {
        File file = new File("E://testjavafile.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            System.out.println("This is content of file: ");
            while (bis.available() > 0) {
                System.out.print((char) bis.read());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file not found" + fnfe);
        } catch (IOException ioe) {
            System.out.println("I/O Exception: " + ioe);
        } finally {
            try {
                if (bis != null && fis != null) {
                    fis.close();
                    bis.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
