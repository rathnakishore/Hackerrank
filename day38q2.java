import java.io.*;
import java.util.*;

class Student{
    private String name;
    private int rollNo;
    private String department;
    Student(String name, int rollNo, String department){
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
    String getName(){
        return name;
    }
    
    int getRollNo(){
        return rollNo;
    }
    String getDepartment(){
        return department;
    }
}

interface Predicate{
    boolean test(Student t);
}

public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Invalid");
            return;
        }
        Student[] std = new Student[n];
        for(int i=0; i<n; i++){
            String name = sc.next();
            int rollNo = sc.nextInt();
            String department = sc.next();
            std[i] = new Student(name, rollNo, department);
        }
        
        Predicate cseFilter = (s)->{
            return s.getDepartment().equals("CSE");
        };
        
        for(int i = 0; i<std.length; i++){
            Student s = std[i];
            if(cseFilter.test(s)){
                System.out.println(s.getRollNo());
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}