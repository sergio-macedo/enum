package course;

import entities.Department;
import entities.Worker;
import enums.WorkerLevel;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data");
        String workerName =sc.nextLine();
        System.out.print("Level");
        String workerLevel =sc.nextLine();
        System.out.print("Base Salary");
        double baseSalary =sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));


    }
}
