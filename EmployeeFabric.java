

import java.util.ArrayList;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age= random.nextInt(20,66);
        int salary = random.nextInt(60000, 120001);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,age);
    }

    public static Employee generateEmployee(String empType){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age= random.nextInt(20,66);
        int salary = random.nextInt(60000, 120001);
        if (empType.toLowerCase().equals("w"))
        {
            return Worker.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary, age);
        }
        else if (empType.toLowerCase().equals("f"))
        {
            return Freelancer.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary, age);
        }
        else
        {
            int rnd= random.nextInt(1,11);
            if (rnd % 2 == 0)
            {
                return Worker.create(
                        surnames[random.nextInt(surnames.length)],
                        names[random.nextInt(names.length)],
                        salary, age);
            }
            else
            {
                return Freelancer.create(
                        surnames[random.nextInt(surnames.length)],
                        names[random.nextInt(names.length)],
                        salary, age);
            }

        }

    }



    public static ArrayList<Employee> generateEmployees(int count,String EmpType){

        ArrayList<Employee> employees = new ArrayList<Employee>();
        if (EmpType.toLowerCase().equals("f")|EmpType.toLowerCase().equals("w")|EmpType.toLowerCase().equals("r"))
        {

            for (int i = 0; i < count; i++){
                employees.add (generateEmployee(EmpType));
            }
        }
        return employees;


    }



}
 