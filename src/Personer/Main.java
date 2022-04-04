package Personer;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tall = new ArrayList<Integer>();
        tall.add(2);
        tall.add(4);
        tall.add(1);
        tall.add(9);
        tall.add(5);
        bool heltall = new bool(tall);

        System.out.println(heltall.storst(tall));
        System.out.println(heltall.minst(tall));
    }
}
