package kr.co.ezenac.ioc;

import java.net.URLEncoder;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {

        String url = "www.google.com/books/it?page=100&name=springframework";

        //Base64 encoding
        IEncoder encoder = new Base64Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

        //url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);
    }
}
