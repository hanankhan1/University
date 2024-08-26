
package subClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class CourseEnrol {
    private Course cour;
    private Student stud;
    private LocalDate date;
    private LocalDateTime time;

    public CourseEnrol(Course cour, Student stud, LocalDate date, LocalDateTime time) {
        this.cour = cour;
        this.stud = stud;
        this.date = date;
        this.time = time;
    }

    public CourseEnrol() {
    }

    public Course getCour() {
        return cour;
    }

    public void setCour(Course cour) {
        this.cour = cour;
    }

    public Student getStud() {
        return stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
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
