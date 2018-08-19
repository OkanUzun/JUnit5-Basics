import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestJUnit {

    private EmployeeBusinessLogic empBusinessLogic;
    private Employee employee;

    public TestJUnit() {
        empBusinessLogic = new EmployeeBusinessLogic();
        employee = new Employee();
    }

    //test to check appraisal
    @Test
    void testCalculateAppriasal() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(501, appraisal, 1.0);
    }

    // test to check yearly salary
    @Test
    void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96001, salary, 1.0);
    }
}
