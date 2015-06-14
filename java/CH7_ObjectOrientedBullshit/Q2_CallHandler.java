package CH7_ObjectOrientedBullshit;

import java.util.ArrayList;

public class Q2_CallHandler {

    // Array containing arrays of employees at different levels.
    ArrayList<ArrayList<Q2_Employee>> employeeLevels = new ArrayList<>();

    public Q2_Employee getCallHandler(Q2_Call call) {
        for (int level = call.level ; level < employeeLevels.size() - 1 ; level++) {
            ArrayList<Q2_Employee> employeeLevel = employeeLevels.get(level);
            for (Q2_Employee employee : employeeLevel) {
                if (employee.free) {
                    return employee;
                }
            }
        }
        return null;
    }

}
