package container;

import candidate.Candidate;
import candidate.ExecutiveCandidate;
import candidate.ICandidate;
import candidate.ManagerCandidate;
import service.EmployeeService;
import service.ExecutiveService;
import service.IEmployeeService;
import service.ManagerService;

public class Factory {
    public static ICandidate getCandidate(String firstName, String lastName) {
        return new Candidate(firstName, lastName, getEmployeeService());
    }

    public static ICandidate getExecutiveCandidate(String firstName, String lastName) {
        return new ExecutiveCandidate(firstName, lastName, getExecutiveService());
    }

    public static ICandidate getManagerCandidate(String firstName, String lastName) {
        return new ManagerCandidate(firstName, lastName, getManagerService());
    }

    public static IEmployeeService getExecutiveService() {
        return new ExecutiveService();
    }

    public static IEmployeeService getManagerService() {
        return new ManagerService();
    }

    public static IEmployeeService getEmployeeService() {
        return new EmployeeService();
    }
}
