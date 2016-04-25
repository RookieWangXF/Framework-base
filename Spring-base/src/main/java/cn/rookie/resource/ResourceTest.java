package cn.rookie.resource;

import org.springframework.core.io.*;

import java.net.MalformedURLException;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie.resource
 * Description:
 */
public class ResourceTest {

    public static void testClassPathResource() throws MalformedURLException {
        //从类加载路径下读取资源,对于web应用会访问WEB-INF/classes下的资源
        ClassPathResource cr = new ClassPathResource("book.xml");
    }

    public static void testUrlResource() throws MalformedURLException {
        //指定读取资源,网络资源或者本地资源,java.net.URL类的包装
        UrlResource ur = new UrlResource("F:book.xml");
    }
    public static void testFileSystemResource() throws MalformedURLException {
        //默认从文件系统的当前路径读取
        FileSystemResource url = new FileSystemResource("book.xml");
    }

    public static void testByteArrayResource() throws MalformedURLException {
        //InputStreamResource
        //ByteArrayResource 优先使用
        String file = "feifei";
        byte[] files = file.getBytes();
        ByteArrayResource bar = new ByteArrayResource(files);
        System.out.println(bar.getDescription()+ new String(bar.getByteArray()));
    }

    public static void main(String[] args) throws MalformedURLException {
        ResourceTest.testByteArrayResource();
    }
}
