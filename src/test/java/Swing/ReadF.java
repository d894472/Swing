package Swing;

import javax.swing.*;
import java.io.*;


public class ReadF {


    public void Reading(File f,JTextArea jta) throws  IOException{
        InputStreamReader ism=new InputStreamReader(new FileInputStream(f),"UTF-8");
        BufferedReader br= new BufferedReader(ism);
        String cs=br.readLine();
        while (cs!=null){
            jta.append(cs);
            cs=br.readLine();

    }









}

}
