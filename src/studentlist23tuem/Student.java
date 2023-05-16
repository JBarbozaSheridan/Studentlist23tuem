/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist23tuem;

/**
 *
 * @author Jose
 */
public class Student {
    private String sname;
    private String sID;

    public Student(String sname, String sID) {
        this.sname = sname;
        this.sID = sID;
    }

    
    
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
    
    
}
