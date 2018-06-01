/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import chat.ChatInterface;
import chat.Message;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 *
 * @author vijani
 */
public class ChatView extends javax.swing.JFrame implements MouseListener, KeyListener {

    String username;
    ChatInterface chat;
    List<Message> msgs = new ArrayList<>();
    List<String> users = new ArrayList<>();

    /**
     * Creates new form ChatView
     */
    public ChatView(ChatInterface chat, String username) throws RemoteException {
        initComponents();
        this.chat = chat;
        this.username = username;
        chat.login(username);
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        chatInputText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatListTextArea = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userListTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lghLabel = new javax.swing.JLabel();
        hpyLabel = new javax.swing.JLabel();
        sadLabel = new javax.swing.JLabel();
        supLabel = new javax.swing.JLabel();
        angLabel = new javax.swing.JLabel();
        tngLabel = new javax.swing.JLabel();
        glsLabel = new javax.swing.JLabel();
        ywnLabel = new javax.swing.JLabel();
        kisLabel = new javax.swing.JLabel();
        luvLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(219, 109, 252));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(194, 181, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(194, 181, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 87, 169)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(55, 178, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("name");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 40));

        sendButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sendButton.setForeground(new java.awt.Color(55, 178, 204));
        sendButton.setText("Send");
        sendButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(55, 178, 204)));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 120, 40));

        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(55, 178, 204));
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(55, 178, 204)));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 120, 40));
        jPanel1.add(chatInputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 230, 40));

        chatListTextArea.setEditable(false);
        chatListTextArea.setContentType("text/html"); // NOI18N
        chatListTextArea.setText("<html>\n  <head>\n\n  </head>\n  <body>\n    <p style=\"margin-top: 0\">\n      <h1 color='red'>Viji</h1>\n    </p>\n  </body>\n</html>\n");
        jScrollPane3.setViewportView(chatListTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 360, 280));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 0, 380, 410));

        jPanel3.setBackground(new java.awt.Color(194, 181, 252));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 87, 169)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userListTextArea.setEditable(false);
        userListTextArea.setBackground(new java.awt.Color(194, 181, 252));
        userListTextArea.setColumns(20);
        userListTextArea.setRows(5);
        jScrollPane2.setViewportView(userListTextArea);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 340));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 178, 204));
        jLabel2.setText("online users");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 410));

        jPanel5.setBackground(new java.awt.Color(194, 181, 252));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 87, 169)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lghLabel.setText("1");
        jPanel5.add(lghLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 50));

        hpyLabel.setText("0");
        jPanel5.add(hpyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 50));

        sadLabel.setText("2");
        jPanel5.add(sadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 50));

        supLabel.setText("3");
        jPanel5.add(supLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, 50));

        angLabel.setText("4");
        jPanel5.add(angLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 50));

        tngLabel.setText("5");
        jPanel5.add(tngLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, 50));

        glsLabel.setText("6");
        jPanel5.add(glsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 50));

        ywnLabel.setText("7");
        jPanel5.add(ywnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, 50));

        kisLabel.setText("8");
        jPanel5.add(kisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 50, 50));

        luvLabel.setText("9");
        jPanel5.add(luvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 50, 50));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 178, 204));
        jLabel1.setText("add a smiley");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 130, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        sendNewMessage();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        try {
            chat.logout(username);  //use the reference "chat" to call remote methods
            System.exit(0);
            //catch the exceptions may occur, Rubbish URL, RemoteException
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angLabel;
    private javax.swing.JTextField chatInputText;
    private javax.swing.JTextPane chatListTextArea;
    private javax.swing.JLabel glsLabel;
    private javax.swing.JLabel hpyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel kisLabel;
    private javax.swing.JLabel lghLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel luvLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel sadLabel;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel supLabel;
    private javax.swing.JLabel tngLabel;
    private javax.swing.JTextArea userListTextArea;
    private javax.swing.JLabel ywnLabel;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        userListTextArea.setLineWrap(true);     // to remove horizontal scrolling bar 
        setTitle("Public Chat");  
        setImages();
        addListeners();      
        this.nameLabel.setText(username);
        this.setVisible(true);
        setLocationRelativeTo(null);            // to visible the GUI in the middle of the screen
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    refresh();                  // this thread is used to refresh the chat window by every second 
                    try {                       // to display whole chat list
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        t1.start();
    }

    public void displayChatList() throws RemoteException {
        chatListTextArea.setText("");
        msgs = chat.getAllMessages();
        String doc = "<html><body><table>";
        for (Message m : msgs) {
            if (!((m.getUsername().equals(username)) && (m.getType().equals("join")))) {             
                String smileyName = m.getSmiley();               
                Date date = m.getDate();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String a = dateFormat.format(date);
                SimpleDateFormat parseFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                SimpleDateFormat printFormat = new SimpleDateFormat("HH:mm:ss");
                try {
                    Date time = parseFormat.parse(a);
                    if (smileyName == null) {
                        doc += "<tr><td>" 
                                + printFormat.format(time) 
                                + "</td><td><font color='rgb(55,178,204)'><b>" 
                                + m.getUsername() 
                                + "</b></font></td><td> " 
                                + m.getMsg() 
                                + "</td></tr>";
                    } else {                  
                        doc += "<tr><td>" 
                                + printFormat.format(time) 
                                + "</td><td><font color='rgb(55,178,204)'><b>" 
                                + m.getUsername()  
                                + "</b></font></td><td><img src= '" 
                                + this.getClass().getResource("/images/"+smileyName) 
                                + "' width=50 height=50 /> </td></tr>";
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
                }                        
            }
        }
        doc += "</table></body></html>";
        chatListTextArea.setText(doc);
    }

    private void displayUserList() throws RemoteException {
        userListTextArea.setText("");
        users = chat.getAllUsers();
        for (String u : users) {
            if (!u.equals(username)) {             
                userListTextArea.append(" " + u + "\n");             
            }
        }
    }

    public void refresh() {
        try {
            displayChatList();
            displayUserList();
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setImages() {
        ImageIcon icons[] = new ImageIcon[10];
        for (int i = 0; i < 10; i++) {
            icons[i] = new ImageIcon(getClass().getResource("/images/" + i + ".png"));
        }
        hpyLabel.setIcon(icons[0]);
        lghLabel.setIcon(icons[1]);
        sadLabel.setIcon(icons[2]);
        supLabel.setIcon(icons[3]);
        tngLabel.setIcon(icons[4]);
        angLabel.setIcon(icons[5]);
        glsLabel.setIcon(icons[6]);
        ywnLabel.setIcon(icons[7]);
        kisLabel.setIcon(icons[8]);
        luvLabel.setIcon(icons[9]);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Message message = new Message();
        message.setUsername(username);
        message.setType("client");
        message.setDate(new Date());
        if (e.getSource() == hpyLabel) {
            message.setSmiley("0.png");
        } else if (e.getSource() == lghLabel) {
            message.setSmiley("1.png");
        } else if (e.getSource() == sadLabel) {
            message.setSmiley("2.png");
        } else if (e.getSource() == supLabel) {
            message.setSmiley("3.png");
        } else if (e.getSource() == tngLabel) {
            message.setSmiley("4.png");
        } else if (e.getSource() == angLabel) {
            message.setSmiley("5.png");
        } else if (e.getSource() == glsLabel) {
            message.setSmiley("6.png");
        } else if (e.getSource() == ywnLabel) {
            message.setSmiley("7.png");
        } else if (e.getSource() == kisLabel) {
            message.setSmiley("8.png");
        } else if (e.getSource() == luvLabel) {
            message.setSmiley("9.png");
        }
        try {
            chat.sendMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void addListeners() {
         hpyLabel.addMouseListener(this);
         lghLabel.addMouseListener(this);
         sadLabel.addMouseListener(this);
         supLabel.addMouseListener(this);
         tngLabel.addMouseListener(this);
         angLabel.addMouseListener(this);
         glsLabel.addMouseListener(this);
         ywnLabel.addMouseListener(this);
         kisLabel.addMouseListener(this);
         luvLabel.addMouseListener(this);
         chatInputText.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            sendNewMessage();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void sendNewMessage() {
        String inputMessage = chatInputText.getText();
        chatInputText.setText("");
        Message message = new Message();
        message.setUsername(username);
        message.setMsg(inputMessage);
        message.setType("client");
        message.setDate(new Date());
        try {
            chat.sendMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
