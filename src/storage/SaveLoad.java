package storage;

import java.io.*;

import datastructures.Lists;

public class SaveLoad {

    public static void save(String path, Lists list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
        oos.writeObject(list);
        oos.close();
    }

    public static Object load(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)))) {
            return ois.readObject();
        }
    }
}