package candidate;

import service.IEmployeeService;

public class ManagerCandidate extends Candidate implements IManagerCandidate {
    public ManagerCandidate(String firstName, String lastName, IEmployeeService employeeService) {
        super(firstName, lastName, employeeService);
    }
}
