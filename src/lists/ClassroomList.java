package lists;

import java.util.LinkedList;
import main.Classroom;
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

    public boolean removeClass(int classroomCode) {
        return classroomList.removeIf(p -> p.getClassroomCode() == classroomCode); 
    }

    public Classroom searchList(int code) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomCode() == code){
                return classroom;
            }
        }
        return null;
    }

    public boolean addStudentInClassroom(StudentList sList, int codeUser, int codeClass){
        return searchList(codeClass).addUser((Student) sList.searchList(codeUser));
    }

    public boolean removeStudentInClassroom(StudentList sList, int codeUser, int codeClass){
        return searchList(codeClass).removeUser((Student) sList.searchList(codeUser));
    }

    public boolean addProfessorInClassroom(ProfessorList pList, int codeUser, int codeClass){
        return searchList(codeClass).setProfessor((Professor) pList.searchList(codeUser));
    }

    public boolean removeProfessorInClassroom(ProfessorList pList, int codeClass){
        return searchList(codeClass).setProfessor(null);
    }

    @Override
    public String toStringList(int i) throws Exception{
        if(classroomList.isEmpty())
            throw new Exception("\nLista vazia");
        else if (i == classroomList.size() -1)
            return classroomList.getLast().toString();
        else 
            return classroomList.get(i).toString() + "\n" + toStringList(++i);
    }
    
    public String toStringClassroom(int code) throws Exception{
        if(!classroomList.contains(searchList(code)))
            throw new Exception("Turma nao encontrada");
        else {
            return searchList(code).toString() + searchList(code).toStringStudents();
        }
    }
}
