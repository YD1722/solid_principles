package candidate;

import service.ManagerService;

public class ManagerCandidate extends Candidate implements IManagerCandidate {
    public ManagerCandidate(String firstName, String lastName) {
        super(firstName, lastName);
        this.setEmployeeService(new ManagerService());
    }
}
