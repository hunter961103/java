
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter961103
 */
public class Information extends javax.swing.JFrame {
    TextFile textfile = new TextFile();
    HerbNode herbhead = null;
    DiseaseNode diseasehead = null;
    TreatmentNode treatmenthead = null;
    boolean admin;
    String usertypeopt , searchtypeopt;
    String inputname = "" , inputtype = "" , location = "" , inputdescription = "" , inputrelated1 = "" , inputrelated2 = "";
    ImageIcon image;
    boolean add;
    String target , search = "";
    DefaultComboBoxModel model1 = new DefaultComboBoxModel();
    DefaultComboBoxModel model2 = new DefaultComboBoxModel();
    
    /**
     * Creates new form Information
     */
    public Information() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Information(boolean admin , String usertypeopt , String searchtypeopt , HerbNode current , String target) {
        initComponents();
        setLocationRelativeTo(null);
        this.admin = admin;
        this.usertypeopt = usertypeopt;
        this.searchtypeopt = searchtypeopt;
        this.target = target;
        add = false;
        searchtypelabel.setText("" + searchtypeopt);
        imagepanel.setPreferredSize(imagepanel.getSize());
        herbhead = textfile.ReadHerb();
        diseasehead = textfile.ReadDisease();
        treatmenthead = textfile.ReadTreatment();
        related1cb.setModel(model1);
        related2cb.setModel(model2);
        model1.addElement("No related data");
        model2.addElement("No related data");
        related1.setText("Related disease :");
        related2.setText("Related treatment :");
        DiseaseNode current1 = diseasehead;
        while(current1 != null) {
            model1.addElement(current1.getName().toString());
            current1 = current1.getLink();
        }
        TreatmentNode current2 = treatmenthead;
        while(current2 != null) {
            model2.addElement(current2.getName().toString());
            current2 = current2.getLink();
        }
        infoname.setEditable(false);
        infotype.setEditable(false);
        infodescription.setEditable(false);
        if(!admin) {
            editname.setVisible(false);
            edittype.setVisible(false);
            editimage.setVisible(false);
            editdescription.setVisible(false);
            save.setVisible(false);
            related1cb.setVisible(false);
            related2cb.setVisible(false);
        }
        infoname.setText("" + current.getName().toString());
        infotype.setText("" + current.getType().toString());
        image = new ImageIcon(current.getImage().toString());
        addimage.setText("");
        addimage.setIcon(image);
        location = current.getImage().toString();
        infodescription.setText("" + current.getDescription().toString());
        inforelated1.setText("" + current.getRelatedds().toString());
        inforelated2.setText("" + current.getRelatedtm().toString());
    }
    
    public Information(boolean admin , String usertypeopt , String searchtypeopt , DiseaseNode current , String target) {
        initComponents();
        setLocationRelativeTo(null);
        this.admin = admin;
        this.usertypeopt = usertypeopt;
        this.searchtypeopt = searchtypeopt;
        this.target = target;
        add = false;
        searchtypelabel.setText("" + searchtypeopt);
        imagepanel.setPreferredSize(imagepanel.getSize());
        herbhead = textfile.ReadHerb();
        diseasehead = textfile.ReadDisease();
        treatmenthead = textfile.ReadTreatment();
        related1cb.setModel(model1);
        related2cb.setModel(model2);
        model1.addElement("No related data");
        model2.addElement("No related data");
        related1.setText("Related herb :");
        related2.setText("Related treatment :");
        HerbNode current1 = herbhead;
        while(current1 != null) {
            model1.addElement(current1.getName().toString());
            current1 = current1.getLink();
        }
        TreatmentNode current2 = treatmenthead;
        while(current2 != null) {
            model2.addElement(current2.getName().toString());
            current2 = current2.getLink();
        }
        infoname.setEditable(false);
        infodescription.setEditable(false);
        typelabel.setVisible(false);
        infotype.setVisible(false);
        edittype.setVisible(false);
        editimage.setVisible(false);
        if(!admin) {
            editname.setVisible(false);
            editdescription.setVisible(false);
            save.setVisible(false);
            related1cb.setVisible(false);
            related2cb.setVisible(false);
        }
        infoname.setText("" + current.getName().toString());
        addimage.setText("No image");
        infodescription.setText("" + current.getDescription().toString());
        inforelated1.setText("" + current.getRelatedh().toString());
        inforelated2.setText("" + current.getRelatedtm().toString());
    }
    
