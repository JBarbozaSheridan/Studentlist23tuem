/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist23tuem;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Studentlist23tuem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student("S1", "s1");
        Scanner input = new Scanner(System.in);
        
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student("s2","abc");
        studentList[2] = new Student("s3","def");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getSname());
        }
        
    }
    
}
