
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class GUI extends javax.swing.JFrame {

    //initialize vars
    private double a = 0, b = 0, c = 0, function = 0;
    public boolean firstInputDone = false, clearTrue = false;
    public GUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) { //left blank so no L&F interferes with custom design applied to each object
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inputField = new javax.swing.JTextPane();
        threeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4-JFRAMEALATOR");
        setBackground(new java.awt.Color(51, 0, 51));
        setName("guiCalc"); // NOI18N
        setPreferredSize(new java.awt.Dimension(206, 380));
        setResizable(false);
        setSize(new java.awt.Dimension(206, 380));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 255, 0));

        inputField.setEditable(false);
        inputField.setBackground(new java.awt.Color(0, 0, 0));
        inputField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        inputField.setForeground(new java.awt.Color(0, 255, 0));
        jScrollPane1.setViewportView(inputField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        threeButton.setBackground(new java.awt.Color(0, 0, 0));
        threeButton.setForeground(new java.awt.Color(0, 255, 0));
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(threeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 40));

        clearButton.setBackground(new java.awt.Color(0, 0, 0));
        clearButton.setForeground(new java.awt.Color(0, 255, 0));
        clearButton.setText("CE");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 200, -1, 40));

        oneButton.setBackground(new java.awt.Color(0, 0, 0));
        oneButton.setForeground(new java.awt.Color(0, 255, 0));
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(oneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 40));

        twoButton.setBackground(new java.awt.Color(0, 0, 0));
        twoButton.setForeground(new java.awt.Color(0, 255, 0));
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(twoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 40));

        nineButton.setBackground(new java.awt.Color(0, 0, 0));
        nineButton.setForeground(new java.awt.Color(0, 255, 0));
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 40));

        eightButton.setBackground(new java.awt.Color(0, 0, 0));
        eightButton.setForeground(new java.awt.Color(0, 255, 0));
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(eightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 40));

        fourButton.setBackground(new java.awt.Color(0, 0, 0));
        fourButton.setForeground(new java.awt.Color(0, 255, 0));
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fourButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 40));

        fiveButton.setBackground(new java.awt.Color(0, 0, 0));
        fiveButton.setForeground(new java.awt.Color(0, 255, 0));
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fiveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 40));

        sixButton.setBackground(new java.awt.Color(0, 0, 0));
        sixButton.setForeground(new java.awt.Color(0, 255, 0));
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sixButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 40));

        sevenButton.setBackground(new java.awt.Color(0, 0, 0));
        sevenButton.setForeground(new java.awt.Color(0, 255, 0));
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sevenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        divideButton.setBackground(new java.awt.Color(0, 0, 0));
        divideButton.setForeground(new java.awt.Color(0, 255, 0));
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });
        getContentPane().add(divideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 40, 40));

        zeroButton.setBackground(new java.awt.Color(0, 0, 0));
        zeroButton.setForeground(new java.awt.Color(0, 255, 0));
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zeroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 40));

        plusButton.setBackground(new java.awt.Color(0, 0, 0));
        plusButton.setForeground(new java.awt.Color(0, 255, 0));
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        getContentPane().add(plusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 40));

        minusButton.setBackground(new java.awt.Color(0, 0, 0));
        minusButton.setForeground(new java.awt.Color(0, 255, 0));
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        getContentPane().add(minusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 40, 40));

        multiplyButton.setBackground(new java.awt.Color(0, 0, 0));
        multiplyButton.setForeground(new java.awt.Color(0, 255, 0));
        multiplyButton.setText("x");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(multiplyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, 40));

        equalButton.setBackground(new java.awt.Color(0, 0, 0));
        equalButton.setForeground(new java.awt.Color(0, 255, 0));
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(equalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 40));

        pointButton.setBackground(new java.awt.Color(0, 0, 0));
        pointButton.setForeground(new java.awt.Color(0, 255, 0));
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pointButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 250, 40, 40));

        aboutButton.setBackground(new java.awt.Color(0, 0, 0));
        aboutButton.setForeground(new java.awt.Color(0, 255, 0));
        aboutButton.setText("About JFamealator");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 150, 40));
        aboutButton.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        /*
        clearTrue is a bool var that will check if the user input is the first input after clear. If it is, it
        will then be set to true, and clear the inputField that is default displaying 0, kind of like a real-world
        physical four function calculator. This var will also handle clearing of the 2nd number input by the user
        after pressing a function (+,-*,/)
        */
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        inputField.setText(inputField.getText() + "0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        inputField.setText(inputField.getText() + "1");
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "2");
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "3");
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "4");
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "5");
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "6");
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "7");
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "8");
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + "9");
    }//GEN-LAST:event_nineButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearTrue = false;
        firstInputDone = false;
        inputField.setText("0");
        a = 0;
        b = 0;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        clearTrue = false;
        if (firstInputDone == false){
        a = Double.parseDouble(inputField.getText());
        firstInputDone = true;
        }
            function = 0; // ID for function to use (reference for equalButton). 0 = + ; 1 = - ; 2 = * ; 3 = /
        
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
         clearTrue = false;
        if (firstInputDone == false){
        a = Double.parseDouble(inputField.getText());
        firstInputDone = true;
        }
            function = 1; // ID for function to use (reference for equalButton). 0 = + ; 1 = - ; 2 = * ; 3 = /
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
         clearTrue = false;
        if (firstInputDone == false){
        a = Double.parseDouble(inputField.getText());
        firstInputDone = true;
        }
            function = 2; // ID for function to use (reference for equalButton). 0 = + ; 1 = - ; 2 = * ; 3 = /
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
         clearTrue = false;
        if (firstInputDone == false){
        a = Double.parseDouble(inputField.getText());
        firstInputDone = true;
        }
            function = 3; // ID for function to use (reference for equalButton). 0 = + ; 1 = - ; 2 = * ; 3 = /     
    }//GEN-LAST:event_divideButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
            // prevents user error if user enters their first input but enters the equal button right away, rather not enter a function/operation to use
            if (a == 0)
            {
                a = Double.parseDouble(inputField.getText());
                b = 0;
            }
            else
                b = Double.parseDouble(inputField.getText()); // get 2nd number input
            
            if (function == 0){
                functions plus = new functions(); //access functions class that handles the operations (implemented multiple classes just for practice)
                c = plus.plusFunction(a, b);
            }
            else if (function == 1){
                functions minus = new functions();
                c = minus.minusFunction(a, b);
            }
            else if (function == 2){
                functions multiply = new functions();
                c = multiply.multiplyFunction(a, b);
            }
            else if (function == 3){
                functions divide = new functions();
                c = divide.divideFunction(a, b);
            }
            inputField.setText(String.valueOf(c)); //displays c, the results to the inputField text var/properties
            a = c; //allows continous calculation if user presses function button again. a is now c and the next input will be stored in b. then it is a + b again.
            firstInputDone = false;
    }//GEN-LAST:event_equalButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        if (clearTrue == false){
            clearTrue = true;
            inputField.setText("");
        }
        
        inputField.setText(inputField.getText() + ".");
    }//GEN-LAST:event_pointButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // calls in credits message from function class
        functions msg = new functions();
        msg.openMessageBox();
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // sets jframe properties: size, starting position, and BG color
        this.setSize(215, 385);
        this.getContentPane().setBackground(Color.black);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JTextPane inputField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
