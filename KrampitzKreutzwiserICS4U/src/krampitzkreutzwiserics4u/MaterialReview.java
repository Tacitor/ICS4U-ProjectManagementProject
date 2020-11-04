/*
 * Lukas Krampitz and Evan Kreutwiser
 * Oct 23, 2020 and November 4, 2020
 * Show the material that the user need to study to pass the quiz
 */
package krampitzkreutzwiserics4u;

import java.io.InputStream; // File reference
import java.util.Scanner; // File reading

/**
 *
 * @author Tacitor
 * @author Evan
 */
public class MaterialReview extends javax.swing.JFrame {
    
    private final MainMenu mainMenuFrame;

    /**
     * Creates new form MaterialReview
     * @param m The main menu JFrame this returns to on exit
     */
    public MaterialReview(MainMenu m) {
        initComponents();
        mainMenuFrame = m;
        
        // Load and display the study material file
        loadMaterial();
    }

    /**
     * Read and display the study material in the data file
     */
    public final void loadMaterial() {
        
        // Declare variables
        Scanner fileReader;
        InputStream file = MaterialReview.class.getResourceAsStream("StudyMaterial.txt");
        String fileContents = "";

        // Try to read the file
        try {
            // Create the scanner to read the file
            fileReader = new Scanner(file);
        
            // Read the entire file into a string
            while (fileReader.hasNextLine()) {
                // Read the line of the file into a line of the string
                fileContents += fileReader.nextLine() + "\n";
            }
        }
        catch (Exception e) {
            // Set the sring to be displayed to an error message
            fileContents = "Error: Study material file could not be read.";
            // Output the jsvs error to the standard output
            System.out.println("Error reading study material file: " + e);
        }
        
        // Display the file's contents from the string
        materialTxtAr.setText(fileContents);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialTxtAr = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Study Material:");

        materialTxtAr.setEditable(false);
        materialTxtAr.setColumns(20);
        materialTxtAr.setRows(5);
        materialTxtAr.setText("Read carefully, you will be tested on this:");
        jScrollPane1.setViewportView(materialTxtAr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The event for when the back button is pressed. Returns to the main menu.
     * @param evt The event generated by the button click (Unused)
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mainMenuFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea materialTxtAr;
    // End of variables declaration//GEN-END:variables
}
