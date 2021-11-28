package employee;

public class Employee implements IEmployee {
    private int id;
    private String name;
    private String mail;
    private boolean isManager = false;
    private boolean isExecutive = false;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean executive) {
        isExecutive = executive;
    }
}
