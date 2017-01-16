package pairapp;

import java.awt.Rectangle;
import java.io.*;

public class PairApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rectangle rec1 = new Rectangle(0,0,5,6);
        Rectangle rec2 = new Rectangle(0,0,7,8);
        
        Pair<Rectangle> prec = new Pair<Rectangle>();
        prec.setFirst(rec1);
        prec.setSecond(rec2);
        System.out.println("1st is: " + prec.getFirst().toString());
        System.out.println("2nd is: " + prec.getSecond().toString());
        
        Pair<Rectangle> newprec = prec.clone();
        System.out.println("Clone's 1st is: " + newprec.getFirst().toString());
        System.out.println("Clone's 2nd is: " + newprec.getSecond().toString());
        
        newprec.setFirst(rec2);
        System.out.println("Clone's new 1st is: "
                + newprec.getFirst().toString());
        System.out.println("Original's new 1st is: "
                + prec.getFirst().toString());
        
        ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("pairs.dat"));
        out.writeObject(prec);
        out.close();
        
        Pair<Rectangle> outpair = new Pair<Rectangle>();
        
        ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("pairs.dat"));
        outpair = (Pair<Rectangle>) in.readObject();
        in.close();
        
        System.out.println("Output pair's 1st is: " + outpair.getFirst());
        System.out.println("Output pair's 2nd is: " + outpair.getSecond());
    }
    
}
