/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellchecking.view;

import model.Rule.Rule16;
import javax.swing.UIManager;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import java.awt.Color;
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
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import model.ReadFile;
import model.Rule.*;
import model.Kmp;

/**
 *
 * @author katie
 */
public class MainView extends javax.swing.JFrame {

	String content = "";
	String contentError = "";
	private Kmp kMPAlgorithm;
	public ArrayList<Rule> listRules;

	public MainView() {
		initComponents();
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

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                textError.setRows(5);
                jScrollPane2.setViewportView(textError);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(readFileBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCheck)
                                                .addGap(28, 28, 28))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(btnSearch)
                                                        .addGap(26, 26, 26)))
                                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(readFileBtn)
                                        .addComponent(btnCheck))
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                );

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
		String[] arr = input.split("[^\\p{IsAlphabetic}']+");

		MainView check = new MainView();
		
		textError.setText("");

		check.listRules = new ArrayList<>();

		check.listRules.add(new Rule1());
		check.listRules.add(new Rule2());
//		check.listRules.add(new Rule3());
//		check.listRules.add(new Rule4());
//		check.listRules.add(new Rule5());
//		check.listRules.add(new Rule6());
		check.listRules.add(new Rule7());
//		check.listRules.add(new Rule8());   #error
//		check.listRules.add(new Rule9());
		check.listRules.add(new Rule10());
		check.listRules.add(new Rule11());
//		check.listRules.add(new Rule13());
		check.listRules.add(new Rule14());
		check.listRules.add(new Rule15());
		check.listRules.add(new Rule16());
		check.listRules.add(new Rule17());
		check.listRules.add(new Rule18());
//		check.listRules.add(new Rule19());
		check.listRules.add(new Rule19B());
		check.listRules.add(new Rule20());
		check.listRules.add(new Rule21());
		check.listRules.add(new Rule22());
		check.listRules.add(new Rule23());
		check.listRules.add(new Rule24());
		check.listRules.add(new Rule25());
		check.listRules.add(new Rule26_27());
//		check.listRules.add(new Rule28());
//		check.listRules.add(new Rule29());
//		check.listRules.add(new Rule29B());
		check.listRules.add(new Rule30_31_33());
		check.listRules.add(new Rule32_34());
		check.listRules.add(new Rule35());
		check.listRules.add(new Rule36());
//		check.listRules.add(new Rule37());
//		check.listRules.add(new Rule39());
//		check.listRules.add(new Rule39B());
		check.listRules.add(new Rule40());
//		check.listRules.add(new Rule41());
//		check.listRules.add(new Rule41B());
		check.listRules.add(new Rule42());
//		check.listRules.add(new Rule43());
//		check.listRules.add(new Rule43B());
		check.listRules.add(new Rule44());
		check.listRules.add(new Rule45());
//		check.listRules.add(new Rule45A());
//		check.listRules.add(new Rule45B());
//		check.listRules.add(new Rule45C());
//		check.listRules.add(new Rule46());
		check.listRules.add(new Rule47());
		check.listRules.add(new Rule48());
		check.listRules.add(new Rule49());

		for (String word : arr) {
			for (Rule rule : check.listRules) {
				if (!rule.isValid(word)) {
					contentError += word + ": " + "Sai luat: \t" + rule.showError() + "\n"; 
//					System.out.println(contentError);
					textError.setText(contentError );
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
		txtResult.setText("");
		String subString = txtSearch.getText();
		kMPAlgorithm = new Kmp();
		kMPAlgorithm.searchSubString(contentArea.getText(), subString);
		if (kMPAlgorithm.getNumberOfMatchesFound() == 0) {
			txtResult.setText("No match found");
		} else {
			txtResult.setText(kMPAlgorithm.getNumberOfMatchesFound() + " matches found");
		}

		setResultHighlight(kMPAlgorithm.getResultPositions());

        }//GEN-LAST:event_btnSearchActionPerformed

	public void setResultHighlight(List<Integer> positions) {
		Highlighter highlighter = contentArea.getHighlighter();
		highlighter.removeAllHighlights();
		Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.PINK);

		for (Integer position : positions) {
			try {
				highlighter.addHighlight(position, position + kMPAlgorithm.getSubStringLength(), painter);
			} catch (BadLocationException ex) {
				Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
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
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JButton readFileBtn;
        private javax.swing.JTextArea textError;
        private javax.swing.JLabel txtResult;
        private javax.swing.JTextField txtSearch;
        // End of variables declaration//GEN-END:variables

}
