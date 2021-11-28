package service;

import candidate.ICandidate;
import employee.Employee;
import employee.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {

    @Override
    public IEmployee createNewAccount(ICandidate person) {
        IEmployee employee = new Employee((int) Math.random(), person.getFirstName());
        employee.setMail(generateEmail(person.getFirstName(), person.getLastName()));

        return employee;
    }

    @Override
    public List<IEmployee> createNewAccounts(List<ICandidate> candidateList) {
        List<IEmployee> employeeList = new ArrayList<>();

        for (ICandidate candidate : candidateList) {
            employeeList.add(createNewAccount(candidate));
        }

        return employeeList;
    }

    @Override
    public void showEmployeeDetails(IEmployee employee) {
        System.out.println("Welcome new employee " + employee.getMail()
                + " | exec : " + employee.isExecutive() + " | manager : " + employee.isManager());
    }

    private String generateEmail(String firstName, String lastName) {
        return lastName.toLowerCase() + "." + firstName.toLowerCase() + "@" + COMPANY_DOMAIN + ".com";
    }
}

