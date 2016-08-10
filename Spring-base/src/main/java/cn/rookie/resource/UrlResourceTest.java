package cn.rookie.resource;

import org.springframework.core.io.UrlResource;

import java.io.*;
import java.net.MalformedURLException;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.resource
 * Description:
 */
public class UrlResourceTest {
    private UrlResource urlResource;

    public void getHttp() {
        try {
            urlResource = new UrlResource("http://www.baidu.com");
            InputStream in = urlResource.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader buff = new BufferedReader(inputStreamReader);
            while (buff.readLine() != null) {
                System.out.println(buff.readLine());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UrlResourceTest urlResourceTest = new UrlResourceTest();
        urlResourceTest.getHttp();
    }
}
