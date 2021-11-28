package candidate;

import service.ExecutiveService;

public class ExecutiveCandidate extends Candidate {

    public ExecutiveCandidate(String firstName, String lastName) {
        super(firstName, lastName);
        this.setEmployeeService(new ExecutiveService());
    }
}
