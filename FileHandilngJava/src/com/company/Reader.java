package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Reader {
    ArrayList<String> arrayList;
    File file;
    Scanner fileReader;
    Iterator iterator;
    Reader(){
        file = new File("file.txt");

        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s;
iterator = arrayList.iterator();

        while(fileReader.hasNext()){
            fileReader.useDelimiter("\n\r");
            s=fileReader.next("\n\r");
            arrayList.add(s);

        }


    }
}
