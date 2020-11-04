/*
 * Evan Kreutzwiser & Lukas Krampiz ProjectManagementProject
 * Oct 23, 2020
 * Help sister learn about SDLC
 */
package krampitzkreutzwiserics4u;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class MainMenu extends javax.swing.JFrame {

    private static ArrayList<Question> questions;
    private final MaterialReview materialReviewFrame;
    private final QuizUI QuizUI_Frame;
    

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        questions = loadQuestions();
        materialReviewFrame = new MaterialReview(this);
        QuizUI_Frame = new QuizUI(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        materialBtn = new javax.swing.JButton();
        quizBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Development Life Cycle");

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLbl.setText("Learn the Software Development Life Cycle");

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        materialBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        materialBtn.setText("View Study Material");
        materialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialBtnActionPerformed(evt);
            }
        });

        quizBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        quizBtn.setText("Start Quiz");
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(materialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quizBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(41, 41, 41)
                .addComponent(materialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0); //close the program with 0 errors/normal conditions
    }//GEN-LAST:event_exitBtnActionPerformed

    private void materialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialBtnActionPerformed
        //set is visible
        materialReviewFrame.setVisible(true);
        //hid this one (main menu)
        this.setVisible(false);
    }//GEN-LAST:event_materialBtnActionPerformed

    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QuizUI_Frame.setVisible(true);
    }//GEN-LAST:event_quizBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows 10 look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    public static ArrayList<Question> getQuestions() {
        return questions;
    }

    /**
     * Load in the questions from the Data file into an array of Question
     * objects //This is Evan's code - Lukas
     * @return 
     */
    private final ArrayList<Question> loadQuestions() {

        // Declare variables
        Scanner fileReader;
        InputStream file = MaterialReview.class.getResourceAsStream("questions.txt");
        ArrayList<Question> loadedQuestions = new ArrayList();
        Question newQestion = new Question();

        // Try to read the file
        try {
            // Create the scanner to read the file
            fileReader = new Scanner(file);

            // Read the entire file into a string
            while (fileReader.hasNextLine()) {
                newQestion = new Question();
                //set the quetion
                newQestion.setQuestion(fileReader.nextLine());
                //set the four ansers
                for (int i = 1; i < 5; i++) {
                    newQestion.setChoice(i, fileReader.nextLine());
                }
                //set the correct answer
                newQestion.setCorrectAnswer(Integer.parseInt(fileReader.nextLine()));

                //a whole question has been loaded, now add it to the arrayList
                loadedQuestions.add(newQestion);
            }
            
            
            
        } catch (Exception e) {
            // Set the arrayList to not be empty and include the error in it
            //set the quetion
            newQestion.setQuestion("ERROR: Failed to load questons data file!");
            //set the four ansers
            for (int i = 1; i < 5; i++) {
                newQestion.setChoice(i, "ERROR: Missing Question");
            }
            // Output the jsvs error to the standard output
            System.out.println("Error reading questions file: " + e);
        }

        //return the loadted arrayList
        return loadedQuestions;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton materialBtn;
    private javax.swing.JButton quizBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
