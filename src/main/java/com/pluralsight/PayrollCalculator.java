package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PayrollCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            FileReader fileReader = new FileReader("C:\\Users\\Khm3o\\pluralsight\\workbook-3\\PayrollCalculator\\src\\main\\java\\com\\pluralsight\\payroll.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
                String [] arr = input.split("\\|");
                Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[3]), Double.parseDouble(arr[3]));
                System.out.printf("Employee ID: %s\nEmployee name %s\nEmployee hours worked: %s\nEmployee pay rate: %s\n\n", employee.getEmployeeId(), employee.getName(), employee.getHoursWorked(), employee.getPayRate());
            }


        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);
        }

        System.out.println();
    }
}
