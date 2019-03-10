package Yeh;

import java.io.*;
import java.net.*;
import  org.json.*;
import net.sf.json.JSONObject.*;


public class PaTest {

    public static void main(String[] args)throws IOException {
       try {
            String url="http://quality.data.gov.tw/dq_download_json.php?nid=99341&md5_url=0a0c00d6d259d7cb28e079e15b067f78";
            InputStream ism=new URL(url).openStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(ism));
            String str;
            StringBuilder sb=new StringBuilder();
            int read=0;
            while((read=br.read())!=-1){

                sb.append((char)read);
            }

            net.sf.json.JSONObject.fromObject(sb);
           System.out.println(sb.toString());
       }
       catch (Exception e){

           System.out.println("Error Message:" + e.getMessage());
       }
    }
}
