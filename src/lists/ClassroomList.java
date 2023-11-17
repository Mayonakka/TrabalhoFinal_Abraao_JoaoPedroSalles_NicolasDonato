package lists;

import java.util.LinkedList;
import main.Classroom;
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

    public boolean createClass(String course, String semesterYear, int classroomSize) {
        int nextClassroomCode = (classroomList.isEmpty()) ? 1001 : classroomList.getLast().getClassroomCode() + 1;
        return classroomList.add(new Classroom(course, semesterYear, classroomSize, nextClassroomCode));
    }

    public boolean removeClass(int classroomCode) {
        return classroomList.removeIf(p -> p.getClassroomCode() == classroomCode); 
    }

    @Override
    public String toStringList(int i) throws Exception{
        if(classroomList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (i == classroomList.size() -1)
            return classroomList.getLast().toString();
        else 
            return classroomList.get(i).toString() + "\n" + toStringList(++i);
    }

    public Classroom searchList(int code) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomCode() == code){
                return classroom;
            }
        }
        return null;
    }

    public boolean addUserInClassroom(StudentList sList, int codeUser, int codeClass){
        return searchList(codeClass).addUser((Student) sList.searchList(codeUser));
    }
}
