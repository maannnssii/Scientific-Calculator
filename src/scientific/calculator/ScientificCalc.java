package scientific.calculator;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ScientificCalc extends javax.swing.JFrame {
    
    double fno , sno , result , a ;
    String operation , answer ;
   
    public ScientificCalc() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(153,153,153));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        root = new javax.swing.JButton();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        btnx = new javax.swing.JButton();
        btnxy = new javax.swing.JButton();
        btnx3 = new javax.swing.JButton();
        btn2x = new javax.swing.JButton();
        btnn = new javax.swing.JButton();
        btn_plusminus = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        log = new javax.swing.JButton();
        btnpercent = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        sinh = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        cosh = new javax.swing.JButton();
        btn_backspace = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        tanh = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_isequalto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCIENTIFIC CALCULATOR");

        display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        root.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        root.setText("Root");
        root.setEnabled(false);
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        buttonGroup.add(on);
        on.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        buttonGroup.add(off);
        off.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        off.setSelected(true);
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        btnx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnx.setText("1/X");
        btnx.setEnabled(false);
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });

        btnxy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnxy.setText("X^Y");
        btnxy.setEnabled(false);
        btnxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxyActionPerformed(evt);
            }
        });

        btnx3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnx3.setText("X^3");
        btnx3.setEnabled(false);
        btnx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx3ActionPerformed(evt);
            }
        });

        btn2x.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2x.setText("X^2");
        btn2x.setEnabled(false);
        btn2x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2xActionPerformed(evt);
            }
        });

        btnn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnn.setText("n!");
        btnn.setEnabled(false);
        btnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnActionPerformed(evt);
            }
        });

        btn_plusminus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_plusminus.setText("+/-");
        btn_plusminus.setEnabled(false);
        btn_plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusminusActionPerformed(evt);
            }
        });

        btnex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnex.setText("e^x");
        btnex.setEnabled(false);
        btnex.setFocusable(false);
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        log.setText("Log");
        log.setEnabled(false);
        log.setFocusable(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        btnpercent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnpercent.setText("%");
        btnpercent.setEnabled(false);
        btnpercent.setFocusable(false);
        btnpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpercentActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn7.setText("7");
        btn7.setEnabled(false);
        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn4.setText("4");
        btn4.setEnabled(false);
        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn1.setText("1");
        btn1.setEnabled(false);
        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sin.setText("Sin");
        sin.setEnabled(false);
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        sinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sinh.setText("Sinh");
        sinh.setEnabled(false);
        sinh.setFocusable(false);
        sinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinhActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_clear.setText("C");
        btn_clear.setEnabled(false);
        btn_clear.setFocusable(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn8.setText("8");
        btn8.setEnabled(false);
        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn5.setText("5");
        btn5.setEnabled(false);
        btn5.setFocusable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn2.setText("2");
        btn2.setEnabled(false);
        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn0.setText("0");
        btn0.setEnabled(false);
        btn0.setFocusable(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cos.setText("Cos");
        cos.setEnabled(false);
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        cosh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cosh.setText("Cosh");
        cosh.setEnabled(false);
        cosh.setFocusable(false);
        cosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coshActionPerformed(evt);
            }
        });

        btn_backspace.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_backspace.setText("B");
        btn_backspace.setEnabled(false);
        btn_backspace.setFocusable(false);
        btn_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backspaceActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn9.setText("9");
        btn9.setEnabled(false);
        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn6.setText("6");
        btn6.setEnabled(false);
        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn3.setText("3");
        btn3.setEnabled(false);
        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn_dot.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_dot.setText(".");
        btn_dot.setEnabled(false);
        btn_dot.setFocusable(false);
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tan.setText("Tan");
        tan.setEnabled(false);
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        tanh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tanh.setText("Tanh");
        tanh.setEnabled(false);
        tanh.setFocusable(false);
        tanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanhActionPerformed(evt);
            }
        });

        btn_plus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_plus.setText("+");
        btn_plus.setEnabled(false);
        btn_plus.setFocusable(false);
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });

        btn_minus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_minus.setText("-");
        btn_minus.setEnabled(false);
        btn_minus.setFocusable(false);
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });

        btn_multiply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_multiply.setText("*");
        btn_multiply.setEnabled(false);
        btn_multiply.setFocusable(false);
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });

        btn_divide.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_divide.setText("/");
        btn_divide.setEnabled(false);
        btn_divide.setFocusable(false);
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });

        btn_isequalto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_isequalto.setText("=");
        btn_isequalto.setEnabled(false);
        btn_isequalto.setFocusable(false);
        btn_isequalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_isequaltoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(display, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(on)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(off))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_isequalto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn2x, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnx3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(on)
                                        .addComponent(off))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnx3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2x, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_dot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_isequalto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        a = Math.sqrt(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_rootActionPerformed

    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        a = 1/(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_btnxActionPerformed

    private void btnxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxyActionPerformed
        fno=Double.parseDouble(display.getText());
        display.setText("");
        operation ="X^Y";
    }//GEN-LAST:event_btnxyActionPerformed

    private void btnx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx3ActionPerformed
        a =(Double.parseDouble(display.getText()));
        a = a*a*a;
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_btnx3ActionPerformed

    private void btn2xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2xActionPerformed
        a =(Double.parseDouble(display.getText()));
        a = a*a;
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_btn2xActionPerformed

    private void btnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnActionPerformed
        a = Double.parseDouble(display.getText());
        double fact=1;
        while(a!=0)
        {
            fact=fact*a;
            a--;
        }
        display.setText("");
        display.setText(display.getText()+fact);
    }//GEN-LAST:event_btnnActionPerformed

    private void btn_plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusminusActionPerformed
        a = Double.parseDouble(String.valueOf(display.getText()));
        a=a*(-1);
        display.setText(String.valueOf(a));
    }//GEN-LAST:event_btn_plusminusActionPerformed

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        a = Math.exp(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_btnexActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        a = Math.log10(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_logActionPerformed

    private void btnpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpercentActionPerformed
        fno=Double.parseDouble(display.getText());
        display.setText("");
        operation ="%";
    }//GEN-LAST:event_btnpercentActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String number = display.getText()+btn7.getText();
        display.setText(number);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String number = display.getText()+btn4.getText();
        display.setText(number);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String number = display.getText()+btn1.getText();
        display.setText(number); 
    }//GEN-LAST:event_btn1ActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        a = Math.sin(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_sinActionPerformed

    private void sinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinhActionPerformed
        a = Math.sinh(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_sinhActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        display.setText(null);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String number = display.getText()+btn8.getText();
        display.setText(number);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String number = display.getText()+btn5.getText();
        display.setText(number);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String number = display.getText()+btn2.getText();
        display.setText(number);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String number = display.getText()+btn0.getText();
        display.setText(number);
    }//GEN-LAST:event_btn0ActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        a = Math.cos(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_cosActionPerformed

    private void coshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coshActionPerformed
        a = Math.cosh(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_coshActionPerformed

    private void btn_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backspaceActionPerformed
        JButton btn_backspace =new JButton("\uF0E7");
        String backspace=null;
        if(display.getText().length()>0)
        {
            StringBuilder str=new StringBuilder(display.getText());
            str.deleteCharAt(display.getText().length()-1);
            backspace=str.toString();
            display.setText(backspace);
        }
    }//GEN-LAST:event_btn_backspaceActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String number = display.getText()+btn9.getText();
        display.setText(number);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String number = display.getText()+btn6.getText();
        display.setText(number);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String number = display.getText()+btn3.getText();
        display.setText(number);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        String number = display.getText()+btn_dot.getText();
        display.setText(number);
    }//GEN-LAST:event_btn_dotActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        a = Math.tan(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_tanActionPerformed

    private void tanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanhActionPerformed
        a = Math.tanh(Double.parseDouble(display.getText()));
        display.setText("");
        display.setText(display.getText()+a);
    }//GEN-LAST:event_tanhActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        fno=Double.parseDouble(display.getText());
        display.setText("");
        operation ="+";
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        fno=Double.parseDouble(display.getText());
        display.setText("");
        operation ="-";
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        fno=Double.parseDouble(display.getText());
        display.setText("");
        operation ="*";
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        fno=Double.parseDouble(display.getText());
        display.setText("");
        operation ="/";
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_isequaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_isequaltoActionPerformed
        sno=Double.parseDouble(display.getText());
        if(operation=="+")
        {
            result=fno+sno;
            answer=String.format("%.2f", result);
            display.setText(answer);
        }
        else if(operation=="-")
        {
            result=fno-sno;
            answer=String.format("%.2f", result);
            display.setText(answer);
        }
        else if(operation=="*")
        {
            result=fno*sno;
            answer=String.format("%.2f", result);
            display.setText(answer);
        }
        else if(operation=="/")
        {
            result=fno/sno;
            answer=String.format("%.2f", result);
            display.setText(answer);
        }
        else if(operation=="%")
        {
            result=fno%sno;
            answer=String.format("%.2f", result);
            display.setText(answer);
        }
        else if(operation=="X^Y")
        {
            double resultt = 1;
            for(int i=0;i<sno;i++)
            {
                resultt=fno*resultt;
            }
            answer=String.format("%.2f", resultt);
            display.setText(answer);
        }
    }//GEN-LAST:event_btn_isequaltoActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        display.setEditable(true);
        btnx.setEnabled(true);
        btnxy.setEnabled(true);
        btnx3.setEnabled(true);
        btn2x.setEnabled(true);
        btnn.setEnabled(true);
        btn_plusminus.setEnabled(true);
        btnex.setEnabled(true);
        log.setEnabled(true);
        btnpercent.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn0.setEnabled(true);
        btn_dot.setEnabled(true);
        sin.setEnabled(true);
        cos.setEnabled(true);
        tan.setEnabled(true);
        sinh.setEnabled(true);
        cosh.setEnabled(true);
        tanh.setEnabled(true);
        btn_clear.setEnabled(true);
        btn_backspace.setEnabled(true);
        btn_plus.setEnabled(true);
        btn_minus.setEnabled(true);
        btn_multiply.setEnabled(true);
        btn_divide.setEnabled(true);
        root.setEnabled(true);
        btn_isequalto.setEnabled(true);
    }//GEN-LAST:event_onActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        display.setEditable(false);
        display.setText(null);
        btnx.setEnabled(false);
        btnxy.setEnabled(false);
        btnx3.setEnabled(false);
        btn2x.setEnabled(false);
        btnn.setEnabled(false);
        btn_plusminus.setEnabled(false);
        btnex.setEnabled(false);
        log.setEnabled(false);
        btnpercent.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn0.setEnabled(false);
        btn_dot.setEnabled(false);
        sin.setEnabled(false);
        cos.setEnabled(false);
        tan.setEnabled(false);
        sinh.setEnabled(false);
        cosh.setEnabled(false);
        tanh.setEnabled(false);
        btn_clear.setEnabled(false);
        btn_backspace.setEnabled(false);
        btn_plus.setEnabled(false);
        btn_minus.setEnabled(false);
        btn_multiply.setEnabled(false);
        btn_divide.setEnabled(false);
        root.setEnabled(false);
        btn_isequalto.setEnabled(false);
    }//GEN-LAST:event_offActionPerformed

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
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn2x;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_backspace;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_isequalto;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_plusminus;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btnn;
    private javax.swing.JButton btnpercent;
    private javax.swing.JButton btnx;
    private javax.swing.JButton btnx3;
    private javax.swing.JButton btnxy;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosh;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton log;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton root;
    private javax.swing.JButton sin;
    private javax.swing.JButton sinh;
    private javax.swing.JButton tan;
    private javax.swing.JButton tanh;
    // End of variables declaration//GEN-END:variables

}
