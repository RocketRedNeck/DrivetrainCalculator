
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 * GUI Frontend for calculator.
 * @author brennon.brimhall
 */
public class MainWindow extends javax.swing.JFrame {

    Scenario currentScenario;
    JFileChooser fileChooser = new JFileChooser();
    /**
     * Creates new form ContantsWindwo
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        kroField = new javax.swing.JTextField();
        krvField = new javax.swing.JTextField();
        vspecField = new javax.swing.JTextField();
        tspecField = new javax.swing.JTextField();
        wspecField = new javax.swing.JTextField();
        ispecField = new javax.swing.JTextField();
        nField = new javax.swing.JTextField();
        rcomField = new javax.swing.JTextField();
        ukField = new javax.swing.JTextField();
        usField = new javax.swing.JTextField();
        vbatField = new javax.swing.JTextField();
        gField = new javax.swing.JTextField();
        rField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        roneField = new javax.swing.JTextField();
        dtField = new javax.swing.JTextField();
        tstopField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        kfField = new javax.swing.JTextField();
        loadScenarioButton = new javax.swing.JButton();
        saveScenarioButton = new javax.swing.JButton();
        xstopField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ether's Drivetrain Acceleration Model Calculator");
        setName("Ether's Drivetrain Acceleration Model Calculator"); // NOI18N
        setResizable(false);

        jLabel1.setText("Enter in the following scenario parameters, then press generate to make your CSV file.");

        jLabel2.setText("Kro:");

        jLabel3.setText("Krv:");

        jLabel4.setText("Vspec:");

        jLabel5.setText("Tspec:");

        jLabel6.setText("Wspec:");

        jLabel7.setText("Ispec:");

        jLabel8.setText("n:");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        kroField.setText("10.0");
        kroField.setToolTipText("rolling resistance tuning parameter, lbf");
        kroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kroFieldActionPerformed(evt);
            }
        });

        krvField.setText("0.0");
        krvField.setToolTipText("rolling resistance tuning parameter, lbf/(ft/sec)");
        krvField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krvFieldActionPerformed(evt);
            }
        });

        vspecField.setText("12.0");
        vspecField.setToolTipText("motor spec volts");

        tspecField.setText("343.4");
        tspecField.setToolTipText("motor stall torque, in_oz");

        wspecField.setText("5310.0");
        wspecField.setToolTipText("motor free speed, RPM");

        ispecField.setText("133.0");
        ispecField.setToolTipText("motor stall amps");

        nField.setText("4");
        nField.setToolTipText("number of motors");

        rcomField.setText("0.013");
        rcomField.setToolTipText("ohms, battery internal resistance plus wire and connection resistance from battery to PDB (including main breaker)");
        rcomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcomFieldActionPerformed(evt);
            }
        });

        ukField.setText("0.7");
        ukField.setToolTipText("coefficient of kinetic friction");

        usField.setText("1.0");
        usField.setToolTipText("coefficient of static friction");

        vbatField.setText("12.7");
        vbatField.setToolTipText("fully-charged open-circuit battery volts");

        gField.setText("12.75");
        gField.setToolTipText("gear ratio");

        rField.setText("3.0");
        rField.setToolTipText("wheel radius, inches");

        jLabel9.setText("Vbat:");

        jLabel17.setText("uk:");

        jLabel18.setText("M:");

        jLabel19.setText("r:");

        mField.setText("150");
        mField.setToolTipText("vehicle mass, lbm");

        jLabel20.setText("G:");

        jLabel21.setText("Rcom:");

        jLabel22.setText("us:");

        jLabel10.setText("Hover over any of the fields for a description tooltip.");

        jLabel11.setText("Rone:");

        jLabel12.setText("dt:");

        jLabel13.setText("tstop:");

        roneField.setText("0.002");
        roneField.setToolTipText("ohms, circuit wiring and connector resistance from PDB to motor (including 40A breaker)");

        dtField.setText("0.001");
        dtField.setToolTipText("integration step size, seconds");
        dtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtFieldActionPerformed(evt);
            }
        });

        tstopField.setText("1.0");
        tstopField.setToolTipText("integration duration, seconds");

        jLabel14.setText("Kf:");

        kfField.setText("0.9");
        kfField.setToolTipText("drivetrain efficiency fraction");

        loadScenarioButton.setText("Load Scenario");
        loadScenarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadScenarioButtonActionPerformed(evt);
            }
        });

        saveScenarioButton.setText("Save Scenario");
        saveScenarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveScenarioButtonActionPerformed(evt);
            }
        });

        xstopField.setText("10.0");
        xstopField.setToolTipText("distance in ft at which point to stop the simulation");

        jLabel15.setText("xstop:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(kfField)
                                        .addComponent(wspecField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(tspecField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(krvField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(kroField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(vspecField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(nField)
                                        .addComponent(ispecField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel9)))
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadScenarioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveScenarioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ukField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(generateButton)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(xstopField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vbatField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rcomField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(roneField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tstopField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vspecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tspecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wspecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ispecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(gField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ukField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rcomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vbatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(roneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tstopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xstopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateButton)
                    .addComponent(loadScenarioButton)
                    .addComponent(saveScenarioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kroFieldActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        parseScenario();
        fileChooser.showSaveDialog(null);
        new Calculator(currentScenario, fileChooser.getSelectedFile()).calculate();
        //JOptionPane.showMessageDialog(null, "Successfully wrote file.");
    }//GEN-LAST:event_generateButtonActionPerformed

    private void dtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtFieldActionPerformed

    private void rcomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcomFieldActionPerformed

    private void krvFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krvFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_krvFieldActionPerformed

    private void loadScenarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadScenarioButtonActionPerformed
        ObjectInputStream inputStream = null;
        fileChooser.showOpenDialog(null);
        
        try {
            inputStream = new ObjectInputStream(new FileInputStream(fileChooser.getSelectedFile()));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The file could not be found.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }
        
        Object data = null;
        
        try {
            data = inputStream.readObject();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "A ClassNotFound Exception occurred.");
        }
        
        if(!(data instanceof Scenario)){
            JOptionPane.showMessageDialog(null, "The file could not be parsed into a scenario.");
        }else{
            Scenario s = (Scenario) data;
            writeFields(
                s.Kro, 
                s.Krv, 
                s.Kf, 
                s.Vspec, 
                s.Tspec, 
                s.Wspec, 
                s.Ispec, 
                s.n, 
                s.G, 
                s.r, 
                s.M, 
                s.uk, 
                s.us, 
                s.Rcom, 
                s.Vbat, 
                s.Rone, 
                s.dt, 
                s.tstop);
            JOptionPane.showMessageDialog(null, "Scenario successfully loaded.");
        }
    }//GEN-LAST:event_loadScenarioButtonActionPerformed

    private void saveScenarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveScenarioButtonActionPerformed
        parseScenario();
        
        ObjectOutputStream outputStream = null;
        fileChooser.showSaveDialog(null);
        
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileChooser.getSelectedFile()));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The file could not be found.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }
        
        try {
            outputStream.writeObject(currentScenario);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }
        
        JOptionPane.showMessageDialog(null, "Scenario successfully saved.");
    }//GEN-LAST:event_saveScenarioButtonActionPerformed

    private void parseScenario(){
        double Kro = Double.valueOf(kroField.getText());
        double Krv = Double.valueOf(krvField.getText());
        double Kf = Double.valueOf(kfField.getText());
        
        double Vspec = Double.valueOf(vspecField.getText());
        double Tspec = Double.valueOf(tspecField.getText());
        double Wspec = Double.valueOf(wspecField.getText());
        double Ispec = Double.valueOf(ispecField.getText());
        int n = Integer.parseInt(nField.getText());

        double G = Double.valueOf(gField.getText());
        double r = Double.valueOf(rField.getText());

        double M = Double.valueOf(mField.getText());
        double uk = Double.valueOf(ukField.getText());
        double us = Double.valueOf(usField.getText());

        double Rcom = Double.valueOf(rcomField.getText());
        double Vbat = Double.valueOf(vbatField.getText());
        double Rone = Double.valueOf(roneField.getText());
        
        double dt = Double.valueOf(dtField.getText());
        double tstop = Double.valueOf(tstopField.getText());
        double xstop = Double.valueOf(xstopField.getText());
        
        currentScenario = new Scenario(Kro, Krv, Kf, Vspec, Tspec, Wspec, Ispec, 
                n, G, r, M, uk, us, Rcom, Vbat, Rone, dt, tstop, xstop);
    }
    
    private void writeFields(double Kro, double Krv, double Kf, double Vspec, 
            double Tspec, double Wspec, double Ispec, int n, double G, double r, 
            double M, double uk, double us, double Rcom, double Vbat, 
            double Rone, double dt, double tstop){
        
        kroField.setText(String.valueOf(Kro));
        krvField.setText(String.valueOf(Krv));
        kfField.setText(String.valueOf(Kf));
        vspecField.setText(String.valueOf(Vspec));
        tspecField.setText(String.valueOf(Tspec));
        wspecField.setText(String.valueOf(Wspec));
        ispecField.setText(String.valueOf(Ispec));
        nField.setText(String.valueOf(n));
        gField.setText(String.valueOf(G));
        rField.setText(String.valueOf(r));
        mField.setText(String.valueOf(M));
        ukField.setText(String.valueOf(uk));
        usField.setText(String.valueOf(us));
        rcomField.setText(String.valueOf(Rcom));
        vbatField.setText(String.valueOf(Vbat));
        roneField.setText(String.valueOf(Rone));
        dtField.setText(String.valueOf(dt));
        tstopField.setText(String.valueOf(tstop));
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dtField;
    private javax.swing.JTextField gField;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField ispecField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kfField;
    private javax.swing.JTextField kroField;
    private javax.swing.JTextField krvField;
    private javax.swing.JButton loadScenarioButton;
    private javax.swing.JTextField mField;
    private javax.swing.JTextField nField;
    private javax.swing.JTextField rField;
    private javax.swing.JTextField rcomField;
    private javax.swing.JTextField roneField;
    private javax.swing.JButton saveScenarioButton;
    private javax.swing.JTextField tspecField;
    private javax.swing.JTextField tstopField;
    private javax.swing.JTextField ukField;
    private javax.swing.JTextField usField;
    private javax.swing.JTextField vbatField;
    private javax.swing.JTextField vspecField;
    private javax.swing.JTextField wspecField;
    private javax.swing.JTextField xstopField;
    // End of variables declaration//GEN-END:variables
}
