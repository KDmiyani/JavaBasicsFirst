import java.io.*;

public class Objectserialized {


    public static void firstserialized() throws Exception {
        Save save = new Save();
        save.i=11255;


        //File f = new File("Serialized.txt");

        FileOutputStream fos = new FileOutputStream("Serialized.txt");
        ObjectOutputStream ooc = new ObjectOutputStream(fos);
        ooc.writeObject(save);



    }
     static void  deserializable() throws Exception {
         FileInputStream fis = new FileInputStream("Serialized.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Save obj1 = (Save) ois.readObject();
         System.out.println(obj1.i);

     }
}

class Save implements Serializable {

    int i ;
}
