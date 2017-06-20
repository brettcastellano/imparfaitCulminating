/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brcas1396
 */
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Lesson1 extends javax.swing.JFrame {

    /**
     * Creates new form Lesson1
     */
    public Lesson1() {
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

        title2_1 = new javax.swing.JLabel();
        title2_2 = new javax.swing.JLabel();
        lesson1Question1 = new javax.swing.JLabel();
        lesson1Question2 = new javax.swing.JLabel();
        lesson1Question3 = new javax.swing.JLabel();
        lesson1Question4 = new javax.swing.JLabel();
        lesson1Answer1 = new javax.swing.JTextField();
        lesson1Answer2 = new javax.swing.JTextField();
        lesson1Answer3 = new javax.swing.JTextField();
        lesson1Answer4 = new javax.swing.JTextField();
        lesson1Question5 = new javax.swing.JLabel();
        lesson1Question6 = new javax.swing.JLabel();
        lesson1Question7 = new javax.swing.JLabel();
        lesson1Question8 = new javax.swing.JLabel();
        lesson1Answer5 = new javax.swing.JTextField();
        lesson1Answer6 = new javax.swing.JTextField();
        lesson1Answer7 = new javax.swing.JTextField();
        lesson1Answer8 = new javax.swing.JTextField();
        presentTenseCheck = new javax.swing.JButton();
        checkOrX1 = new javax.swing.JLabel();
        checkOrX2 = new javax.swing.JLabel();
        checkOrX3 = new javax.swing.JLabel();
        checkOrX4 = new javax.swing.JLabel();
        checkOrX5 = new javax.swing.JLabel();
        checkOrX6 = new javax.swing.JLabel();
        checkOrX7 = new javax.swing.JLabel();
        checkOrX8 = new javax.swing.JLabel();
        l1_Q3_Hint = new javax.swing.JLabel();
        l1_Q4_Hint = new javax.swing.JLabel();
        groupPrompt = new javax.swing.JLabel();
        groupChoice = new javax.swing.JTextField();
        allCorrect = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title2_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        title2_1.setText("First let's make sure you can conjugate the first person plural ");

        title2_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        title2_2.setText("in the present tense:  (make sure the c and g remain soft) ");

        lesson1Question1.setText("marcher (nous): ");

        lesson1Question2.setText("aller (nous): ");

        lesson1Question3.setText("placer (nous): ");

        lesson1Question4.setText("plonger (nous): ");

        lesson1Question5.setText("rougir (nous): ");

        lesson1Question6.setText("vouloir (nous): ");

        lesson1Question7.setText("courir (nous): ");

        lesson1Question8.setText("faire (nous): ");

        presentTenseCheck.setText("Check Answers");
        presentTenseCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentTenseCheckActionPerformed(evt);
            }
        });

        checkOrX1.setMaximumSize(new java.awt.Dimension(25, 25));
        checkOrX1.setMinimumSize(new java.awt.Dimension(25, 25));
        checkOrX1.setPreferredSize(new java.awt.Dimension(25, 25));

        checkOrX2.setMinimumSize(new java.awt.Dimension(25, 25));
        checkOrX2.setPreferredSize(new java.awt.Dimension(25, 25));

        groupPrompt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        groupPrompt.setText("Next, select a verb group (type 1-3, then press enter): ");

        groupChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupChoiceActionPerformed(evt);
            }
        });

        allCorrect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title2_1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lesson1Question4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lesson1Question1)
                                    .addComponent(lesson1Question2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lesson1Question3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lesson1Answer4)
                                                .addComponent(lesson1Answer2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lesson1Answer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                            .addComponent(lesson1Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l1_Q3_Hint, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l1_Q4_Hint, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(checkOrX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(checkOrX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(checkOrX3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lesson1Question5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                                        .addComponent(lesson1Answer5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lesson1Question6)
                                                            .addComponent(lesson1Question7))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(lesson1Answer6, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                            .addComponent(lesson1Answer7)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lesson1Question8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lesson1Answer8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkOrX4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(213, 213, 213))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(presentTenseCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(allCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOrX5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title2_2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(groupChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(groupPrompt)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title2_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title2_2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOrX5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lesson1Question1)
                                .addComponent(lesson1Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lesson1Question5)
                                .addComponent(lesson1Answer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(checkOrX1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lesson1Question2)
                        .addComponent(lesson1Answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lesson1Question6)
                        .addComponent(lesson1Answer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkOrX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOrX6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lesson1Question3)
                            .addComponent(lesson1Answer3)
                            .addComponent(lesson1Question7)
                            .addComponent(lesson1Answer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l1_Q3_Hint, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOrX3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lesson1Question4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lesson1Answer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lesson1Question8)
                        .addComponent(lesson1Answer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkOrX8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOrX4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l1_Q4_Hint, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentTenseCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(groupPrompt)
                .addGap(18, 18, 18)
                .addComponent(groupChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presentTenseCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentTenseCheckActionPerformed
        int numCorrect = 0;     // number of correct user answers
        
        /* arrays to record user guesses and correct answers */
        String[] answers = new String[8];
        JTextField[] guesses = new JTextField[8];
        String[] userGuess = new String[8];
        
        JLabel[] checkOrX = new JLabel[8];      //checkmark and x icons

        /* correct answers */
        answers[0] = "marchons";
        answers[1] = "allons";
        answers[2] = "plaçons";
        answers[3] = "plongeons";
        answers[4] = "rougissons";
        answers[5] = "voulons";
        answers[6] = "courons";
        answers[7] = "faisons";

        /* array of text fields where user guesses will be inputted */ 
        guesses[0] = lesson1Answer1;
        guesses[1] = lesson1Answer2;
        guesses[2] = lesson1Answer3;
        guesses[3] = lesson1Answer4;
        guesses[4] = lesson1Answer5;
        guesses[5] = lesson1Answer6;
        guesses[6] = lesson1Answer7;
        guesses[7] = lesson1Answer8;

        /* labels for checkmark and x icons */
        checkOrX[0] = checkOrX1;
        checkOrX[1] = checkOrX2;
        checkOrX[2] = checkOrX3;
        checkOrX[3] = checkOrX4;
        checkOrX[4] = checkOrX5;
        checkOrX[5] = checkOrX6;
        checkOrX[6] = checkOrX7;
        checkOrX[7] = checkOrX8;

        for (int i = 0; i < guesses.length; i++) {
            userGuess[i] = (guesses[i]).getText();      //get each answer from user

            if (userGuess[i].equalsIgnoreCase(answers[i])) {        //guess matches correct answer?
                numCorrect +=1;     
                allCorrect.setText(answerCorrect(checkOrX, i, numCorrect));     //message for whether or not user got all correct
            } else {
                answerIncorrect(checkOrX, i);
                l1_Q3_Hint.setText("Hint: ç");      //hints for conjugation
                l1_Q4_Hint.setText("Hint: ge");
            }
            
        }

    }//GEN-LAST:event_presentTenseCheckActionPerformed

    private void groupChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupChoiceActionPerformed
        int verbGroup;

        /* user chooses preferred verb group */
        String userChoice = groupChoice.getText();      
        verbGroup = Integer.parseInt(userChoice);

        /* set appropriate frame visible, based on user choice */
        if (verbGroup == 1) {
            new Group1().setVisible(true);
            this.setVisible(false);
        } else if (verbGroup == 2) {
            new Group2().setVisible(true);
            this.setVisible(false);
        } else {
            new Group3().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_groupChoiceActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);     //close the program
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.out.println("Fill in the empty check boxes, then verify your answers."       //help
                + " next, enter your prefered verb group and press ENTER.");        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
   /**
    *Displays checkmark beside correct user answer,
    * returns message based on user's success
    * pre: array of JLabels, question number (i),
    * number of correct answers
    * post: icon set to JLabel, good or bad 
    * message returned
    */
    public String answerCorrect(JLabel[] checkOrX, int i, int numCorrect) {
    ImageIcon checkMark = new ImageIcon(getClass().getResource("/checkmark.gif"));      //get checkmark image
    checkOrX[i].setIcon(checkMark);     //display checkmark beside correct answer
    String msg;
    
    if (numCorrect == 8) {      //all answers correct? 
        msg = "Great Job!";
    } else {
        msg = "Oops!";
    }
    return msg;
}
    /**
    *Displays x beside incorrect user answer,
    * pre: array of JLabels, question number (i),
    * post: icon set to JLabel,
    */
    public void answerIncorrect(JLabel[] checkOrX, int i) {
    ImageIcon incorrect = new ImageIcon(getClass().getResource("/incorrect.png"));      //get x image
    
    
    checkOrX[i].setIcon(incorrect);     //display x beside incorrect answer
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
            java.util.logging.Logger.getLogger(Lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lesson1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allCorrect;
    private javax.swing.JLabel checkOrX1;
    private javax.swing.JLabel checkOrX2;
    private javax.swing.JLabel checkOrX3;
    private javax.swing.JLabel checkOrX4;
    private javax.swing.JLabel checkOrX5;
    private javax.swing.JLabel checkOrX6;
    private javax.swing.JLabel checkOrX7;
    private javax.swing.JLabel checkOrX8;
    private javax.swing.JTextField groupChoice;
    private javax.swing.JLabel groupPrompt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel l1_Q3_Hint;
    private javax.swing.JLabel l1_Q4_Hint;
    private javax.swing.JTextField lesson1Answer1;
    private javax.swing.JTextField lesson1Answer2;
    private javax.swing.JTextField lesson1Answer3;
    private javax.swing.JTextField lesson1Answer4;
    private javax.swing.JTextField lesson1Answer5;
    private javax.swing.JTextField lesson1Answer6;
    private javax.swing.JTextField lesson1Answer7;
    private javax.swing.JTextField lesson1Answer8;
    private javax.swing.JLabel lesson1Question1;
    private javax.swing.JLabel lesson1Question2;
    private javax.swing.JLabel lesson1Question3;
    private javax.swing.JLabel lesson1Question4;
    private javax.swing.JLabel lesson1Question5;
    private javax.swing.JLabel lesson1Question6;
    private javax.swing.JLabel lesson1Question7;
    private javax.swing.JLabel lesson1Question8;
    private javax.swing.JButton presentTenseCheck;
    private javax.swing.JLabel title2_1;
    private javax.swing.JLabel title2_2;
    // End of variables declaration//GEN-END:variables
}
