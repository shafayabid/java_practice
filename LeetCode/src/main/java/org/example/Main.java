package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String s = "AnyRandomString";
        char ch[] = s.toCharArray();
        int output = 0;
        int tempOutput = 0;
        ArrayList<Character> testList = new ArrayList<Character>();
        for(int i = 0; i < ch.length; i++){
            testList.add(ch[i]);
            if(i < ch.length - 1){
                for(int j = i + 1; j < ch.length; j++){
                    if(!testList.contains(ch[j])){
                        testList.add(ch[j]);
                    }else{
                        j = ch.length - 1;
                    }
                }
            }
            tempOutput = testList.size();
            if(tempOutput > output){
                output = tempOutput;
            }
            testList.clear();
        }
        System.out.println(output);
    }
}