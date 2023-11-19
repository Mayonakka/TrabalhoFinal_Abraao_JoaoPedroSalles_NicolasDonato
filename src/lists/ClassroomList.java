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
        int nextClassroomCode = (classroomList.isEmpty()) ? 1001 : classroomList.getLast().getClassroomCode() + 1;
        return classroomList.add(new Classroom(course, semesterYear, nextClassroomCode));
    }

    public boolean deleteClass(int classroomCode) {
        return classroomList.removeIf(p -> p.getClassroomCode() == classroomCode); 
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

    public boolean addGrade(int crCode, int uCode, float a, float b) throws Exception{
        Classroom cr = searchList(crCode);
        return cr.searchStudent(uCode).searchCourse(cr.getCourse()).calcFinalGrade(crCode, uCode);
    }

    public Classroom searchList(int classroomCode) throws Exception {
        for (Classroom classroom : classroomList)
            if (classroom.getClassroomCode() == classroomCode)
                return classroom;
        throw new Exception("\nTurma nao encontrada");
    }

    //toStrings
    @Override
    public String toStringList() throws Exception{
        String sb = UI.CLEAR
        +"\n\n+-------------------------------------------+"
	      +"\n|              LISTA DE TURMAS              |"
		  +"\n+-------------------------------------------+\n";
          return sb + toStringList(0);
    }
    
    public String toStringList(int i) throws Exception {
        if (!classroomList.isEmpty())
            if(i == classroomList.size() -1)
                return  (classroomList.getLast().toString());
            else {
                return classroomList.get(i).toString() + toStringList(++i);
            }
        throw new Exception("\nNao ha turmas cadastradas");
    }
    
    public String toStringClassroom(int crCode) throws Exception{
        String sb = UI.CLEAR
        +"\n\n+-------------------------------------------+"
	      +"\n|             DETALHES DA TURMA             |"
		  +"\n+-------------------------------------------+\n";
        return sb + searchList(crCode).toStringStudents();
    }

    public String toStringClassroomGrades(int crCode) throws Exception{
        String sb = UI.CLEAR
        +"\n\n+-------------------------------------------+"
	      +"\n|             BOLETIM DA TURMA              |"
		  +"\n+-------------------------------------------+\n";
        return sb + searchList(crCode).toStringStudentsGrades();
    }
}
