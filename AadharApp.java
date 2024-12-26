import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.Image;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

public class AadharApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aadhaar Application Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null); // Set layout to null for absolute positioning

        ImageIcon imageIcon1 = new ImageIcon("emblem1.jpg");
        ImageIcon imageIcon2 = new ImageIcon("centerlogo.jpg");
        ImageIcon imageIcon3 = new ImageIcon("rightlogo4.jpg");
        JLabel label1 = new JLabel(imageIcon1);
        JLabel label2 = new JLabel(imageIcon2);
        JLabel label3 = new JLabel(imageIcon3);

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.setBounds(15, 10, 605, 140);
        panel1.setBackground(Color.WHITE);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);

        Border coloredBorder = BorderFactory.createLineBorder(Color.red, 20);
        JPanel contentPane = (JPanel) frame.getContentPane();
        contentPane.setBorder(coloredBorder);
        contentPane.setLayout(null); // Set layout to null for absolute positioning

        JPanel panel2 = new JPanel();
        panel2.setBounds(15, 150, 605, 15);
        panel2.setBackground(Color.RED);

        JLabel label4 = new JLabel();
        label4.setPreferredSize(new Dimension(600, 10));
        label4.setBackground(Color.red);
        label4.setOpaque(true);
        panel2.add(label4);

        contentPane.add(panel1);
        contentPane.add(panel2);

        JLabel label5 = new JLabel("Application Form");
        label5.setFont(new Font("cambria", Font.PLAIN, 26));
        label5.setBounds(220, 155, 200, 40);

        JLabel label6 = new JLabel("   Your Full Name");
        label6.setFont(new Font("Roboto", Font.PLAIN, 16));
        label6.setBounds(20, 200, 200, 40);
        JTextField t1 = new JTextField();
        t1.setFont(new Font("Arial", Font.PLAIN, 16));
        t1.setBounds(220, 210, 300, 30);
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    evt.consume(); // Ignore the event if it's not a letter or whitespace
                }
            }
        });

        JLabel label7 = new JLabel("   Father Name");
        label7.setFont(new Font("Roboto", Font.PLAIN, 16));
        label7.setBounds(20, 250, 200, 40);
        JTextField t2 = new JTextField();
        t2.setFont(new Font("Arial", Font.PLAIN, 16));
        t2.setBounds(220, 260, 300, 30);
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    evt.consume(); // Ignore the event if it's not a letter or whitespace
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed");
                }
            }
        });

        JLabel label8 = new JLabel("   Mother Name");
        label8.setFont(new Font("Roboto", Font.PLAIN, 16));
        label8.setBounds(20, 300, 200, 40);
        JTextField t3 = new JTextField();
        t3.setFont(new Font("Arial", Font.PLAIN, 16));
        t3.setBounds(220, 310, 300, 30);
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    evt.consume(); // Ignore the event if it's not a letter or whitespace
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed");
                }
            }
        });

        JLabel label9 = new JLabel("   Date Of Birth");
        label9.setFont(new Font("Roboto", Font.PLAIN, 16));
        label9.setBounds(20, 350, 200, 40);
        JTextField t4 = new JTextField();
        t4.setFont(new Font("Arial", Font.PLAIN, 16));
        t4.setBounds(220, 360, 300, 30);
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c) && c != '/' && c != '-' && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    evt.consume(); // Ignore the event if it's not a digit, '/' or '-'
                }
            }
        });

        JLabel label10 = new JLabel("   Gender");
        label10.setFont(new Font("Roboto", Font.PLAIN, 16));
        label10.setBounds(20, 400, 200, 40);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial", Font.PLAIN, 16));
        r1.setBounds(220, 410, 100, 30);
        r1.setBackground(Color.white);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setFont(new Font("Arial", Font.PLAIN, 16));
        r2.setBounds(330, 410, 100, 30);
        r2.setBackground(Color.white);
        ButtonGroup br = new ButtonGroup();
        br.add(r1);
        br.add(r2);

        JLabel label11 = new JLabel("   Marital Status");
        label11.setFont(new Font("Roboto", Font.PLAIN, 16));
        label11.setBounds(20, 450, 200, 40);
        JRadioButton rb1 = new JRadioButton("Married");
        rb1.setFont(new Font("Arial", Font.PLAIN, 16));
        rb1.setBounds(220, 460, 100, 30);
        rb1.setBackground(Color.white);
        JRadioButton rb2 = new JRadioButton("Unmarried");
        rb2.setFont(new Font("Arial", Font.PLAIN, 16));
        rb2.setBounds(330, 460, 100, 30);
        rb2.setBackground(Color.white);
        ButtonGroup gr = new ButtonGroup();
        gr.add(rb1);
        gr.add(rb2);

        JLabel label12 = new JLabel("   Aadhaar Number");
        label12.setFont(new Font("Roboto", Font.PLAIN, 16));
        label12.setBounds(20, 500, 200, 40);
        JTextField t7 = new JTextField();
        t7.setFont(new Font("Arial", Font.PLAIN, 16));
        t7.setBounds(220, 510, 300, 30);
        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) || t7.getText().length() >= 12) {
                evt.consume(); // Ignore the event if it's not a digit or if length exceeds 12
            }
            }
        });

        JButton uploadButton = new JButton("Upload Passport Photo");
        uploadButton.setFont(new Font("Roboto", Font.PLAIN, 16));
        uploadButton.setBounds(220, 550, 200, 30);
        JLabel passportPhotoLabel = new JLabel();
        passportPhotoLabel.setBounds(500, 550, 90, 90);
        passportPhotoLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png"));
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                if (selectedFile.length() > 3 * 1024 * 1024) {
                JOptionPane.showMessageDialog(null, "File size must be less than 3MB");
                } else {
                ImageIcon passportPhoto = new ImageIcon(new ImageIcon(selectedFile.getAbsolutePath()).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
                passportPhotoLabel.setIcon(passportPhoto);
                }
            }
            }
        });

        frame.add(uploadButton);
        frame.add(passportPhotoLabel);

        JLabel label14 = new JLabel("   Address");
        label14.setFont(new Font("Roboto", Font.PLAIN, 16));
        label14.setBounds(20, 600, 200, 40);
        JTextArea t8 = new JTextArea(2, 3);
        t8.setFont(new Font("Arial", Font.PLAIN, 16));
        t8.setBounds(220, 610, 250, 100);
        t8.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Set border for JTextArea

        JButton jb = new JButton("Submit");
        jb.setFont(new Font("Roboto", Font.PLAIN, 16));
        jb.setBounds(220, 720, 100, 25);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(label5);
        frame.add(label6);
        frame.add(t1);
        frame.add(label7);
        frame.add(t2);
        frame.add(label8);
        frame.add(t3);
        frame.add(label9);
        frame.add(t4);
        frame.add(label10);
        frame.add(r1);
        frame.add(r2);
        frame.add(label11);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(label12);
        frame.add(t7);
        frame.add(label14);
        frame.add(t8);
        frame.add(jb);
        frame.add(panel); // Add the main panel to the frame
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);
        frame.setSize(650, 800);
        frame.setResizable(false);
        frame.setVisible(true);
