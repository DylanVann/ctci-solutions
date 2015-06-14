package CH7.Q2;

import java.util.ArrayList;

public class CallHandler {

    // Array containing arrays of employees at different levels.
    ArrayList<ArrayList<Employee>> employeeLevels = new ArrayList<>();

    public Employee getCallHandler(Call call) {
        for (int level = call.level ; level < employeeLevels.size() - 1 ; level++) {
            ArrayList<Employee> employeeLevel = employeeLevels.get(level);
            for (Employee employee : employeeLevel) {
                if (employee.free) {
                    return employee;
                }
            }
        }
        return null;
    }

}
