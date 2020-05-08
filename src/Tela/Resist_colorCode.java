package Tela;
import calcu.Class_resist;

public class Resist_colorCode extends javax.swing.JFrame {

    public Resist_colorCode() {
        initComponents();
    }
    public double acum;
    public double valor;
    public double no;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        num1 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        pontoVirgula = new javax.swing.JButton();
        apagarTudo = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        calcular.setText("Calcular Resistor");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        pontoVirgula.setText(".");
        pontoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoVirgulaActionPerformed(evt);
            }
        });

        apagarTudo.setText("AC");
        apagarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarTudoActionPerformed(evt);
            }
        });

        menuPrincipal.setText("Menu Principal");
        menuPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite o valor da 1º faixa:");

        jLabel2.setText("Digite o valor da 2º faixa:");

        jLabel3.setText("Digite o multiplicador:");

        jLabel4.setText("Digite a tolerância:");

        jLabel5.setText("Valor do resistor (resultado):");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela/Post-004-27-07-2016_01.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pontoVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(num6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pontoVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPrincipal))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(5));
            no=0;
        }else{
            txt1.setText(txt1.getText()+ String.valueOf(5));
        }
    }//GEN-LAST:event_num5ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(7));
             no=0;
        }else{
            txt1.setText(txt1.getText()+ String.valueOf(7));  
        }
    }//GEN-LAST:event_num7ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(9));
            no=0;
        }else{
            txt1.setText(txt1.getText()+ String.valueOf(9));   
        }
    }//GEN-LAST:event_num9ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        if (no>0){
      txt1.setText(""); 
       txt1.setText(txt1.getText()+ String.valueOf(1));
       no=0;
    }else{
        txt1.setText(txt1.getText()+ String.valueOf(1));
    }
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
        if (no>0){
       txt1.setText("");
       txt1.setText(txt1.getText()+ String.valueOf(2));
       no=0;
       }else{
        txt1.setText(txt1.getText()+ String.valueOf(2));
       }
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(3));
            no=0;
        }else{
        txt1.setText(txt1.getText()+ String.valueOf(3));   
        }
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(4));
            no=0;
        }else{
             txt1.setText(txt1.getText()+ String.valueOf(4));
        }
    }//GEN-LAST:event_num4ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(6));
            no=0;
        }else{
          txt1.setText(txt1.getText()+ String.valueOf(6));
        }
    }//GEN-LAST:event_num6ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(8));
            no=0;
        }else{
            txt1.setText(txt1.getText()+ String.valueOf(8));
        }
    }//GEN-LAST:event_num8ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        Class_resist Obj_calc=new Class_resist();
        Obj_calc.setN1(txt1.getText());
        Obj_calc.setN2(txt2.getText());
        Obj_calc.setN3(Double.parseDouble(txt3.getText()));
        Obj_calc.setN4(txt4.getText());
                txt5.setText(Obj_calc.valorResist()+"");
    }//GEN-LAST:event_calcularActionPerformed

    private void apagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarTudoActionPerformed
        // TODO add your handling code here:
        txt1.setText("");
        acum=0;
        valor=0;
    }//GEN-LAST:event_apagarTudoActionPerformed

    private void pontoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoVirgulaActionPerformed
        // TODO add your handling code here:
        String cadena;
        int ponto;
        cadena = txt1.getText();
        ponto = cadena.indexOf('.');
        if (ponto==-1){
          txt1.setText(txt1.getText()+("."));
        }
    }//GEN-LAST:event_pontoVirgulaActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt1.setText("");
            txt1.setText(txt1.getText()+ String.valueOf(0));
            no=0;
        }else{
            txt1.setText(txt1.getText()+ String.valueOf(0));
        }
    }//GEN-LAST:event_num0ActionPerformed

    private void menuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalActionPerformed
        // TODO add your handling code here:
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_menuPrincipalActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Resist_colorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resist_colorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resist_colorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resist_colorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resist_colorCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarTudo;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuPrincipal;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton pontoVirgula;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
