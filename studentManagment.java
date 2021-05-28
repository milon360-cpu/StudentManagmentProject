
package StudentManagmentProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class studentManagment extends JFrame implements ActionListener
{
    Container c;
    Cursor cursor;
    JLabel HLabel,BLabel, Name,ID,acID,Number,SSC,HSC,address,dept,Semester;
    JTextArea area;
    Font hFont,lFOnt,fFont;
    JTextField nameField,idFiled,acIdField,numberField,SSCFiled,HSCFiled,addressField,deptFiled,fieldSemester;
    Color fiedColor;
    JButton add,Find,update,delete,clear;
    studentManagment()
    {
        hFont = new Font("cambria",Font.BOLD,25);
        lFOnt = new Font("cambria",Font.BOLD,18);
        fFont = new Font("cambria",Font.PLAIN,17);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        fiedColor = new Color(225,225,225);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Student Managment");
        this.setResizable(false);
        this.setBounds(400,200,700,800);
        
        c = new Container();
        c  = this.getContentPane();
        c.setLayout(null);
        
//  -------------START Header Part---------------------    
        HLabel = new JLabel("Student Information");
        HLabel.setBounds(230,10,300,45);
        HLabel.setFont(hFont);
        c.add(HLabel);
        
        BLabel = new JLabel();
        BLabel.setBounds(0,10,700,45);
        BLabel.setBackground(Color.LIGHT_GRAY);
        BLabel.setOpaque(true);
        BLabel.setFont(hFont);
        c.add(BLabel);
//  -------------END Header Part--------------------- 

//  -------------START MAIN SECTION--------------------- 
        Name = new JLabel("Name");
        Name.setBounds(20,80,100,25);
        Name.setFont(lFOnt);
        c.add(Name);
        
        nameField = new JTextField();
        nameField.setBounds(150,80,300,26);
        nameField.setBorder(null);
        nameField.setFont(fFont);
        nameField.setBackground(fiedColor);
        c.add(nameField);
//  ---------- NAME PART END HERE---------

        ID = new JLabel("ID");
        ID.setBounds(20,130,100,25);
        ID.setFont(lFOnt);
        c.add(ID);
        
        idFiled = new JTextField();
        idFiled.setBounds(150,130,300,26);
        idFiled.setBorder(null);
        idFiled.setFont(fFont);
        idFiled.setBackground(fiedColor);
        c.add(idFiled);
        
 //  ---------- ID PART END HERE---------
        acID = new JLabel("Account ID");
        acID.setBounds(20,180,100,25);
        acID.setFont(lFOnt);
        c.add(acID);
        
        acIdField = new JTextField();
        acIdField.setBounds(150,180,300,26);
        acIdField.setBorder(null);
        acIdField.setFont(fFont);
        acIdField.setBackground(fiedColor);
        c.add(acIdField);
 //  ---------- Account ID PART END HERE---------
 
        Number = new JLabel("Number");
        Number.setBounds(20,230,100,25);
        Number.setFont(lFOnt);
        c.add(Number);
        
        numberField = new JTextField();
        numberField.setBounds(150,230,300,26);
        numberField.setBorder(null);
        numberField.setFont(fFont);
        numberField.setBackground(fiedColor);
        c.add(numberField);
  //  ---------- NUMBER PART END HERE---------
  
        SSC = new JLabel("SSC");
        SSC.setBounds(20,280,100,25);
        SSC.setFont(lFOnt);
        c.add(SSC);
        
        SSCFiled = new JTextField();
        SSCFiled.setBounds(150,280,300,26);
        SSCFiled.setBorder(null);
        SSCFiled.setFont(fFont);
        SSCFiled.setBackground(fiedColor);
        c.add(SSCFiled);
        
  //  ---------- SSC PART END HERE---------
  
        HSC = new JLabel("HSC");
        HSC.setBounds(20,330,100,25);
        HSC.setFont(lFOnt);
        c.add(HSC);
        
        HSCFiled = new JTextField();
        HSCFiled.setBounds(150,330,300,26);
        HSCFiled.setBorder(null);
        HSCFiled.setFont(fFont);
        HSCFiled.setBackground(fiedColor);
        c.add(HSCFiled);
        
     // ---------- HSC PART END HERE---------
        address = new JLabel("Address");
        address.setBounds(20,380,100,25);
        address.setFont(lFOnt);
        c.add(address);
        
        addressField = new JTextField();
        addressField.setBounds(150,380,300,26);
        addressField.setBorder(null);
        addressField.setFont(fFont);
        addressField.setBackground(fiedColor);
        c.add(addressField);
        
     // ---------- ADDRESS PART END HERE---------
        dept = new JLabel("Department");
        dept.setBounds(20,420,120,25);
        dept.setFont(lFOnt);
        c.add(dept);
        
        deptFiled = new JTextField();
        deptFiled.setBounds(150,420,300,26);
        deptFiled.setBorder(null);
        deptFiled.setFont(fFont);
        deptFiled.setBackground(fiedColor);
        c.add(deptFiled);
        
     // ---------- Department PART END HERE---------
        Semester = new JLabel("Semester");
        Semester.setBounds(20,470,120,25);
        Semester.setFont(lFOnt);
        c.add(Semester);
        
        fieldSemester = new JTextField();
        fieldSemester.setBounds(150,470,300,26);
        fieldSemester.setBorder(null);
        fieldSemester.setFont(fFont);
        fieldSemester.setBackground(fiedColor);
        c.add(fieldSemester);
  
//        START BUTTON HERE 
            add = new JButton("Add");
            add.setBounds(120,550,100,30);
            add.setFont(lFOnt);
            add.setCursor(cursor);
            add.setFocusPainted(false);
            c.add(add);
            
      //   ADD BUTTOn END HERE 
      
            Find = new JButton("Find");
            Find.setBounds(240,550,100,30);
            Find.setFont(lFOnt);
            Find.setCursor(cursor);
            Find.setFocusPainted(false);
            c.add(Find);
            
      //   FIND BUTTON END HERE 
      
            update = new JButton("Update");
            update.setBounds(360,550,100,30);
            update.setFont(lFOnt);
            update.setCursor(cursor);
            update.setFocusPainted(false);
            c.add(update);
            
      //   UPDATE BUTTON END HERE 
      
            delete = new JButton("Delete");
            delete.setBounds(480,550,100,30);
            delete.setFont(lFOnt);
            delete.setCursor(cursor);
            delete.setFocusPainted(false);
            c.add(delete);
            
      //   DELETE BUTTON END HERE 
      
            clear = new JButton("Clear");
            clear.setBounds(520,80,100,30);
            clear.setFont(lFOnt);
            clear.setCursor(cursor);
            clear.setFocusPainted(false);
            c.add(clear);
            
//      NOTE 
        area = new JTextArea();
        area.setText("**If you want to see student info give a id in the ID field and click on the find button.");
        area.setBounds(50,650,600,30);
        area.setFont(fFont);
        c.add(area);
        
//        ACTION LISTENER 
        clear.addActionListener(this);
        Find.addActionListener(this);
        add.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        
    }
    public static void main(String[] args)
    {
        studentManagment frame = new studentManagment();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource().equals(clear))
        {
            idFiled.setBackground(fiedColor);
            nameField.setText("");
            idFiled.setText("");
            acIdField.setText("");
            numberField.setText("");
            SSCFiled.setText("");
            HSCFiled.setText("");
            addressField.setText("");
            deptFiled.setText("");
            fieldSemester.setText("");
        }
        else if(ae.getSource().equals(Find))
        {
            idFiled.setBackground(Color.YELLOW);
            String id = idFiled.getText().toString();
            
            try {
                String url = "jdbc:mysql://127.0.0.1/student";
                String username ="root";
                String password = "";
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection connection;
                try 
                {
                     connection = (Connection)DriverManager.getConnection(url,username,password);
                     Statement statement = connection.createStatement();
                     String query;
                    query = "SELECT *FROM Batch_53 WHERE ID = "+id;
                     ResultSet result = statement.executeQuery(query);
                     
                     while(result.next())
                     {
                         String Name = result.getString("Name");
                         int ID_ = result.getInt("ID");
                         int Account_Id = result.getInt("Account_ID");
                         int Number = result.getInt("Number");
                         double SSC = result.getDouble("SSC");
                         double HSC = result.getDouble("HSC");
                         String Address = result.getString("Address");
                         String Dept = result.getString("Department");
                         String Semester = result.getString("Semester");
                         
                         String ac_ID = String.valueOf(Account_Id);
                         String ph = String.valueOf(Number);
                         String ssc = String.valueOf(SSC);
                         String hsc = String.valueOf(HSC);
                         String address = String.valueOf(Address);
                         String dept = String.valueOf(Dept);
                         String semester = String.valueOf(Semester);
                         
                         nameField.setText(Name);
                         idFiled.setText(id);
                         acIdField.setText(ac_ID);
                         numberField.setText(ph);
                         SSCFiled.setText(ssc);
                         HSCFiled.setText(hsc);
                         addressField.setText(address);
                         deptFiled.setText(Dept);
                         fieldSemester.setText(semester);
                     }
                     connection.close();
                     statement.close();
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null,"Enter ID");
                }   
              } catch (ClassNotFoundException ex) 
              {
                  JOptionPane.showMessageDialog(null,"Enter ID");
              }
        }
        else if(ae.getSource().equals(add))
        {
            try {
                String url = "jdbc:mysql://127.0.0.1/student";
                String username ="root";
                String password = "";
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection connection;
                try 
                {
                     
                     connection = (Connection)DriverManager.getConnection(url,username,password);
                     Statement statement = connection.createStatement();
                     String query;
                    
                     
                         String Name =  nameField.getText();
                         String ID = idFiled.getText();
                         String AC_ID = acIdField.getText();
                         String ph_number = numberField.getText();
                         String ssc = SSCFiled.getText();
                         String hsc = HSCFiled.getText();
                         String address = addressField.getText();
                         String dept = deptFiled.getText();
                         String semester = fieldSemester.getText();
                         query = "INSERT INTO batch_53 values ('"+Name+"','"+ID+"','"+AC_ID+"','"+ph_number+"','"+ssc+"','"+hsc+"','"+address+"','"+dept+"','"+semester+"')";
                         statement.executeUpdate(query);
                         connection.close();
                         statement.close();
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null,"Insert Value clearly");
                }   
              } catch (ClassNotFoundException ex) 
              {
                  JOptionPane.showMessageDialog(null,"Insert Value clearly");
              }
            nameField.setText("");
            idFiled.setText("");
            acIdField.setText("");
            numberField.setText("");
            SSCFiled.setText("");
            HSCFiled.setText("");
            addressField.setText("");
            deptFiled.setText("");
            fieldSemester.setText("");
        }
        else if(ae.getSource().equals(delete))
        {     
            try {
                String url = "jdbc:mysql://127.0.0.1/student";
                String username ="root";
                String password = "";
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection connection;
                try 
                {
                    int Tr = JOptionPane.showConfirmDialog(null,"Are You Sure ?","Confirm",JOptionPane.YES_NO_OPTION);
                     
                    if(Tr==0)
                    {
                     String id = idFiled.getText().toString();
                     connection = (Connection)DriverManager.getConnection(url,username,password);
                     Statement statement = connection.createStatement();
                     String query;
                     query = "DELETE FROM batch_53 WHERE ID = "+id;
                     statement.executeUpdate(query);
                     connection.close();
                     statement.close();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Thank you for your confirmition");
                    }
         
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null,"Somthing Wrong");
                }   
              } catch (ClassNotFoundException ex) 
              {
                  JOptionPane.showMessageDialog(null,"Somthing Wrong");
              }
            nameField.setText("");
            idFiled.setText("");
            acIdField.setText("");
            numberField.setText("");
            SSCFiled.setText("");
            HSCFiled.setText("");
            addressField.setText("");
            deptFiled.setText("");
            fieldSemester.setText("");
        }
        
        else if(ae.getSource().equals(update))
        {     
             String id = idFiled.getText();
              try {
                String url = "jdbc:mysql://127.0.0.1/student";
                String username ="root";
                String password = "";
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection connection;
                try 
                {
                    
                         String Name =  nameField.getText().toString();
                         String ID = idFiled.getText();
                         String AC_ID = acIdField.getText();
                         String ph_number = numberField.getText();
                         String ssc = SSCFiled.getText();
                         String hsc = HSCFiled.getText();
                         String address = addressField.getText();
                         String dept = deptFiled.getText();
                         String semester = fieldSemester.getText();
                         
                     connection = (Connection)DriverManager.getConnection(url,username,password);
                     Statement statement = connection.createStatement();
                     String query;
                     query = "UPDATE Batch_53 SET Name = '"+Name+"',Account_ID = '"+AC_ID+"',Number = '"+ph_number+"',HSC = '"+hsc+"',SSC = '"+ssc+"',Address = '"+address+"',Department = '"+dept+"',Semester = '"+semester+"'WHERE ID = "+id;
                    
                     statement.executeUpdate(query);
                     JOptionPane.showMessageDialog(null,"Update Succesfully");
                     
                        nameField.setText("");
                        idFiled.setText("");
                        acIdField.setText("");
                        numberField.setText("");
                        SSCFiled.setText("");
                        HSCFiled.setText("");
                        addressField.setText("");
                        deptFiled.setText("");
                        fieldSemester.setText("");
                        
                     connection.close();
                     statement.close();
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null,"Somthing Wronge.Try Again");
                   
                }   
              } 
              catch (ClassNotFoundException ex) 
                {
                    JOptionPane.showMessageDialog(null,"Somthing Wronge.Try Again");

                }    
        }          
    }
}
