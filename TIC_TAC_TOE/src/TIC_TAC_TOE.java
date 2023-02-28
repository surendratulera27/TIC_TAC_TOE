import static java.awt.Color.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sunder Singh Tulera
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE
     */
    public String turn = "O";
    public int xCount = 0;
    public int oCount = 0;
    public int count = 0;
    
    public TIC_TAC_TOE() {
        initComponents();
    }
    
    public void reset(){
        txtbtn1.setText("");
        txtbtn2.setText("");
        txtbtn3.setText("");
        
        txtbtn4.setText("");
        txtbtn5.setText("");
        txtbtn6.setText("");
        
        txtbtn7.setText("");
        txtbtn8.setText("");
        txtbtn9.setText("");
        
        txtbtn1.setBackground(white);
        txtbtn2.setBackground(white);
        txtbtn3.setBackground(white);
        
        txtbtn4.setBackground(white);
        txtbtn5.setBackground(white);
        txtbtn6.setBackground(white);
        
        txtbtn7.setBackground(white);
        txtbtn8.setBackground(white);
        txtbtn9.setBackground(white);
        count = 0;
    }
    public void choosePlayer(){
        if(turn.equalsIgnoreCase("X")){
            turn = "O";
        }
        else{
            turn = "X";
        }
    }
    
    public void setScore(){
    xscore.setText(String.valueOf(xCount));
    oscore.setText(String.valueOf(oCount));
    if(xCount==3){
        JOptionPane.showMessageDialog(this, "Winner winner chiken dinner...Player X have completed the target. \n Fact ! \n THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG...contains all 26 letters of the English alphabet.",
                "Congratulation !", JOptionPane.INFORMATION_MESSAGE);
        reset();
        xCount = 0;
        oCount = 0;
        oscore.setText("0");
        xscore.setText("0");
    }
    if(oCount==3){
        JOptionPane.showMessageDialog(this, "Winner winner chiken dinner...Player O have completed the target. \n Fact ! \n THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG...contains all 26 letters of the English alphabet.",
                "Congratulation !", JOptionPane.INFORMATION_MESSAGE);
        reset();
        xCount = 0;
        oCount = 0;
        oscore.setText("0");
        xscore.setText("0");
    }
    }
    public void chooseWinner(){
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        if(b1=="X" && b2=="X" && b3=="X"){
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b4=="X" && b5=="X" && b6=="X"){
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b7=="X" && b8=="X" && b9=="X"){
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b1=="X" && b4=="X" && b7=="X"){
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b2=="X" && b5=="X" && b8=="X"){
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b3=="X" && b6=="X" && b9=="X"){
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b1=="X" && b5=="X" && b9=="X"){
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        else if(b3=="X" && b5=="X" && b7=="X"){
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player X Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            reset();
        }
        if(b1=="O" && b2=="O" && b3=="O"){
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b4=="O" && b5=="O" && b6=="O"){
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b7=="O" && b8=="O" && b9=="O"){
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b1=="O" && b4=="O" && b7=="O"){
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b2=="O" && b5=="O" && b8=="O"){
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b3=="O" && b6=="O" && b9=="O"){
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b1=="O" && b5=="O" && b9=="O"){
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else if(b3=="O" && b5=="O" && b7=="O"){
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player O Wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            reset();
        }
        else{
            if(count==9){
                JOptionPane.showMessageDialog(this, "Game ends in a tie !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                reset();
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        whooseTurn = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("TIC");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("TAC");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("TURN :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("PLAYER X :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("PLAYER O :");

        whooseTurn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        whooseTurn.setForeground(new java.awt.Color(255, 0, 204));
        whooseTurn.setText("O");

        xscore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        xscore.setForeground(new java.awt.Color(255, 0, 0));
        xscore.setText("0");

        oscore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        oscore.setForeground(new java.awt.Color(255, 0, 204));
        oscore.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xscore, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(oscore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(whooseTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(whooseTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xscore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oscore, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resetbtn.setBackground(new java.awt.Color(255, 255, 0));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(0, 204, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 204, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.setText("TARGET : 3");
        jButton12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        if(txtbtn1.getText()==""){
            txtbtn1.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn1.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn1.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        if(txtbtn2.getText()==""){
            txtbtn2.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn2.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn2.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        if(txtbtn3.getText()==""){
            txtbtn3.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn3.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn3.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        if(txtbtn4.getText()==""){
            txtbtn4.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn4.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn4.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        if(txtbtn5.getText()==""){
            txtbtn5.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn5.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn5.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        if(txtbtn6.getText()==""){
            txtbtn6.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn6.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn6.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        if(txtbtn7.getText()==""){
            txtbtn7.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn7.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn7.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        if(txtbtn8.getText()==""){
            txtbtn8.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn8.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn8.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        if(txtbtn9.getText()==""){
            txtbtn9.setText(turn);
            if(turn.equalsIgnoreCase("X")){
                txtbtn9.setForeground(red);
                whooseTurn.setText("O");
                whooseTurn.setForeground(magenta);
                count++;
            }
            else{
                txtbtn9.setForeground(magenta);
                whooseTurn.setText("X");
                whooseTurn.setForeground(red);
                count++;
            }
            choosePlayer();
            chooseWinner();
        }
        else{
        JOptionPane.showMessageDialog(this, "This place is already allocated !", "Alert Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog( frame, "Confirm if you want to exit", "Tic Tac Toe",
        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JLabel whooseTurn;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
