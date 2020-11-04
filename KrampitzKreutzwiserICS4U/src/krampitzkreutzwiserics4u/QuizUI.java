/*
 * Lukas Krampiz
 * Nov 4, 2020
 * 
 */
package krampitzkreutzwiserics4u;

import java.util.ArrayList;

/**
 *
 * @author lukra1175
 */
public class QuizUI extends javax.swing.JFrame {
    
    private final MainMenu mainMenuFrame;
    private static ArrayList<Question> quizQuestions;
    private int questionNum = 0; //the current question the user is on
    private int selectedAns = 0;

    /**
     * Creates new form QuizUI
     * @param mainMenu
     */
    public QuizUI(MainMenu mainMenu) {
        initComponents();
        mainMenuFrame = mainMenu;
        quizQuestions = MainMenu.getQuestions();
        updateLabels();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnswerOptionBtnGrp = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        questionPromptLbl = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        optionALbl = new javax.swing.JLabel();
        optionBLbl1 = new javax.swing.JLabel();
        optionCLbl2 = new javax.swing.JLabel();
        optionDLbl3 = new javax.swing.JLabel();
        Option1RdBtn = new javax.swing.JRadioButton();
        Option2RdBtn = new javax.swing.JRadioButton();
        Option3RdBtn = new javax.swing.JRadioButton();
        Option4RdBtn = new javax.swing.JRadioButton();
        nextBtn = new javax.swing.JButton();
        PreviousBtn = new javax.swing.JButton();
        questionNumPromptLbl = new javax.swing.JLabel();
        questionNumCurrLbl = new javax.swing.JLabel();
        questionNumSlashLbl = new javax.swing.JLabel();
        questionNumTotalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLbl.setText("Multiple Choice Quiz");

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        questionPromptLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        questionPromptLbl.setText("Question: ");

        questionLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        questionLbl.setText("question here");

        optionALbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        optionALbl.setText("A)");

        optionBLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        optionBLbl1.setText("B)");

        optionCLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        optionCLbl2.setText("C)");

        optionDLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        optionDLbl3.setText("D)");

        AnswerOptionBtnGrp.add(Option1RdBtn);
        Option1RdBtn.setSelected(true);
        Option1RdBtn.setText("Option1RdBtn");

        AnswerOptionBtnGrp.add(Option2RdBtn);
        Option2RdBtn.setText("Option2RdBtn");

        AnswerOptionBtnGrp.add(Option3RdBtn);
        Option3RdBtn.setText("Option3RdBtn");

        AnswerOptionBtnGrp.add(Option4RdBtn);
        Option4RdBtn.setText("Option4RdBtn");

        nextBtn.setText("Next >");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        PreviousBtn.setText("< Previous");
        PreviousBtn.setEnabled(false);
        PreviousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousBtnActionPerformed(evt);
            }
        });

        questionNumPromptLbl.setText("Question:");

        questionNumCurrLbl.setText("0");

        questionNumSlashLbl.setText("/");

        questionNumTotalLbl.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PreviousBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(optionALbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(Option1RdBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(questionPromptLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(questionLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(optionBLbl1)
                                                .addComponent(optionCLbl2))
                                            .addComponent(optionDLbl3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Option3RdBtn)
                                            .addComponent(Option2RdBtn)
                                            .addComponent(Option4RdBtn)))
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(questionNumPromptLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionNumCurrLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionNumSlashLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionNumTotalLbl)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLbl)
                    .addComponent(questionNumPromptLbl)
                    .addComponent(questionNumCurrLbl)
                    .addComponent(questionNumSlashLbl)
                    .addComponent(questionNumTotalLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionPromptLbl)
                    .addComponent(questionLbl))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionALbl)
                    .addComponent(Option1RdBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option2RdBtn)
                    .addComponent(optionBLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option3RdBtn)
                    .addComponent(optionCLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option4RdBtn)
                    .addComponent(optionDLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousBtn)
                    .addComponent(nextBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        updateUserBtnChoice();
        //make the main menu visable again
        this.setVisible(false);
        mainMenuFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        updateUserBtnChoice();
        
        if (questionNum < (quizQuestions.size() - 1)) {
            questionNum++;
            PreviousBtn.setEnabled(true);
            if (questionNum == (quizQuestions.size() - 1)) {
                nextBtn.setText("Submit >");
            }
        } else {
            nextBtn.setEnabled(false);
        }
        
        //update labels
        updateLabels();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void PreviousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousBtnActionPerformed
        // TODO add your handling code here:
        updateUserBtnChoice();
        
        if (questionNum > 0) {
            questionNum--;
            nextBtn.setEnabled(true);
            nextBtn.setText("Next >");
            if (questionNum == 0) {
                PreviousBtn.setEnabled(false);
            }
        } else {
            PreviousBtn.setEnabled(false);
        }
        
        
        
        //update labels
        updateLabels();
    }//GEN-LAST:event_PreviousBtnActionPerformed

    private void updateLabels() {
        questionNumCurrLbl.setText(Integer.toString(questionNum + 1));
        questionNumTotalLbl.setText(Integer.toString(quizQuestions.size()));
        questionLbl.setText(quizQuestions.get(questionNum).getQuestion());
        Option1RdBtn.setText(quizQuestions.get(questionNum).getChoice(1));
        Option2RdBtn.setText(quizQuestions.get(questionNum).getChoice(2));
        Option3RdBtn.setText(quizQuestions.get(questionNum).getChoice(3));
        Option4RdBtn.setText(quizQuestions.get(questionNum).getChoice(4));
    }
    
    private void updateUserBtnChoice() {
        //find which button is selected
        if (Option1RdBtn.isSelected()) {            
            selectedAns = 1;
        } else if (Option2RdBtn.isSelected()) {            
            selectedAns = 2;
        } else if (Option3RdBtn.isSelected()) {            
            selectedAns = 3;
        } else if (Option4RdBtn.isSelected()) {            
            selectedAns = 4;
        } else {
            selectedAns = 0;
        }
        quizQuestions.get(questionNum).setUserAnswer(selectedAns);
    }
    
    private ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AnswerOptionBtnGrp;
    private javax.swing.JRadioButton Option1RdBtn;
    private javax.swing.JRadioButton Option2RdBtn;
    private javax.swing.JRadioButton Option3RdBtn;
    private javax.swing.JRadioButton Option4RdBtn;
    private javax.swing.JButton PreviousBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel optionALbl;
    private javax.swing.JLabel optionBLbl1;
    private javax.swing.JLabel optionCLbl2;
    private javax.swing.JLabel optionDLbl3;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JLabel questionNumCurrLbl;
    private javax.swing.JLabel questionNumPromptLbl;
    private javax.swing.JLabel questionNumSlashLbl;
    private javax.swing.JLabel questionNumTotalLbl;
    private javax.swing.JLabel questionPromptLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
