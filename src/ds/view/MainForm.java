/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ds.view;

import ds.controll.Controller;
import ds.observer.DefenceObserver;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class MainForm extends javax.swing.JFrame implements Controller{
    private DefenceObserver observer;
    /**
     * Creates new form MainForm
     */
    public MainForm(DefenceObserver observer) {
        this.observer = observer;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCollectInfo = new javax.swing.JButton();
        txtMessageMain = new javax.swing.JTextField();
        checkPrivate = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaShowMessage = new javax.swing.JTextArea();
        defenceComboBox = new javax.swing.JComboBox<>();
        txtAmmoCount = new javax.swing.JTextField();
        txtFuelCount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkAreraClear = new javax.swing.JCheckBox();
        txtSolderCount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controll Panel");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Controll Room");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 652, 51));

        btnCollectInfo.setBackground(new java.awt.Color(255, 255, 153));
        btnCollectInfo.setText("Collect Imformation");
        btnCollectInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCollectInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 57, 180, 34));

        txtMessageMain.setBackground(new java.awt.Color(0, 0, 0));
        txtMessageMain.setForeground(new java.awt.Color(51, 153, 0));
        txtMessageMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageMainActionPerformed(evt);
            }
        });
        getContentPane().add(txtMessageMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 109, 244, 60));

        checkPrivate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkPrivate.setForeground(new java.awt.Color(102, 255, 255));
        checkPrivate.setText("Send Private");
        checkPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPrivateActionPerformed(evt);
            }
        });
        getContentPane().add(checkPrivate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 118, 29));

        btnSend.setBackground(new java.awt.Color(0, 102, 0));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 215, 244, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Position");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 217, 106, 28));

        jSlider1.setBackground(new java.awt.Color(0, 0, 0));
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(2);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintTrack(false);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 251, 600, -1));

        messageArea.setBackground(new java.awt.Color(0, 0, 0));
        messageArea.setColumns(20);
        messageArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        messageArea.setForeground(new java.awt.Color(51, 204, 0));
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 307, 280, 110));

        areaShowMessage.setBackground(new java.awt.Color(0, 0, 0));
        areaShowMessage.setColumns(20);
        areaShowMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        areaShowMessage.setForeground(new java.awt.Color(51, 204, 0));
        areaShowMessage.setRows(5);
        jScrollPane2.setViewportView(areaShowMessage);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 307, 290, 110));

        defenceComboBox.setBackground(new java.awt.Color(153, 153, 255));
        defenceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        defenceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenceComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(defenceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 57, 200, 34));

        txtAmmoCount.setBackground(new java.awt.Color(102, 255, 204));
        txtAmmoCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmmoCountActionPerformed(evt);
            }
        });
        getContentPane().add(txtAmmoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 172, 100, 20));

        txtFuelCount.setBackground(new java.awt.Color(255, 255, 153));
        txtFuelCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelCountActionPerformed(evt);
            }
        });
        getContentPane().add(txtFuelCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 142, 100, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fuel Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 142, 100, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 172, 100, 20));

        checkAreraClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAreraClear.setForeground(new java.awt.Color(102, 255, 255));
        checkAreraClear.setText("Area Clear");
        checkAreraClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAreraClearActionPerformed(evt);
            }
        });
        getContentPane().add(checkAreraClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 57, 125, 34));

        txtSolderCount.setBackground(new java.awt.Color(255, 153, 153));
        txtSolderCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolderCountActionPerformed(evt);
            }
        });
        getContentPane().add(txtSolderCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 109, 100, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Solder Count");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 109, 100, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Netbeans Projects\\Defense-System\\src\\images\\1659016_orig.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 650, 440));

        getAccessibleContext().setAccessibleDescription("Team Froza");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectInfoActionPerformed
        // TODO add your handling code here:0-
    }//GEN-LAST:event_btnCollectInfoActionPerformed

    private void txtMessageMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageMainActionPerformed
       if (!"".equals(txtMessageMain.getText())) {
           if (checkPrivate.isSelected()) {
                observer.setPosition("Main Controller :" + txtMessageMain.getText()+"\n");
            } else {
                observer.setMessage("Main Controller :" + txtMessageMain.getText()+"\n");
            }
            txtMessageMain.setText("");
        } else {
            JOptionPane.showConfirmDialog(null, "Enter your message commander!", "Error", JOptionPane.OK_CANCEL_OPTION, 0);
        }
    }//GEN-LAST:event_txtMessageMainActionPerformed

    private void checkPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPrivateActionPerformed

    }//GEN-LAST:event_checkPrivateActionPerformed
    
    @Override
    public void message(String message) {}

    @Override
    public void areaClear() {}

    @Override
    public void areaNotClear() {}
    
    @Override
    public void mainFormMessage(String message) {
       messageArea.append(message);
    }
    @Override
    public void buttonMessage(String message) {
        areaShowMessage.append(message);
    }

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
         if (!"".equals(txtMessageMain.getText())) {
            if (checkPrivate.isSelected()) {
                observer.setPosition("Main Controller :" + txtMessageMain.getText()+"\n");
            } else {
                observer.setMessage("Main Controller :" + txtMessageMain.getText()+"\n");
            }
            txtMessageMain.setText("");
        } else {
            JOptionPane.showConfirmDialog(null, "Enter your message commander!", "Error", JOptionPane.OK_CANCEL_OPTION, 0);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        observer.setSliderControll(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void defenceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defenceComboBoxActionPerformed

    }//GEN-LAST:event_defenceComboBoxActionPerformed

    private void txtAmmoCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmmoCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmmoCountActionPerformed

    private void txtFuelCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuelCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelCountActionPerformed

    private void checkAreraClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAreraClearActionPerformed
       if(checkAreraClear.isSelected()){
          observer.areaClear();
       }else{
           observer.areaNotClear();
       }
    }//GEN-LAST:event_checkAreraClearActionPerformed

    private void txtSolderCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolderCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolderCountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaShowMessage;
    private javax.swing.JButton btnCollectInfo;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox checkAreraClear;
    private javax.swing.JCheckBox checkPrivate;
    private javax.swing.JComboBox<String> defenceComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JTextField txtAmmoCount;
    private javax.swing.JTextField txtFuelCount;
    private javax.swing.JTextField txtMessageMain;
    private javax.swing.JTextField txtSolderCount;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPosition(String message) {
        
    }

    @Override
    public void setSliderControll(int value) {
    }


}
