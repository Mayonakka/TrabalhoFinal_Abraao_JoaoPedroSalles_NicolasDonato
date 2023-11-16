package lists;

import main.Person;

public interface UserLists extends Lists{
    public boolean createUser(String name, String cpf);
    public boolean removeUser(int codeUser);
    public Person searchList(int codeUser);
}