    public Information(boolean admin , String usertypeopt , String searchtypeopt , TreatmentNode current , String target) {
        initComponents();
        setLocationRelativeTo(null);
        this.admin = admin;
        this.usertypeopt = usertypeopt;
        this.searchtypeopt = searchtypeopt;
        this.target = target;
        add = false;
        searchtypelabel.setText("" + searchtypeopt);
        imagepanel.setPreferredSize(imagepanel.getSize());
        herbhead = textfile.ReadHerb();
        diseasehead = textfile.ReadDisease();
        treatmenthead = textfile.ReadTreatment();
        related1cb.setModel(model1);
        related2cb.setModel(model2);
        model1.addElement("No related data");
        model2.addElement("No related data");
        related1.setText("Related herb :");
        related2.setText("Related disease :");
        HerbNode current1 = herbhead;
        while(current1 != null) {
            model1.addElement(current1.getName().toString());
            current1 = current1.getLink();
        }
        DiseaseNode current2 = diseasehead;
        while(current2 != null) {
            model2.addElement(current2.getName().toString());
            current2 = current2.getLink();
        }
        infoname.setEditable(false);
        infotype.setEditable(false);
        infodescription.setEditable(false);
        editimage.setVisible(false);
        if(!admin) {
            editname.setVisible(false);
            edittype.setVisible(false);
            editdescription.setVisible(false);
            save.setVisible(false);
            related1cb.setVisible(false);
            related2cb.setVisible(false);
        }
        infoname.setText("" + current.getName().toString());
        infotype.setText("" + current.getType().toString());
        addimage.setText("No image");
        infodescription.setText("" + current.getDescription().toString());
        inforelated1.setText("" + current.getRelatedh().toString());
        inforelated2.setText("" + current.getRelatedds().toString());
    }
    
