package mysingleton6;

import java.io.*;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class SaveAndReadForSingleton {
    /*序列化与反序列化测试代码*/
    public static void main(String[] args) {
        MySingleton6 singleton = MySingleton6.getInstance();

        File file = new File("mysingleton6.txt");

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
            MySingleton6 rSingleton = (MySingleton6) ois.readObject();
            //也可以返回一个全新的其他类型的对象，不过这样没有什么意义。
            //String s = (String) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(rSingleton.hashCode());
            //System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            file.deleteOnExit();
        }
    }
}
