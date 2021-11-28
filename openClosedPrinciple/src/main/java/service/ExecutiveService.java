package service;

import candidate.ICandidate;
import employee.IEmployee;

public class ExecutiveService extends EmployeeService {

    @Override
    public IEmployee createNewAccount(ICandidate person) {
        IEmployee executive = super.createNewAccount(person);

        executive.setExecutive(true);

        return executive;
    }
}
