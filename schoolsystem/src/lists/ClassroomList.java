package lists;

import java.util.LinkedList;
import main.Classroom;
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
    public String toStringList(int index) throws Exception{
        if(classroomList.isEmpty())
            throw new Exception(UI.RED + "\nLista vazia" + UI.RESET);
        else if (index == classroomList.size() -1)
            return classroomList.getLast().toString();
        else 
            return classroomList.get(index).toString() + "\n" + toStringList(++index);
    }

    public Classroom searchList(int code) {
        for (Classroom classroom : classroomList) {
            if (classroom.getClassroomCode() == code){
                return classroom;
            }
        }
        return null;
    }

    public boolean addUserInClassroom(UserLists lists, int codeUser, int codeClass){
        return searchList(codeClass).addUser(lists.searchList(codeUser));
    }
}
