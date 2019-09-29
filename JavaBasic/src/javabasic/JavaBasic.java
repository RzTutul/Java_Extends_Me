/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rztut
 */
public class JavaBasic {

    public static void main(String[] args) {
        
        StudentInfo stdInfo1 = new StudentInfo("123", "Rz Tutul", "CSE", "01924250146");
        
        StudentInfo stdInfo2 = new StudentInfo("5001", "Jack Sparrow");
  
       ///Here we can use gatter stter mathod;
       
        stdInfo1.setStdPhone("019242501461");
        stdInfo1.setStdName("Jack Sprarrow");
        stdInfo1.setStdDept("CSE");
        stdInfo1.setStdId("12454");
        System.out.println("\n"+stdInfo1.allinfo()); 
        
        
        ///ArrayList
        
        ArrayList<StudentInfo> std = new ArrayList<>();
        
        std.add(stdInfo1);
        std.add(stdInfo2); //add method take object or reference
        
        for (StudentInfo studentInfo : std) {
            
            System.out.println(studentInfo.allinfo());
    
        }
        
        ArrayList<String> city = new ArrayList<>();
        
        city.add("Dhaka");
        city.add("Jeshore");
        city.add("Shylet");
        System.out.println(city.size());
        for(String showcity : city)
        {
            System.out.println("\n"+showcity);
        }
        
        
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy hh:mm");
        
        String today = format.format(new Date());
        
        System.out.println(today);
        
 
    }
    
}
