package components;

import java.util.LinkedList;
import userinterface.UI;

public class Student extends Person {

    private LinkedList<Course> courses = new LinkedList<Course>();

    public Student(String name, int code) {
        super(name, code);
    }

    public boolean addNewCourse(Course course) throws Exception {
        if (!courses.contains(course))
            return courses.add(course);
        throw new Exception("\nAluno ja matriculado nesta disciplina");
    }

    public boolean removeCourse(String n) throws Exception {
        return courses.removeIf(c -> c.getName() == n);
    }

    public Course searchCourse(String cName) throws Exception {
        for (Course c : courses)
            if (c.getName() == cName)
                return c;
        throw new Exception("\nDisciplina nao encontrada");
    }

    // toStrings
    public String toStringRecord() {
        String s = UI.CLEAR
                + "\n\n+-------------------------------------------+"
                + "\n|             HISTORICO DO ALUNO            |"
                + "\n+-------------------------------------------+\n\n"
                + toString() + "\n";

        for (Course course : courses) {
            s += course.toString() + "\n";
        }
        return s;
    }

    public String toStringGrade(String cName) throws Exception {
        Course c = searchCourse(cName);
        return getCode() + "  |  " + getName() + "  |  " + c.toString() + "\n";
    }

    @Override
    public String toString() {
        return getCode() + "  |  " + getName() + "\n";
    }
}