package lists;

import java.io.*;

public class SaveLoad {

    public static void save(File file, Lists list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(list);
        oos.close();
    }

    public static Object load(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        }
    }
}
