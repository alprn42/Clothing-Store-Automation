package magazamodul;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import magazamodul.Storemodule;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class adminpanel extends javax.swing.JFrame {
	Storemodule mmd = new Storemodule();
	DefaultTableModel model;

	public adminpanel() {
		initComponents();
		setLocationRelativeTo(null);
		addpositioncmb();
		adddepartmentcmb();
		addstorecmb();
		addpersonnellcmb();
		addcategorycmb();
		addcolorcmb();
		addpatterncmb();
		addbrandcmb();
		addsizecmb();
		addtypecmb();
		listusers();
		liststores();
		listpositions();
		listdepartments();
		listproducts();
		listpersonnells();
		updatecategory();
	}

	public void addpositioncmb() {

		for (String a : mmd.getposition()) {

			comboposition.addItem(a);
		}

	}

	public void adddepartmentcmb() {
		for (String a : mmd.getdepartment()) {
			combodept.addItem(a);
			jComboBox5.addItem(a);
		}
	}

	public void addstorecmb() {
		for (String a : mmd.getstore()) {
			combostore.addItem(a);
			jComboBox8.addItem(a);
			// jComboBox6.addItem(a);
		}
	}

	public void addpersonnellcmb() {
		for (String a : mmd.getpersonnel()) {
			jComboBox4.addItem(a);
			// jComboBox7.addItem(a);
		}
	}

	public void addcategorycmb() {
		for (String a : mmd.getcategory()) {
			jComboBox9.addItem(a);
			jComboBox15.addItem(a);
		}
	}

	public void addcolorcmb() {
		for (String a : mmd.getcolor()) {
			jComboBox10.addItem(a);
			jComboBox17.addItem(a);
		}
	}

	public void addpatterncmb() {
		for (String a : mmd.getpattern()) {
			jComboBox11.addItem(a);
			jComboBox16.addItem(a);
		}
	}

	public void addbrandcmb() {
		for (String a : mmd.getbrand()) {
			jComboBox12.addItem(a);
			jComboBox18.addItem(a);
		}
	}

	public void addsizecmb() {
		for (String a : mmd.getsize()) {
			jComboBox13.addItem(a);
			jComboBox19.addItem(a);
		}
	}

	public void addtypecmb() {
		for (String a : mmd.gettype()) {
			jComboBox14.addItem(a);
			jComboBox20.addItem(a);
		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		jPanel15 = new javax.swing.JPanel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jTextField12 = new javax.swing.JTextField();
		jComboBox5 = new javax.swing.JComboBox<>();
		jTextField13 = new javax.swing.JTextField();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton8 = new javax.swing.JButton();
		jPanel16 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jTextField14 = new javax.swing.JTextField();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jPanel17 = new javax.swing.JPanel();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jPanel4 = new javax.swing.JPanel();
		jLabel26 = new javax.swing.JLabel();
		jPanel18 = new javax.swing.JPanel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jTextField15 = new javax.swing.JTextField();
		jTextField16 = new javax.swing.JTextField();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jPanel19 = new javax.swing.JPanel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jTextField17 = new javax.swing.JTextField();
		jTextField18 = new javax.swing.JTextField();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jPanel20 = new javax.swing.JPanel();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jPanel31 = new javax.swing.JPanel();
		jScrollPane11 = new javax.swing.JScrollPane();
		jTable9 = new javax.swing.JTable();
		jButton33 = new javax.swing.JButton();
		jButton34 = new javax.swing.JButton();
		jPanel7 = new javax.swing.JPanel();
		jPanel25 = new javax.swing.JPanel();
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
		jLabel44 = new javax.swing.JLabel();
		jTextField19 = new javax.swing.JTextField();
		jTextField20 = new javax.swing.JTextField();
		jTextField21 = new javax.swing.JTextField();
		jTextField22 = new javax.swing.JTextField();
		jComboBox8 = new javax.swing.JComboBox<>();
		jComboBox9 = new javax.swing.JComboBox<>();
		jComboBox10 = new javax.swing.JComboBox<>();
		jComboBox11 = new javax.swing.JComboBox<>();
		jComboBox12 = new javax.swing.JComboBox<>();
		jComboBox13 = new javax.swing.JComboBox<>();
		jComboBox14 = new javax.swing.JComboBox<>();
		jButton17 = new javax.swing.JButton();
		jLabel45 = new javax.swing.JLabel();
		jPanel26 = new javax.swing.JPanel();
		jLabel47 = new javax.swing.JLabel();
		jTextField23 = new javax.swing.JTextField();
		jButton18 = new javax.swing.JButton();
		jLabel46 = new javax.swing.JLabel();
		jPanel27 = new javax.swing.JPanel();
		jScrollPane9 = new javax.swing.JScrollPane();
		jTable7 = new javax.swing.JTable();
		jButton19 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		txtperad = new javax.swing.JTextField();
		txtpersoyad = new javax.swing.JTextField();
		comboposition = new javax.swing.JComboBox<>();
		combodept = new javax.swing.JComboBox<>();
		combostore = new javax.swing.JComboBox<>();
		txttel = new javax.swing.JTextField();
		txtmaas = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtadres = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel10 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jPanel11 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton4 = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		jPanel28 = new javax.swing.JPanel();
		jLabel49 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jTextField24 = new javax.swing.JTextField();
		jTextField25 = new javax.swing.JTextField();
		jTextField26 = new javax.swing.JTextField();
		jTextField27 = new javax.swing.JTextField();
		jTextField28 = new javax.swing.JTextField();
		jTextField29 = new javax.swing.JTextField();
		jButton20 = new javax.swing.JButton();
		jButton21 = new javax.swing.JButton();
		jButton22 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jPanel29 = new javax.swing.JPanel();
		jLabel55 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		jLabel57 = new javax.swing.JLabel();
		jLabel58 = new javax.swing.JLabel();
		jLabel59 = new javax.swing.JLabel();
		jLabel60 = new javax.swing.JLabel();
		jButton26 = new javax.swing.JButton();
		jButton27 = new javax.swing.JButton();
		jButton28 = new javax.swing.JButton();
		jButton29 = new javax.swing.JButton();
		jButton30 = new javax.swing.JButton();
		jButton31 = new javax.swing.JButton();
		jComboBox15 = new javax.swing.JComboBox<>();
		jComboBox16 = new javax.swing.JComboBox<>();
		jComboBox17 = new javax.swing.JComboBox<>();
		jComboBox18 = new javax.swing.JComboBox<>();
		jComboBox19 = new javax.swing.JComboBox<>();
		jComboBox20 = new javax.swing.JComboBox<>();
		jButton32 = new javax.swing.JButton();
		jPanel30 = new javax.swing.JPanel();
		jScrollPane10 = new javax.swing.JScrollPane();
		jTable8 = new javax.swing.JTable();
		jButton35 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        if (jTable2.getColumnModel().getColumnCount() > 0) {
//            jTable2.getColumnModel().getColumn(0).setResizable(false);
//        }

		jPanel15.setBackground(new java.awt.Color(0, 255, 255));

		jLabel19.setText("BRANCH NAME");

		jLabel20.setText("DEPARTMENT");

		jLabel21.setText("CITY");

		jLabel22.setText("PHONE NUMBER");

		jLabel23.setText("ADDRESS");

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane4.setViewportView(jTextArea2);

		jButton8.setText("ADD STORE");

		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		jPanel15.setLayout(jPanel15Layout);
		jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel15Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel15Layout.createSequentialGroup()
								.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel21).addComponent(jLabel23).addComponent(jLabel22))
								.addGap(38, 38, 38)
								.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel15Layout.createSequentialGroup().addComponent(jButton8)
												.addGap(0, 97, Short.MAX_VALUE))
										.addComponent(jTextField12).addComponent(jTextField13)
										.addComponent(jScrollPane4)))
						.addGroup(jPanel15Layout.createSequentialGroup()
								.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel20).addComponent(jLabel19))
								.addGap(18, 18, 18)
								.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField11).addComponent(jComboBox5, 0,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addContainerGap()));
		jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addGap(27, 27, 27)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel19)
								.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel20).addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel21)
								.addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel22)
								.addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel23).addComponent(jScrollPane4,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(37, 37, 37).addComponent(jButton8)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel16.setBackground(new java.awt.Color(0, 255, 255));

		jLabel24.setText("BRANCH NAME");

		jButton9.setText("SEARCH");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
		jPanel16.setLayout(jPanel16Layout);
		jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel16Layout.createSequentialGroup().addContainerGap(107, Short.MAX_VALUE)
						.addComponent(jLabel24).addGap(26, 26, 26)
						.addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 195,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(36, 36, 36).addComponent(jButton9).addGap(142, 142, 142)));
		jPanel16Layout
				.setVerticalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel16Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel16Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel24)
								.addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton9))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jButton10.setText("REMOVE");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jTable3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "BRANCH NAME", "PHONE NUMBER", "ADDRESS", "CITY" }));
		jScrollPane5.setViewportView(jTable3);
		if (jTable3.getColumnModel().getColumnCount() > 0) {
			jTable3.getColumnModel().getColumn(0).setMaxWidth(50);
		}

		javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
		jPanel17.setLayout(jPanel17Layout);
		jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel17Layout.createSequentialGroup().addContainerGap()
								.addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
								.addContainerGap()));
		jPanel17Layout.setVerticalGroup(
				jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane5,
						javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
				.createSequentialGroup().addGap(35)
				.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
						.createSequentialGroup().addGap(80)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(376).addComponent(jButton10))))
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(26).addComponent(jPanel17,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(240, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(52)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(56).addComponent(jButton10)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jPanel17,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(223, Short.MAX_VALUE)));
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("ADD/REMOVE STORE", jPanel3);

		jLabel26.setText("USE COMMA FOR MORE VALUES");

		jPanel18.setBackground(new java.awt.Color(0, 255, 255));

		jLabel27.setText("DEPARTMENT NAME");

		jLabel28.setText("POSITION NAME");

		jButton11.setText("ADD DEPARTMENT");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setText("ADD POSITION");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
		jPanel18.setLayout(jPanel18Layout);
		jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel27).addComponent(jLabel28))
						.addGap(18, 18, 18)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jTextField15)
								.addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel27)
								.addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton11))
						.addGap(18, 18, 18)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel28)
								.addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton12))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel19.setBackground(new java.awt.Color(0, 255, 255));

		jLabel29.setText("DEPARTMENT NAME");

		jLabel30.setText("POSITION NAME");

		jButton13.setText("SHOW");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setText("SHOW");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
		jPanel19.setLayout(jPanel19Layout);
		jPanel19Layout.setHorizontalGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel19Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel29).addComponent(jLabel30))
						.addGap(18, 18, 18)
						.addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jTextField17)
								.addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
						.addGap(34, 34, 34)
						.addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton13).addComponent(jButton14))
						.addContainerGap(36, Short.MAX_VALUE)));
		jPanel19Layout.setVerticalGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel19Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel29)
								.addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton13))
						.addGap(18, 18, 18)
						.addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel30)
								.addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton14))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jTable4.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "POSITION" }));
		jScrollPane6.setViewportView(jTable4);

		javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
		jPanel20.setLayout(jPanel20Layout);
		jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE));
		jPanel20Layout.setVerticalGroup(
				jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane6,
						javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE));

		jTable9.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "DEPARTMENT" }));
		jScrollPane11.setViewportView(jTable9);

		javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
		jPanel31.setLayout(jPanel31Layout);
		jPanel31Layout.setHorizontalGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE));
		jPanel31Layout.setVerticalGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

		jButton33.setText("REMOVE");
		jButton33.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton33ActionPerformed(evt);
			}
		});

		jButton34.setText("REMOVE");
		jButton34.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton34ActionPerformed(evt);
			}
		});
		jPanel2 = new javax.swing.JPanel();
		jPanel12 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jTextField9 = new javax.swing.JTextField();
		jComboBox4 = new javax.swing.JComboBox<>();
		jButton5 = new javax.swing.JButton();
		jPanel13 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jPanel14 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton7 = new javax.swing.JButton();

		jPanel12.setBackground(new java.awt.Color(0, 255, 255));

		jLabel13.setText("USER NAME");

		jLabel14.setText("PASSWORD");

		jLabel15.setText("AUTHORIZATION");

		jLabel16.setText("PERSONNEL ID:");

		jButton5.setText("ADD USER");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel12Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel13)
								.addComponent(jLabel14).addComponent(jLabel15).addComponent(jLabel16))
						.addGap(18, 18, 18)
						.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel12Layout.createSequentialGroup().addComponent(jButton5).addGap(0, 116,
										Short.MAX_VALUE))
								.addComponent(jTextField7).addComponent(jTextField8).addComponent(jTextField9)
								.addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14)
								.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel15)
								.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(36, 36, 36).addComponent(jButton5)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel13.setBackground(new java.awt.Color(0, 255, 255));

		jLabel17.setText("USER NAME");

		jButton6.setText("SEARCH");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel17)
						.addGap(43, 43, 43)
						.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 192,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(126, 126, 126))
				.addGroup(jPanel13Layout.createSequentialGroup().addGap(253, 253, 253).addComponent(jButton6)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel17))
						.addGap(26, 26, 26).addComponent(jButton6)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "USERNAME", "PASSWORD", "AUTHORIZATION" }));
		jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable2MouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jTable2);

		javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel14Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		jButton7.setText("REMOVE");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(33)
				.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(81)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jPanel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(536).addComponent(jButton7)))
				.addContainerGap(218, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(42)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(56).addComponent(jButton7).addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(169, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("ADD/REMOVE USER", jPanel2);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(38)
						.addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
						.addComponent(jPanel19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(35))
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(82).addComponent(jLabel26))
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(190)
										.addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(100).addComponent(jPanel31, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(310).addComponent(jButton33)
										.addGap(381).addComponent(jButton34)))
						.addContainerGap(369, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout
				.createSequentialGroup().addGap(46).addComponent(jLabel26).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jPanel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(68)
				.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jPanel31, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(18).addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(jButton33)
						.addComponent(jButton34))
				.addContainerGap(60, Short.MAX_VALUE)));
		jPanel4.setLayout(jPanel4Layout);

		jTabbedPane1.addTab("ADD/REMOVE DEPARTMENT and POSITION", jPanel4);
