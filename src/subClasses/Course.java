/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subClasses;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Course {
    private Section sect;
    private String cCode;
    private String cName;

    public Course() {
    }

    public Section getSect() {
        return sect;
    }

    public void setSect(Section sect) {
        this.sect = sect;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Course(Section sect, String cCode, String cName) {
        this.sect = sect;
        this.cCode = cCode;
        this.cName = cName;
    }

}
