package PastQuestionPro;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Dashboard extends RunnerClass {

    int TimerButton = 0;
    static Timer timer = null;
    private CardLayout cards;

    public Dashboard() {
        initComponents();
        cards = (CardLayout) CardContainer.getLayout();
        // setTimer();
        // lblOND1.addMouseListener(new mouseClickedEvent());
        //  lblClose.addMouseListener(new mouseClickedEvent());

        areaQuestion.setText(DBFunctions.getQuestion(1, "Chemistry"));
        lblAnswerA.setText(DBFunctions.getAnswerA("Chemistry"));
        lblAnswerB.setText(DBFunctions.getAnswerB("Chemistry"));
        lblAnswerC.setText(DBFunctions.getAnswerC("Chemistry"));
        lblAnswerD.setText(DBFunctions.getAnswerD("Chemistry"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        displayLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CardContainer = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        lblOND1 = new javax.swing.JLabel();
        lblHND2 = new javax.swing.JLabel();
        lblOND2Second = new javax.swing.JLabel();
        lblOND1Second = new javax.swing.JLabel();
        lblHND1 = new javax.swing.JLabel();
        lblHND2Second = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblOND2 = new javax.swing.JLabel();
        lblHND1Second = new javax.swing.JLabel();
        RandomCourses = new javax.swing.JPanel();
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
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ExamPane = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaQuestion = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        lblAnswerA = new javax.swing.JLabel();
        lblAnswerB = new javax.swing.JLabel();
        lblAnswerC = new javax.swing.JLabel();
        lblAnswerD = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PastQuestionPro");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(0, 26, 66));
        jPanel6.setPreferredSize(new java.awt.Dimension(30, 20));

        lblClose.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setToolTipText("CLOSE");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setPreferredSize(new java.awt.Dimension(20, 19));
        lblClose.addMouseListener(new mouseClickedEvent());

        jLabel21.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("-");
        jLabel21.addMouseListener(new mouseClickedEvent());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/data_configuration-24.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(1243, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addContainerGap())
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 26, 66));

        jLabel1.setBackground(java.awt.Color.blue);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);

        lblHome.setBackground(new java.awt.Color(0, 162, 232));
        lblHome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_icon.png"))); // NOI18N
        lblHome.setText("HOME");
        lblHome.setAlignmentX(9.0F);
        lblHome.setAlignmentY(8.0F);
        lblHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblHome.setMinimumSize(new java.awt.Dimension(0, 0));
        lblHome.setOpaque(true);
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHomeMousePressed(evt);
            }
        });

        displayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_icon.png"))); // NOI18N
        displayLabel.setPreferredSize(new java.awt.Dimension(250, 40));
        displayLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                displayLabelMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 162, 232));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prepare_icon.png"))); // NOI18N
        jLabel4.setText("PREPARE FOR EXAMS");
        jLabel4.setAlignmentX(9.0F);
        jLabel4.setAlignmentY(8.0F);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel5.setIconTextGap(0);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about_icon.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 162, 232));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/performance_icon.png"))); // NOI18N
        jLabel17.setText("PERFORMANCE");
        jLabel17.setAlignmentX(9.0F);
        jLabel17.setAlignmentY(8.0F);
        jLabel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel17.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(0, 162, 232));
        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scores_icon.png"))); // NOI18N
        jLabel18.setText("TOP SCORES");
        jLabel18.setAlignmentX(9.0F);
        jLabel18.setAlignmentY(8.0F);
        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel18.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel18.setOpaque(true);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_subject_icon.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_subject_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        CardContainer.setBackground(new java.awt.Color(51, 255, 255));
        CardContainer.setLayout(new java.awt.CardLayout());

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setPreferredSize(new java.awt.Dimension(1000, 772));

        lblOND1.setBackground(new java.awt.Color(0, 162, 232));
        lblOND1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblOND1.setForeground(new java.awt.Color(255, 255, 255));
        lblOND1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOND1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/physics_icon.png"))); // NOI18N
        lblOND1.setText("OND 1 FIRST SEMESTER");
        lblOND1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOND1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOND1.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblOND1.setMinimumSize(new java.awt.Dimension(0, 0));
        lblOND1.setOpaque(true);
        lblOND1.setPreferredSize(new java.awt.Dimension(340, 220));
        lblOND1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOND1.addMouseListener(new mouseClickedEvent());

        lblHND2.setBackground(new java.awt.Color(0, 162, 232));
        lblHND2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHND2.setForeground(new java.awt.Color(255, 255, 255));
        lblHND2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHND2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/commerce_icon.png"))); // NOI18N
        lblHND2.setText("HND 2 FIRST SEMESTER");
        lblHND2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHND2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHND2.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblHND2.setMinimumSize(new java.awt.Dimension(0, 0));
        lblHND2.setOpaque(true);
        lblHND2.setPreferredSize(new java.awt.Dimension(340, 220));
        lblHND2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblHND2.addMouseListener(new mouseClickedEvent());

        lblOND2Second.setBackground(new java.awt.Color(0, 26, 66));
        lblOND2Second.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblOND2Second.setForeground(new java.awt.Color(255, 255, 255));
        lblOND2Second.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOND2Second.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agriculture_icon.png"))); // NOI18N
        lblOND2Second.setText("OND 2 SECOND SEMESTER");
        lblOND2Second.setToolTipText("");
        lblOND2Second.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOND2Second.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOND2Second.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblOND2Second.setMinimumSize(new java.awt.Dimension(0, 0));
        lblOND2Second.setOpaque(true);
        lblOND2Second.setPreferredSize(new java.awt.Dimension(340, 220));
        lblOND2Second.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOND2Second.addMouseListener(new mouseClickedEvent());

        lblOND1Second.setBackground(new java.awt.Color(0, 26, 66));
        lblOND1Second.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblOND1Second.setForeground(new java.awt.Color(255, 255, 255));
        lblOND1Second.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOND1Second.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mathematics_icon.png"))); // NOI18N
        lblOND1Second.setText("OND 1 SECOND SEMESTER");
        lblOND1Second.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOND1Second.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOND1Second.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblOND1Second.setMinimumSize(new java.awt.Dimension(0, 0));
        lblOND1Second.setOpaque(true);
        lblOND1Second.setPreferredSize(new java.awt.Dimension(340, 220));
        lblOND1Second.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOND1Second.addMouseListener(new mouseClickedEvent());

        lblHND1.setBackground(new java.awt.Color(0, 162, 232));
        lblHND1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHND1.setForeground(new java.awt.Color(255, 255, 255));
        lblHND1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHND1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/biology_icon.png"))); // NOI18N
        lblHND1.setText("HND 1 FIRST SEMESTER");
        lblHND1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHND1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHND1.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblHND1.setMinimumSize(new java.awt.Dimension(0, 0));
        lblHND1.setOpaque(true);
        lblHND1.setPreferredSize(new java.awt.Dimension(340, 220));
        lblHND1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblHND1.addMouseListener(new mouseClickedEvent());

        lblHND2Second.setBackground(new java.awt.Color(0, 26, 66));
        lblHND2Second.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHND2Second.setForeground(new java.awt.Color(255, 255, 255));
        lblHND2Second.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHND2Second.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crk_icon.png"))); // NOI18N
        lblHND2Second.setText("HND 2 SECOND SEMESTER");
        lblHND2Second.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHND2Second.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHND2Second.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblHND2Second.setMinimumSize(new java.awt.Dimension(0, 0));
        lblHND2Second.setOpaque(true);
        lblHND2Second.setPreferredSize(new java.awt.Dimension(340, 220));
        lblHND2Second.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblHND2Second.addMouseListener(new mouseClickedEvent());

        jLabel14.setBackground(new java.awt.Color(0, 162, 232));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/irk_icon.png"))); // NOI18N
        jLabel14.setText("OTHERS...");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel14.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel14.setOpaque(true);
        jLabel14.setPreferredSize(new java.awt.Dimension(340, 220));
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblOND2.setBackground(new java.awt.Color(0, 162, 232));
        lblOND2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblOND2.setForeground(new java.awt.Color(255, 255, 255));
        lblOND2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOND2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_icon.png"))); // NOI18N
        lblOND2.setText("OND 2 FIRST SEMESTER");
        lblOND2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOND2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOND2.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblOND2.setMinimumSize(new java.awt.Dimension(0, 0));
        lblOND2.setOpaque(true);
        lblOND2.setPreferredSize(new java.awt.Dimension(340, 220));
        lblOND2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOND2.addMouseListener(new mouseClickedEvent());

        lblHND1Second.setBackground(new java.awt.Color(0, 26, 66));
        lblHND1Second.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHND1Second.setForeground(new java.awt.Color(255, 255, 255));
        lblHND1Second.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHND1Second.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chemistry_icon.png"))); // NOI18N
        lblHND1Second.setText("HND 1 SECOND SEMESTER");
        lblHND1Second.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHND1Second.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHND1Second.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        lblHND1Second.setMinimumSize(new java.awt.Dimension(0, 0));
        lblHND1Second.setOpaque(true);
        lblHND1Second.setPreferredSize(new java.awt.Dimension(340, 220));
        lblHND1Second.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblHND1Second.addMouseListener(new mouseClickedEvent());

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOND2Second, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(lblHND2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblOND1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOND1Second, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(lblHND1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblHND2Second, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHND1Second, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(lblOND2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOND1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOND1Second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOND2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHND1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHND1Second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOND2Second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHND2Second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHND2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        CardContainer.add(Dashboard, "card1");

        RandomCourses.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setBackground(new java.awt.Color(0, 26, 66));
        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chemistry_icon.png"))); // NOI18N
        jLabel22.setText("COM211");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel22.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel23.setBackground(new java.awt.Color(0, 26, 66));
        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crk_icon.png"))); // NOI18N
        jLabel23.setText("COM213");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel23.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel23.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel23.setOpaque(true);
        jLabel23.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel24.setBackground(new java.awt.Color(0, 162, 232));
        jLabel24.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_icon.png"))); // NOI18N
        jLabel24.setText("COM212");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel24.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel24.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel24.setOpaque(true);
        jLabel24.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setBackground(Color.BLACK);

        jLabel25.setBackground(new java.awt.Color(0, 26, 66));
        jLabel25.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agriculture_icon.png"))); // NOI18N
        jLabel25.setText("COM215");
        jLabel25.setToolTipText("");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel25.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel25.setOpaque(true);
        jLabel25.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel26.setBackground(new java.awt.Color(0, 162, 232));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/biology_icon.png"))); // NOI18N
        jLabel26.setText("COM113");
        jLabel26.setToolTipText("Introduction To Programming");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel26.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel26.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel26.setOpaque(true);
        jLabel26.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel27.setBackground(new java.awt.Color(0, 162, 232));
        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/physics_icon.png"))); // NOI18N
        jLabel27.setText("COM101");
        jLabel27.setToolTipText("Introduction To Computers");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel27.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel27.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel27.setOpaque(true);
        jLabel27.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel28.setBackground(new java.awt.Color(0, 162, 232));
        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/commerce_icon.png"))); // NOI18N
        jLabel28.setText("COM216");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel28.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel28.setOpaque(true);
        jLabel28.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel29.setBackground(new java.awt.Color(0, 26, 66));
        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mathematics_icon.png"))); // NOI18N
        jLabel29.setText("COM112");
        jLabel29.setToolTipText("Introduction To Digital Electronics");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel29.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel29.setOpaque(true);
        jLabel29.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel30.setBackground(new java.awt.Color(0, 162, 232));
        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/irk_icon.png"))); // NOI18N
        jLabel30.setText("COM214");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel30.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel30.setOpaque(true);
        jLabel30.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel31.setBackground(new java.awt.Color(0, 162, 232));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/commerce_icon.png"))); // NOI18N
        jLabel31.setText("COM226");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel31.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel31.setOpaque(true);
        jLabel31.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel32.setBackground(new java.awt.Color(0, 162, 232));
        jLabel32.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/physics_icon.png"))); // NOI18N
        jLabel32.setText("COM114");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel32.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel32.setOpaque(true);
        jLabel32.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel33.setBackground(new java.awt.Color(0, 26, 66));
        jLabel33.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crk_icon.png"))); // NOI18N
        jLabel33.setText("COM223");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel33.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel33.setOpaque(true);
        jLabel33.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel34.setBackground(new java.awt.Color(0, 162, 232));
        jLabel34.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/irk_icon.png"))); // NOI18N
        jLabel34.setText("COM224");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel34.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel34.setOpaque(true);
        jLabel34.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel35.setBackground(new java.awt.Color(0, 26, 66));
        jLabel35.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mathematics_icon.png"))); // NOI18N
        jLabel35.setText("COM115");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel35.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel35.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel35.setOpaque(true);
        jLabel35.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel36.setBackground(new java.awt.Color(0, 162, 232));
        jLabel36.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/biology_icon.png"))); // NOI18N
        jLabel36.setText("COM116");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel36.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel36.setOpaque(true);
        jLabel36.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel37.setBackground(new java.awt.Color(0, 26, 66));
        jLabel37.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agriculture_icon.png"))); // NOI18N
        jLabel37.setText("COM225");
        jLabel37.setToolTipText("");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel37.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel37.setOpaque(true);
        jLabel37.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel37.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel38.setBackground(new java.awt.Color(0, 26, 66));
        jLabel38.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chemistry_icon.png"))); // NOI18N
        jLabel38.setText("COM221");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel38.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel38.setOpaque(true);
        jLabel38.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel38.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel39.setBackground(new java.awt.Color(0, 162, 232));
        jLabel39.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_icon.png"))); // NOI18N
        jLabel39.setText("COM222");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel39.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel39.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel39.setOpaque(true);
        jLabel39.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setBackground(Color.BLACK);

        jLabel40.setBackground(new java.awt.Color(0, 26, 66));
        jLabel40.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chemistry_icon.png"))); // NOI18N
        jLabel40.setText("COM217");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel40.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel40.setOpaque(true);
        jLabel40.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel41.setBackground(new java.awt.Color(0, 26, 66));
        jLabel41.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chemistry_icon.png"))); // NOI18N
        jLabel41.setText("COM121");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel41.setMaximumSize(new java.awt.Dimension(340000000, 220000000));
        jLabel41.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel41.setOpaque(true);
        jLabel41.setPreferredSize(new java.awt.Dimension(190, 150));
        jLabel41.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel42.setText("Choose any of the Random Subjects to get started.");

        jLabel43.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel43.setText("Test Your Ability Before The Exams...");

        jSeparator1.setBackground(new java.awt.Color(0, 26, 66));

        javax.swing.GroupLayout RandomCoursesLayout = new javax.swing.GroupLayout(RandomCourses);
        RandomCourses.setLayout(RandomCoursesLayout);
        RandomCoursesLayout.setHorizontalGroup(
            RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RandomCoursesLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RandomCoursesLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RandomCoursesLayout.createSequentialGroup()
                        .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(RandomCoursesLayout.createSequentialGroup()
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RandomCoursesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43))
                    .addGroup(RandomCoursesLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RandomCoursesLayout.setVerticalGroup(
            RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RandomCoursesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RandomCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        CardContainer.add(RandomCourses, "card3");

        ExamPane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setBackground(new java.awt.Color(255, 0, 0));
        jLabel44.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abort.png"))); // NOI18N
        jLabel44.setText("ABORT");
        jLabel44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
        jLabel44.setIconTextGap(10);
        jLabel44.setOpaque(true);
        jLabel44.setPreferredSize(new java.awt.Dimension(190, 50));

        jLabel45.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_subject_icon.png"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("1/5");

        jLabel47.setBackground(new java.awt.Color(0, 26, 66));
        jLabel47.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/submit_icon.png"))); // NOI18N
        jLabel47.setText("SUBMIT");
        jLabel47.setIconTextGap(10);
        jLabel47.setOpaque(true);
        jLabel47.setPreferredSize(new java.awt.Dimension(200, 46));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        areaQuestion.setEditable(false);
        areaQuestion.setBackground(new java.awt.Color(240, 240, 240));
        areaQuestion.setColumns(20);
        areaQuestion.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        areaQuestion.setLineWrap(true);
        areaQuestion.setRows(5);
        areaQuestion.setWrapStyleWord(true);
        areaQuestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(areaQuestion);

        jPanel7.setBackground(new java.awt.Color(0, 26, 66));

        lblTime.setBackground(new java.awt.Color(0, 26, 66));
        lblTime.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ntimer.png"))); // NOI18N
        lblTime.setText("0:0");
        lblTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTime.setIconTextGap(10);
        lblTime.setOpaque(true);
        lblTime.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel49.setBackground(new java.awt.Color(0, 26, 66));
        jLabel49.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Time Remaining");
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel49.setOpaque(true);
        jLabel49.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next.png"))); // NOI18N
        jLabel50.setText("Next");
        jLabel50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel50.setIconTextGap(0);
        jLabel50.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setText("jRadioButton3");

        jRadioButton4.setText("jRadioButton4");

        lblAnswerA.setText("jLabel3");

        lblAnswerB.setText("jLabel7");

        lblAnswerC.setText("jLabel8");

        lblAnswerD.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnswerA)
                    .addComponent(lblAnswerB)
                    .addComponent(lblAnswerC)
                    .addComponent(lblAnswerD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(lblAnswerA))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(lblAnswerB))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(lblAnswerC))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(lblAnswerD))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ExamPaneLayout = new javax.swing.GroupLayout(ExamPane);
        ExamPane.setLayout(ExamPaneLayout);
        ExamPaneLayout.setHorizontalGroup(
            ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExamPaneLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ExamPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(455, 455, 455))
        );
        ExamPaneLayout.setVerticalGroup(
            ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(33, 33, 33))
        );

        CardContainer.add(ExamPane, "card4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        CardContainer.add(jPanel5, "card5");

        getContentPane().add(CardContainer, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMousePressed
        cards.first(CardContainer);
        cards.addLayoutComponent(this.Dashboard, "Dashboard");
        cards.show(CardContainer, "Dashboard");

    }//GEN-LAST:event_lblHomeMousePressed

    private void displayLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayLabelMousePressed
        //cards.addLayoutComponent(this.ExamPane, "Pane3");
        // cards.show(CardContainer, "Pane3");
    }//GEN-LAST:event_displayLabelMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        cards.addLayoutComponent(this.RandomCourses, "Pane4");
        cards.show(CardContainer, "Pane4");

    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed

        cards.addLayoutComponent(this.jPanel5, "rootPane");
        cards.show(CardContainer, "rootPane");
    }//GEN-LAST:event_jLabel6MousePressed

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
//        TimerButton = 0;
//        timer = new Timer(100, this);
//        timer.start();
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
//        TimerButton = 1;
//        timer = new Timer(1000, this);
//        timer.start();

    }//GEN-LAST:event_lblHomeMouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        new PopUp(Dashboard.this, true).setVisible(true);
    }//GEN-LAST:event_jLabel2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel CardContainer;
    private javax.swing.JPanel Dashboard;
    public javax.swing.JPanel ExamPane;
    private javax.swing.JPanel RandomCourses;
    public static javax.swing.JTextArea areaQuestion;
    public javax.swing.JLabel displayLabel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnswerA;
    private javax.swing.JLabel lblAnswerB;
    private javax.swing.JLabel lblAnswerC;
    private javax.swing.JLabel lblAnswerD;
    public javax.swing.JLabel lblClose;
    public javax.swing.JLabel lblHND1;
    public javax.swing.JLabel lblHND1Second;
    public javax.swing.JLabel lblHND2;
    public javax.swing.JLabel lblHND2Second;
    private javax.swing.JLabel lblHome;
    public javax.swing.JLabel lblOND1;
    public javax.swing.JLabel lblOND1Second;
    public javax.swing.JLabel lblOND2;
    public javax.swing.JLabel lblOND2Second;
    public javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        switch (TimerButton) {
            case 0:

                int count = 50;
                int c = 40;
                displayLabel.setVisible(true);
                while (!(count == 300)) {
                    displayLabel.setSize(count, c);
                    count = count + 50;
                }
                timer.stop();
                break;

            case 1:

                int counter = 1;
                while (!(counter >= 12)) {
                    displayLabel.setVisible(false);
                    counter = counter + 1;
                }
                timer.stop();

                break;

        }

    }

    private class mouseClickedEvent implements MouseListener {

        // Dashboard dash = new Dashboard();
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getSource() == lblClose) {
                new Timer(1000, new ActionListener() {
                    int count = 0;

                    public void actionPerformed(ActionEvent e) {
                        count++;
                        if (count == 1) {

                            System.exit(0);
                        }
                    }
                }).start();

            } else if (e.getSource() == lblOND1 || e.getSource() == lblOND1Second
                    || e.getSource() == lblOND2 || e.getSource() == lblOND2Second || e.getSource() == lblHND1 || e.getSource() == lblHND1Second
                    || e.getSource() == lblHND2 || e.getSource() == lblHND2Second) {
                new CourseDetails(new Dashboard(), true, cards, CardContainer, ExamPane, lblTime).setVisible(true);
            } else if (e.getSource() == jLabel21) {
                setMinimized();
            }
        }

        @Override
        public void mouseReleased(MouseEvent e
        ) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

    private void setMinimized() {

        setExtendedState(JFrame.ICONIFIED);

    }

}
