package candidate;

import service.EmployeeService;
import service.IEmployeeService;

public class Candidate implements ICandidate {
    private String firstName;
    private String lastName;
    private IEmployeeService employeeService;

    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeService = new EmployeeService();
    }

    public IEmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
