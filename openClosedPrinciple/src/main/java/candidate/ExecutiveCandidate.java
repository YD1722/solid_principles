package candidate;

import service.IEmployeeService;

public class ExecutiveCandidate extends Candidate {

    public ExecutiveCandidate(String firstName, String lastName, IEmployeeService employeeService) {
        super(firstName, lastName, employeeService);
    }
}