//        if (jTable5.getColumnModel().getColumnCount() > 0) {
//            jTable5.getColumnModel().getColumn(0).setMaxWidth(50);
//        }

		jPanel25.setBackground(new java.awt.Color(0, 255, 255));

		jLabel34.setText("BARCODE");

		jLabel35.setText("PRODUCT NAME");

		jLabel36.setText("PRODUCT PRICE");

		jLabel37.setText("PRODUCT NUMBER");

		jLabel38.setText("STORE");

		jLabel39.setText("CATEGORY");

		jLabel40.setText("COLOR");

		jLabel41.setText("PATTERN");

		jLabel42.setText("BRAND");

		jLabel43.setText("SIZE");

		jLabel44.setText("TYPE");

		jButton17.setText("ADD PRODUCT");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
		jPanel25Layout
				.setHorizontalGroup(
						jPanel25Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel25Layout
								.createSequentialGroup().addContainerGap().addGroup(jPanel25Layout
										.createParallelGroup(Alignment.TRAILING, false).addGroup(jPanel25Layout
												.createSequentialGroup()
												.addGroup(jPanel25Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jLabel34).addComponent(jLabel35))
												.addGap(36)
												.addGroup(jPanel25Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jTextField20, GroupLayout.PREFERRED_SIZE, 195,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jTextField19, GroupLayout.PREFERRED_SIZE, 195,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												jPanel25Layout
														.createSequentialGroup().addGroup(jPanel25Layout
																.createParallelGroup(Alignment.LEADING)
																.addComponent(jLabel36).addComponent(jLabel37)
																.addComponent(jLabel38).addComponent(jLabel39)
																.addComponent(jLabel40).addComponent(jLabel41)
																.addComponent(jLabel42).addComponent(jLabel43)
																.addComponent(jLabel44))
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(jPanel25Layout.createParallelGroup(Alignment.LEADING)
																.addComponent(jButton17)
																.addGroup(jPanel25Layout
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(jTextField21)
																		.addComponent(jTextField22)
																		.addComponent(jComboBox8, 0, 195,
																				Short.MAX_VALUE)
																		.addComponent(
																				jComboBox9, 0, GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jComboBox10, 0,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(jComboBox11, 0,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(jComboBox12, 0,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(jComboBox13, 0,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(jComboBox14, 0,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel25Layout.setVerticalGroup(jPanel25Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel25Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel34).addComponent(
						jTextField19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel35).addComponent(
						jTextField20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel36).addComponent(
						jTextField21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel37).addComponent(
						jTextField22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(36)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel38).addComponent(
						jComboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel39).addComponent(
						jComboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel40).addComponent(
						jComboBox10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel41).addComponent(
						jComboBox11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel42).addComponent(
						jComboBox12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel43).addComponent(
						jComboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel25Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel44).addComponent(
						jComboBox14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(34).addComponent(jButton17).addContainerGap(57, Short.MAX_VALUE)));
		jPanel25.setLayout(jPanel25Layout);

		jLabel45.setText("ADDING PRODUCT");

		jPanel26.setBackground(new java.awt.Color(0, 255, 255));

		jLabel47.setText("BARCODE");

		jButton18.setText("SEARCH PRODUCT");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
		jPanel26.setLayout(jPanel26Layout);
		jPanel26Layout.setHorizontalGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel26Layout.createSequentialGroup().addContainerGap().addComponent(jLabel47)
						.addGap(18, 18, 18)
						.addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 196,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jButton18)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel26Layout
				.setVerticalGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel26Layout.createSequentialGroup().addContainerGap().addGroup(jPanel26Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel47)
								.addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton18))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel46.setText("REMOVING PRODUCT");

		jTable7.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "PRODUCT ID", "PRODUCT NAME", "PRODUCT PRICE", "CATEGORY ID", "BARCODE" }));
		jScrollPane9.setViewportView(jTable7);

		javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
		jPanel27.setLayout(jPanel27Layout);
		jPanel27Layout.setHorizontalGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE));
		jPanel27Layout.setVerticalGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE));

		jButton19.setText("REMOVE");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7Layout
				.setHorizontalGroup(
						jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout
								.createSequentialGroup().addGroup(jPanel7Layout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel7Layout.createSequentialGroup().addGap(48)
												.addComponent(
														jPanel25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addGap(89)
												.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
														.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
																.addComponent(jPanel26, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(jPanel27, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel7Layout.createSequentialGroup()
																.addComponent(jButton19).addGap(268))))
										.addGroup(jPanel7Layout.createSequentialGroup().addGap(172)
												.addComponent(jLabel45).addGap(379).addComponent(jLabel46)))
								.addContainerGap(211, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel7Layout
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(jPanel7Layout
						.createParallelGroup(Alignment.BASELINE).addComponent(jLabel45).addComponent(jLabel46))
				.addGap(18)
				.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup()
								.addComponent(jPanel26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
								.addComponent(jPanel27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(jButton19).addGap(135))
						.addGroup(jPanel7Layout.createSequentialGroup()
								.addComponent(jPanel25, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))));
		jPanel7.setLayout(jPanel7Layout);

		jTabbedPane1.addTab("ADD/REMOVE PRODUCT", jPanel7);

		jPanel9.setBackground(new java.awt.Color(0, 255, 255));
		jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel1.setText("PERSONNEL NAME");

		jLabel2.setText("PERSONNEL SURNAME");

		jLabel3.setText("ENTRY DATE");

		jLabel4.setText("POSITION");

		jLabel5.setText("DEPARTMENT");

		jLabel6.setText("STORE");

		jLabel7.setText("PHONE");

		jLabel8.setText("SALARY");

		jLabel9.setText("ADDRESS");

		comboposition.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbmeslekActionPerformed(evt);
			}
		});

		txtadres.setColumns(20);
		txtadres.setRows(5);
		jScrollPane1.setViewportView(txtadres);

		jButton1.setText("ADD PERSONNEL");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(
				jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout
						.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3)
								.addGroup(jPanel9Layout
										.createSequentialGroup().addGroup(jPanel9Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1).addComponent(jLabel2).addComponent(
														jLabel4)
												.addComponent(
														jLabel5)
												.addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8)
												.addComponent(jLabel9))
										.addGap(32, 32, 32)
										.addGroup(jPanel9Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jButton1)
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtpersoyad)
														.addComponent(comboposition, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(combodept, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(combostore, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(txttel).addComponent(txtmaas)
														.addComponent(jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE, 196,
																Short.MAX_VALUE)
														.addComponent(txtperad)))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtperad, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtpersoyad, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jLabel3).addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(comboposition, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(combodept, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(combostore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(txtmaas, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel9).addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(47, 47, 47).addComponent(jButton1).addContainerGap(34, Short.MAX_VALUE)));

		jButton2.setText("SHOW PERSONNEL SCREEN");

		jPanel10.setBackground(new java.awt.Color(0, 255, 255));
		jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel10.setText("PERSONNEL NAME");

		jLabel11.setText("PERSONNEL SURNAME");

		jButton3.setText("SEARCH");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addGroup(jPanel10Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel10Layout.createSequentialGroup().addComponent(jLabel10).addGap(44, 44, 44)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 195,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel10Layout.createSequentialGroup().addComponent(jLabel11).addGap(18, 18, 18)
								.addComponent(jTextField6)))
						.addGap(18, 18, 18).addComponent(jButton3).addContainerGap(190, Short.MAX_VALUE)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11)
								.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "NAME", "SURNAME", "PHONE", "ADDRESS", "ENTRY DATE", "SALARY", "DEPARTMENT", "POSITION",
				"STORE" }));
		jScrollPane2.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(
				jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane2).addContainerGap()));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jButton4.setText("REMOVE");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(44)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(jButton2).addComponent(
						jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
						.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(495).addComponent(jButton4))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(36).addComponent(jPanel10,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 265, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)))
				.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(42)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jButton2))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jButton4).addGap(18).addComponent(jPanel11,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(71, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jTabbedPane1.addTab("ADD/REMOVE PERSONNEL", jPanel1);

		jPanel28.setBackground(new java.awt.Color(0, 255, 255));

		jLabel49.setText("CATEGORY NAME");

		jLabel50.setText("PATTERN");

		jLabel51.setText("COLOR");

		jLabel52.setText("BRAND");

		jLabel53.setText("SIZE");

		jLabel54.setText("TYPE");

		jButton20.setText("ADD");
		jButton20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});

		jButton21.setText("ADD");
		jButton21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton21ActionPerformed(evt);
			}
		});

		jButton22.setText("ADD");
		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});

		jButton23.setText("ADD");
		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});

		jButton24.setText("ADD");
		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		jButton25.setText("ADD");
		jButton25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton25ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
		jPanel28.setLayout(jPanel28Layout);
		jPanel28Layout.setHorizontalGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel28Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel49).addComponent(jLabel50).addComponent(jLabel51)
								.addComponent(jLabel52).addComponent(jLabel53).addComponent(jLabel54))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jTextField24).addComponent(jTextField25).addComponent(jTextField26)
								.addComponent(jTextField27).addComponent(jTextField28)
								.addComponent(jTextField29, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton20).addComponent(jButton21).addComponent(jButton22)
								.addComponent(jButton23).addComponent(jButton24).addComponent(jButton25))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel28Layout.setVerticalGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel28Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel49)
								.addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton20))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel50)
								.addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton21))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel51)
								.addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton22))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel52)
								.addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton23))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel53)
								.addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton25))
						.addGap(18, 18, 18)
						.addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel54)
								.addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton24))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel29.setBackground(new java.awt.Color(0, 255, 255));

		jLabel55.setText("CATEGORY NAME");

		jLabel56.setText("PATTERN");

		jLabel57.setText("COLOR");

		jLabel58.setText("BRAND");

		jLabel59.setText("SIZE");

		jLabel60.setText("TYPE");

		jButton26.setText("REMOVE");
		jButton26.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton26ActionPerformed(evt);
			}
		});

		jButton27.setText("REMOVE");
		jButton27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton27ActionPerformed(evt);
			}
		});

		jButton28.setText("REMOVE");
		jButton28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton28ActionPerformed(evt);
			}
		});

		jButton29.setText("REMOVE");
		jButton29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton29ActionPerformed(evt);
			}
		});

		jButton30.setText("REMOVE");
		jButton30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton30ActionPerformed(evt);
			}
		});

		jButton31.setText("REMOVE");
		jButton31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton31ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
		jPanel29.setLayout(jPanel29Layout);
		jPanel29Layout.setHorizontalGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel29Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel55).addComponent(jLabel56).addComponent(jLabel57)
								.addComponent(jLabel58).addComponent(jLabel59).addComponent(jLabel60))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jComboBox15, 0, 196, Short.MAX_VALUE)
								.addComponent(jComboBox16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jComboBox17, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jComboBox18, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jComboBox19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jComboBox20, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton26).addComponent(jButton27).addComponent(jButton28)
								.addComponent(jButton29).addComponent(jButton30).addComponent(jButton31))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel29Layout.setVerticalGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel29Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel55).addComponent(jButton26)
								.addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel56).addComponent(jButton27)
								.addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel57).addComponent(jButton28)
								.addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel58).addComponent(jButton29)
								.addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel59).addComponent(jButton31)
								.addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel60).addComponent(jButton30).addComponent(jComboBox20,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jButton32.setText("SHOW/UPDATE CATEGORY ");
		jButton32.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton32ActionPerformed(evt);
			}
		});

		jTable8.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "CATEGORY ID", "CATEGORY NAME", "SIZE", "BRAND", "PATTERN", "COLOR", "TYPE" }));
		jScrollPane10.setViewportView(jTable8);

		javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
		jPanel30.setLayout(jPanel30Layout);
		jPanel30Layout.setHorizontalGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE));
		jPanel30Layout.setVerticalGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE));

		jButton35.setText("REMOVE");
		jButton35.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton35ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(86, 86, 86).addComponent(jButton32)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
						.addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(81, 81, 81))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel8Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(204, 204, 204))
				.addGroup(jPanel8Layout.createSequentialGroup().addGap(631, 631, 631).addComponent(jButton35)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel8Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel8Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel8Layout.createSequentialGroup().addGap(120, 120, 120).addComponent(jButton32)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
						.addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton35)
						.addGap(24, 24, 24)));

		jTabbedPane1.addTab("ADD/REMOVE CATEGORY", jPanel8);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(27, 27, 27)
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1338,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	private void cmbmeslekActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = txtperad.getText();
		String surname = txtpersoyad.getText();
		String position = comboposition.getSelectedItem().toString();
		String department = combodept.getSelectedItem().toString();
		String store = combostore.getSelectedItem().toString();
		String phone = txttel.getText().toString();
		String salary = txtmaas.getText().toString();
		String address = txtadres.getText().toString();
		mmd.addpersonnel(name, surname, position, department, store, phone, salary, address);

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField7.getText();
		String password = jTextField8.getText();
		String aut = jTextField9.getText();
		String personnell = jComboBox4.getSelectedItem().toString();
		mmd.adduser(name, password, aut, personnell);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField11.getText();
		String department = jComboBox5.getSelectedItem().toString();
		String city = jTextField12.getText();
		String phone = jTextField13.getText();
		String address = jTextArea2.getText();
		mmd.addstore(name, department, city, phone, address);
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String ad = jTextField15.getText();
		mmd.adddepartment(ad);
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField16.getText();
		mmd.addposition(name);
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String barcode = jTextField19.getText();
		String name = jTextField20.getText();
		String price = jTextField21.getText();
		String category = jComboBox9.getSelectedItem().toString();
		String stocknumber = jTextField22.getText();
		String store = jComboBox8.getSelectedItem().toString();
