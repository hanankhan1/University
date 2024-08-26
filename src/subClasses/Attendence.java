/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author pc
 */
public class Attendence {
    private Section sec;
    private boolean mark;
    private LocalDate date;
    private LocalDateTime time;

    public Attendence(Section sec, boolean mark, LocalDate date, LocalDateTime time) {
        this.sec = sec;
        this.mark = mark;
        this.date = date;
        this.time = time;
    }

    public Attendence() {
    }

    public Section getSec() {
        return sec;
    }

    public void setSec(Section sec) {
        this.sec = sec;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
}
