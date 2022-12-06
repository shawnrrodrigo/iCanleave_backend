package lk.icanleave.icanlkleavesystem.utils;

import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.model.Role;

public class IDGenerator {
    public static String employeeIdGenerator(Employee employee){
        System.out.println(employee.toString());
        Role role = employee.getRole();
        String idString,zero = "0",roleName = role.getName();
        int idLength = 5- String.valueOf(employee.getId()).length();
        switch(roleName){
            case "ADMIN":
                idString = "AD";
                break;
            case "EMPLOYEE":
                idString = "EM";
                break;
            case "HR":
                idString = "HR";
                break;
            case "TEAMLEADER":
                idString = "TL";
                break;
            default:
                return null;
        }
        String id = idString+ new String(new char[idLength]).replace("\0", zero) + employee.getId();
        return id;
    }
    public static String leaveIdGenerator(){
        return "Temp";
    }
    public static int getEmployeeId(String id){
        return 1;
    }
}
