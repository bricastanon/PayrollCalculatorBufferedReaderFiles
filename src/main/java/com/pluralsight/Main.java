package com.pluralsight;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
// Exercise 1
        int employeeId;
        String name;
        double hoursWorked;
        double payRate;

        String fileName = "src/employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            if ((line = reader.readLine()) != null) {
            }

                while ((line = reader.readLine()) != null) {
                    String[] split = line.split("\\|");
                    employeeId = Integer.parseInt(split[0]);
                    name = split[1];
                    hoursWorked = Double.parseDouble(split[2]);
                    payRate = Double.parseDouble(split[3]);

                    Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                    System.out.printf("Employee ID: %d, Name: %s, Gross pay: $%.2f%n",
                            employee.getemployeeId(),
                            employee.getname(),
                            employee.getGrossPay());
                }

            } catch (IOException e) {
            e.printStackTrace();

        } }}
     /*   try {
            File file = new File("src/employees.csv");
            Scanner scanner = new Scanner(file); // This will throw FileNotFoundException
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found");
        }

    }




} */