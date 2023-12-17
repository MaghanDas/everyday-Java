package com.parkash.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable {
    String batch;
    String name;
    String rollNo;
    String dept;
    public Student(String batch, String rollNo, String name, String dept){
        this.name = name;
        this.batch = batch;
        this.dept = dept;
        this.rollNo = rollNo;
    }
}
class MyFrame extends JFrame implements ActionListener{
    private ArrayList<Student> studentList = new ArrayList<>();
    private JLabel batch,name,rollNO,dept;
    private JTextField nameF, rollNOF, deptF;
    private JComboBox batchBox;
    private JButton addButton,searchButton;
    public MyFrame(){

        this.setTitle("OOP final paper");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,600,600);
        this.setLayout(null);

        batch = new JLabel("Batch");
        batch.setBounds(20,20,50,20);
        this.add(batch);

        String[] batchList= {"19","20","21","22","23"};

        batchBox = new JComboBox(batchList);
        batchBox.setBounds(120,20,150,30);
        this.add(batchBox);

        name = new JLabel("Name");
        name.setBounds(20,100,50,20);
        this.add(name);

        nameF = new JTextField();
        nameF.setBounds(120,100,150,30);
        this.add(nameF);

        rollNO = new JLabel("Roll No");
        rollNO.setBounds(20,180,50,20);
        this.add(rollNO);

        rollNOF = new JTextField();
        rollNOF.setBounds(120,180,150,30);
        this.add(rollNOF);

        dept = new JLabel("Department");
        dept.setBounds(20,260,80,20);
        this.add(dept);

        deptF = new JTextField();
        deptF.setBounds(120,260,150,30);
        this.add(deptF);

        addButton = new JButton("Add Student");
        addButton.setBounds(20,350,150,30);
        this.add(addButton);
        addButton.addActionListener(this);

        searchButton = new JButton("Search Student");
        searchButton.setBounds(200,350,150,30);
        this.add(searchButton);
        searchButton.addActionListener(this);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == addButton){
             addStudent();
         }
         if(e.getSource() == searchButton ){
             searchStudentByRollNo();
         }
    }

    private void addStudent() {
        String batch = batchBox.getSelectedItem().toString();
        String rollNo = rollNOF.getText();
        String name = nameF.getText();
        String department = deptF.getText();

        Student student = new Student(batch, rollNo, name, department);
        studentList.add(student);


        batchBox.setName("");
        rollNOF.setText("");
        nameF.setText("");
        deptF.setText("");

        try {
            FileOutputStream fileOut = new FileOutputStream("Data.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            for (Student students : studentList) {
                objectOut.writeObject(students);
            }

            objectOut.close();
            fileOut.close();
            JOptionPane.showMessageDialog(this, "Student information saved to Data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchStudentByRollNo() {

        String rollNoToSearch = JOptionPane.showInputDialog("Enter Roll Number to search:");

        for (Student student : studentList) {
            if (student.rollNo.equalsIgnoreCase(rollNoToSearch)) {
                JOptionPane.showMessageDialog(this, "Student Found:\nBatch: " + student.batch +
                        "\nName: " + student.name + "\nDepartment: " + student.dept);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Student with Roll Number " + rollNoToSearch + " not found.");
    }
}
public class Main {
    public static void main(String[] args) {
       MyFrame myFrame = new MyFrame();
    }
}
