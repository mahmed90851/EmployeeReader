package com.example.payroll;

import java.io.*;

public class EmployeePayrollInformation {
    public static void main(String[] args) {
        //read employee data from file
        try {
            FileReader filereader = new FileReader("PayDataFile");
            BufferedReader bufReader = new BufferedReader (filereader);
            String input;

            System.out.println("\n---------------------Employee gross pay information---------------------");
            while((input = bufReader.readLine()) != null){
                String[] substrings = input.split("\\|");
                Employee e = new Employee(substrings[0], substrings[1], Double.parseDouble(substrings[2]), Double.parseDouble(substrings[3]));
                System.out.printf("\nID: %s Name: %-30s Gross Pay: $%.2f",
                        e.getEmployeeId(), e.getEmployeeName(), e.getGrossPay() );

            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        //generate pay information
        //Print it out


}
