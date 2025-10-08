package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            FileWriter fileWriter = new FileWriter("src/main/java/com/pluralsight/payroll-sept-2023.csv");
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            FileReader fileReader = new FileReader("src/main/java/com/pluralsight/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
                String [] arr = input.split("\\|");
                Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]));
                System.out.printf("Employee ID: %s\nEmployee name %s\nEmployee gross pay: %s\n\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay(employee.getHoursWorked(), employee.getPayRate()));
                String text = String.format("%s|%s|%.2f", employee.getEmployeeId(), employee.getName(), employee.getGrossPay(employee.getHoursWorked(), employee.getPayRate()));
                bufWriter.write(text + "\n");
            }
            bufWriter.close();
            bufReader.close();

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);
        }
    }
}
