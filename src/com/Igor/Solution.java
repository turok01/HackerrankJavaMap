package com.Igor;
//https://www.hackerrank.com/challenges/phone-book/problem
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String []argh)
    {
        Map <String,Integer> phoneBook = new HashMap <String,Integer>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name,phone);
        }
        ArrayList <String> findList = new ArrayList <String>();
        while(in.hasNext())
        {
            String s=in.nextLine();
            findList.add(s);
        }
        //for (Map.Entry <String,Integer> record : phoneBook.entrySet()){
        //    System.out.println(record);
        //}
        //for (String name: findList){
        //    System.out.println(name);
        //}
        for(String name: findList){
            if(phoneBook.containsKey(name))
                System.out.println(name + "=" + phoneBook.get(name));
            else
                System.out.println("Not found");
        }
    }
}
