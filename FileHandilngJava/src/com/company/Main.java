package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//	String path = "file.txt";
//	File file = new File(path);
//        FileWriter fr = null;
//        try {
//             fr = new FileWriter(file);
//            fr.write("Hello sir , this is me , literally me");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        ArrayList<String> arrayList = new ArrayList<String>();
        File file;
        Scanner scan= null;

        file = new File("file.txt");

        scan = new Scanner(file);
        String s;


        while(scan.hasNext()) {
            scan.useDelimiter("\n\r");

            s = scan.next();
            arrayList.add(s);
        }
        String res;
        ListIterator<String> iterator = arrayList.listIterator();

        res = arrayList.get(1);
        System.out.println(res);
//        while (iterator.hasNext()){
//    res = iterator.next().toString();
//            System.out.println(res);
//        }


    }
}
