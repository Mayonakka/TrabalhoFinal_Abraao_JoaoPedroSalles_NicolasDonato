package lists;

import java.util.LinkedList;
import main.Classroom;
import main.Person;
import userinterface.UI;

public class ClassroomList implements Lists{

    private LinkedList<Classroom> classroomList = new LinkedList();

    
    public LinkedList<Classroom> getclassroomLists() {
        return classroomList;
    }
    public void setclassroomLists(LinkedList<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public boolean createClass(String course, String semesterYear, int classroomSize) {
        int nextClassroomCode = (classroomList.isEmpty()) ? 11 : classroomList.getLast().getClassroomCode() + 10;
        return classroomList.add(new Classroom(course, semesterYear, classroomSize, nextClassroomCode));
    }

    public boolean removeClass(int classroomCode) {
        return classroomList.removeIf(p -> p.getClassroomCode() == classroomCode); 
    }

    public String getList(int index) throws Exception{
        if(classroomList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (index == classroomList.size() -1)
            return classroomList.getLast().toString();
        else 
            return classroomList.get(index).toString() + "\n" + getList(++index);
    }

    public Classroom searchClassroom(int code) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomCode() == code){
                return classroom;
            }
        }
        return null;
    }

    public boolean addUser(UserLists lists, int codeUser, int codeClass){
        return searchClassroom(codeClass).addUser(lists.searchList(codeUser));
    }
}
