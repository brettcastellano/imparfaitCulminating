
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brcas1396
 */
public class Group2 extends javax.swing.JFrame {

    /**
     * Creates new form Group2
     */
    public Group2() {
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

        ending3 = new javax.swing.JLabel();
        instruction1 = new javax.swing.JLabel();
        instruction2 = new javax.swing.JLabel();
        ending1 = new javax.swing.JLabel();
        ending2 = new javax.swing.JLabel();
        ending4 = new javax.swing.JLabel();
        ending5 = new javax.swing.JLabel();
        ending6 = new javax.swing.JLabel();
        ending7 = new javax.swing.JLabel();
        examples = new javax.swing.JLabel();
        practices = new javax.swing.JLabel();
        example1 = new javax.swing.JLabel();
        example2 = new javax.swing.JLabel();
        example3 = new javax.swing.JLabel();
        example4 = new javax.swing.JLabel();
        example5 = new javax.swing.JLabel();
        practice1 = new javax.swing.JLabel();
        practice2 = new javax.swing.JLabel();
        practice3 = new javax.swing.JLabel();
        practice4 = new javax.swing.JLabel();
        practice5 = new javax.swing.JLabel();
        practiceA1 = new javax.swing.JTextField();
        practiceA2 = new javax.swing.JTextField();
        practiceA3 = new javax.swing.JTextField();
        practiceA5 = new javax.swing.JTextField();
        g1CheckAns = new javax.swing.JButton();
        g1Proceed = new javax.swing.JButton();
        checkOrX1 = new javax.swing.JLabel();
        checkOrX2 = new javax.swing.JLabel();
        checkOrX3 = new javax.swing.JLabel();
        checkOrX4 = new javax.swing.JLabel();
        checkOrX5 = new javax.swing.JLabel();
        practiceA4 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        ending3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending3.setText("il: ait");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instruction1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        instruction1.setText("To form the imparfait for 1st group verbs, simply take the radical of the verb");

        instruction2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        instruction2.setText("conjugated with \"nous\" in the present tense, and add the following endings: ");

        ending1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending1.setText("Je: issais");

        ending2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending2.setText("Tu: issais");

        ending4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending4.setText("il: issait");

        ending5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending5.setText("Nous: issions");

        ending6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending6.setText("Vous: issiez");

        ending7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ending7.setText("Ils/elles: issaient");

        examples.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        examples.setText("Example: ");

        practices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        practices.setText("Try it: ");

        example1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        example1.setText("finir (tu): [fin]issais");

        example2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        example2.setText("bondir (nous): [bond]issions");

        example3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        example3.setText("convertir (il): [convert]issait");

        example4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        example4.setText("avertir (vous): [avert]issiez");

        example5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        example5.setText("fournir (ils): [fourn]issaient");

        practice1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        practice1.setText("grandir (il): ");

        practice2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        practice2.setText("subir (elles): ");

        practice3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        practice3.setText("rougir (je): ");

        practice4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        practice4.setText("enrichir (vous): ");

        practice5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        practice5.setText("nourrir (nous): ");

        practiceA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceA2ActionPerformed(evt);
            }
        });

        g1CheckAns.setText("Check Answers");
        g1CheckAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1CheckAnsActionPerformed(evt);
            }
        });

        g1Proceed.setText("Proceed");
        g1Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ProceedActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ending1)
                            .addComponent(ending2)
                            .addComponent(ending4))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkOrX2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkOrX4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkOrX5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ending5)
                        .addGap(229, 229, 229))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(practiceA2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ending6)
                                .addComponent(ending7)
                                .addComponent(practices)
                                .addComponent(practice3)
                                .addComponent(practice2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(practice1)
                                    .addGap(32, 32, 32)
                                    .addComponent(practiceA1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(practice5)
                                        .addComponent(practice4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(practiceA5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(practiceA4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(practiceA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instruction2)
                    .addComponent(instruction1))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examples)
                    .addComponent(example4)
                    .addComponent(example5)
                    .addComponent(example2)
                    .addComponent(example1)
                    .addComponent(example3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1Proceed, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(g1CheckAns, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(instruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction2)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ending1)
                    .addComponent(ending5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ending2)
                    .addComponent(ending6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ending4)
                    .addComponent(ending7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examples)
                    .addComponent(practices))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(example1)
                        .addComponent(practice1)
                        .addComponent(practiceA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkOrX1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g1CheckAns)
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkOrX2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(example2)
                                        .addComponent(practice2)
                                        .addComponent(practiceA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkOrX3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(example3)
                                .addComponent(practice3)
                                .addComponent(practiceA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(g1Proceed)
                            .addComponent(example4)
                            .addComponent(practice4)
                            .addComponent(practiceA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOrX4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(example5)
                        .addComponent(practice5)
                        .addComponent(practiceA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkOrX5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void practiceA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_practiceA2ActionPerformed

    private void g1CheckAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1CheckAnsActionPerformed
        /* Arrays to record user guesses and correct answers */
        String[] answers = new String[5];
        JTextField[] guesses = new JTextField[5];
        String[] userGuess = new String[5];
        
        JLabel[] checkOrX = new JLabel[5];      //checkmark or x icons
        
        /* get checkmark and x images */
        ImageIcon checkMark = new ImageIcon(getClass().getResource("/checkmark.gif"));
        ImageIcon incorrect = new ImageIcon(getClass().getResource("/incorrect.png"));

        /* correct answers */
        answers[0] = "grandissait";
        answers[1] = "subissaient";
        answers[2] = "rougissais";
        answers[3] = "enrichissiez";
        answers[4] = "nourrissions";

        /* array of text fields where user guesses will be inputted */ 
        guesses[0] = practiceA1;
        guesses[1] = practiceA2;
        guesses[2] = practiceA3;
        guesses[3] = practiceA4;
        guesses[4] = practiceA5;

        /* labels for checkmark and x icons */
        checkOrX[0] = checkOrX1;
        checkOrX[1] = checkOrX2;
        checkOrX[2] = checkOrX3;
        checkOrX[3] = checkOrX4;
        checkOrX[4] = checkOrX5;
        
        for (int i = 0; i < guesses.length; i++) {
            userGuess[i] = (guesses[i]).getText();      //get each answer from user

            if (userGuess[i].equalsIgnoreCase(answers[i])) {        //guess matches correct answer?
                checkOrX[i].setIcon(checkMark);     //display checkmark beside correct answer
            } else {
                checkOrX[i].setText(answers[i]);     //display correct answer
                checkOrX[i].setIcon(incorrect);     //display x beside incorrect answer
            }
            
        }
        
        
    }//GEN-LAST:event_g1CheckAnsActionPerformed

    private void g1ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ProceedActionPerformed
        /* proceed to next frame (group2quiz) */
        new Group2Quiz().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g1ProceedActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);     //close the program
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.out.println("Fill in the empty check boxes, then verify your answers."       //help
            + " next, click 'proceed'.");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkOrX1;
    private javax.swing.JLabel checkOrX2;
    private javax.swing.JLabel checkOrX3;
    private javax.swing.JLabel checkOrX4;
    private javax.swing.JLabel checkOrX5;
    private javax.swing.JLabel ending1;
    private javax.swing.JLabel ending2;
    private javax.swing.JLabel ending3;
    private javax.swing.JLabel ending4;
    private javax.swing.JLabel ending5;
    private javax.swing.JLabel ending6;
    private javax.swing.JLabel ending7;
    private javax.swing.JLabel example1;
    private javax.swing.JLabel example2;
    private javax.swing.JLabel example3;
    private javax.swing.JLabel example4;
    private javax.swing.JLabel example5;
    private javax.swing.JLabel examples;
    private javax.swing.JButton g1CheckAns;
    private javax.swing.JButton g1Proceed;
    private javax.swing.JLabel instruction1;
    private javax.swing.JLabel instruction2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel practice1;
    private javax.swing.JLabel practice2;
    private javax.swing.JLabel practice3;
    private javax.swing.JLabel practice4;
    private javax.swing.JLabel practice5;
    private javax.swing.JTextField practiceA1;
    private javax.swing.JTextField practiceA2;
    private javax.swing.JTextField practiceA3;
    private javax.swing.JTextField practiceA4;
    private javax.swing.JTextField practiceA5;
    private javax.swing.JLabel practices;
    // End of variables declaration//GEN-END:variables
}