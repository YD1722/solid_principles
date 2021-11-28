package candidate;

import service.IEmployeeService;

public interface ICandidate {
    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    void setEmployeeService(IEmployeeService employeeService);

    IEmployeeService getEmployeeService();
}
