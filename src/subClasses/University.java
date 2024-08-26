package subClasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class University {

    private static ArrayList<Teacher> teachers;
    private static ArrayList<Student> students;
    private static ArrayList<CourseEnrol> coursEnrool;
    private static ArrayList<Course> courses;
    private static ArrayList<Attendence> attendences;
    private static ArrayList<Section> sections;

    static {
        teachers = new ArrayList();
        students = new ArrayList();
        coursEnrool = new ArrayList();
        courses = new ArrayList();
        attendences = new ArrayList();
        sections = new ArrayList();

    }

    public static void addTeacher(Teacher t) {
        if (t != null) {
            teachers.add(t);
        } else {
            JOptionPane.showMessageDialog(null, "Teacher data is not recieved..!");
        }

    }

    public static void delTeacher(Teacher obj) {
        teachers.remove(obj);
        JOptionPane.showMessageDialog(null, "Deleted successfiuly..!");
    }

    public static void delSection(Section obj) {
        sections.remove(obj);
        JOptionPane.showMessageDialog(null, "Deleted successfiuly..!");
    }

    public static void delCourse(Course obj) {
        courses.remove(obj);
        JOptionPane.showMessageDialog(null, "Deleted successfiuly..!");
    }

    public static void showMsgError(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static boolean tMatch(String name, String pass) {
        for (int i = 0; i < teachers.size(); i++) {
            if (name.equals(teachers.get(i).gettName()) && pass.equals(teachers.get(i).getEpass())) {
                return true;
            }
        }
        return false;
    }

    public static void addCourse(Course c) {
        if (c != null) {
            courses.add(c);

        } else {
            JOptionPane.showMessageDialog(null, "Course data is not recieved ..!");
        }
    }

    public static void addSection(Section s) {
        if (s != null) {
            sections.add(s);

        } else {
            JOptionPane.showMessageDialog(null, "Section data is not recieved ..!");
        }
    }

    public static ArrayList<Course> getAllCourse() {
        return courses;
    }

    public static ArrayList<Teacher> getAllTeacher() {
        return teachers;
    }

    public static ArrayList<Section> getAllSection() {
        return sections;
    }

    public static Course csearchByName(String name) {
        for (Course course : courses) {
            if (course != null && course.getSect() != null) {
                if (course.getcName().equals(name)) {
                    return course;
                }
            }
        }
        return null;
    }

    public static Teacher tSearchByName(String name) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).gettName().equalsIgnoreCase(name)) {
                return teachers.get(i);
            }

        }
        return null;
    }

    public static void update(String id, Teacher t) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).gettId() == id) {
                teachers.get(i).settName(t.gettName());
                teachers.get(i).settId(t.gettId());
                teachers.get(i).setSalary(t.getSalary());
                teachers.get(i).setDeprt(t.getDeprt());
                teachers.get(i).setAddress(t.getAddress());
                teachers.get(i).setPhoneNo(t.getPhoneNo());
                showMsgError("updated succcesfully..!");
            }
        }
    }

    public static void cupdate(String code, Course c) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcCode() == code) {
                courses.get(i).setcName(c.getcName());
                courses.get(i).setcCode(c.getcCode());
                courses.get(i).getSect().setSecName(c.getSect().getSecName());
                courses.get(i).getSect().setSecDay(c.getSect().getSecDay());
                courses.get(i).getSect().setSecRoom(c.getSect().getSecRoom());
                courses.get(i).getSect().setSecTime(c.getSect().getSecTime());
                courses.get(i).getSect().getTeach().settName(c.getSect().getTeach().gettName());
                showMsgError("updated succcesfully..!");
            }
        }
    }

}
