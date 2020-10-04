package main.java.com.borlok.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Применение класса URLConnection
 */
public class UCDemo4 {
    public UCDemo4() {
        int c;
        try {
            URL hp = new URL("http://www.internic.net");
            URLConnection hpCon = hp.openConnection();
            long d = hpCon.getDate();
            if (d == 0)
                System.out.println("Сведения о дате отсутствуют");
            else
                System.out.println("Дата: " + new Date(d));

            System.out.println("Тип содержимого: " + hpCon.getContentType());
            d = hpCon.getExpiration();
            if (d == 0)
                System.out.println("Сведения о сроке действия отсутствуют");
            else
                System.out.println("Срок действия истекает: " + new Date(d));
            d = hpCon.getLastModified();
            if (d == 0)
                System.out.println("Сведения о последней модификации отсутствуют");
            else
                System.out.println("Последняя модификация: " + new Date(d));
            long len = hpCon.getContentLengthLong();
            if (len == -1)
                System.out.println("Длинна недоступна");
            else
                System.out.println("Длинна содержимого: " + len);

            if (len != 0){
                System.out.println("---Содержимое---");
                InputStream in = hpCon.getInputStream();
                while ((c = in.read()) != -1) {
                    System.out.print((char) c);
                }
                in.close();
            } else
                System.out.println("Содержимое недоступно");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
