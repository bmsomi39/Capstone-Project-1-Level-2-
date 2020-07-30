/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poised;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Bonga
 */
public class Poised {//Poised Main class

    Map<String, Customer> customerMap;

    Poised() {
        customerMap = new HashMap<String, Customer>();
    		}

    public static void main(String[] args) { //Main
        Scanner sc = new Scanner(System.in);
        Customer customer;//default constructor
        String surname, email;
        Poised poised = new Poised();
        String choice;
        choice = "";
        String street_name;
        String house_no;
        String postal_code;
        String province;
        System.out.println("\n-------------------");
        System.out.println("Welcome to Poised ");
        System.out.println("-------------------\n");
        System.out.println("1. Register Project.");
        System.out.println("2. Register person (Architect,customer or contractor).");
        choice = sc.nextLine();

        if (choice.equals("1")) {//Register Project option
            Project project = new Project(); //project.java in use here

          //Accept input for each credential
            System.out.print("Enter project number : ");
            String project_num = sc.nextLine();
            System.out.println("Enter project name : ");
            String project_name = sc.nextLine();
            //surname = sc.next();
            System.out.print("Enter Building type(Apartment,House,Store) : ");
            String building_ = sc.nextLine();
            //building_ = sc.nextLine();
            System.out.print("Enter address\n");
            System.out.print("Enter street name : ");
            street_name = sc.nextLine();
            System.out.print("Enter house number : ");
            house_no = sc.nextLine();
            System.out.print("Enter postal code : ");
            postal_code = sc.nextLine();
            System.out.print("Enter province : ");
            province = sc.nextLine();
            System.out.println("Enter ERF number :");
            String ERF = sc.next();
            sc.nextLine();
            System.out.print("Total_fee_charged : ");
            Double total_fee_charged = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter amount paid to date : ");
            Double amt_paid_to_date = sc.nextDouble();
            //sc.nextDouble();
            System.out.print("Enter project due date : ");
            String project_due_date = sc.nextLine();
            sc.nextLine();
            System.out.print("Is project finalised YES/NO : ");
            String finalised = sc.nextLine();
            //  sc.nextLine();
            project = new Project(project_name, project_name, building_, project_due_date, ERF, total_fee_charged, amt_paid_to_date, project_due_date, finalised);
            System.out.println("Project :" + "\nProject number :" + project_num + "\nProject Name :" + project_name + "\nBuilding Type :" + building_ + "\nERF :" + ERF + "\nAddress :\n" + street_name + "\n" + house_no + "\n" + postal_code + "\n" + province + "\nDue date :"
                    + project_due_date + "\nTotal fee charged :" + total_fee_charged + "\namount paid :" + amt_paid_to_date + "\nfinalised :" + finalised);

        } else if (choice.equals("2")) {//Register person option (Architect/ Customer/Contractor)
        	
        	//Accept input for each credential
            System.out.print("Enter person type architech, contractor or customer : ");
            String person_type = sc.nextLine();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.println("Enter surname : ");
            surname = sc.nextLine();
            while (poised.customerMap.containsKey(surname)) {
                System.out.println("Username already exists. Set again : ");
                surname = sc.next();
            }
            System.out.print("Enter contact number : ");
            String phone = sc.nextLine();
            System.out.print("Enter address\n");
            System.out.print("Enter street name : ");
            street_name = sc.nextLine();

            System.out.print("Enter house number : ");
            house_no = sc.nextLine();
            System.out.print("Enter postal code : ");
            postal_code = sc.nextLine();
            System.out.print("Enter province : ");
            province = sc.nextLine();
            System.out.println("Enter email should contain special character @ :");
            email = sc.next();
            sc.nextLine();
            //  sc.nextLine();
            customer = new Customer(surname, person_type, name, street_name, house_no, postal_code, province, phone);//new customer
            System.out.println("Type :  \n" + person_type + "\nSurname :" + surname + "\nName :" + name + "\nEmail :" + email + "\nPhone :" + phone + "\nAddress :\n" + street_name + "\n" + house_no + "\n" + postal_code + "\n" + province);
            poised.customerMap.put(surname, customer);

        }
    }
}
