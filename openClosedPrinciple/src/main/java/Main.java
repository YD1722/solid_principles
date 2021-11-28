import candidate.ICandidate;
import container.Factory;
import employee.IEmployee;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICandidate> candidateList = new ArrayList<>();

        candidateList.add(Factory.getManagerCandidate("Tommy", "Shelby"));
        candidateList.add(Factory.getCandidate("Arthur", "Shelby"));
        candidateList.add(Factory.getCandidate("Michal", "Shelby"));
        candidateList.add(Factory.getExecutiveCandidate("Polly", "Shelby"));

        for (ICandidate candidate : candidateList) {
            IEmployeeService employeeService = candidate.getEmployeeService();

            IEmployee newEmployee = employeeService.createNewAccount(candidate);
            employeeService.showEmployeeDetails(newEmployee);
        }

    }
}