// <------------------------------------------------------------------------------------------------------------------------------------------------------------------->

        JFrame frame1 = new JFrame(" Aadhaar Card");
        Border coloredBorder1 = BorderFactory.createLineBorder(Color.red, 7);
        JPanel contentPane1 = (JPanel) frame1.getContentPane();
        contentPane1.setBorder(coloredBorder1);

        ImageIcon ic1 = new ImageIcon("logo.jpg");
        JLabel l1 = new JLabel(ic1);
        JPanel p = new JPanel();
        p.setBounds(5, 5, 400, 80);
        p.add(l1);

        JLabel l2 = new JLabel();
        l2.setPreferredSize(new Dimension(400, 5));
        l2.setBackground(Color.red);
        l2.setOpaque(true);
        JPanel p1 = new JPanel(new BorderLayout());
        p1.setBounds(5, 85, 400, 5);
        p1.add(l2, BorderLayout.CENTER);
        p1.add(l2);

        JLabel l3 = new JLabel();
        l3.setPreferredSize(new Dimension(5, 380));
        l3.setBackground(Color.red);
        l3.setOpaque(true);
        JPanel p2 = new JPanel(new BorderLayout());
        p2.setBounds(405, 6, 5, 380);
        p2.add(l3, BorderLayout.CENTER);
        p2.add(l3);

        ImageIcon ic2 = new ImageIcon("logo.jpg");
        JLabel ll4 = new JLabel(ic2);
        JPanel p3 = new JPanel();
        p3.setBounds(410, 5, 400, 80);
        p3.add(ll4);

        JLabel l5 = new JLabel();
        l5.setPreferredSize(new Dimension(400, 5));
        l5.setBackground(Color.red);
        l5.setOpaque(true);
        JPanel p4 = new JPanel(new BorderLayout());
        p4.setBounds(410, 85, 400, 5);
        p4.add(l5, BorderLayout.CENTER);
        p4.add(l5);

        JLabel l6 = new JLabel();
        JPanel p5 = new JPanel();
        p5.setBounds(10, 110, 90, 90);
        p5.add(l6);
        p5.setBackground(Color.WHITE);

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png"));
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                if (selectedFile.length() > 3 * 1024 * 1024) {
                JOptionPane.showMessageDialog(null, "File size must be less than 3MB");
                } else {
                ImageIcon passportPhoto = new ImageIcon(new ImageIcon(selectedFile.getAbsolutePath()).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
                passportPhotoLabel.setIcon(passportPhoto);
                l6.setIcon(passportPhoto); // Set the uploaded image to l6
                }
            }
            }
        });

        ImageIcon ic4 = new ImageIcon("qr.jpg");
        JLabel l7 = new JLabel();
        Image img = ic4.getImage();
        Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        l7.setIcon(new ImageIcon(scaledImg));
        JPanel p6 = new JPanel();
        p6.setBounds(700, 105, 100, 100);
        p6.add(l7);
        p6.setBackground(Color.WHITE);

        JLabel l8 = new JLabel();
        l8.setPreferredSize(new Dimension(400, 5));
        l8.setBackground(Color.red);
        l8.setOpaque(true);
        JPanel p7 = new JPanel(new BorderLayout());
        p7.setBounds(5, 270, 400, 5);
        p7.add(l8, BorderLayout.CENTER);
        p7.add(l8);

        JLabel l9 = new JLabel();
        l9.setPreferredSize(new Dimension(400, 5));
        l9.setBackground(Color.red);
        l9.setOpaque(true);
        JPanel p8 = new JPanel(new BorderLayout());
        p8.add(l9, BorderLayout.CENTER);
        p8.setBounds(410, 270, 400, 5);
        p8.add(l9);

        JLabel la1 = new JLabel("  Name  :");
        la1.setFont(new Font("Roboto", Font.PLAIN, 16));
        la1.setBounds(140, 110, 70, 15);
        JTextArea ta1 = new JTextArea(1, 1);
        ta1.setFont(new Font("Arial", Font.PLAIN, 16));
        ta1.setBounds(220, 110, 180, 20);
        ta1.setEditable(false); // Make the JTextArea non-editable
        ta1.setFocusable(false); // Make the JTextArea non-focusable to remove the cursor

        JLabel la2 = new JLabel(" DOB    :");
        la2.setFont(new Font("Roboto", Font.PLAIN, 16));
        la2.setBounds(140, 140, 70, 15);
        JTextArea ta2 = new JTextArea(1, 1);
        ta2.setFont(new Font("Arial", Font.PLAIN, 16));
        ta2.setBounds(220, 140, 180, 20);
        ta2.setEditable(false); // Make the JTextArea non-editable
        ta2.setFocusable(false); // Make the JTextArea non-focusable to remove the cursor

        JLabel la3 = new JLabel("Gender :");
        la3.setFont(new Font("Roboto", Font.PLAIN, 16));
        la3.setBounds(140, 170, 70, 15);
        JTextArea ta3 = new JTextArea(1, 1);
        ta3.setFont(new Font("Arial", Font.PLAIN, 16));
        ta3.setBounds(220, 170, 180, 20);
        ta3.setEditable(false); // Make the JTextArea non-editable
        ta3.setFocusable(false); // Make the JTextArea non-focusable to remove the cursor

        JTextArea ta4 = new JTextArea(1, 1);
        ta4.setFont(new Font("Arial", Font.PLAIN, 26));
        ta4.setBounds(160, 230, 220, 30);
        ta4.setEditable(false); // Make the JTextArea non-editable
        ta4.setFocusable(false); // Make the JTextArea non-focusable to remove the cursor

        JTextArea ta5 = new JTextArea(1, 1);
        ta5.setFont(new Font("Arial", Font.PLAIN, 26));
        ta5.setBounds(460, 230, 220, 30);
        ta5.setEditable(false); // Make the JTextArea non-editable
        ta5.setFocusable(false); // Make the JTextArea non-focusable to remove the cursor

        JLabel la6 = new JLabel(" Address :");
        la6.setFont(new Font("Roboto", Font.PLAIN, 16));
        la6.setBounds(410, 110, 80, 15);
        JTextArea ta6 = new JTextArea(3, 3);
        ta6.setFont(new Font("Arial", Font.PLAIN, 16));
        ta6.setBounds(450, 125, 250, 110);
        ta6.setEditable(false); // Make the JTextArea non-editable
        ta6.setFocusable(false); // Make the JTextArea non-focusable to remove the cursor

        JLabel la7 = new JLabel("My Aadhaar, My Identity");
        la7.setFont(new Font("cambria", Font.PLAIN, 26));
        la7.setBounds(70, 275, 300, 40);

        ImageIcon ic = new ImageIcon("tele.jpg");
        JLabel jb0 = new JLabel(ic);
        JPanel p9 = new JPanel();
        p9.setBounds(440, 275, 33, 33);
        p9.add(jb0);
        p9.setBackground(Color.WHITE);

        JLabel la8 = new JLabel("1947");
        la8.setFont(new Font("cambria", Font.PLAIN, 12));
        la8.setBounds(480, 275, 40, 40);

        ImageIcon ic11 = new ImageIcon("mail1.jpg");
        JLabel jb1 = new JLabel(ic11);
        JPanel p10 = new JPanel();
        p10.setBounds(530, 275, 33, 33);
        p10.add(jb1);
        p10.setBackground(Color.WHITE);

        JLabel la9 = new JLabel("help@uidai.gov.in");
        la9.setFont(new Font("cambria", Font.PLAIN, 12));
        la9.setBounds(564, 275, 150, 40);
        la9.setBackground(Color.WHITE);

        ImageIcon ic12 = new ImageIcon("web1.jpg");
        JLabel jb2 = new JLabel(ic12);
        JPanel p11 = new JPanel();
        p11.setBounds(670, 274, 33, 35);
        p11.setBackground(Color.WHITE); // Set background color to white
        p11.add(jb2);

        JLabel la10 = new JLabel("www.uidai.gov.in");
        la10.setFont(new Font("cambria", Font.PLAIN, 12));
        la10.setBounds(710, 275, 150, 40);

        frame1.add(p);
        frame1.add(p1);
        frame1.add(p2);
        frame1.add(p3);
        frame1.add(p4);
        frame1.add(p5);
        frame1.add(p6);
        frame1.add(p7);
        frame1.add(p8);
        frame1.add(p9);
        frame1.add(p10);
        frame1.add(p11);

        frame1.add(la1);
        frame1.add(ta1);
        frame1.add(la2);
        frame1.add(ta2);
        frame1.add(la3);
        frame1.add(ta3);
        frame1.add(ta4);
        frame1.add(ta5);
        frame1.add(la6);
        frame1.add(ta6);
        frame1.add(la7);
        frame1.add(la8);
        frame1.add(la9);
        frame1.add(la10);

        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta3.setText("Male");
            }
        });

        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta3.setText("Female");
            }
        });

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta1.setText(t1.getText());
                ta2.setText(t4.getText());
                ta4.setText(t7.getText());
                ta5.setText(t7.getText());
                ta6.setText(t8.getText());
                frame1.setVisible(true);
            }
        });

        ta1.setEditable(false);
        ta2.setEditable(false);
        ta3.setEditable(false);
        ta4.setEditable(false);
        ta5.setEditable(false);
        ta6.setEditable(false);

        frame1.setLayout(null);
        frame1.getContentPane().setBackground(Color.white);
        frame1.setResizable(false);
        frame1.setSize(830, 350);
    }
}
