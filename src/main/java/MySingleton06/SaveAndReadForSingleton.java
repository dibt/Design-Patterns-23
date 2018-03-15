package MySingleton06;

import java.io.*;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class SaveAndReadForSingleton {
    /*序列化与反序列化测试代码*/
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();

        File file = new File("MySingleton.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            fos.close();
            oos.close();
            System.out.println(singleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            MySingleton rSingleton = (MySingleton) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(rSingleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
