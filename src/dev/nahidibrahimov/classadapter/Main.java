package dev.nahidibrahimov.classadapter;

public class Main {
    public static void main(String[] args) {

        var employeeAdapter = new EmployeeClassAdapter();
        populateData(employeeAdapter);

        var designer = new BusinessCardDesigner();
        var card = designer.designCard(employeeAdapter);
        System.out.println(card);
    }

    public static void populateData(Employee employee) {
        employee.setFullName("John Doe");
        employee.setJobTitle("Backend Developer");
        employee.setOfficeLocation("Baku, Azerbaijan");
    }

}