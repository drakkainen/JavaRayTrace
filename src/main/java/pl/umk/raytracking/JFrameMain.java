/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.umk.raytracking;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import pl.umk.raytracking.utility.Vector3D;

/**
 *
 * @author Szymon
 */
public class JFrameMain extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain
     */
    public Driver driver;
    private Integer stepDist = 15;
    public JFrameMain() {
        initComponents();

        try {
            driver = new Driver();
            buffer1 = driver.myImage.buffer;
            buffer2 = driver.myImage.buffer;
            LabelBuffer.setIcon(new ImageIcon(Driver.myImage.buffer));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        LabelBuffer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        camPosXForm = new javax.swing.JTextField();
        camPosYForm = new javax.swing.JTextField();
        camPosZForm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sampleButton = new javax.swing.JButton();
        renderButton = new javax.swing.JButton();
        renderWidth = new javax.swing.JTextField();
        renderHeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ambientlightForm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        antyAliasingNumber = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lookAtX = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lookAtY = new javax.swing.JTextField();
        lookAtZ = new javax.swing.JTextField();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        right = new javax.swing.JButton();
        left = new javax.swing.JButton();
        lookLeft = new javax.swing.JButton();
        LookRight = new javax.swing.JButton();
        filePath = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        animate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelBuffer.setBackground(new java.awt.Color(0, 0, 0));
        LabelBuffer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Pozycja Kamery:");

        camPosXForm.setText("0");

        camPosYForm.setText("130");
        camPosYForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camPosYFormActionPerformed(evt);
            }
        });

        camPosZForm.setText("800");

        jLabel2.setText("x:");

        jLabel3.setText("y:");

        jLabel4.setText("z:");

        sampleButton.setText("podglad");
        sampleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampleButtonActionPerformed(evt);
            }
        });

        renderButton.setText("renderuj");
        renderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renderButtonActionPerformed(evt);
            }
        });

        renderWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renderWidthActionPerformed(evt);
            }
        });

        jLabel5.setText("Roździelczość renderowania:");

        jLabel6.setText("szerokość:");

        jLabel7.setText("wysokość:");

        jLabel8.setText("intenywność światła(-1.5;1.5):");

        ambientlightForm.setText("0.05");
        ambientlightForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambientlightFormActionPerformed(evt);
            }
        });

        antyAliasingNumber.setModel(new javax.swing.AbstractListModel() {
            Integer[] ints = { 1, 2, 3, 4, 5,6,7,8,9,10 };
            public int getSize() { return ints.length; }
            public Object getElementAt(int i) { return ints[i]; }
        });
        jScrollPane1.setViewportView(antyAliasingNumber);

        jLabel9.setText("Anty-aliasing");

        jLabel11.setText("Punkt patrzenia:");

        lookAtX.setText("0");
        lookAtX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookAtXActionPerformed(evt);
            }
        });

        jLabel12.setText("x:");

        jLabel13.setText("y:");

        jLabel14.setText("z:");

        lookAtY.setText("0");

        lookAtZ.setText("0");

        up.setText("/\\");
            up.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    upActionPerformed(evt);
                }
            });

            down.setText("\\/");
            down.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    downActionPerformed(evt);
                }
            });

            right.setText(">");
            right.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rightActionPerformed(evt);
                }
            });

            left.setText("<");
            left.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    leftActionPerformed(evt);
                }
            });

            lookLeft.setText("<");
            lookLeft.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    lookLeftActionPerformed(evt);
                }
            });

            LookRight.setText(">");
            LookRight.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    LookRightActionPerformed(evt);
                }
            });

            filePath.setText("d:\\\\image.png");

            jLabel10.setText("scieżka do pliku :");

            animate.setText("animate");
            animate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    animateActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LabelBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(down))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(up))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(left)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(right))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lookLeft)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LookRight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(animate)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(lookAtX, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(lookAtY, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(lookAtZ, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(220, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(camPosXForm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(camPosYForm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(96, 96, 96)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ambientlightForm, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(camPosZForm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))
                                .addComponent(sampleButton)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(renderWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(renderHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(renderButton))))
                                .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(camPosXForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(camPosYForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(camPosZForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ambientlightForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lookLeft)
                                        .addComponent(LookRight))
                                    .addGap(87, 87, 87))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(jLabel11)
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lookAtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lookAtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lookAtZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addComponent(sampleButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(2, 2, 2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(renderWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(renderHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(renderButton))
                    .addGap(15, 15, 15)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(animate)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void renderWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renderWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renderWidthActionPerformed

    private void lookAtXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookAtXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lookAtXActionPerformed

    private void camPosYFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camPosYFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camPosYFormActionPerformed

    private void sampleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampleButtonActionPerformed

        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            camx = Double.parseDouble(camPosXForm.getText());
            camy = Double.parseDouble(camPosYForm.getText());
            camz = Double.parseDouble(camPosZForm.getText());
            lookx = Double.parseDouble(lookAtX.getText());
            lookz = Double.parseDouble(lookAtZ.getText());
            double looky = Double.parseDouble(lookAtY.getText());
            double ambilent = Double.parseDouble(ambientlightForm.getText());

            im = Driver.render(800, 600, ambilent,
                    camx, camy, camz, lookx,
                    looky, lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_sampleButtonActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            Vector3D vector = new Vector3D(lookx-camx, 0, lookz-camz);
            vector = new Vector3D(-vector.z, 0, vector.x);
            
            vector.normalize();         
            
            camx += Math.round(vector.mult(stepDist).x);
            camz += Math.round(vector.mult(stepDist).z);
            
            lookx += Math.round(vector.mult(stepDist).x);
            lookz += Math.round(vector.mult(stepDist).z);
            
            
            camPosXForm.setText(String.valueOf(camx));
            camPosZForm.setText(String.valueOf(camz));
            
            lookAtX.setText(String.valueOf(lookx));
            lookAtZ.setText(String.valueOf(lookz));

            im = Driver.render(800, 600, Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx,
                    Double.parseDouble(lookAtY.getText()), lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rightActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

//            camx -= 50;
//            lookx -= 50;
            
            Vector3D vector = new Vector3D(lookx-camx, 0, lookz-camz);
            vector = new Vector3D(vector.z, 0, -vector.x);
            
            vector.normalize();         
            
            camx += Math.round(vector.mult(stepDist).x);
            camz += Math.round(vector.mult(stepDist).z);
            
            lookx += Math.round(vector.mult(stepDist).x);
            lookz += Math.round(vector.mult(stepDist).z);
            
            
            camPosXForm.setText(String.valueOf(camx));
            camPosZForm.setText(String.valueOf(camz));
            
            lookAtX.setText(String.valueOf(lookx));
            lookAtZ.setText(String.valueOf(lookz));
            
            im = Driver.render(800, 600, Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx,
                    Double.parseDouble(lookAtY.getText()), lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leftActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {
    
            
            Vector3D vector = new Vector3D(lookx-camx, 0, lookz-camz);
            
            vector.normalize();         
            
            camx += Math.round(vector.mult(stepDist*2).x);
            camz += Math.round(vector.mult(stepDist*2).z);
            
            lookx += Math.round(vector.mult(stepDist*2).x);
            lookz += Math.round(vector.mult(stepDist*2).z);
            
            
            
            camPosZForm.setText(String.valueOf(camz));
            camPosXForm.setText(String.valueOf(camx));
            
            lookAtZ.setText(String.valueOf(lookz));
            lookAtX.setText(String.valueOf(lookx));

            im = Driver.render(800, 600, Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx,
                    Double.parseDouble(lookAtY.getText()), lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_upActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            Vector3D vector = new Vector3D(lookx-camx, 0, lookz-camz);
            
            vector.normalize();         
            
            camx -= Math.round(vector.mult(stepDist*2).x);
            camz -= Math.round(vector.mult(stepDist*2).z);
            
            lookx -= Math.round(vector.mult(stepDist*2).x);
            lookz -= Math.round(vector.mult(stepDist*2).z);
            
            
            camPosXForm.setText(String.valueOf(camx));
            camPosZForm.setText(String.valueOf(camz));
            
            lookAtX.setText(String.valueOf(lookx));
            lookAtZ.setText(String.valueOf(lookz));

            im = Driver.render(800, 600, Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx,
                    Double.parseDouble(lookAtY.getText()), lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_downActionPerformed

    private void lookLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookLeftActionPerformed
        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            lookx =  Math.round( (lookx-camx)*Math.cos(-0.1) - (lookz - camz)*Math.sin(-0.1)+camx );
            lookz =  Math.round( (lookx-camx)*Math.sin(-0.1) + (lookz - camz)*Math.cos(-0.1)+camz );
            
            lookAtX.setText(String.valueOf(lookx));
            lookAtZ.setText(String.valueOf(lookz));

            im = Driver.render(800, 600, Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx,
                    Double.parseDouble(lookAtY.getText()), lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lookLeftActionPerformed

    private void LookRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookRightActionPerformed
        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            lookx = Math.round( (lookx-camx)*Math.cos(0.1) - (lookz - camz)*Math.sin(0.1)+camx );
            lookz =  Math.round( (lookx-camx)*Math.sin(0.1) + (lookz - camz)*Math.cos(0.1)+camz );
            
            lookAtX.setText(String.valueOf(lookx));
            lookAtZ.setText(String.valueOf(lookz));

            im = driver.render(800, 600, Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx,
                    Double.parseDouble(lookAtY.getText()), lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LookRightActionPerformed

    private void renderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renderButtonActionPerformed

        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            im = Driver.render(Integer.parseInt(renderWidth.getText()), Integer.parseInt(renderHeight.getText()), Double.parseDouble(ambientlightForm.getText()),
                    camx, camy, camz, lookx, Double.parseDouble(lookAtY.getText()), lookz, a, filePath.getText(), 0);

            // LabelBuffer.setIcon(new ImageIcon(im) );
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }

            //LabelBuffer.setIcon(new ImageIcon(Driver.myImage.buffer) );

    }//GEN-LAST:event_renderButtonActionPerformed

    private void animateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animateActionPerformed

        int a;
        if (antyAliasingNumber.getSelectedValue() != null) {
            a = (int) antyAliasingNumber.getSelectedValue();
        } else {
            a = 1;
        }
        BufferedImage im;
        try {

            camx = Double.parseDouble(camPosXForm.getText());
            camy = Double.parseDouble(camPosYForm.getText());
            camz = Double.parseDouble(camPosZForm.getText());
            lookx = Double.parseDouble(lookAtX.getText());
            lookz = Double.parseDouble(lookAtZ.getText());
            double looky = Double.parseDouble(lookAtY.getText());
            double ambilent = Double.parseDouble(ambientlightForm.getText());

            im = Driver.render(800, 600, ambilent,
                    camx, camy, -camz, lookx,
                    looky, lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
            im = Driver.render(800, 600, ambilent,
                    camx, camy, 100, lookx,
                    looky, lookz, a, "", 0);

            LabelBuffer.setIcon(new ImageIcon(im));
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_animateActionPerformed

    private void ambientlightFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambientlightFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ambientlightFormActionPerformed

    double camx = 0;
    double camy = 130;
    double camz = 800;

    double lookx = 0;
    double lookz = 0;

    BufferedImage buffer1;
    BufferedImage buffer2;

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ExecutorService exec = Executors.newCachedThreadPool();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                new JFrameMain().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBuffer;
    private javax.swing.JButton LookRight;
    private javax.swing.JTextField ambientlightForm;
    private javax.swing.JButton animate;
    public javax.swing.JList antyAliasingNumber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField camPosXForm;
    private javax.swing.JTextField camPosYForm;
    private javax.swing.JTextField camPosZForm;
    private javax.swing.JButton down;
    private javax.swing.JTextField filePath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton left;
    private javax.swing.JTextField lookAtX;
    private javax.swing.JTextField lookAtY;
    private javax.swing.JTextField lookAtZ;
    private javax.swing.JButton lookLeft;
    private javax.swing.JButton renderButton;
    private javax.swing.JTextField renderHeight;
    private javax.swing.JTextField renderWidth;
    private javax.swing.JButton right;
    private javax.swing.JButton sampleButton;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
