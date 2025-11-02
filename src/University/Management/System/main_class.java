package University.Management.System;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class main_class extends JFrame implements ActionListener {
    main_class() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        // new inforamtion

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        //details

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        details.addActionListener(this);
        mb.add(details);

        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);

        // leave

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        leave.addActionListener(this);
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        // leave details

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
       leaveDetails.addActionListener(this); 
        mb.add(leaveDetails);

        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.WHITE);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);

        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.WHITE);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);

        //exams

        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        exam.addActionListener(this);
        mb.add(exam);

        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);

        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.WHITE);
        enterMarks.addActionListener(this);
        exam.add(enterMarks);

        //update Info

        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.addActionListener(this);
        mb.add(updateInfo);

        JMenuItem updateFaculityInfo = new JMenuItem("Update Faculity Details");
        updateFaculityInfo.setBackground(Color.WHITE);
        updateFaculityInfo.addActionListener(this);
        updateInfo.add(updateFaculityInfo);

        JMenuItem updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);

        // fee

        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        fee.addActionListener(this);
        mb.add(fee);

        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);

        // utility

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.WHITE);
        About.addActionListener(this);
        about.add(About);

        //exit

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add(Exit);
        

        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();

        if(sm.equals("Exit")) {
            System.exit(15);
        }else if(sm.equals("Calculator")) {
            try {
                new ProcessBuilder("calc").start();
            }catch (Exception E) {
                E.printStackTrace();
            }
        }else if (sm.equals("Notepad")) {
            try {
                new ProcessBuilder("Notepad").start();
            }catch (Exception E) {
                E.printStackTrace();
            }
        }else if(sm.equals("New Faculty Information")) {
            new AddFaculty();
        }else if(sm.equals("New Student Information")) {
            new AddStudent();
        }else if(sm.equals("View Faculty Details")) {
            new FacultyDetails();
        }else if(sm.equals("View Student Details")) {
            new StudentDetails();
        }else if(sm.equals("Faculty Leave")) {
            new TeacherLeave();
        }else if(sm.equals("Student Leave")) {
            new StudentLeave();
        }else if(sm.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        }else if(sm.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }else if(sm.equals("Update Faculity Details")) {
            new UpdateTeacher();
        }else if(sm.equals("Update Student Details")) {
            new UpdateStudentDetails();
        }else if(sm.equals("Enter Marks")) {
            new EnterMarks();
        }else if(sm.equals("Examination Results")) {
            new ExaminationDetails();
        }else if(sm.equals("Fee Structure")) {
            new FeeStructure();
        }else if(sm.equals("Student Fee Form")) {
            new StudentFeeForm();
        }else if(sm.equals("About")) {
            new About();
        }
    }
    public static void main(String[] args) {
        new main_class();
    }
}