package ru.mirea.task17;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("gorou");
        controller.setEmployeeId(777);
        controller.setEmployeeSalary(777777);
        controller.updateView();
    }
    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee("arataki itto", 6669, -1);
        return employee;
    }
}
