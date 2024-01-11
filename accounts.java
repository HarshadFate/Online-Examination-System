/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.examination.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import static online.examination.system.Homepage.display;

/**
 *
 * @author Dell
 */
public class accounts extends javax.swing.JInternalFrame {

    /**
     * Creates new form accounts
     */
    
    
    public accounts() {
        initComponents();
        update_table();
        update_cname();
      
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    void update_cname()
        {
           try{
            
            String sql = "select * from student";
            PreparedStatement pst = db.mycon().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                cname.addItem(rs.getString("enrollment_no"));
            }


            }catch(Exception e){} 

        }

    void update_table()
            {
                 try{
             
            String sql = "select * from student order by enrollment_no ASC ";
            PreparedStatement pst = db.mycon().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tab.setModel(DbUtils.resultSetToTableModel(rs));


            }catch(Exception e){}

            }
    

   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        cname = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panel2.setForeground(new java.awt.Color(204, 255, 204));
        panel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-add-user-group-man-man-30.png"))); // NOI18N
        jButton1.setText("Add new student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1);
        jButton1.setBounds(450, 20, 190, 40);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tab);

        panel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 80, 850, 450);

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-denied-30.png"))); // NOI18N
        delete.setText("Delete student");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        panel2.add(delete);
        delete.setBounds(650, 20, 180, 40);

        cname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });
        panel2.add(cname);
        cname.setBounds(240, 20, 180, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select Student:");
        panel2.add(jLabel1);
        jLabel1.setBounds(120, 30, 110, 20);

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 70, 886, 550));

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("List of all registerd students");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 13, -1, 50));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/report.png"))); // NOI18N
        jButton2.setText("Generate Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
       
       
       
       
        display.removeAll();
        STUDENTE s1 = new STUDENTE();
        display.add(s1).setVisible(true);
        
        
        
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         try{     
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
         int row = tab.getSelectedRow();
         //String cell = tab.getModel().getValueAt(row,0).toString();
         String cell = (String)cname.getSelectedItem();
         String sql = "DELETE from student where enrollment_no= "+cell;
         PreparedStatement p = con.prepareStatement(sql);
         int executeUpdate = p.executeUpdate();
         DefaultTableModel model = (DefaultTableModel)tab.getModel();
         model.setRowCount(0);
         update_table();
         update_cname();
         display.removeAll();
         
                STUDENTE s1 = new STUDENTE();
                accounts c1 = new accounts();
                display.add(s1).setVisible(true);
                display.removeAll();
                display.add(c1).setVisible(true);   
         //show_user();
         JOptionPane.showMessageDialog(this,"Item Deleted Successfully");
                
     }catch(Exception e){
     JOptionPane.showMessageDialog(this,e);}
    

        /*DefaultTableModel tb = (DefaultTableModel) coursetable.getModel();

        if(coursetable.getSelectedRowCount() == 1)
        {
            tb.removeRow(coursetable.getSelectedRow()) ;

        }else{
            if(coursetable.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"this is empty");

            }
            else
            {
                JOptionPane.showMessageDialog(this,"please select single row for delete");
            }
        }*/
    }//GEN-LAST:event_deleteActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String file  = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\online examination system\\src\\online\\examination\\system\\reports\\report2.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,db.mycon());
            JasperViewer.viewReport(jp,false);
        }catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cname;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel2;
    public static javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}