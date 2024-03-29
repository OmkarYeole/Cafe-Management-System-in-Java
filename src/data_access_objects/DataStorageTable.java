/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access_objects;

import javax.swing.JOptionPane;

/**
 *
 * @author abhis
 */
//Implemented Singleton pattern
public class DataStorageTable {
    private static DataStorageTable instance = null;
    
    // Private constructor
    private DataStorageTable() {
    }
    
    public static DataStorageTable getInstance() {
        if (instance == null) {
            instance = new DataStorageTable();
        }
        return instance;
    }
    // Create Customer table
    public void createCustomerTable() {
        try {
            String customerTable = "CREATE table customer(id int AUTO_INCREMENT primary key, name VARCHAR(200), email VARCHAR(200),"
                    + " mobile_number VARCHAR(10), password VARCHAR(200), security_question VARCHAR(200), answer VARCHAR(200), UNIQUE(email));";
            DatabaseOperations.setDataOrDeleteData(customerTable, "Customer Table Created!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Add Manager details in the table
    public void addManagerDetails() {
        try {
            String managerDetails = "insert into customer(name, email, mobile_number, password, security_question, answer) VALUES ('Manager','manager@gmail.com','1234567890','admin','What city do you live in?','Boulder');";
            DatabaseOperations.setDataOrDeleteData(managerDetails, "Manager Details Added Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Add Manager details in the table
    public void addCategoryTable() {
        try {
            String categoryTable = "CREATE table category(id int AUTO_INCREMENT primary key, name VARCHAR(200));";
            DatabaseOperations.setDataOrDeleteData(categoryTable, "Category Table Created!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void addSubCategoryTable(){
        try{
            String subcategoryTable = "CREATE table subcategory(id int AUTO_INCREMENT primary key, name VARCHAR(200), category varchar(200), price varchar(200))";
            DatabaseOperations.setDataOrDeleteData(subcategoryTable, "Sub-Category Table Created!");   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addbillDetails(){
        try{
        String billDetailsTable = "CREATE table billdetailstable(id int PRIMARY KEY, name VARCHAR(200), mobile_number VARCHAR(200), email VARCHAR(200), date VARCHAR(50), total VARCHAR(200), createdBy VARCHAR(200))"; 
        DatabaseOperations.setDataOrDeleteData(billDetailsTable, "Bill Details table created!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String[] args){
        DataStorageTable.getInstance().createCustomerTable();
        DataStorageTable.getInstance().addManagerDetails();
        DataStorageTable.getInstance().addCategoryTable();
        DataStorageTable.getInstance().addSubCategoryTable();
        DataStorageTable.getInstance().addbillDetails();
    }
}
