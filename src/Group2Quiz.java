
import java.text.DecimalFormat;
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
 * @author Brett
 */
public class Group2Quiz extends javax.swing.JFrame {

    /**
     * Creates new form Group2Quiz
     */
    public Group2Quiz() {
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

        Title = new javax.swing.JLabel();
        rule = new javax.swing.JLabel();
        instruction1 = new javax.swing.JLabel();
        instruction2 = new javax.swing.JLabel();
        question1 = new javax.swing.JLabel();
        question2 = new javax.swing.JLabel();
        question3 = new javax.swing.JLabel();
        question4 = new javax.swing.JLabel();
        answer1 = new javax.swing.JTextField();
        answer2 = new javax.swing.JTextField();
        answer3 = new javax.swing.JTextField();
        answer4 = new javax.swing.JTextField();
        instruction3 = new javax.swing.JLabel();
        instruction4 = new javax.swing.JLabel();
        question8 = new javax.swing.JLabel();
        question9 = new javax.swing.JLabel();
        question10 = new javax.swing.JLabel();
        question11 = new javax.swing.JLabel();
        answer6 = new javax.swing.JTextField();
        answer7 = new javax.swing.JTextField();
        answer8 = new javax.swing.JTextField();
        answer9 = new javax.swing.JTextField();
        doneQuiz = new javax.swing.JButton();
        sentence3 = new javax.swing.JLabel();
        sentence1 = new javax.swing.JLabel();
        sentence2 = new javax.swing.JLabel();
        bravoGif = new javax.swing.JLabel();
        sadPng = new javax.swing.JLabel();
        checkOrX1 = new javax.swing.JLabel();
        checkOrX2 = new javax.swing.JLabel();
        checkOrX3 = new javax.swing.JLabel();
        checkOrX4 = new javax.swing.JLabel();
        checkOrX5 = new javax.swing.JLabel();
        checkOrX6 = new javax.swing.JLabel();
        checkOrX7 = new javax.swing.JLabel();
        checkOrX8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        answer5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        answer10 = new javax.swing.JTextField();
        checkOrX9 = new javax.swing.JLabel();
        checkOrX10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setText("Let's Test Your Knowledge!");

        rule.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rule.setText("You are NOT allowed to use the internet or any other source for this quiz.");

        instruction1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruction1.setText("1. Convert the following verbs from their infinitive forms,");

        instruction2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruction2.setText("to imparfait:");

        question1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question1.setText("a) faiblir (nous): ");

        question2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question2.setText("b) amaigrir (vous): ");

        question3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question3.setText("c) choisir (tu):  ");

        question4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question4.setText("d) finir (elles):  ");

        instruction3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruction3.setText("2. Convert the following verbs from imparfait,");

        instruction4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruction4.setText("to their infinitive forms:");

        question8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question8.setText("a) je garantissais");

        question9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question9.setText("b) il invertissait");

        question10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question10.setText("c) vous refroidissiez ");

        question11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        question11.setText("d) tu trahissais");

        doneQuiz.setText("Finished!");
        doneQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneQuizActionPerformed(evt);
            }
        });

        sentence3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sentence3.setForeground(new java.awt.Color(255, 0, 0));

        sentence1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sentence1.setForeground(new java.awt.Color(255, 0, 0));

        sentence2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sentence2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("e) unir (nous): ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("e) ils remplissaient");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(rule))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(sentence3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sadPng, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sentence2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sentence1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(doneQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(169, 169, 169)))))
                                .addComponent(bravoGif, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(instruction1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(instruction2)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(instruction4)
                                            .addComponent(instruction3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(question4)
                                            .addComponent(question3)
                                            .addComponent(question2)
                                            .addComponent(question1)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(answer4)
                                                .addComponent(answer3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                .addComponent(answer1)
                                                .addComponent(answer5))
                                            .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkOrX3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(question9)
                                            .addComponent(question8)
                                            .addComponent(question10)
                                            .addComponent(question11)
                                            .addComponent(jLabel2))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(answer10, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                .addComponent(answer9)
                                                .addComponent(answer8)
                                                .addComponent(answer6))
                                            .addComponent(answer7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkOrX6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkOrX10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(44, 44, 44)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(29, 29, 29)
                .addComponent(rule)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruction1)
                    .addComponent(instruction3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruction2)
                    .addComponent(instruction4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkOrX1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(question1)
                                        .addComponent(question8)
                                        .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(answer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checkOrX6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(question2)
                                        .addComponent(question9)
                                        .addComponent(answer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checkOrX7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(checkOrX2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(question3)
                                .addComponent(question10)
                                .addComponent(answer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkOrX8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOrX3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(question4)
                                .addComponent(question11)
                                .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkOrX9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(checkOrX4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkOrX10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(checkOrX5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(answer10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(answer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bravoGif, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sadPng, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doneQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sentence1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sentence2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sentence3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneQuizActionPerformed
        /* total # of questions and # of correct user answers */
        final int numQuestions = 10;
        int numCorrect = 0;
        
        /* arrays to record user guesses and correct answers */
        String[] answers = new String[10];
        JTextField[] guesses = new JTextField[10];
        String[] userGuess = new String[10];
        
        JLabel[] checkOrX = new JLabel[10];     //checkmark or x icons
        
        /* get all images/gifs */
        ImageIcon checkMark = new ImageIcon(getClass().getResource("/checkmark.gif"));
        ImageIcon incorrect = new ImageIcon(getClass().getResource("/incorrect.png"));
        ImageIcon bravo = new ImageIcon(getClass().getResource("/bravo.gif"));
        ImageIcon sad = new ImageIcon(getClass().getResource("/sad.png"));
        
        DecimalFormat x = new DecimalFormat("###%");        //to display score as a percentage
        
        /* correct answers */
        answers[0] = "faiblissions";
        answers[1] = "amaigrissiez";
        answers[2] = "choisissais";
        answers[3] = "finissaient";
        answers[4] = "unissions";
        answers[5] = "garantir";
        answers[6] = "invertir";
        answers[7] = "refroidir";
        answers[8] = "trahir";
        answers[9] = "remplir";
        
        /* array of text fields where user guesses will be inputted */
        guesses[0] = answer1;
        guesses[1] = answer2;
        guesses[2] = answer3;
        guesses[3] = answer4;
        guesses[4] = answer5;
        guesses[5] = answer6;
        guesses[6] = answer7;
        guesses[7] = answer8;
        guesses[8] = answer9;
        guesses[9] = answer10;
        
        /* labels for checkmark and x icons */
        checkOrX[0] = checkOrX1;
        checkOrX[1] = checkOrX2;
        checkOrX[2] = checkOrX3;
        checkOrX[3] = checkOrX4;
        checkOrX[4] = checkOrX5;
        checkOrX[5] = checkOrX6;
        checkOrX[6] = checkOrX7;
        checkOrX[7] = checkOrX8;
        checkOrX[8] = checkOrX9;
        checkOrX[9] = checkOrX10;
        
  
        for (int i = 0; i < guesses.length; i++) {
            userGuess[i] = (guesses[i]).getText();      //get each answer from user

            if (userGuess[i].equalsIgnoreCase(answers[i])) {        //guess matches correct answer?
                numCorrect +=1;
                checkOrX[i].setIcon(checkMark);     //display checkmark beside correct answer
            } else {
                checkOrX[i].setIcon(incorrect);     //display x beside incorrect answer
            }
            
        }
        doneQuiz.setVisible(false);     //get rid of button (can only take quiz once)
        
        sentence1.setText("You got " + numCorrect + " answers out of " + numQuestions + " correct. "
                + "Your score is " + x.format((double)numCorrect / numQuestions));      //notify user of final score (including percent)
        
        if (((double)numCorrect / numQuestions * 100) > 75) {       //did user score above 75%?
            sentence2.setText("Great job! You meet or exceed the standard.");
            bravoGif.setIcon(bravo);        //happy gif
        } else {
            sadPng.setIcon(sad);        //sad picture
            sentence2.setText("Unfortunately, you did not meet the standard.");
            sentence3.setText("We recommend trying again and paying closer attention to the lesson.");        
        }
        
    }//GEN-LAST:event_doneQuizActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);     //close the program
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.out.println("Fill in the empty check boxes, then click 'finished!'.");       //help
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
            java.util.logging.Logger.getLogger(Group2Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group2Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group2Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group2Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group2Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField answer1;
    private javax.swing.JTextField answer10;
    private javax.swing.JTextField answer2;
    private javax.swing.JTextField answer3;
    private javax.swing.JTextField answer4;
    private javax.swing.JTextField answer5;
    private javax.swing.JTextField answer6;
    private javax.swing.JTextField answer7;
    private javax.swing.JTextField answer8;
    private javax.swing.JTextField answer9;
    private javax.swing.JLabel bravoGif;
    private javax.swing.JLabel checkOrX1;
    private javax.swing.JLabel checkOrX10;
    private javax.swing.JLabel checkOrX2;
    private javax.swing.JLabel checkOrX3;
    private javax.swing.JLabel checkOrX4;
    private javax.swing.JLabel checkOrX5;
    private javax.swing.JLabel checkOrX6;
    private javax.swing.JLabel checkOrX7;
    private javax.swing.JLabel checkOrX8;
    private javax.swing.JLabel checkOrX9;
    private javax.swing.JButton doneQuiz;
    private javax.swing.JLabel instruction1;
    private javax.swing.JLabel instruction2;
    private javax.swing.JLabel instruction3;
    private javax.swing.JLabel instruction4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel question1;
    private javax.swing.JLabel question10;
    private javax.swing.JLabel question11;
    private javax.swing.JLabel question2;
    private javax.swing.JLabel question3;
    private javax.swing.JLabel question4;
    private javax.swing.JLabel question8;
    private javax.swing.JLabel question9;
    private javax.swing.JLabel rule;
    private javax.swing.JLabel sadPng;
    private javax.swing.JLabel sentence1;
    private javax.swing.JLabel sentence2;
    private javax.swing.JLabel sentence3;
    // End of variables declaration//GEN-END:variables
}
