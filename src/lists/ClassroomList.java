package lists;

import java.util.LinkedList;
import main.Classroom;
import main.Course;
import main.Professor;
import main.Student;
import userinterface.UI;


public class ClassroomList implements Lists{

    private LinkedList<Classroom> classroomList = new LinkedList();

    
    public LinkedList<Classroom> getclassroomList() {
        return classroomList;
    }
    public void setclassroomList(LinkedList<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public boolean createClass(String course, String semesterYear) {
        int nextClassroomCode = (classroomList.isEmpty()) ? 1 : classroomList.getLast().getClassroomCode() + 1;
        return classroomList.add(new Classroom(course, semesterYear, nextClassroomCode));
    }

    public boolean deleteClass(int classroomCode) {
        return classroomList.removeIf(p -> p.getClassroomCode() == classroomCode); 
    }

    public Classroom searchList(int classroomCode) throws Exception {
        for (Classroom classroom : classroomList)
            if (classroom.getClassroomCode() == classroomCode)
                return classroom;
        throw new Exception("Turma nao encontrada");
    }

    public boolean addStudentInClassroom(StudentList sList, int uCode, int crCode) throws Exception {
        Student s = (Student) sList.searchInList(uCode);
        Classroom cr = searchList(crCode);
        return cr.addUser(s) && s.addNewCourse(new Course(cr.getCourse()));
    }

    public boolean removeStudentInClassroom(StudentList sList, int uCode, int crCode) throws Exception {
        Student s = (Student) sList.searchInList(uCode);
        Classroom cr = searchList(crCode);
        return cr.removeUser(s) && s.removeCourse(cr.getCourse());
    }

    public boolean addProfessorInClassroom(ProfessorList pList, int uCode, int crCode) throws Exception {
        return searchList(crCode).setProfessor((Professor) pList.searchInList(uCode));
    }

    public boolean removeProfessorInClassroom(ProfessorList pList, int crCode) throws Exception {
        return searchList(crCode).setProfessor(null);
    }

    @Override
    public String toStringList(int i) throws Exception {
        String sb = UI.CLEAR
        +"+-------------------------------------------+"
		+"|              LISTA DE TURMAS              |"
		+"+-------------------------------------------+";

        if (!classroomList.isEmpty())
            if(i == classroomList.size() -1)
                return sb + (classroomList.getLast().toString());
            else {
                return sb += classroomList.get(i).toString() + toStringList(++i);
            }
        throw new Exception("\nLista vazia");
    }
    
    public String toStringClassroom(int crCode) throws Exception{
        return searchList(crCode).toStringStudents();
    }
}
