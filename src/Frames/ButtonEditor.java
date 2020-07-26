/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
//import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Ashu Jain
 */
public class ButtonEditor extends DefaultCellEditor{
    
    protected JButton button;
  private String  label;
  private boolean isPushed;
  public JTable  table1;
 public String jobno=null;
  
  public ButtonEditor(JCheckBox checkBox,JTable table) {
    super(checkBox);
    table1=table;
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
      }
    });
  }
  
  public Component getTableCellEditorComponent(JTable table, Object value,
                   boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else{
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }
    label = (value ==null) ? "View" : value.toString();
    button.setText( label );
    isPushed = true;
    
    return button;
  }
  
  public Object getCellEditorValue() {
    if (isPushed)  {
        int r=table1.getSelectedRow();
          int c=0;  
          System.out.println(table1.getColumnName(0));
        if(table1.getColumnName(0).equalsIgnoreCase("Job No."))
          c=0;
        else
            c=1;
          
          jobno=(String)table1.getValueAt(r, c);
          System.out.println(jobno);
      new Details(jobno).setVisible(true);
      //JOptionPane.showMessageDialog(button ,label + ": Ouch!");
     
      
    }
    isPushed = false;
    return new String(label) ;
  }
    
  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }
  
  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
}
