/*******************************************************************************
* Copyright (c) 2012-2014 -- WPI Suite
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributor: team struct-by-lightning
*******************************************************************************/
package edu.wpi.cs.wpisuitetng.modules.PlanningPoker.views;

import javax.swing.DefaultListModel;

import edu.wpi.cs.wpisuitetng.modules.PlanningPoker.models.Deck;

/**
 * @author sfmailand
 *
 */
public class CreateDeckView extends javax.swing.JPanel {

	
	DefaultListModel<Integer> deckValuesListModel = new DefaultListModel<Integer>();
	
	
    /**
     * Creates new form CreateDeckView
     */
    public CreateDeckView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        deckNamePanel = new javax.swing.JPanel();
        deckNameField = new javax.swing.JTextField();
        deckPanel = new javax.swing.JPanel();
        newValueField = new javax.swing.JTextField();
        addValueBtn = new javax.swing.JButton();
        deckValuesScrollPane = new javax.swing.JScrollPane();
        deckValuesList = new javax.swing.JList<Integer>();
        removeValuesBtn = new javax.swing.JButton();
        createDeckBtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();

        
        
        deckValuesList.setModel(deckValuesListModel);
        
        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Creating your new deck");

        deckNamePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Deck Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16)))); // NOI18N

        deckNameField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deckNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deckNameFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout deckNamePanelLayout = new javax.swing.GroupLayout(deckNamePanel);
        deckNamePanel.setLayout(deckNamePanelLayout);
        deckNamePanelLayout.setHorizontalGroup(
            deckNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deckNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deckNameField)
                .addContainerGap())
        );
        deckNamePanelLayout.setVerticalGroup(
            deckNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deckNamePanelLayout.createSequentialGroup()
                .addComponent(deckNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deckPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Deck Values", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        newValueField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        newValueField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newValueField.setText("20");
        newValueField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newValueFieldKeyTyped(evt);
            }
        });

        addValueBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addValueBtn.setText(">");
        addValueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValueBtnActionPerformed(evt);
            }
        });

        deckValuesList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deckValuesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deckValuesListMouseClicked(evt);
            }
        });
        deckValuesScrollPane.setViewportView(deckValuesList);

        removeValuesBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        removeValuesBtn.setText("Remove");
        removeValuesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeValuesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deckPanelLayout = new javax.swing.GroupLayout(deckPanel);
        deckPanel.setLayout(deckPanelLayout);
        deckPanelLayout.setHorizontalGroup(
            deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addValueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deckValuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeValuesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        deckPanelLayout.setVerticalGroup(
            deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deckPanelLayout.createSequentialGroup()
                        .addComponent(deckValuesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(deckPanelLayout.createSequentialGroup()
                        .addGroup(deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeValuesBtn)
                            .addGroup(deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addValueBtn)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        createDeckBtn.setText("Create Deck");
        createDeckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDeckBtnActionPerformed(evt);
            }
        });

        errorMessage.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deckNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deckPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(createDeckBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deckNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDeckBtn)
                    .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void addValueBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	deckValuesListModel.addElement(Integer.parseInt(newValueField.getText()));
    }                                           

    private void createDeckBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	checkAllFields();
    }                                             

    private void removeValuesBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	checkAllFields();
    }                                               

    private void deckValuesListMouseClicked(java.awt.event.MouseEvent evt) {                                            
    	checkAllFields();
    }                                           

    private void newValueFieldKeyTyped(java.awt.event.KeyEvent evt) {                                       
    	checkAllFields();
    }                                      

    private void deckNameFieldKeyTyped(java.awt.event.KeyEvent evt) {                                       
        checkAllFields();
    }   
    
    
    public void checkAllFields(){
    	
    }
    
    
	/**
	 * This method will open up a new tab in the planning poker module with this
	 * UI for creating a new planning poker game.
	 */
	public static void openNewTab() {
		final CreateDeckView view = new CreateDeckView();
		MainView.getInstance().addCloseableTab("Create Deck", view);
	}


    // Variables declaration - do not modify                     
    private javax.swing.JButton addValueBtn;
    private javax.swing.JButton createDeckBtn;
    private javax.swing.JTextField deckNameField;
    private javax.swing.JPanel deckNamePanel;
    private javax.swing.JPanel deckPanel;
    private javax.swing.JList<Integer> deckValuesList;
    private javax.swing.JScrollPane deckValuesScrollPane;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField newValueField;
    private javax.swing.JButton removeValuesBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}