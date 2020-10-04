package main.java.com.borlok.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Применение класса HttpUrlConnection
 */
public class HttpURLDemo5 {
    public HttpURLDemo5() {
        URL hp = null;
        try {
            hp = new URL("http://www.google.com");
            HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
            System.out.println("Метод запроса: " + hpCon.getRequestMethod());
            System.out.println("Код ответа: " + hpCon.getResponseCode());
            System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());
            Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
            Set<String> hdrFields = hdrMap.keySet();
            System.out.println("\nДалее следует заголовок:");
            for (String k : hdrFields){
                System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
