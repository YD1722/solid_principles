package service;

import candidate.ICandidate;
import employee.IEmployee;

public class ManagerService extends EmployeeService implements IManagerService {
    @Override
    public IEmployee createNewAccount(ICandidate person) {
        IEmployee manager = super.createNewAccount(person);

        manager.setExecutive(true);
        manager.setManager(true);

        return manager;
    }
}