    public Information(boolean admin , String usertypeopt , String searchtypeopt , boolean add) {
        initComponents();
        setLocationRelativeTo(null);
        this.admin = admin;
        this.usertypeopt = usertypeopt;
        this.searchtypeopt = searchtypeopt;
        this.add = add;
        searchtypelabel.setText("" + searchtypeopt);
        imagepanel.setPreferredSize(imagepanel.getSize());
        herbhead = textfile.ReadHerb();
        diseasehead = textfile.ReadDisease();
        treatmenthead = textfile.ReadTreatment();
        related1cb.setModel(model1);
        related2cb.setModel(model2);
        model1.addElement("No related data");
        model2.addElement("No related data");
        switch(searchtypeopt) {
            case "Herb" :
                related1.setText("Related disease :");
                related2.setText("Related treatment :");
                DiseaseNode current1 = diseasehead;
                while(current1 != null) {
                    model1.addElement(current1.getName().toString());
                    current1 = current1.getLink();
                }
                TreatmentNode current2 = treatmenthead;
                while(current2 != null) {
                    model2.addElement(current2.getName().toString());
                    current2 = current2.getLink();
                }
                break;
            case "Disease" :
                related1.setText("Related herb :");
                related2.setText("Related treatment :");
                typelabel.setVisible(false);
                infotype.setVisible(false);
                edittype.setVisible(false);
                addimage.setText("No image");
                HerbNode current3 = herbhead;
                while(current3 != null) {
                    model1.addElement(current3.getName().toString());
                    current3 = current3.getLink();
                }
                TreatmentNode current4 = treatmenthead;
                while(current4 != null) {
                    model2.addElement(current4.getName().toString());
                    current4 = current4.getLink();
                }
                break;
            case "Treatment" :
                related1.setText("Related herb :");
                related2.setText("Related disease :");
                addimage.setText("No image");
                HerbNode current5 = herbhead;
                while(current5 != null) {
                    model1.addElement(current5.getName().toString());
                    current5 = current5.getLink();
                }
                DiseaseNode current6 = diseasehead;
                while(current6 != null) {
                    model2.addElement(current6.getName().toString());
                    current6 = current6.getLink();
                }
        }
        infoname.setEditable(true);
        infotype.setEditable(true);
        infodescription.setEditable(true);
        if(!admin || add) {
            editname.setVisible(false);
            edittype.setVisible(false);
            editimage.setVisible(false);
            editdescription.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        information = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        infodescription = new javax.swing.JTextArea();
        edittype = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        editimage = new javax.swing.JButton();
        addimage = new javax.swing.JLabel();
        editdescription = new javax.swing.JButton();
        editname = new javax.swing.JButton();
        infoname = new javax.swing.JTextField();
        infotype = new javax.swing.JTextField();
        namelabel = new javax.swing.JLabel();
        typelabel = new javax.swing.JLabel();
        descriptionlabel = new javax.swing.JLabel();
        searchtypelabel = new javax.swing.JLabel();
        related1 = new javax.swing.JLabel();
        related1cb = new javax.swing.JComboBox<>();
        related2 = new javax.swing.JLabel();
        related2cb = new javax.swing.JComboBox<>();
        inforelated1 = new javax.swing.JLabel();
        inforelated2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Herbal Medical Knowledge Repository System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 524, -1, -1));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 524, -1, -1));

        information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        infodescription.setColumns(20);
        infodescription.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        infodescription.setLineWrap(true);
        infodescription.setRows(5);
        infodescription.setToolTipText("");
        infodescription.setWrapStyleWord(true);
        scrollpane.setViewportView(infodescription);

        edittype.setText("Edit");
        edittype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittypeActionPerformed(evt);
            }
        });

        imagepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        editimage.setText("Edit");
        editimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editimageActionPerformed(evt);
            }
        });

        addimage.setText("Add Image");
        addimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addimageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addimageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addimageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout imagepanelLayout = new javax.swing.GroupLayout(imagepanel);
        imagepanel.setLayout(imagepanelLayout);
        imagepanelLayout.setHorizontalGroup(
            imagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addimage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editimage)
                .addContainerGap())
        );
        imagepanelLayout.setVerticalGroup(
            imagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addimage)
                    .addComponent(editimage))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        editdescription.setText("Edit");
        editdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdescriptionActionPerformed(evt);
            }
        });

        editname.setText("Edit");
        editname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnameActionPerformed(evt);
            }
        });

        namelabel.setText("Name :");

        typelabel.setText("Type :");

        descriptionlabel.setText("Description :");

        javax.swing.GroupLayout informationLayout = new javax.swing.GroupLayout(information);
        information.setLayout(informationLayout);
        informationLayout.setHorizontalGroup(
            informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationLayout.createSequentialGroup()
                        .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(informationLayout.createSequentialGroup()
                                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(informationLayout.createSequentialGroup()
                                        .addComponent(descriptionlabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editdescription))
                            .addComponent(imagepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationLayout.createSequentialGroup()
                        .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namelabel)
                            .addComponent(typelabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoname)
                            .addComponent(infotype))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edittype, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editname, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        informationLayout.setVerticalGroup(
            informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editname)
                    .addComponent(infoname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edittype)
                    .addComponent(infotype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typelabel))
                .addGap(10, 10, 10)
                .addComponent(imagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationLayout.createSequentialGroup()
                        .addComponent(editdescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(information, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 50, -1, -1));

        searchtypelabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        searchtypelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchtypelabel.setText("Search Type");
        searchtypelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(searchtypelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 11, 335, -1));

        related1.setText("Related 1 :");
        getContentPane().add(related1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 427, -1, -1));

        related1cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                related1cbActionPerformed(evt);
            }
        });
        getContentPane().add(related1cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 447, -1, -1));

        related2.setText("Related 2 :");
        getContentPane().add(related2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 478, -1, -1));

        related2cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                related2cbActionPerformed(evt);
            }
        });
        getContentPane().add(related2cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 498, -1, -1));

        inforelated1.setText("No related data");
        inforelated1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inforelated1MouseClicked(evt);
            }
        });
        getContentPane().add(inforelated1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 450, 210, -1));

        inforelated2.setText("No related data");
        getContentPane().add(inforelated2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 501, 210, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Information Background.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        inputname = infoname.getText();
        inputtype = infotype.getText();
        inputdescription = infodescription.getText();
        switch(searchtypeopt) {
            case "Herb" :
                if(inputname.equals("") || inputtype.equals("") || location.equals("") || inputdescription.equals(""))
                    JOptionPane.showMessageDialog(null , "Information does not complete");
                else {
                    boolean found = false;
                    HerbNode current1 = herbhead;
                    while(current1 != null) {
                        if(add && inputname.equals(current1.getName().toString())) {
                            JOptionPane.showMessageDialog(null , "Herb \"" + inputname + "\" is already exist");
                            found = true;
                        }
                        current1 = current1.getLink();
                    }
                    if(!found) {
                        HerbNode herbnode = new HerbNode(inputname , inputtype , location , inputdescription , inputrelated1 , inputrelated2);
                        if(herbhead == null)
                            herbhead = herbnode;
                        else {
                            HerbNode current = herbhead;
                            while(current.getLink() != null)
                                current = current.getLink();
                            current.setLink(herbnode);
                        }
                        if(!add) {
                            if(herbhead.getName().toString().equals(target))
                                herbhead = herbhead.getLink();
                            else {
                                HerbNode before = herbhead;
                                HerbNode current = herbhead;
                                while(!current.getName().toString().equals(target) && current.getLink() != null) {
                                    before = current;
                                    current = current.getLink();
                                }
                                if(current.getName().toString().equals(target))
                                    before.setLink(current.getLink());
                            }
                        }
                        textfile.SaveHerb(herbhead);
                        if(add)
                            JOptionPane.showMessageDialog(null , searchtypeopt + " is added succesfully");
                        else
                            JOptionPane.showMessageDialog(null , searchtypeopt + " is updated succesfully");
                        close();
                        Data frame1 = new Data(admin , usertypeopt , searchtypeopt , search);
                        frame1.setVisible(true);
                    }
                }
                break;
            case "Disease" :
                if(inputname.equals("") || inputdescription.equals(""))
                    JOptionPane.showMessageDialog(null , "Information does not complete");
                else {
                    boolean found = false;
                    DiseaseNode current1 = diseasehead;
                    while(current1 != null) {
                        if(add && inputname.equals(current1.getName().toString())) {
                            JOptionPane.showMessageDialog(null , "Disease \"" + inputname + "\" is already exist");
                            found = true;
                        }
                        current1 = current1.getLink();
                    }
                    if(!found) {
                        DiseaseNode diseasenode = new DiseaseNode(inputname , inputdescription , inputrelated1 , inputrelated2);
                        if(diseasehead == null)
                            diseasehead = diseasenode;
                        else {
                            DiseaseNode current = diseasehead;
                            while(current.getLink() != null)
                                current = current.getLink();
                            current.setLink(diseasenode);
                        }
                        if(!add) {
                            if(diseasehead.getName().toString().equals(target))
                                diseasehead = diseasehead.getLink();
                            else {
                                DiseaseNode before = diseasehead;
                                DiseaseNode current = diseasehead;
                                while(!current.getName().toString().equals(target) && current.getLink() != null) {
                                    before = current;
                                    current = current.getLink();
                                }
                                if(current.getName().toString().equals(target))
                                    before.setLink(current.getLink());
                            }
                        }
                        textfile.SaveDisease(diseasehead);
                        if(add)
                            JOptionPane.showMessageDialog(null , searchtypeopt + " is added succesfully");
                        else
                            JOptionPane.showMessageDialog(null , searchtypeopt + " is updated succesfully");
                        close();
                        Data frame1 = new Data(admin , usertypeopt , searchtypeopt , search);
                        frame1.setVisible(true);
                    }
                }
                break;
            case "Treatment" :
                if(inputname.equals("") || inputtype.equals("") || inputdescription.equals(""))
                    JOptionPane.showMessageDialog(null , "Information does not complete");
                else {
                    boolean found = false;
                    TreatmentNode current1 = treatmenthead;
                    while(current1 != null) {
                        if(add && inputname.equals(current1.getName().toString())) {
                            JOptionPane.showMessageDialog(null , "Treatment \"" + inputname + "\" is already exist");
                            found = true;
                        }
                        current1 = current1.getLink();
                    }
                    if(!found) {
                        TreatmentNode treatmentnode = new TreatmentNode(inputname , inputtype , inputdescription , inputrelated1 , inputrelated2);
                        if(add) {
                            if(treatmenthead == null)
                                treatmenthead = treatmentnode;
                            else {
                                treatmentnode.setLink(treatmenthead);
                                treatmenthead = treatmentnode;
                            }
                        }
                        else {
                            TreatmentNode current = treatmenthead;
                            while(current != null) {
                                if(current.getName().toString().equals(target)) {
                                    current.setName(inputname);
                                    current.setType(inputtype);
                                    current.setDescription(inputdescription);
                                }
                                    current = current.getLink();
                            }
                        }
                        textfile.SaveTreatment(treatmenthead);
                        if(add)
                            JOptionPane.showMessageDialog(null , searchtypeopt + " is added succesfully");
                        else
                            JOptionPane.showMessageDialog(null , searchtypeopt + " is updated succesfully");
                        close();
                        Data frame1 = new Data(admin , usertypeopt , searchtypeopt , search);
                        frame1.setVisible(true);
                    }
                }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void edittypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittypeActionPerformed
        infotype.setEditable(true);
    }//GEN-LAST:event_edittypeActionPerformed

    private void editimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editimageActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images" , "jpg");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        try {
            location = "" + chooser.getSelectedFile().getAbsolutePath();
            image = new ImageIcon(location);
            addimage.setText("");
            addimage.setIcon(image);
        }
        catch(NullPointerException ex) {}
    }//GEN-LAST:event_editimageActionPerformed

    private void editdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdescriptionActionPerformed
        infodescription.setEditable(true);
    }//GEN-LAST:event_editdescriptionActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        close();
        Data frame2 = new Data(admin , usertypeopt , searchtypeopt , search);
        frame2.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void addimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addimageMouseClicked
        if(add && searchtypeopt.equals("Herb")) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images" , "jpg");
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(filter);
            chooser.showOpenDialog(null);
            try {
                location = "" + chooser.getSelectedFile().getAbsolutePath();
                image = new ImageIcon(location);
                addimage.setText("");
                addimage.setIcon(image);
            }
            catch(NullPointerException ex) {}
        }
    }//GEN-LAST:event_addimageMouseClicked

    private void addimageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addimageMouseEntered
        if(add && searchtypeopt.equals("Herb")) {
            Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR); 
            setCursor(cursor);
        }
    }//GEN-LAST:event_addimageMouseEntered

    private void addimageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addimageMouseExited
        Cursor cursor = Cursor.getDefaultCursor();
        setCursor(cursor);
    }//GEN-LAST:event_addimageMouseExited

    private void editnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnameActionPerformed
        infoname.setEditable(true);
    }//GEN-LAST:event_editnameActionPerformed

    private void related1cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_related1cbActionPerformed
        inputrelated1 = related1cb.getSelectedItem().toString();
        inforelated1.setText(inputrelated1);
    }//GEN-LAST:event_related1cbActionPerformed

    private void related2cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_related2cbActionPerformed
        inputrelated2 = related2cb.getSelectedItem().toString();
        inforelated2.setText(inputrelated2);
    }//GEN-LAST:event_related2cbActionPerformed

    private void inforelated1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inforelated1MouseClicked
        
    }//GEN-LAST:event_inforelated1MouseClicked

    public void close() {
        WindowEvent close = new WindowEvent(this , WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(close);
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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addimage;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel descriptionlabel;
    private javax.swing.JButton editdescription;
    private javax.swing.JButton editimage;
    private javax.swing.JButton editname;
    private javax.swing.JButton edittype;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JTextArea infodescription;
    private javax.swing.JTextField infoname;
    private javax.swing.JLabel inforelated1;
    private javax.swing.JLabel inforelated2;
    private javax.swing.JPanel information;
    private javax.swing.JTextField infotype;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel related1;
    private javax.swing.JComboBox<String> related1cb;
    private javax.swing.JLabel related2;
    private javax.swing.JComboBox<String> related2cb;
    private javax.swing.JButton save;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JLabel searchtypelabel;
    private javax.swing.JLabel typelabel;
    // End of variables declaration//GEN-END:variables
}
