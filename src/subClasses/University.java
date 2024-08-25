package subClasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class University {

    private static ArrayList<Teacher> teachers;
    private static ArrayList<Student> students;

    static {
        teachers = new ArrayList();
        students = new ArrayList();

    }

    public static void addTeacher(Teacher t) {
        if (t != null) {
            teachers.add(t);
        } else {
            JOptionPane.showMessageDialog(null, "Teacher data is not recieved..!");
        }

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
}
