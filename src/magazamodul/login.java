package magazamodul;

import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

	
	public login() {
		initComponents();
	}


	@SuppressWarnings("unchecked")
	
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtKadi = new javax.swing.JTextField();
		txtpass = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setType(java.awt.Window.Type.UTILITY);
		addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				formKeyReleased(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(51, 204, 255));

		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login-256.png"))); // NOI18N

		jLabel4.setText("LOG IN");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(102, 102, 102).addComponent(jLabel5)
						.addContainerGap(87, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4).addGap(205, 205, 205)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(jLabel5)
						.addGap(18, 18, 18).addComponent(jLabel4).addContainerGap(186, Short.MAX_VALUE)));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel1.setText("USER NAME");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setText("PASSWORD");

		txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				txtpassKeyReleased(evt);
			}
		});

		jButton1.setText("LOG IN");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("x");
		jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel3MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout
						.createSequentialGroup().addContainerGap().addComponent(jLabel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(13, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel3).addContainerGap()));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(40, 40, 40)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1).addComponent(jLabel2))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton1)
								.addComponent(txtKadi, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
								.addComponent(txtpass))
						.addContainerGap(183, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(138, 138, 138)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtKadi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel2).addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24).addComponent(jButton1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String usernamecheck = txtKadi.getText();
		String kpass = new String(txtpass.getPassword());
		Storemodule mmdl = new Storemodule();
		adminpanel admpnl = new adminpanel();
		boolean ENTER = mmdl.log(usernamecheck, kpass);
		int aut = mmdl.aut;
		if (ENTER == true) {
			userpanel upnl = new userpanel(this, true);
			if (aut == 1) {
				System.out.println("Since authorization 1 adminpanel connected.");
				setVisible(false);
				admpnl.setVisible(true);
				// System.exit(0);

			} else if (aut == 2) {
				System.out.println("Since authorization 2 userpanel connected.");
				setVisible(false);
				upnl.setVisible(true);
				// System.exit(0);
			}

		} else
			JOptionPane.showMessageDialog(rootPane, "Wrong password or username");
	}

	private void formKeyReleased(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
		if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
			String kadi = txtKadi.getText();
			String kpass = new String(txtpass.getPassword());
			Storemodule mmdl = new Storemodule();
			adminpanel admpnl = new adminpanel();
			boolean enter = mmdl.log(kadi, kpass);
			int aut = mmdl.aut;
			if (enter == true) {
				userpanel upnl = new userpanel(this, true);
				if (aut == 1) {
					System.out.println("Since authorization 1 adminpanel connected.");
					setVisible(false);
					admpnl.setVisible(true);
					// System.exit(0);

				} else if (aut == 2) {
					System.out.println("Since authorization 2 userpanel connected.");
					setVisible(false);
					upnl.setVisible(true);
					// System.exit(0);
				}

			} else
				JOptionPane.showMessageDialog(rootPane, "Wrong password or username");
		}
	}

	private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}

	
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new login().setVisible(true);
			}
		});
	}

	// Variables declaration 
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	public javax.swing.JTextField txtKadi;
	private javax.swing.JPasswordField txtpass;
	
}
