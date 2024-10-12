package telran.view;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

record Employee(long id, String name, String department, int salary, LocalDate birthDate) {}
public class InputOutputTest {
    /*******************************/
    //For HW#35 constants
    final static int MIN_SALARY = 5000; 
    final static int MAX_SALARY = 50000;
    final static String[] DEPARTMENTS = {"QA", "Audit", "Development", "Managment"};
    //name shopuld be at least 3 letters ; First - capital, last - small, no numbers
    final static long MIN_ID = 100000;
    final static long MAX_ID = 999999;
    final static int MIN_AGE = 18;
    final static int MAX_AGE = 70;
    /*******************************/
    InputOutput io = new StandartInputOutput();
    @Test
    void readEmployeeAsObjectTest() {
        // TODO: write test for readEmployeeAsObject()
        Employee employee = io.readObject("Enter employee details in format: " +
        "<id>#<name>#<department>#<salary>#<yyyy-mm-dd>", "Invalid input", str -> {
            String [] tokens = str.split("#");
            return new Employee(Long.parseLong(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]), LocalDate.parse(tokens[4]));
        });
        io.writeLine("You are entered the folowing Employee data");
        io.writeLine(employee);
    }
    @Test
    void readEmployeeAsSeparateFieldsTest() {
        // TODO: write test for readEmployeeAsObjectPredicate()
        //Enter ID, name, department, salary, birth date
    }
}
