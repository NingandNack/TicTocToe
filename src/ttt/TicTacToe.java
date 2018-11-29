package ttt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {
    private String turn = "X";
    private String playerOne = "Player One";
    private String playerTwo = "Player Two";
    
    public TicTacToe() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        PlayerName();
        resetGame();
        
    }
    
    private void PlayerName(){
        playerOne = JOptionPane.showInputDialog(this,
                "Player One Name : ",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        playerTwo = JOptionPane.showInputDialog(this,
                "Player Two Name : ",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        if(playerOne.equals(" ")){
            playerOne = "Player One";
        }
        if(playerTwo.equals(" ")){
            playerTwo = "Player Two";
        }
    }
    
    private void determineWhoseTurn(){
        if (turn.equalsIgnoreCase("X")){
            turn = "O";
        }
        else{
            turn = "X";
        }
    }
    
    private void xWins(){
        JOptionPane.showMessageDialog(this,
                "Player " + playerOne + " is The Winnner!!!",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }
    
    private void oWins(){
        JOptionPane.showMessageDialog(this,
                "Player " + playerTwo + " is The Winner!!!",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }
    
    private void Tie(){
        String A = b1.getText();
        String B = b2.getText();
        String C = b3.getText();
        String D = b4.getText();
        String E = b5.getText();
        String F = b6.getText();
        String G = b7.getText();
        String H = b8.getText();
        String I = b9.getText();
        
        if(A != "" && B != "" && C != ""
                && D != "" && E!= "" && F != ""
                && G != "" && H != "" && I != ""){
            JOptionPane.showMessageDialog(this, 
                    "Game is Tie!!!", 
                    "Tie Game", 
                    JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }
    
    private void resetGame(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
    
    private void determineIfWin(){
        String A = b1.getText();
        String B = b2.getText();
        String C = b3.getText();
        String D = b4.getText();
        String E = b5.getText();
        String F = b6.getText();
        String G = b7.getText();
        String H = b8.getText();
        String I = b9.getText();
        
        // X
        if(A == "X" && B == "X" && C == "X"){
            xWins();
        }
        if(D == "X" && E == "X" && F == "X"){
            xWins();
        }
        if(G == "X" && H == "X" && I == "X"){
            xWins();
        }
        if(A == "X" && D == "X" && G == "X"){
            xWins();
        }
        if(B == "X" && E == "X" && H == "X"){
            xWins();
        }
        if(C == "X" && F == "X" && I == "X"){
            xWins();
        }
        if(C == "X" && E == "X" && G == "X"){
            xWins();
        }
        if(A == "X" && E == "X" && I == "X"){
            xWins();
        }
        
        // O
        if(A == "O" && B == "O" && C == "O"){
            oWins();
        }
        if(D == "O" && E == "O" && F == "O"){
            oWins();
        }
        if(G == "O" && H == "O" && I == "O"){
            oWins();
        }
        if(A == "O" && D == "O" && G == "O"){
            oWins();
        }
        if(B == "O" && E == "O" && H == "O"){
            oWins();
        }
        if(C == "O" && F == "O" && I == "O"){
            oWins();
        }
        if(C == "O" && E == "O" && G == "O"){
            oWins();
        }
        if(A == "O" && E == "O" && I == "O"){
            oWins();
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel_GridHolder = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        b3 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        b4 = new javax.swing.JButton();
        p5 = new javax.swing.JPanel();
        b5 = new javax.swing.JButton();
        p6 = new javax.swing.JPanel();
        b6 = new javax.swing.JButton();
        p7 = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        p8 = new javax.swing.JPanel();
        b8 = new javax.swing.JButton();
        p9 = new javax.swing.JPanel();
        b9 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel_GridHolder.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(new java.awt.BorderLayout());

        b1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        p1.add(b1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p1);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setLayout(new java.awt.BorderLayout());

        b2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        p2.add(b2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p2);

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setLayout(new java.awt.BorderLayout());

        b3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        p3.add(b3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p3);

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setLayout(new java.awt.BorderLayout());

        b4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        p4.add(b4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p4);

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p5.setLayout(new java.awt.BorderLayout());

        b5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        p5.add(b5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p5);

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p6.setLayout(new java.awt.BorderLayout());

        b6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        p6.add(b6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p6);

        p7.setBackground(new java.awt.Color(255, 255, 255));
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p7.setLayout(new java.awt.BorderLayout());

        b7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        p7.add(b7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p7);

        p8.setBackground(new java.awt.Color(255, 255, 255));
        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p8.setLayout(new java.awt.BorderLayout());

        b8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        p8.add(b8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p8);

        p9.setBackground(new java.awt.Color(255, 255, 255));
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p9.setLayout(new java.awt.BorderLayout());

        b9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        p9.add(b9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(p9);

        getContentPane().add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b1.setForeground(Color.red);
        }
        else{
            b1.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b2.setForeground(Color.red);
        }
        else{
            b2.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        b3.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b3.setForeground(Color.red);
        }
        else{
            b3.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        b4.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b4.setForeground(Color.red);
        }
        else{
            b4.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        b5.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b5.setForeground(Color.red);
        }
        else{
            b5.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        b6.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b6.setForeground(Color.red);
        }
        else{
            b6.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        b7.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b7.setForeground(Color.red);
        }
        else{
            b7.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        b8.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b8.setForeground(Color.red);
        }
        else{
            b8.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        b9.setText(turn);
        if (turn.equalsIgnoreCase("X")){
            b9.setForeground(Color.red);
        }
        else{
            b9.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        Tie();
    }//GEN-LAST:event_b9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_GridHolder;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    // End of variables declaration//GEN-END:variables
}