package Ahorcado;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

public class Juego extends javax.swing.JFrame {

Back band = new Back();


    public Juego() {
       this.setContentPane(band);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Back();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLetra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 125, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1333, 685));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ahorcado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Letras incorrectas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa la letra:");

        txtLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLetraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetraKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setToolTipText("");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setToolTipText("");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setToolTipText("");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setToolTipText("");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setToolTipText("");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setToolTipText("");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setToolTipText("");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setToolTipText("");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setToolTipText("");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_ahorcado/hangman0.png"))); // NOI18N
        jLabel32.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(691, 691, 691)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(196, 196, 196))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetraKeyTyped
        {
            if (txtLetra.getText().length() == 1) {
                evt.consume(); //no permite que en "txtLetra" pueda haber más de 1 carácter al mismo tiempo
            }
        }
    }//GEN-LAST:event_txtLetraKeyTyped

    private void txtLetraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean acierto = false; // letra acertada = true; letra no acertada = false
            boolean carac_valido = false; //letra ingresada = true; otro carácter ingresado = false
            boolean ya_escrita = false; //letra ya ingresada anteriormente = true; letra ingresada por primera vez en este juego = false

            String letra_ingr = txtLetra.getText().toUpperCase(); //convierte toda letra ingresada en minúscula

            for (int v = 0; v < abecedario.length; v++) { //recorre el array abecedario
                if (letra_ingr.equals(abecedario[v])) {
                    carac_valido = true;
                    //si la letra ingresada se encuentra en algún elemento del array "abecedario", significa que es una letra (y no otro tipo de carácter) y esta variable pasa a ser "true"
                    break;
                }
            }

            for (int g = 0; g < letra_repe.length; g++) {
                if (letra_ingr.equals(letra_repe[g])) {
                    ya_escrita = true;
                    //si la letra ingresada se encuentra en algún elemento del array "letra_repe", significa que ya se ingresó anteriormente, y esta variable pasa a ser "true"
                    break;
                }
            }

            if (carac_valido == false) {
                JOptionPane.showMessageDialog(this, "Símbolo inválido", "Alerta", JOptionPane.WARNING_MESSAGE);

            } else {
                if (ya_escrita == true) {
                    JOptionPane.showMessageDialog(this, "Letra ya ingresada antes", "Alerta", JOptionPane.WARNING_MESSAGE);
                } else {
                    letra_repe[i_letra] = letra_ingr; //se agrega a la posición del valor de i_letra de ese momento
                    i_letra += 1; //suma 1 para la proxima que se ingrese una letra, pueda ingresar al siguiente elemento del array
                    for (char ch : letra_ingr.toCharArray()) { //convierte la variable tipo String "letra_ingr" a tipo char
                        char chr = letra_ingr.charAt(0);
                        for (int recorre = 0; recorre < paises[palabra_azar].length(); recorre++) {
                            if (chr == paises[palabra_azar].charAt(recorre)) {
                                acierto = true;
                                cant_acierto += 1;
//recorre, mediante for y charAt, carácter por carácter del país sorteado para ver si se acertó (y la cantidad de veces) o no.
                            }

                        }

                    }

                    if (acierto == false) {
                        errores += 1; //si acierto se mantiene en false, se suma 1 error.
                    }
                    
                    Icon icono;
                    if (errores<=6){ //si los errores son menores o iguales a 6 (es decir, que el usuario aún no perdió), entra al if
                    icono = new ImageIcon(getClass().getResource("/img_ahorcado/hangman"+errores+".png")); //se dibuja el ícono según la cantidad de errores
                    jLabel32.setIcon(icono);   
                    }

                    Fin_Juego();
                    /*una vez llegado acá, se pasa a Fin_Juego para evaluar si se acertó la palabra entera
                    (con la cantidad de errores correspondientes) o si se llegó a los 7 errores (se perdió)*/
                }
            }
            if (acierto == false && carac_valido == true && ya_escrita == false) {
//si se ingresó un carácter válido que aún no había sido escrito y que no esté dentro de la palabra a acertar, entra al if
                if (errores == 1) {
                    jLabel4.setText(letra_ingr);
                }
                if (errores == 2) {
                    jLabel5.setText(letra_ingr);
                }
                if (errores == 3) {
                    jLabel6.setText(letra_ingr);
                }
                if (errores == 4) {
                    jLabel7.setText(letra_ingr);
                }
                if (errores == 5) {
                    jLabel8.setText(letra_ingr);
                }
                if (errores == 6) {
                    jLabel9.setText(letra_ingr);
                }
//si errores es igual a 1, la letra erróneamente ingresada ocupará el casillero 1 (jLabel4) de las letras incorrectas
//si errores es igual a 2, la letra erróneamente ingresada ocupará el casillero 2 (jLabel5) de las letras incorrectas, y así sucesivamente
            }

            if (acierto == true) { //si se acierta la letra ingresada, entra al if:
                 for (char ch : letra_ingr.toCharArray()) { //convierte la variable tipo String "letra_ingr" a tipo char
                char chr = letra_ingr.charAt(0);
                 if (chr == paises[palabra_azar].charAt(0)) {
                      jLabel10.setText(letra_ingr);
//si la letra ingresada (convertida en carácter), coincide con la letra 1 del país y se muestra en pantalla en la posición 1 de esa palabra (a traves del jLabel10)                 
                 }
                  if (chr == paises[palabra_azar].charAt(1)) {
                      jLabel11.setText(letra_ingr);
//si la letra ingresada, coincide con la letra 2 del país y se muestra en pantalla en la posición 2 de esa palabra (a traves del jLabel11)                    
                 }
                 if (chr == paises[palabra_azar].charAt(2)) {
                      jLabel12.setText(letra_ingr);
//si la letra ingresada, coincide con la letra 3 del país y se muestra en pantalla en la posición 3 de esa palabra (a traves del jLabel12)                      
                 }
                  if (chr == paises[palabra_azar].charAt(3)) {
                      jLabel13.setText(letra_ingr);
//si la letra ingresada, coincide con la letra 4 del país y se muestra en pantalla en la posición 4 de esa palabra (a traves del jLabel13), y así sucesivamente
                 }
            if (paises[palabra_azar].length()>=5) {
               if (chr == paises[palabra_azar].charAt(4)){
                    jLabel14.setText(letra_ingr); 
                         }
//A partir del 5to carácter se agrega una condición extra debido a que hay países en el array del mismo nombre que no llegan a los 5 caracteres
//La condición extra es que el país sorteado aleatoriamente tiene que tener un mínimo de 5 carácteres para poder comparar la letra ingresada con ese 5to carácter. Esta nueva condición se repetirá hasta el final
                     }
            if (paises[palabra_azar].length()>=6) {
               if (chr == paises[palabra_azar].charAt(5)){
                    jLabel15.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=7) {
               if (chr == paises[palabra_azar].charAt(6)){
                    jLabel16.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=8) {
               if (chr == paises[palabra_azar].charAt(7)){
                    jLabel17.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=9) {
               if (chr == paises[palabra_azar].charAt(8)){
                    jLabel18.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=10) {
               if (chr == paises[palabra_azar].charAt(9)){
                    jLabel19.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=11) {
               if (chr == paises[palabra_azar].charAt(10)){
                    jLabel20.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=12) {
               if (chr == paises[palabra_azar].charAt(11)){
                    jLabel21.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=13) {
               if (chr == paises[palabra_azar].charAt(12)){
                    jLabel22.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=14) {
               if (chr == paises[palabra_azar].charAt(13)){
                    jLabel23.setText(letra_ingr); 
                         }
                     }
             if (paises[palabra_azar].length()>=15) {
               if (chr == paises[palabra_azar].charAt(14)){
                    jLabel24.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=16) {
               if (chr == paises[palabra_azar].charAt(15)){
                    jLabel25.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=17) {
               if (chr == paises[palabra_azar].charAt(16)){
                    jLabel26.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=18) {
               if (chr == paises[palabra_azar].charAt(17)){
                    jLabel27.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=19) {
               if (chr == paises[palabra_azar].charAt(18)){
                    jLabel28.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=20) {
               if (chr == paises[palabra_azar].charAt(19)){
                    jLabel29.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=21) {
               if (chr == paises[palabra_azar].charAt(20)){
                    jLabel30.setText(letra_ingr); 
                         }
                     }
            if (paises[palabra_azar].length()>=22) {
               if (chr == paises[palabra_azar].charAt(21)){
                    jLabel31.setText(letra_ingr); 
                         }
                     }             
                }
            }

        }
    }//GEN-LAST:event_txtLetraKeyPressed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new Juego().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    String[] paises = {"ARGENTINA", "BOLIVIA", "BRASIL", "CHILE",
        "COLOMBIA", "ECUADOR", "PARAGUAY", "PERU", "URUGUAY", "VENEZUELA",
        "NUEVA ZELANDA", "AUSTRALIA", "MEXICO", "ESTADOS UNIDOS", "CUBA",
        "JAMAICA", "NICARAGUA", "HONDURAS", "GUATEMALA", "COSTA RICA",
        "EL SALVADOR", "PANAMA", "REPUBLICA DOMINICANA", "HAITI", "CANADA",
        "ARGELIA", "EGIPTO", "MARRUECOS", "LIBIA", "TUNEZ", "SUDAFRICA",
        "NIGERIA", "CAMERUN", "SENEGAL", "CONGO", "ETIOPIA", "KENIA",
        "MOZAMBIQUE", "MADAGASCAR", "COSTA DE MARFIL", "JAPON",
        "CHINA", "COREA DEL SUR", "COREA DEL NORTE", "MALASIA",
        "VIETNAM", "TAILANDIA", "VIETNAM", "ARABIA SAUDITA",
        "ISRAEL", "QATAR", "EMIRATOS ARABES UNIDOS", "IRAN",
        "IRAK", "AFGANISTAN", "LIBANO", "HONG KONG", "PALESTINA", "INDIA",
        "PAKISTAN", "BANGLADESH", "CAMBOYA", "FILIPINAS", "JORDANIA",
        "KUWAIT", "MONGOLIA", "NEPAL", "SINGAPUR", "SIRIA", "ALBANIA",
        "ALEMANIA", "ESPAÑA", "REINO UNIDO", "ITALIA", "FRANCIA",
        "PAISES BAJOS", "PORTUGAL", "SUECIA", "SUIZA", "BULGARIA", "IRLANDA",
        "RUMANIA", "RUSIA", "UCRANIA", "TURQUIA", "GRECIA", "SERBIA",
        "KOSOVO", "CROACIA", "MONTENEGRO", "BOSNIA", "ESLOVENIA", "ESLOVAQUIA",
        "REPUBLICA CHECA", "BELGICA", "AUSTRIA", "DINAMARCA", "NORUEGA",
        "ISLANDIA", "FINLANDIA", "HUNGRIA", "POLONIA", "ARMENIA", "CHIPRE"};
    String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z"};
    Random num_aleatorio = new Random();
    int palabra_azar = num_aleatorio.nextInt(paises.length);
    String[] letra_repe = new String[27];
    /*empieza como un array vacío, y va
    agregando las letras ingresadas (correctas o incorrectas)*/
    
    int errores = 0;
    int i_letra = 0;
    /*sirve como índice para poder agregar cada letra
ingresada al array "letra_repe" a dicha posición. Una vez añadida, esta
variable incrementa su valor 1 unidad*/
    
    int cant_acierto = 0;
    /*esta variable incrementa una unidad por cada vez que
la letra ingresada está en esa palabra. EJEMPLO: al ingresar la "o" en
Estados Unidos, esta variable aumentará su valor en 2 unidades*/
    
    int cant_espacio = 0;
    /*cuenta la cantidad de espacios que hay en el país
a adivinar. En caso de ser un país de una sola palabra, la variable quedará
en 0*/
    boolean ya_recorrio = false;

    /*esta variable sirve para poder contar SOLAMENTE
UNA VEZ la cantidad de espacios en el país sorteado. Empieza en "false", y
solamente cuenta los espacios en esa condición. Una vez que se
contaron la cantidad de espacios, pasa a "True", y al no regresar a "False",
no cuenta más la cantidad de espacios, hasta la nueva ejecución del programa,
evitando así un doble recuento*/
    
         private void Fin_Juego(){
        for (int va_letra = 0; va_letra < paises[palabra_azar].length(); va_letra++) {
            if (ya_recorrio == false) {
                if (paises[palabra_azar].charAt(va_letra) == (' ')) { //recorre cada carácter del país sorteado para ver cuantos espacios contiene
                    cant_espacio += 1;
                }
            }
        }

        ya_recorrio = true;
        int letras_tot = paises[palabra_azar].length() - cant_espacio; //resta los carácteres totales por los espacios, obteniendo así las letras totales
        if (cant_acierto == letras_tot) {
            /*si la cantidad de aciertos es igual a las LETRAS totales, el jugador habrá ganado el juego y el
programa evaluará la cantidad de errores obtenidos para mostrar una u otra pantalla.*/
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades!!! El país adivinado es "+paises[palabra_azar], "Adivinaste la palabra", JOptionPane.INFORMATION_MESSAGE);
//Este mensaje salta solamente si se adivinó la palabra
            if (errores == 0) {
                Ganaste0 sin_errores = new Ganaste0();
                sin_errores.setVisible(true);
                this.dispose();
            }
            if (errores == 1) {
                Ganaste1 un_error = new Ganaste1();
                un_error.setVisible(true);
                this.dispose();
            }
            if (errores == 2) {
                Ganaste2 dos_errores = new Ganaste2();
                dos_errores.setVisible(true);
                this.dispose();
            }
            if (errores == 3 || errores == 4) {
                Ganaste3_4 tres_cuatro = new Ganaste3_4();
                tres_cuatro.setVisible(true);
                this.dispose();
            }
            if (errores == 5 || errores == 6) {
                Ganaste5_6 cinco_seis = new Ganaste5_6();
                cinco_seis.setVisible(true);
                this.dispose();
            }

        } else {
            if (errores >= 7) {
               JOptionPane.showMessageDialog(this, "No tenés más intentos. El país a adivinar era "+paises[palabra_azar], "Perdiste el juego", JOptionPane.ERROR_MESSAGE); 
               //Este mensaje salta solamente si el usuario no pudo acertar la palabra 
               Perdiste loser = new Perdiste();
                loser.setVisible(true);
                this.dispose();
            }
        }
    }   
    //}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtLetra;
    // End of variables declaration//GEN-END:variables

   class Back extends JPanel {

        private Image picture;
        private Image guion;
        private Image space;
        public void paint(Graphics h) {
            picture = new ImageIcon(getClass().getResource("/img_ahorcado/pizarron.jpg")).getImage();
            h.drawImage(picture, 0, 0, getWidth()+4, getHeight()-19, this);
            guion = new ImageIcon(getClass().getResource("/img_ahorcado/guion1.png")).getImage();
            space = new ImageIcon(getClass().getResource("/img_ahorcado/guion2.png")).getImage();
            int mov_largo = 6;
            int ajuste = 23;
            int division = (getWidth()+4)/ajuste;
            for (int l = 0; l < paises[palabra_azar].length(); l++) {
                if (paises[palabra_azar].charAt(l) == (' ')) { //crea un guión "invisible" por cada espacio
                    h.drawImage(space, mov_largo, 410, division, 18, this);

                } else { //crea un guión negro por cada letra
                    h.drawImage(guion, mov_largo, 410, division, 18, this);

                }
                mov_largo += division + 1;
                //cada vez que se crea un nuevo guión (negro o "invisible")
//esta variable incrementa en lo que mida cada guión ("invisible" o negro) + 1 unidad para poder desplazarse a lo largo de la pantalla

            }
            setOpaque(false);
            super.paint(h);

        }
    }  

}