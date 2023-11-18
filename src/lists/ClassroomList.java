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

    public boolean deleteClass(int classroomCode) {
        return classroomList.removeIf(p -> p.getClassroomCode() == classroomCode); 
    }

    public Classroom searchList(int classroomCode) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomCode() == classroomCode){
                return classroom;
            }
        }
        return null;
    }

    public boolean addStudentInClassroom(StudentList sList, int uCode, int crCode){
        return searchList(crCode).addUser((Student) sList.searchInList(uCode));
    }

    public boolean removeStudentInClassroom(StudentList sList, int uCode, int crCode){
        return searchList(crCode).removeUser((Student) sList.searchInList(uCode));
    }

    public boolean addProfessorInClassroom(ProfessorList pList, int uCode, int crCode){
        return searchList(crCode).setProfessor((Professor) pList.searchInList(uCode));
    }

    public boolean removeProfessorInClassroom(ProfessorList pList, int crCode){
        return searchList(crCode).setProfessor(null);
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
    
    public String toStringClassroom(int crCode) throws Exception{
        if(classroomList.contains(searchList(crCode)))
            return searchList(crCode).toStringStudents();
        throw new Exception("Turma nao encontrada");
    }
}
