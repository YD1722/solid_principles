package employee;

public interface IEmployee {
    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    String getMail();

    void setMail(String mail);

    boolean isManager();

    void setManager(boolean manager);

    boolean isExecutive();

    void setExecutive(boolean executive);
}
