import java.io.*;
import java.util.Properties;

public class FlieHandling {


    public static void filefirst() throws Exception {
        FileOutputStream fos = new FileOutputStream("demokdkd.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("keval miyani is my name");

        FileInputStream fis = new FileInputStream("demokdkd.txt" );
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);

    }

    public static void propertyclass() throws Exception {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("fileconfig.properties");


        p.setProperty("url","localhost:8080");
        p.setProperty("username","admin");
        p.setProperty("password","12345678790kaja");

        p.store(os,null);


        InputStream is= new FileInputStream("fileconfig.properties");
        p.load(is);

        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));

        p.list(System.out);

    }







}
