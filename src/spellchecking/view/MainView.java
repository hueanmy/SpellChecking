/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellchecking.view;

import model.Rule.Rule16;
import javax.swing.UIManager;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import model.ReadFile;
import model.Rule.*;
import model.Kmp;

/**
 *
 * @author katie
 */
public class MainView extends javax.swing.JFrame {
        

        private int pos = 0;
	String content = "";
	String contentError = "";
	private Kmp kMPAlgorithm;
	public ArrayList<Rule> listRules;
	String found = "";

	public MainView() {
		initComponents();
                contentArea.setText("Click Read File and your input file will go here");
            textError.setText("Click Check and error words in that file goes here");
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        readFileBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentArea = new javax.swing.JTextArea();
        btnCheck = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtResult = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textError = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 583));

        readFileBtn.setText("Read File");
        readFileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readFileBtnMouseClicked(evt);
            }
        });
        readFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readFileBtnActionPerformed(evt);
            }
        });

        contentArea.setColumns(20);
        contentArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        contentArea.setRows(5);
        jScrollPane1.setViewportView(contentArea);

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        textError.setColumns(20);
        textError.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textError.setRows(5);
        jScrollPane2.setViewportView(textError);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\phuong\\Desktop\\java_lib\\spellcheck.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Simple Spell Checker");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(readFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtSearch)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearch)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCheck, btnSearch, readFileBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(readFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCheck, btnSearch, readFileBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readFileBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readFileBtnMouseClicked
	    JFileChooser fileChooser = new JFileChooser();
	    int returnValue = fileChooser.showOpenDialog(null);
	    if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String file_path = selectedFile.getAbsolutePath();
                ReadFile rf = new ReadFile();
                try {
                        String text = rf.read(file_path);
                        contentArea.setText(text);
                        content = text;

                } catch (IOException ex) {
                        Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
	    }
    }//GEN-LAST:event_readFileBtnMouseClicked

	public void spellCheck(String input) {
	    String inputLC = input.toLowerCase();
            String[] arr = inputLC.split("[^\\p{IsAlphabetic}']+");

            MainView check = new MainView();

            textError.setText("");

            check.listRules = new ArrayList<>();

            check.listRules.add(new Rule1());
            check.listRules.add(new Rule2());
	    check.listRules.add(new Rule3());
	    check.listRules.add(new Rule4());
	    check.listRules.add(new Rule5());
	    check.listRules.add(new Rule6());
            check.listRules.add(new Rule7());
	    check.listRules.add(new Rule8_9());  
            check.listRules.add(new Rule10());
            check.listRules.add(new Rule11());
	    check.listRules.add(new Rule13());
            check.listRules.add(new Rule14());
            check.listRules.add(new Rule15());
            check.listRules.add(new Rule16());
            check.listRules.add(new Rule17());
            check.listRules.add(new Rule18());
	    check.listRules.add(new Rule19());
            check.listRules.add(new Rule19B());
            check.listRules.add(new Rule20());
            check.listRules.add(new Rule21());
            check.listRules.add(new Rule22());
            check.listRules.add(new Rule23());
            check.listRules.add(new Rule24());
            check.listRules.add(new Rule25());
            check.listRules.add(new Rule26_27());
	    check.listRules.add(new Rule28_29AB());
            check.listRules.add(new Rule30_31_33());
            check.listRules.add(new Rule32_34());
            check.listRules.add(new Rule35());
            check.listRules.add(new Rule36());
	    check.listRules.add(new Rule37());
	    check.listRules.add(new Rule38());
	    check.listRules.add(new Rule39AB());
            check.listRules.add(new Rule40());
	    check.listRules.add(new Rule41());
            check.listRules.add(new Rule41B());
            check.listRules.add(new Rule42());
	    check.listRules.add(new Rule43());
            check.listRules.add(new Rule44());
            check.listRules.add(new Rule45());
	    check.listRules.add(new Rule46());
            check.listRules.add(new Rule47());
            check.listRules.add(new Rule48());
            check.listRules.add(new Rule49());

            for (String word : arr) {
                for (Rule rule : check.listRules) {
                    if (!rule.isValid(word)) {
                        contentError += word + ":    " + "Sai luat: \t" + rule.showError() + "\n";
                        textError.setText(contentError);
                    }
                }

            }

	}


    private void readFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readFileBtnActionPerformed

    }//GEN-LAST:event_readFileBtnActionPerformed

        private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
            spellCheck(content);
        }//GEN-LAST:event_btnCheckActionPerformed

        private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
            int number_of_results = 0;
            txtResult.setText("");
            String subString = txtSearch.getText().toLowerCase();
            
            kMPAlgorithm = new Kmp();
            kMPAlgorithm.searchSubString(contentArea.getText(), subString);
            if (kMPAlgorithm.getNumberOfMatchesFound() == 0) {
                txtResult.setText("No match found");
            } else {
                txtResult.setText(kMPAlgorithm.getNumberOfMatchesFound() + " matches found");
            }
            

            contentArea.requestFocusInWindow();

            if(subString != null && subString.length() > 0) {

                Document document = contentArea.getDocument();

                int findLength = subString.length();

                try {
                    boolean found = false;
                    if (pos + findLength > document.getLength()) {
                        pos = 0;
                    }

                    while (pos + findLength <= document.getLength()) {

                        String match = document.getText(pos, findLength).toLowerCase();

                        if (match.equals(subString)) {
                            found = true;
                            break;
                        }
                        pos++;
                    }


                    if (found) {

                        Rectangle viewRect = contentArea.modelToView(pos);

                        contentArea.scrollRectToVisible(viewRect);

                        contentArea.setCaretPosition(pos + findLength);
                        contentArea.moveCaretPosition(pos);

                        pos += findLength;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        }//GEN-LAST:event_btnSearchActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null,"Minimalist SpellChecker \n"
                + "Author: Mai and Phuong");
    }//GEN-LAST:event_jLabel1MouseClicked


	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
            

            try {
                UIManager.setLookAndFeel((new SyntheticaBlackEyeLookAndFeel()));
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainView().setVisible(true);
                }
            });
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextArea contentArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton readFileBtn;
    private javax.swing.JTextArea textError;
    private javax.swing.JLabel txtResult;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
