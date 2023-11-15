package lists;

public interface Lists {
    public boolean createUser(String name, String cpf);
    public boolean removeUser(int codeStudent);
    public String getUserList(int index) throws Exception;
}
