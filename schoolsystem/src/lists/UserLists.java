package lists;

import java.util.LinkedList;

import main.Person;

public interface UserLists extends Lists{
    public Person searchList(int code);
    public LinkedList<Person> getList();
    public boolean createUser(String name, String cpf);
    public boolean removeUser(int codeStudent);

}
