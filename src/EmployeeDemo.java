import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee E;
        Employee EV;
        PTEmployee PE;
        PTEmployee PEV;
        String name;
        String ssn;
        String position;
        Date dateOfBirth;
        String month;
        float nHours;
        float wages;
        int day;
        int year;
        float pay;

        //User input variables
        System.out.println("Please input the following Employee data: ");
        System.out.print("Month: ");
        month = keyboard.nextLine();
        System.out.print("Date: ");
        day = keyboard.nextInt();
        System.out.print("Year: ");
        year = keyboard.nextInt();
        dateOfBirth = new Date(month, day, year);
        keyboard.nextLine();
        System.out.print("Name: ");
        name = keyboard.nextLine();
        System.out.print("Ssn: ");
        ssn = keyboard.nextLine();
        System.out.print("Position: ");
        position = keyboard.nextLine();
        System.out.print("Salary: ");
        pay = keyboard.nextFloat();
        System.out.print("Number of hours: ");
        nHours = keyboard.nextFloat();
        System.out.print("Hourly Wage: ");
        wages = keyboard.nextFloat();

        E = new Employee(name, ssn, position, dateOfBirth, pay);
        PE = new PTEmployee(name, ssn, position, dateOfBirth, nHours, wages);

        //Test employee methods
        System.out.println(E);
        E.setPosition("Professional Clown");
        System.out.println(E.getPosition());
        Date newDate = new Date("January", 1, 2000);
        E.setDateOfBirth(newDate);
        System.out.println(E.getDateOfBirth());
        E.setName("Bobby the Clown");
        System.out.println(E.getName());
        E.setPay(1);
        System.out.println(E.getPay());
        System.out.println(E.raise(100));
        E.setSsn("000-00-0000");
        System.out.println(E.getSsn());

        //Test PTEmployee methods
        System.out.println(PE);
        PE.setPosition("Professional Clown");
        System.out.println(PE.getPosition());
        PE.setDateOfBirth(newDate);
        System.out.println(PE.getDateOfBirth());
        PE.setName("Bobby the Clown");
        System.out.println(PE.getName());
        PE.setPay(1);
        System.out.println(PE.getPay());
        PE.setSsn("000-00-0000");
        System.out.println(PE.getSsn());
        PE.setNHours(1);
        System.out.println(PE.getNHours());
        PE.setWages(1);
        System.out.println(PE.getWages());
        System.out.println(PE.raise(1));

        //Test EV = E methods
        EV = E;
        EV.setPay(100);
        System.out.println(EV.getPay());
        //EV.setWages(100);
        //setWages is a method of a child class (PTEmployee), not the parent (Employee)
        //System.out.println(EV.getWages());
        //setWages is a method of a child class (PTEmployee), not the parent (Employee)
        System.out.println(EV.raise(4.0f));
        System.out.println(EV.getDateOfBirth());
        System.out.println(EV);

        //Test EV = PE methods
        EV = PE;
        EV.setPay(100);
        System.out.println(EV.getPay());
        //EV.setWages(100);
        //setWages is a method of a child class (PTEmployee), not the parent (Employee)
        //System.out.println(EV.getWages());
        //setWages is a method of a child class (PTEmployee), not the parent (Employee)
        System.out.println(EV.raise(4.0f));
        System.out.println(EV.getDateOfBirth());
        System.out.println(EV);

        //Test EV = E methods
        /**
         * PEV is type PTEmployee, child of Employee. Assignment is invalid
        PEV = E;
        PEV.setPay(100);
        System.out.println(PEV.getPay());
        PEV.setWages(100);
        System.out.println(PEV.getWages());
        System.out.println(PEV.raise(4.0f));
        System.out.println(PEV.getDateOfBirth());
        System.out.println(PEV);
         */

        //Test EV = PE methods
        PEV = PE;
        PEV.setPay(100);
        System.out.println(PEV.getPay());
        PEV.setWages(100);
        System.out.println(PEV.getWages());
        System.out.println(PEV.raise(4.0f));
        System.out.println(PEV.getDateOfBirth());
        System.out.println(PEV);
    }
}
