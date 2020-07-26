/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jdatepicker.DateModel;

/**
 *
 * @author Ashu Jain
 */
public class Jobcard extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement ps=null,ps1=null;
    StringBuilder sb=new StringBuilder("VEH");
    String AlphaNumericString="0123456789";
    String jobno;
    int index;
    
    {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoicon.png")));
    Toolkit toolkit =  Toolkit.getDefaultToolkit ();
    Dimension dim = toolkit.getScreenSize();
    this.setSize(dim.width,dim.height);
    }
    
    public Jobcard() {
        initComponents();
        try{
            
            for(int i=0;i<5;i++){
            index=(int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
            }
            jobno=sb.toString();
            sb.replace(0, 15,"VEH");
            jLabel2.setText(jobno);
            jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        }
        catch(Exception ex){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField(10);
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox89 = new javax.swing.JCheckBox();
        jCheckBox90 = new javax.swing.JCheckBox();
        jCheckBox91 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox82 = new javax.swing.JCheckBox();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jCheckBox85 = new javax.swing.JCheckBox();
        jCheckBox86 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jCheckBox87 = new javax.swing.JCheckBox();
        jCheckBox88 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea("Description");
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea("Description");
        jLabel32 = new javax.swing.JLabel();
        jCheckBox106 = new javax.swing.JCheckBox();
        jCheckBox101 = new javax.swing.JCheckBox();
        jCheckBox97 = new javax.swing.JCheckBox();
        jCheckBox102 = new javax.swing.JCheckBox();
        jCheckBox98 = new javax.swing.JCheckBox();
        jCheckBox104 = new javax.swing.JCheckBox();
        jCheckBox96 = new javax.swing.JCheckBox();
        jCheckBox103 = new javax.swing.JCheckBox();
        jCheckBox94 = new javax.swing.JCheckBox();
        jCheckBox93 = new javax.swing.JCheckBox();
        jCheckBox100 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jCheckBox99 = new javax.swing.JCheckBox();
        jCheckBox105 = new javax.swing.JCheckBox();
        jCheckBox107 = new javax.swing.JCheckBox();
        jCheckBox108 = new javax.swing.JCheckBox();
        jCheckBox109 = new javax.swing.JCheckBox();
        jCheckBox110 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jCheckBox111 = new javax.swing.JCheckBox();
        jCheckBox112 = new javax.swing.JCheckBox();
        jCheckBox113 = new javax.swing.JCheckBox();
        jCheckBox114 = new javax.swing.JCheckBox();
        jCheckBox115 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea("Description");
        jLabel38 = new javax.swing.JLabel();
        jCheckBox92 = new javax.swing.JCheckBox();
        jCheckBox95 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("JOB CARD");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("_______");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Job no.");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Vehicle no.");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Vehicle Model");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("min");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Fuel");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Customer Name");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Date");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Contact No.");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("OUT");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("IN");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("hr");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Time (optional)");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Kms");

        buttonGroup5.add(jCheckBox1);
        jCheckBox1.setText("E");

        buttonGroup5.add(jCheckBox2);
        jCheckBox2.setText("1/4");

        buttonGroup5.add(jCheckBox3);
        jCheckBox3.setText("1/2");

        buttonGroup5.add(jCheckBox4);
        jCheckBox4.setText("3/4");

        buttonGroup5.add(jCheckBox5);
        jCheckBox5.setText("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 53, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1021, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));

        jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame1.setVisible(true);

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setAutoscrolls(true);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Oil change");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jCheckBox54.setText("Oil Filter");
        jPanel5.add(jCheckBox54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jCheckBox58.setText("Diesel Filter");
        jPanel5.add(jCheckBox58, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jCheckBox59.setText("Air Filter");
        jPanel5.add(jCheckBox59, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jCheckBox60.setText("Gear Oil");
        jPanel5.add(jCheckBox60, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 81, -1));

        jCheckBox61.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox61.setText("Coolant Change ");
        jPanel5.add(jCheckBox61, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Injector Service");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 119, -1));

        jCheckBox62.setText("Plug service");
        jPanel5.add(jCheckBox62, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jCheckBox63.setText("Point");
        jPanel5.add(jCheckBox63, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jCheckBox64.setText("Engine Tuning");
        jPanel5.add(jCheckBox64, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("Radiator Service");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 119, -1));

        jCheckBox65.setText("A.C.");
        jPanel5.add(jCheckBox65, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jCheckBox66.setText("Condensor");
        jPanel5.add(jCheckBox66, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jCheckBox67.setText("Compressor ");
        jPanel5.add(jCheckBox67, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jCheckBox68.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox68.setText("Battery Water");
        jPanel5.add(jCheckBox68, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jCheckBox69.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox69.setText("A.C. Filter");
        jPanel5.add(jCheckBox69, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jCheckBox70.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox70.setText("Scanning");
        jPanel5.add(jCheckBox70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jCheckBox71.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox71.setText("Engine Head Gas Kit");
        jPanel5.add(jCheckBox71, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jCheckBox89.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox89.setText("Wiring");
        jPanel5.add(jCheckBox89, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jCheckBox90.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox90.setText("Crown Pinion");
        jPanel5.add(jCheckBox90, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jCheckBox91.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox91.setText("Brake Shoe/Brake pad");
        jPanel5.add(jCheckBox91, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Denting");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jCheckBox72.setText("Doors");
        jPanel5.add(jCheckBox72, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jCheckBox73.setText("Funder");
        jPanel5.add(jCheckBox73, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jCheckBox74.setText("Bonet");
        jPanel5.add(jCheckBox74, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jCheckBox77.setText("Roof");
        jPanel5.add(jCheckBox77, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        jCheckBox76.setText("Boot Space");
        jPanel5.add(jCheckBox76, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        jCheckBox75.setText("Side Borders");
        jPanel5.add(jCheckBox75, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        jCheckBox78.setText("Bumper Repair");
        jPanel5.add(jCheckBox78, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        jCheckBox79.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox79.setText("Front Bushing");
        jPanel5.add(jCheckBox79, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        jCheckBox80.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox80.setText("Rear Bushing");
        jPanel5.add(jCheckBox80, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        jCheckBox81.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox81.setText("Wheel Service");
        jPanel5.add(jCheckBox81, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jCheckBox82.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox82.setText("Gear Repair");
        jPanel5.add(jCheckBox82, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jCheckBox83.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox83.setText("Clutch + Pressure Plate");
        jPanel5.add(jCheckBox83, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        jCheckBox84.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox84.setText("Turbo Charging");
        jPanel5.add(jCheckBox84, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jCheckBox85.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox85.setText("Doors Setting");
        jPanel5.add(jCheckBox85, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        jCheckBox86.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox86.setText("Shaft Cross");
        jPanel5.add(jCheckBox86, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Axle");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        jCheckBox87.setText("Front");
        jPanel5.add(jCheckBox87, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        jCheckBox88.setText("Rear");
        jPanel5.add(jCheckBox88, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel31.setText("Engine Work");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 86, 28));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Description");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea2FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 200, 86));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Stearing Work");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 86, 28));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Description");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 200, 86));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("Tyre Change");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jCheckBox106.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox106.setText("Teflon Coating(Lamination)");
        jPanel5.add(jCheckBox106, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        buttonGroup3.add(jCheckBox101);
        jCheckBox101.setText("1");
        jPanel5.add(jCheckBox101, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        buttonGroup2.add(jCheckBox97);
        jCheckBox97.setText("2");
        jPanel5.add(jCheckBox97, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        buttonGroup3.add(jCheckBox102);
        jCheckBox102.setText("2");
        jPanel5.add(jCheckBox102, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        buttonGroup1.add(jCheckBox98);
        jCheckBox98.setText("3");
        jPanel5.add(jCheckBox98, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        buttonGroup3.add(jCheckBox104);
        jCheckBox104.setText("4");
        jPanel5.add(jCheckBox104, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        buttonGroup1.add(jCheckBox96);
        jCheckBox96.setText("1");
        jPanel5.add(jCheckBox96, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        buttonGroup3.add(jCheckBox103);
        jCheckBox103.setText("3");
        jPanel5.add(jCheckBox103, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        buttonGroup1.add(jCheckBox94);
        jCheckBox94.setText("4");
        jPanel5.add(jCheckBox94, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        buttonGroup1.add(jCheckBox93);
        jCheckBox93.setText("2");
        jPanel5.add(jCheckBox93, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jCheckBox100.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox100.setText("Nitogen Gas");
        jPanel5.add(jCheckBox100, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Wheel Rim Band");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 119, -1));

        buttonGroup2.add(jCheckBox99);
        jCheckBox99.setText("4");
        jPanel5.add(jCheckBox99, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jCheckBox105.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox105.setText("Inter Cleaning");
        jPanel5.add(jCheckBox105, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jCheckBox107.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox107.setText("Self Service");
        jPanel5.add(jCheckBox107, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jCheckBox108.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox108.setText("Altenator Sevice");
        jPanel5.add(jCheckBox108, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jCheckBox109.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox109.setText("Rubbing Polish");
        jPanel5.add(jCheckBox109, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jCheckBox110.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox110.setText("Washing");
        jPanel5.add(jCheckBox110, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("Head Work");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        buttonGroup4.add(jCheckBox111);
        jCheckBox111.setText("Half");
        jPanel5.add(jCheckBox111, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        buttonGroup4.add(jCheckBox112);
        jCheckBox112.setText("Full");
        jPanel5.add(jCheckBox112, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        jCheckBox113.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox113.setText("Painting");
        jPanel5.add(jCheckBox113, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        buttonGroup2.add(jCheckBox114);
        jCheckBox114.setText("1");
        jPanel5.add(jCheckBox114, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        buttonGroup2.add(jCheckBox115);
        jCheckBox115.setText("3");
        jPanel5.add(jCheckBox115, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Alignment");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("Others");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 86, 28));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Description");
        jTextArea3.setToolTipText("");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea3FocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(jTextArea3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 200, 86));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setText("Wheel Balance");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jCheckBox92.setText("Front");
        jPanel5.add(jCheckBox92, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jCheckBox95.setText("Rear");
        jPanel5.add(jCheckBox95, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if ((jCheckBox5.isSelected()==false && jCheckBox4.isSelected()==false && jCheckBox3.isSelected()==false && jCheckBox2.isSelected()==false && jCheckBox1.isSelected()==false)||jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField8.getText().equals("")){
            jLabel3.setText("*Please Complete all the vehicle details");
        }
        else{
        String jno=jLabel2.getText(),
               vno=jTextField1.getText(),
               km=jTextField2.getText(),
               vmodel=jTextField3.getText(),
               cname=jTextField4.getText(),
               cno=jTextField8.getText();
        long contact=Long.parseLong(cno);
        long kms=Long.parseLong(km);
        
        String fuel="";
        
        if(jCheckBox1.isSelected()){
        fuel="E";
        }
        else if(jCheckBox2.isSelected()){
        fuel="1/4";
        }
        else if(jCheckBox3.isSelected()){
        fuel="1/2";
        }
        else if(jCheckBox4.isSelected()){
        fuel="3/4";
        }
        else if(jCheckBox5.isSelected()){
        fuel="F";
        }
        
        DateModel dm=jDatePicker1.getModel();
        String date=dm.getDay()+"/"+(dm.getMonth()+1)+"/"+dm.getYear();
        String inhr=((Integer)jSpinner1.getValue()).toString();
        String inmin=((Integer)jSpinner2.getValue()).toString();
        String outhr=((Integer)jSpinner3.getValue()).toString();
        String outmin=((Integer)jSpinner4.getValue()).toString();
        String inmode=(String)jComboBox1.getSelectedItem();
        String outmode=(String)jComboBox1.getSelectedItem();
        String inTime=inhr+":"+inmin+" "+inmode;
        String outTime=outhr+":"+outmin+" "+outmode;
        String work="";
        
        
        if(jCheckBox54.isSelected())
            work+="Oil Filter Change ,";
        if(jCheckBox58.isSelected())
            work+="Deisel Filter Change ,";
        if(jCheckBox59.isSelected())
            work+="Air Filter Change ,";
        if(jCheckBox60.isSelected())
            work+="Gear Oil Change ,";
        if(jCheckBox61.isSelected())
            work+="Coolant Change ,";
        if(jCheckBox62.isSelected())
            work+="Injector Service - Plug Sevice ,";
        if(jCheckBox63.isSelected())
            work+="Injector Service - Point Sevice ,";
        if(jCheckBox64.isSelected())
            work+="Injector Service - Engine Tuning ,";
        if(jCheckBox65.isSelected())
            work+="Radiator Service - A.C. ,";
        if(jCheckBox66.isSelected())
            work+="Radiator Service - Condensor ,";
        if(jCheckBox67.isSelected())
            work+="Radiator Service - Compressor ,";
        if(jCheckBox68.isSelected())
            work+="Battery Water ,";
        if(jCheckBox69.isSelected())
            work+="AC Filter ,";
        if(jCheckBox70.isSelected())
            work+="Scanning ,";
        if(jCheckBox71.isSelected())
            work+="Engine Head Gas Kit ,";
        if(jCheckBox89.isSelected())
            work+="Wiring ,";
        if(jCheckBox90.isSelected())
            work+="Crown Pinion ,";
        if(jCheckBox91.isSelected())
            work+="Brake Shoe/Brake plate ,";
        if(jCheckBox93.isSelected())
            work+="Wheel Balance - 2 wheels ,";
        if(jCheckBox96.isSelected())
            work+="Wheel Balance - 1 wheel ,";
        if(jCheckBox98.isSelected())
            work+="Wheel Balance - 3 wheels ,";
        if(jCheckBox94.isSelected())
            work+="Wheel Balance - 4 wheels ,";
        if(jCheckBox92.isSelected())
            work+="Alignment - Front ,";
        if(jCheckBox95.isSelected())
            work+="Alignment - Rear ,";
        if(jCheckBox114.isSelected())
            work+="Tyre Change - 1 wheel ,";
        if(jCheckBox97.isSelected())
            work+="Tyre Change - 2 wheels ,";
        if(jCheckBox115.isSelected())
            work+="Tyre Change - 3 wheels ,";
        if(jCheckBox99.isSelected())
            work+="Tyre Change - 4 wheels ,";
        if(jCheckBox101.isSelected())
            work+="Wheel Rim Band - 1 wheel ,";
        if(jCheckBox102.isSelected())
            work+="Wheel Rim Band - 2 wheels ,";
        if(jCheckBox103.isSelected())
            work+="Wheel Rim Band - 3 wheels ,";
        if(jCheckBox104.isSelected())
            work+="Wheel Rim Band - 4 wheels ,";
        if(jCheckBox105.isSelected())
            work+="Inter Cleaning ,";
        if(jCheckBox106.isSelected())
            work+="Teflon Coating(Lamination) ,";
        if(jCheckBox107.isSelected())
            work+="Self Service ,";
        if(jCheckBox108.isSelected())
            work+="Altenator Service ,";
        if(jCheckBox109.isSelected())
            work+="Rubbing Polish ,";
        if(jCheckBox100.isSelected())
            work+="Nitrogen Gas ,";
        if(jCheckBox111.isSelected())
            work+="Head Work - Half ,";
        if(jCheckBox112.isSelected())
            work+="Head Work - Full ,";
        if(jCheckBox74.isSelected())
            work+="Denting - Bonet ,";
        if(jCheckBox72.isSelected())
            work+="Denting - Doors ,";
        if(jCheckBox73.isSelected())
            work+="Denting - Funder ,";
        if(jCheckBox76.isSelected())
            work+="Denting - Boot Space ,";
        if(jCheckBox77.isSelected())
            work+="Denting - Roof ,";
        if(jCheckBox75.isSelected())
            work+="Denting - Side Borders ,";
        if(jCheckBox78.isSelected())
            work+="Denting - Bumper Repair ,";
        if(jCheckBox80.isSelected())
            work+="Rear Bushing ,";
        if(jCheckBox81.isSelected())
            work+="Wheel Service ,";
        if(jCheckBox83.isSelected())
            work+="Clutch + Pressure Plate ,";
        if(jCheckBox84.isSelected())
            work+="Turbo Charging ,";
        if(jCheckBox85.isSelected())
            work+="Door Setting ,";
        if(jCheckBox86.isSelected())
            work+="Shaft Cross ,";
        if(jCheckBox88.isSelected())
            work+="Axle - Rear ,";
        if(jCheckBox87.isSelected())
            work+="Axle - Front ,";
        if(jCheckBox113.isSelected())
            work+="Painting ,";
        if(jCheckBox110.isSelected())
            work+="Washing ,";
        
        if(!jTextArea2.getText().equals("Description"))        
            work+="Engine Work - "+ jTextArea2.getText()+" ,";
        if(!jTextArea1.getText().equals("Description"))        
            work+="Stearing Work - "+ jTextArea1.getText()+" ,";
        if(!jTextArea3.getText().equals("Description"))        
            work+="Other Work - "+ jTextArea3.getText()+" ,";
         
       
        try{
            con=new LocalDatabaseConnection().getConnection();
            //con=new DBConnection().getConnection();
            ps=con.prepareStatement("insert into jobcarddetails values (?,?,?,?,?,?,?,?,?,?)");
            ps1=con.prepareStatement("insert into jobwork values (?,?)");
            ps.setString(1,jno);
            ps.setString(2,vno);
            ps.setString(3,vmodel);
            ps.setLong(4,kms);
            ps.setString(5,cname);
            ps.setLong(6,contact);
            ps.setString(7,date);
            ps.setString(8,inTime);
            ps.setString(9,outTime);
            ps.setString(10,fuel);
            ps1.setString(1,jno);
            ps1.setString(2,work);
            
            ps1.executeUpdate();
            ps.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this,"Job Card created successfully");
            dispose();
        }
        catch(HeadlessException | SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Something went wrong");
            dispose();
        }
        
        
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextArea2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea2FocusGained
        if(jTextArea2.getText().equalsIgnoreCase("Description"))
           jTextArea2.setText("");
    }//GEN-LAST:event_jTextArea2FocusGained

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        if(jTextArea1.getText().equalsIgnoreCase("Description"))    
            jTextArea1.setText("");
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea2FocusLost
        if(jTextArea2.getText().equals("")){
            jTextArea2.setText("Description");
        }
    }//GEN-LAST:event_jTextArea2FocusLost

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        if(jTextArea1.getText().equals("")){
            jTextArea1.setText("Description");
        }
    }//GEN-LAST:event_jTextArea1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField8.setText("");
        jTextField4.setText("");
        
        jTextArea1.setText("Description");
        jTextArea2.setText("Description");
        
        jCheckBox1.setSelected(false);jCheckBox2.setSelected(false);jCheckBox3.setSelected(false);jCheckBox4.setSelected(false);jCheckBox5.setSelected(false);
        jCheckBox100.setSelected(false);
        jCheckBox101.setSelected(false);
        jCheckBox102.setSelected(false);
        jCheckBox103.setSelected(false);
        jCheckBox104.setSelected(false);jCheckBox105.setSelected(false);jCheckBox106.setSelected(false);
        jCheckBox107.setSelected(false);jCheckBox108.setSelected(false);
        jCheckBox109.setSelected(false);jCheckBox110.setSelected(false);
        jCheckBox111.setSelected(false);jCheckBox112.setSelected(false);
        jCheckBox113.setSelected(false);jCheckBox54.setSelected(false);
        jCheckBox58.setSelected(false);jCheckBox59.setSelected(false);
        jCheckBox60.setSelected(false);jCheckBox61.setSelected(false);
        jCheckBox62.setSelected(false);jCheckBox63.setSelected(false);
        jCheckBox64.setSelected(false);jCheckBox65.setSelected(false);
        jCheckBox66.setSelected(false);jCheckBox67.setSelected(false);
        jCheckBox68.setSelected(false);jCheckBox69.setSelected(false);
        jCheckBox70.setSelected(false);jCheckBox71.setSelected(false);jCheckBox72.setSelected(false);
        jCheckBox73.setSelected(false);jCheckBox74.setSelected(false);jCheckBox75.setSelected(false);
        jCheckBox76.setSelected(false);jCheckBox77.setSelected(false);jCheckBox78.setSelected(false);
        jCheckBox79.setSelected(false);jCheckBox80.setSelected(false);jCheckBox81.setSelected(false);
        jCheckBox82.setSelected(false);jCheckBox83.setSelected(false);jCheckBox84.setSelected(false);
        jCheckBox85.setSelected(false);jCheckBox86.setSelected(false);jCheckBox87.setSelected(false);
        jCheckBox88.setSelected(false);jCheckBox89.setSelected(false);jCheckBox90.setSelected(false);
        jCheckBox91.setSelected(false);jCheckBox93.setSelected(false);
        jCheckBox94.setSelected(false);jCheckBox96.setSelected(false);
        jCheckBox97.setSelected(false);jCheckBox98.setSelected(false);jCheckBox99.setSelected(false);
        jCheckBox114.setSelected(false);jCheckBox115.setSelected(false);
        jSpinner1.setValue(0);jSpinner2.setValue(0);jSpinner3.setValue(0);jSpinner4.setValue(0);
        
        jLabel3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
        if(jTextField8.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
        if(jTextField2.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isUpperCase(c)|| Character.isDigit(c)) )
        {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextArea3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea3FocusGained

    private void jTextArea3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea3FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jobcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jobcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jobcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jobcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jobcard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox88;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
