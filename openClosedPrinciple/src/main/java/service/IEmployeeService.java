package service;

import candidate.ICandidate;
import employee.IEmployee;

import java.util.List;

public interface IEmployeeService {
    String COMPANY_DOMAIN = "org";

    IEmployee createNewAccount(ICandidate person);

    List<IEmployee> createNewAccounts(List<ICandidate> candidateList);

    void showEmployeeDetails(IEmployee employeeList);
}
