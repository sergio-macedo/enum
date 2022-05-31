package course;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data");
        String workerName = sc.nextLine();
        System.out.print("Level");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract # "+ i + "data:");
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valeu per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours =sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear =sc.next();
        int month =

    }
}
