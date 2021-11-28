import candidate.Candidate;
import candidate.ExecutiveCandidate;
import candidate.ICandidate;
import candidate.ManagerCandidate;
import service.EmployeeService;
import employee.IEmployee;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICandidate> candidateList = new ArrayList<>();

        candidateList.add(new ManagerCandidate("Tommy", "Shelby"));
        candidateList.add(new Candidate("Arthur", "Shelby"));
        candidateList.add(new Candidate("Michal", "Shelby"));
        candidateList.add(new ExecutiveCandidate("Polly", "Shelby"));

        for (ICandidate candidate : candidateList) {
            IEmployeeService employeeService = candidate.getEmployeeService();

            IEmployee newEmployee = employeeService.createNewAccount(candidate);
            employeeService.showEmployeeDetails(newEmployee);
        }

    }
}
