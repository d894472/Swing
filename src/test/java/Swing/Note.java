package Swing;



import javax.swing.*;
import java.awt.*;

public class Note extends JFrame {
    public static void main(String[] args) {
        Note nt=new Note();
    }

        public  JFrame f =new JFrame();
        static  JTextArea jta=new JTextArea(30,60);
        static  JScrollPane jspa=new JScrollPane(jta);
        static  JFileChooser jfc= new JFileChooser();
        static  JButton savbtu=new JButton("Save");
        static  JButton readbtu=new JButton("Read");
        static FlowLayout blo=new FlowLayout();
    public Note(){
        f.setTitle("NoteSwing");
        f.setSize(800,600);
        f.setLayout(blo);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(jspa);
        f.add(savbtu);
        f.add(readbtu);
        


    }


}