//        String customer=textField111.getText();
		mmd.addproduct(name, barcode, price, category);
		mmd.addstock(stocknumber, name, store);
	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField24.getText();
		mmd.addcategory(name);
	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField25.getText();
		mmd.addpattern(name);
	}

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField26.getText();
		mmd.addcolor(name);
	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField27.getText();
		mmd.addbrand(name);
	}

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField28.getText();
		mmd.addsize(name);
	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField29.getText();
		mmd.addtype(name);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		listsearchuser();
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		listsearchbranch();
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		listsearchdepr();
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		listsearchposition();
	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		listsearchproduct();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		listsearchperr();
	}

	private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:

	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable2.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removeuser(id);
		listusers();
		JOptionPane.showMessageDialog(null, "user deleted");
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable3.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removestore(id);
		liststores();
		JOptionPane.showMessageDialog(null, "store deleted");
	}

	private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable4.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removeposition(id);
		listpositions();
		JOptionPane.showMessageDialog(null, "position deleted");
	}

	private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable9.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removedep(id);
		listsearchdepr();
		JOptionPane.showMessageDialog(null, "department deleted");
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable7.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removestock(id);
		mmd.removeproduct(id);

		listproducts();
		JOptionPane.showMessageDialog(null, "product deleted");
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable1.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removeper(id);
		listpersonnells();
		JOptionPane.showMessageDialog(null, "personnel deleted");
	}

	private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jComboBox15.getSelectedItem().toString();
		mmd.removecatname(name);
		JOptionPane.showMessageDialog(null, "category deleted");
		jComboBox15.removeAllItems();
		addcategorycmb();

	}

	private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		updatecategory();
	}

	private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jComboBox16.getSelectedItem().toString();
		mmd.removepattern(name);
		JOptionPane.showMessageDialog(null, "pattern deleted");
		jComboBox16.removeAllItems();
		addpatterncmb();
	}

	private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jComboBox17.getSelectedItem().toString();
		mmd.removecolor(name);
		JOptionPane.showMessageDialog(null, "color deleted");
		jComboBox17.removeAllItems();
		addcolorcmb();
	}

	private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jComboBox18.getSelectedItem().toString();
		mmd.removebrand(name);
		JOptionPane.showMessageDialog(null, "brand deleted");
		jComboBox18.removeAllItems();
		addbrandcmb();
	}

	private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jComboBox19.getSelectedItem().toString();
		mmd.removesize(name);
		JOptionPane.showMessageDialog(null, "size deleted");
		jComboBox19.removeAllItems();
		addsizecmb();
	}

	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jComboBox20.getSelectedItem().toString();
		mmd.removetype(name);
		JOptionPane.showMessageDialog(null, "type deleted");
		jComboBox20.removeAllItems();
		addtypecmb();
	}

	private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selected = jTable8.getSelectedRow();
		String id = model.getValueAt(selected, 0).toString();
		mmd.removecategory(id);
		updatecategory();
		JOptionPane.showMessageDialog(null, "selected category deleted");
	}

	public void listsearchperr() {
		model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		String name = jTextField5.getText();
		String surname = jTextField6.getText();
		ArrayList<String> a = new ArrayList<>();
		a = mmd.searchper(name, surname);
		if (a != null) {
			for (int i = 0; i < a.size(); i += 10) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4), a.get(i + 5),
						a.get(i + 6), a.get(i + 7), a.get(i + 8), a.get(i + 9) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listsearchproduct() {
		model = (DefaultTableModel) jTable7.getModel();
		model.setRowCount(0);
		String name = jTextField23.getText();
		ArrayList<String> a = new ArrayList<>();
		a = mmd.searchproduct(name);
		if (a != null) {
			for (int i = 0; i < a.size(); i += 5) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listsearchdepr() {
		model = (DefaultTableModel) jTable9.getModel();
		model.setRowCount(0);
		String name = jTextField17.getText();
		ArrayList<String> a = new ArrayList<>();
		a = mmd.deparama(name);
		if (a != null) {
			for (int i = 0; i < a.size(); i += 2) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listsearchposition() {
		model = (DefaultTableModel) jTable4.getModel();
		model.setRowCount(0);
		String name = jTextField18.getText();
		ArrayList<String> a = new ArrayList<>();
		a = mmd.mesarama(name);
		if (a != null) {
			for (int i = 0; i < a.size(); i += 2) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listsearchuser() {
		model = (DefaultTableModel) jTable2.getModel();
		model.setRowCount(0);
		String name = jTextField10.getText();
		ArrayList<String> a = new ArrayList<>();
		a = mmd.searchuser(name);
		if (a != null) {
			for (int i = 0; i < a.size(); i += 4) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listsearchbranch() {
		model = (DefaultTableModel) jTable3.getModel();
		model.setRowCount(0);
		String name = jTextField14.getText();
		ArrayList<String> a = new ArrayList<>();
		a = mmd.searchbranch(name);
		if (a != null) {
			for (int i = 0; i < a.size(); i += 5) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listusers() {
		model = (DefaultTableModel) jTable2.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.getuser();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 4) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3) };
				model.addRow(add);

				// }

			}

		}
	}

	public void liststores() {
		model = (DefaultTableModel) jTable3.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.listgetstore();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 5) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listpositions() {
		model = (DefaultTableModel) jTable4.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.listgetposition();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 2) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listdepartments() {
		model = (DefaultTableModel) jTable9.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.listgetdepartment();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 2) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listproducts() {
		model = (DefaultTableModel) jTable7.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.getproduct();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 5) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4) };
				model.addRow(add);

				// }

			}

		}
	}

	public void listpersonnells() {
		model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.listgetpersonnel();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 10) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4), a.get(i + 5),
						a.get(i + 6), a.get(i + 7), a.get(i + 8), a.get(i + 9) };
				model.addRow(add);

				// }

			}

		}
	}

	public void updatecategory() {
		model = (DefaultTableModel) jTable8.getModel();
		model.setRowCount(0);
		ArrayList<String> a = new ArrayList<>();
		a = mmd.listgetcategory();
		if (a != null) {
			for (int i = 0; i < a.size(); i += 7) {
				// for(int j=0; j<4; j++){
				Object[] add = { a.get(i), a.get(i + 1), a.get(i + 2), a.get(i + 3), a.get(i + 4), a.get(i + 5),
						a.get(i + 6) };
				model.addRow(add);

				// }

			}

		}
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
			java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new adminpanel().setVisible(true);
			}
		});
	}

	private javax.swing.JComboBox<String> combodept;
	private javax.swing.JComboBox<String> combostore;
	private javax.swing.JComboBox<String> comboposition;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton26;
	private javax.swing.JButton jButton27;
	private javax.swing.JButton jButton28;
	private javax.swing.JButton jButton29;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private javax.swing.JButton jButton32;
	private javax.swing.JButton jButton33;
	private javax.swing.JButton jButton34;
	private javax.swing.JButton jButton35;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JComboBox<String> jComboBox10;
	private javax.swing.JComboBox<String> jComboBox11;
	private javax.swing.JComboBox<String> jComboBox12;
	private javax.swing.JComboBox<String> jComboBox13;
	private javax.swing.JComboBox<String> jComboBox14;
	private javax.swing.JComboBox<String> jComboBox15;
	private javax.swing.JComboBox<String> jComboBox16;
	private javax.swing.JComboBox<String> jComboBox17;
	private javax.swing.JComboBox<String> jComboBox18;
	private javax.swing.JComboBox<String> jComboBox19;
	private javax.swing.JComboBox<String> jComboBox20;
	private javax.swing.JComboBox<String> jComboBox4;
	private javax.swing.JComboBox<String> jComboBox5;
	private javax.swing.JComboBox<String> jComboBox8;
	private javax.swing.JComboBox<String> jComboBox9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
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
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel16;
	private javax.swing.JPanel jPanel17;
	private javax.swing.JPanel jPanel18;
	private javax.swing.JPanel jPanel19;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel20;
	private javax.swing.JPanel jPanel25;
	private javax.swing.JPanel jPanel26;
	private javax.swing.JPanel jPanel27;
	private javax.swing.JPanel jPanel28;
	private javax.swing.JPanel jPanel29;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel30;
	private javax.swing.JPanel jPanel31;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane10;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable7;
	private javax.swing.JTable jTable8;
	private javax.swing.JTable jTable9;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField15;
	private javax.swing.JTextField jTextField16;
	private javax.swing.JTextField jTextField17;
	private javax.swing.JTextField jTextField18;
	private javax.swing.JTextField jTextField19;
	private javax.swing.JTextField jTextField20;
	private javax.swing.JTextField jTextField21;
	private javax.swing.JTextField jTextField22;
	private javax.swing.JTextField jTextField23;
	private javax.swing.JTextField jTextField24;
	private javax.swing.JTextField jTextField25;
	private javax.swing.JTextField jTextField26;
	private javax.swing.JTextField jTextField27;
	private javax.swing.JTextField jTextField28;
	private javax.swing.JTextField jTextField29;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JTextArea txtadres;
	private javax.swing.JTextField txtmaas;
	private javax.swing.JTextField txtperad;
	private javax.swing.JTextField txtpersoyad;
	private javax.swing.JTextField txttel;
}
