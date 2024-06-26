/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mathquiz;

import java.awt.Color;
import java.util.*;
import java.lang.Math; 
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import javax.swing.JOptionPane;

/**
 *
 * @author Tertius
 */
public class Quiz extends javax.swing.JFrame {
    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    public int totalQuestions;
    public boolean isActive = true;
    public boolean programActive;
    public String chosenType, operant;
    public int correct, tried, valOne, valTwo, countQuestion;
    public double answer;
    public String equasionTypes[] = {};
    public int countdownStarter;
    public List<String> operator = new ArrayList<String>();
    
    /**
     * Creates new form Quiz
     */
    public Quiz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberOfQuestions = new javax.swing.ButtonGroup();
        timerswitch = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        score1 = new javax.swing.JPanel();
        totalTried = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        score2 = new javax.swing.JPanel();
        totalCorrect = new javax.swing.JLabel();
        questionPanel = new javax.swing.JPanel();
        numOne = new javax.swing.JLabel();
        calType = new javax.swing.JLabel();
        numTwo = new javax.swing.JLabel();
        Equels = new javax.swing.JLabel();
        AnswerBlock = new javax.swing.JTextPane();
        typePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Addition = new javax.swing.JCheckBox();
        Subtraction = new javax.swing.JCheckBox();
        Division = new javax.swing.JCheckBox();
        Multiplication = new javax.swing.JCheckBox();
        totalPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        random = new javax.swing.JRadioButton();
        one = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        three = new javax.swing.JRadioButton();
        four = new javax.swing.JRadioButton();
        five = new javax.swing.JRadioButton();
        six = new javax.swing.JRadioButton();
        seven = new javax.swing.JRadioButton();
        eight = new javax.swing.JRadioButton();
        nine = new javax.swing.JRadioButton();
        timerPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        timerOn = new javax.swing.JRadioButton();
        timerOff = new javax.swing.JRadioButton();
        timer = new javax.swing.JLabel();
        exitButtun = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Tried:");

        score1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        totalTried.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        totalTried.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalTried.setText("0");

        javax.swing.GroupLayout score1Layout = new javax.swing.GroupLayout(score1);
        score1.setLayout(score1Layout);
        score1Layout.setHorizontalGroup(
            score1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, score1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalTried, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        score1Layout.setVerticalGroup(
            score1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, score1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalTried))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setText("Correct:");

        score2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        totalCorrect.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        totalCorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalCorrect.setText("0");

        javax.swing.GroupLayout score2Layout = new javax.swing.GroupLayout(score2);
        score2.setLayout(score2Layout);
        score2Layout.setHorizontalGroup(
            score2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(score2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        score2Layout.setVerticalGroup(
            score2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, score2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalCorrect))
        );

        questionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));

        numOne.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        numOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calType.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        calType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        numTwo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        numTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Equels.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Equels.setText("=");

        AnswerBlock.setEditable(false);
        AnswerBlock.setBackground(new java.awt.Color(240, 240, 240));
        AnswerBlock.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        AnswerBlock.setText("??");
        AnswerBlock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(numOne, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(calType, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(numTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Equels)
                .addGap(18, 18, 18)
                .addComponent(AnswerBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(numTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Equels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnswerBlock)
                    .addComponent(calType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        typePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Type:");

        Addition.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Addition.setText("Addition");
        Addition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdditionMouseClicked(evt);
            }
        });

        Subtraction.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Subtraction.setText("Subtraction");
        Subtraction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubtractionMouseClicked(evt);
            }
        });

        Division.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Division.setText("Division");
        Division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivisionMouseClicked(evt);
            }
        });

        Multiplication.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Multiplication.setText("Multiplication");
        Multiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplicationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout typePanelLayout = new javax.swing.GroupLayout(typePanel);
        typePanel.setLayout(typePanelLayout);
        typePanelLayout.setHorizontalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addGroup(typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(typePanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3))
                    .addGroup(typePanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Subtraction)
                            .addComponent(Addition)
                            .addComponent(Division)
                            .addComponent(Multiplication))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        typePanelLayout.setVerticalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Addition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subtraction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Division)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Multiplication)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        totalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setText("No. of Questions");

        numberOfQuestions.add(random);
        random.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        random.setSelected(true);
        random.setText("Random");
        random.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randomMouseClicked(evt);
            }
        });

        numberOfQuestions.add(one);
        one.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        one.setText("1");
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });

        numberOfQuestions.add(two);
        two.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        two.setText("2");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });

        numberOfQuestions.add(three);
        three.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        three.setText("3");
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });

        numberOfQuestions.add(four);
        four.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        four.setText("4");
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
        });

        numberOfQuestions.add(five);
        five.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        five.setText("5");
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
        });

        numberOfQuestions.add(six);
        six.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        six.setText("6");
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });

        numberOfQuestions.add(seven);
        seven.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        seven.setText("7");
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
        });

        numberOfQuestions.add(eight);
        eight.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        eight.setText("8");
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });

        numberOfQuestions.add(nine);
        nine.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        nine.setText("9");
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout totalPanelLayout = new javax.swing.GroupLayout(totalPanel);
        totalPanel.setLayout(totalPanelLayout);
        totalPanelLayout.setHorizontalGroup(
            totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPanelLayout.createSequentialGroup()
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(totalPanelLayout.createSequentialGroup()
                                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(four)
                                    .addComponent(one)
                                    .addComponent(seven))
                                .addGap(37, 37, 37)
                                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eight)
                                    .addComponent(five)
                                    .addComponent(two))
                                .addGap(31, 31, 31)
                                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nine)
                                    .addComponent(six)
                                    .addComponent(three)))
                            .addComponent(random)))
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        totalPanelLayout.setVerticalGroup(
            totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(random)
                .addGap(9, 9, 9)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three))
                .addGap(18, 18, 18)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six))
                .addGap(18, 18, 18)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine))
                .addContainerGap())
        );

        timerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setText("Timer:");

        timerswitch.add(timerOn);
        timerOn.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        timerOn.setText("On");

        timerswitch.add(timerOff);
        timerOff.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        timerOff.setSelected(true);
        timerOff.setText("Off");

        timer.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPanelLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(timerOn)
                    .addComponent(timerOff))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addComponent(timerOn)
                .addGap(18, 18, 18)
                .addComponent(timerOff)
                .addGap(18, 18, 18)
                .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        exitButtun.setBackground(new java.awt.Color(102, 102, 255));
        exitButtun.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        exitButtun.setForeground(new java.awt.Color(255, 255, 255));
        exitButtun.setText("Exit");
        exitButtun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtunMouseClicked(evt);
            }
        });

        checkButton.setBackground(new java.awt.Color(102, 102, 255));
        checkButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        checkButton.setForeground(new java.awt.Color(255, 255, 255));
        checkButton.setText("Check Answer");
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(102, 102, 255));
        startButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(exitButtun, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkButton)
                .addGap(206, 206, 206)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(typePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(totalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(score2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButtun)
                    .addComponent(checkButton)
                    .addComponent(startButton))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtunMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtunMouseClicked

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked
        if(programActive == true){
            if(Double.parseDouble(AnswerBlock.getText()) == answer){
                correct ++;
                JOptionPane.showMessageDialog(null, "Correct!");
            }else{
                tried ++;
                JOptionPane.showMessageDialog(null, "Incorrect!");
            }
            
            totalTried.setText(Integer.toString(tried));
            totalCorrect.setText(Integer.toString(correct));
            createQuestion();
        }
    }//GEN-LAST:event_checkButtonMouseClicked

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        boolean time = false;
        countdownStarter = 30;
        programActive = true;
        countQuestion = 0;
        isActive = true;
        exitButtun.setVisible(false);
        correct = 0;
        tried = 0;
        totalTried.setText(Integer.toString(tried));
        totalCorrect.setText(Integer.toString(correct));
        equasionTypes = new String[operator.size()];
        operator.toArray(equasionTypes);
        timer.setText("");
        startButton.setVisible(false);
        
        if (timerOn.isSelected()){
            time = true;
        }else{
            time = false;
        }
        
        if(random.isSelected()){
            totalQuestions = (int)(Math.random()*(16)-1);
            if(totalQuestions == 0){
                totalQuestions++;
            }
        }
        createQuestion();
        
        timer.setVisible(time);   
        
        if(time == true){
            timer.setForeground(Color.black);

            final Runnable runnable = new Runnable() {

                public void run() {

                    timer.setText(Integer.toString(countdownStarter));
                    countdownStarter--;

                    if (countdownStarter < 15){
                        timer.setForeground(Color.red);
                    }

                    if (countdownStarter < 0) {
                        scheduler.shutdown();
                        JOptionPane.showMessageDialog(null, "Out of time!");
                        timerNotActive();
                        endQuestions();
                    }
                }
            };
            scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
        }
        
        AnswerBlock.setEditable(true);
    }//GEN-LAST:event_startButtonMouseClicked

    private void randomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randomMouseClicked
        totalQuestions = (int)(Math.random()*(16)-1);
    }//GEN-LAST:event_randomMouseClicked

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        totalQuestions = 1;
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        totalQuestions = 2;
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        totalQuestions = 3;
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
        totalQuestions = 4;
    }//GEN-LAST:event_fourMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        totalQuestions = 5;
    }//GEN-LAST:event_fiveMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        totalQuestions = 6;
    }//GEN-LAST:event_sixMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
        totalQuestions = 7;
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        totalQuestions = 8;
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        totalQuestions = 9;
    }//GEN-LAST:event_nineMouseClicked

    private void AdditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdditionMouseClicked
        if (Addition.isSelected()){
            operator.add("+");
        }else{
            operator.remove("+");
        }
    }//GEN-LAST:event_AdditionMouseClicked

    private void SubtractionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubtractionMouseClicked
        if (Subtraction.isSelected()){
            operator.add("-");
        }else{
            operator.remove("-");
        }
    }//GEN-LAST:event_SubtractionMouseClicked

    private void DivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivisionMouseClicked
        if (Division.isSelected()){
            operator.add("/");
        }else{
            operator.remove("/");
        }
    }//GEN-LAST:event_DivisionMouseClicked

    private void MultiplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplicationMouseClicked
        if (Multiplication.isSelected()){
            operator.add("X");
        }else{
            operator.remove("X");
        }
    }//GEN-LAST:event_MultiplicationMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }
    
    public void createQuestion(){
        AnswerBlock.setText("");
        if(countQuestion < totalQuestions){
            valOne = (int)(Math.random()*(50));
            valTwo = (int)(Math.random()*(50));
            
            if(equasionTypes.length == 1){
                operant = equasionTypes[0];
            }else{
                operant = equasionTypes[(int)(Math.random()*(equasionTypes.length))];
            }
            
            try{
                switch (operant){
                    case "+":
                        answer = valOne + valTwo;
                        break;
                    case "-":
                        answer = valOne - valTwo;
                        break;
                    case "/":
                        valOne = (int)(Math.random()*(13)-1);
                        valTwo = (int)(Math.random()*(13)-1);
                        answer = valOne / valTwo;
                        break;
                    case "X":
                        valOne = (int)(Math.random()*(13)-1);
                        valTwo = (int)(Math.random()*(13)-1);
                        answer = valOne * valTwo;
                        break;
                }
                
                numOne.setText(Integer.toString(valOne));
                numTwo.setText(Integer.toString(valTwo));
                calType.setText(operant);
                countQuestion ++;
                
            }catch (Exception e){
                createQuestion();
            }
        }else{
            scheduler.shutdown();
            JOptionPane.showMessageDialog(null, "All questions have been answered!");
            endQuestions();
        }
    }
    
    public void endQuestions(){
        numOne.setText("Marks:");
        String result = correct + " / " + totalQuestions;
        numTwo.setText(result);
        calType.setText("");
        Equels.setText("");
        AnswerBlock.setText("");
        AnswerBlock.setEditable(false);
        exitButtun.setVisible(true);
        checkButton.setVisible(false);
        programActive = false;
    }
    
    public void timerNotActive(){
        isActive = false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Addition;
    private javax.swing.JTextPane AnswerBlock;
    private javax.swing.JCheckBox Division;
    private javax.swing.JLabel Equels;
    private javax.swing.JCheckBox Multiplication;
    private javax.swing.JCheckBox Subtraction;
    private javax.swing.JLabel calType;
    private javax.swing.JButton checkButton;
    private javax.swing.JRadioButton eight;
    private javax.swing.JButton exitButtun;
    private javax.swing.JRadioButton five;
    private javax.swing.JRadioButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton nine;
    private javax.swing.JLabel numOne;
    private javax.swing.JLabel numTwo;
    private javax.swing.ButtonGroup numberOfQuestions;
    private javax.swing.JRadioButton one;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JRadioButton random;
    private javax.swing.JPanel score1;
    private javax.swing.JPanel score2;
    private javax.swing.JRadioButton seven;
    private javax.swing.JRadioButton six;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton three;
    private javax.swing.JLabel timer;
    private javax.swing.JRadioButton timerOff;
    private javax.swing.JRadioButton timerOn;
    private javax.swing.JPanel timerPanel;
    private javax.swing.ButtonGroup timerswitch;
    private javax.swing.JLabel totalCorrect;
    private javax.swing.JPanel totalPanel;
    private javax.swing.JLabel totalTried;
    private javax.swing.JRadioButton two;
    private javax.swing.JPanel typePanel;
    // End of variables declaration//GEN-END:variables
}