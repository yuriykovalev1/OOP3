
import java.util.ArrayList;
import java.util.Collections;


public class Program {

    public static void main(String[] args) {
        // w - создать работника f - создать фрилансера r - создать случайного работника
        ArrayList<Employee> employees = EmployeeFabric.generateEmployees(5,"w");
        employees.addAll(EmployeeFabric.generateEmployees(5,"r"));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Отсортированный архив по возрасту по возрастанию");
        System.out.println();

        //Collections.sort(employees, new SalaryComparator());

        Collections.sort(employees, new AgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Отсортированный архив фамилии, затем возрасту");
        System.out.println();
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }



    }

}