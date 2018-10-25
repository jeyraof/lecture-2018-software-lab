import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class BusinessPartner extends JFrame {
	private JPanel contentPane;
	private JTextField txtC;
	private JTextField txtNormThompson;
	private JTextField textField;
	private JTextField txtUs;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_11;
	private JTextField txtNormThompson_1;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField txtPaulMayers;
	private JTextField textField_14;
	private JTextField txtProcurementManager;
	private JTextField textField_20;
	private JTextField txtPmthompsoncom;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField txtBillTomainAddress;
	private JTextField txtBillingsDrive;
	private JTextField txtSuite;
	private JTextField txtHavertown;
	private JTextField textField_24;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTable table;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				BusinessPartner frame = new BusinessPartner();
				
				//
				QueryExecuter executer = new QueryExecuter(false);
				ResultSet result = executer.execute("SELECT * FROM C_BPARTNER WHERE C_BPARTNER_ID=118");
				try {
					if (result.next()) {
						frame.applyResultToForm(result);
					}					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
//				try {
//					System.out.println(result.getString(2));					
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
				
				
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BusinessPartner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 1038);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 82, 116, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 1;
		gbc_verticalStrut_3.gridy = 0;
		contentPane.add(verticalStrut_3, gbc_verticalStrut_3);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_9 = new GridBagConstraints();
		gbc_horizontalStrut_9.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_9.gridx = 0;
		gbc_horizontalStrut_9.gridy = 1;
		contentPane.add(horizontalStrut_9, gbc_horizontalStrut_9);
		
		JLabel lblCode = new JLabel("Code");
		GridBagConstraints gbc_lblCode = new GridBagConstraints();
		gbc_lblCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCode.anchor = GridBagConstraints.WEST;
		gbc_lblCode.gridx = 1;
		gbc_lblCode.gridy = 1;
		contentPane.add(lblCode, gbc_lblCode);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_8 = new GridBagConstraints();
		gbc_horizontalStrut_8.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_8.gridx = 2;
		gbc_horizontalStrut_8.gridy = 1;
		contentPane.add(horizontalStrut_8, gbc_horizontalStrut_8);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setEnabled(false);
		txtC.setText("C20000");
		GridBagConstraints gbc_txtC = new GridBagConstraints();
		gbc_txtC.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtC.insets = new Insets(0, 0, 5, 5);
		gbc_txtC.gridx = 3;
		gbc_txtC.gridy = 1;
		contentPane.add(txtC, gbc_txtC);
		txtC.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Lead", "Vendor"}));
		comboBox.setSelectedIndex(1);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Local Currency", "System Currency"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 12;
		gbc_comboBox_3.gridy = 1;
		contentPane.add(comboBox_3, gbc_comboBox_3);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 2;
		contentPane.add(lblName, gbc_lblName);
		
		txtNormThompson = new JTextField();
		txtNormThompson.setText("Norm Thompson");
		GridBagConstraints gbc_txtNormThompson = new GridBagConstraints();
		gbc_txtNormThompson.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNormThompson.gridwidth = 2;
		gbc_txtNormThompson.insets = new Insets(0, 0, 5, 5);
		gbc_txtNormThompson.gridx = 3;
		gbc_txtNormThompson.gridy = 2;
		contentPane.add(txtNormThompson, gbc_txtNormThompson);
		txtNormThompson.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 5;
		gbc_horizontalStrut.gridy = 2;
		contentPane.add(horizontalStrut, gbc_horizontalStrut);
		
		JLabel lblAccountBalance = new JLabel("Account Balance");
		GridBagConstraints gbc_lblAccountBalance = new GridBagConstraints();
		gbc_lblAccountBalance.anchor = GridBagConstraints.WEST;
		gbc_lblAccountBalance.insets = new Insets(0, 0, 5, 5);
		gbc_lblAccountBalance.gridx = 6;
		gbc_lblAccountBalance.gridy = 2;
		contentPane.add(lblAccountBalance, gbc_lblAccountBalance);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_3.gridx = 7;
		gbc_horizontalStrut_3.gridy = 2;
		contentPane.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5.gridx = 9;
		gbc_horizontalStrut_5.gridy = 2;
		contentPane.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		JButton button_3 = new JButton("\u2192");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 11;
		gbc_button_3.gridy = 2;
		contentPane.add(button_3, gbc_button_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText("19,598.60");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 12;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton button_4 = new JButton("\uD83D\uDCCA");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 13;
		gbc_button_4.gridy = 2;
		contentPane.add(button_4, gbc_button_4);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_10 = new GridBagConstraints();
		gbc_horizontalStrut_10.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_10.gridx = 14;
		gbc_horizontalStrut_10.gridy = 2;
		contentPane.add(horizontalStrut_10, gbc_horizontalStrut_10);
		
		JLabel lblForeignName = new JLabel("Foreign Name");
		GridBagConstraints gbc_lblForeignName = new GridBagConstraints();
		gbc_lblForeignName.insets = new Insets(0, 0, 5, 5);
		gbc_lblForeignName.anchor = GridBagConstraints.WEST;
		gbc_lblForeignName.gridx = 1;
		gbc_lblForeignName.gridy = 3;
		contentPane.add(lblForeignName, gbc_lblForeignName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblDeliveries = new JLabel("Deliveries");
		GridBagConstraints gbc_lblDeliveries = new GridBagConstraints();
		gbc_lblDeliveries.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeliveries.anchor = GridBagConstraints.WEST;
		gbc_lblDeliveries.gridx = 6;
		gbc_lblDeliveries.gridy = 3;
		contentPane.add(lblDeliveries, gbc_lblDeliveries);
		
		JButton button = new JButton("\u2192");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 11;
		gbc_button.gridy = 3;
		contentPane.add(button, gbc_button);
		
		textField_2 = new JTextField();
		textField_2.setText("-328.50");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 12;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		
		JButton button_5 = new JButton("\uD83D\uDCCA");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 13;
		gbc_button_5.gridy = 3;
		contentPane.add(button_5, gbc_button_5);
		
		JLabel lblGroup = new JLabel("Group");
		GridBagConstraints gbc_lblGroup = new GridBagConstraints();
		gbc_lblGroup.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroup.anchor = GridBagConstraints.WEST;
		gbc_lblGroup.gridx = 1;
		gbc_lblGroup.gridy = 4;
		contentPane.add(lblGroup, gbc_lblGroup);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Construction", "Group1", "Group2"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 2;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 4;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblAccountOrdersbalance = new JLabel("Orders");
		GridBagConstraints gbc_lblAccountOrdersbalance = new GridBagConstraints();
		gbc_lblAccountOrdersbalance.insets = new Insets(0, 0, 5, 5);
		gbc_lblAccountOrdersbalance.anchor = GridBagConstraints.WEST;
		gbc_lblAccountOrdersbalance.gridx = 6;
		gbc_lblAccountOrdersbalance.gridy = 4;
		contentPane.add(lblAccountOrdersbalance, gbc_lblAccountOrdersbalance);
		
		JButton button_1 = new JButton("\u2192");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 11;
		gbc_button_1.gridy = 4;
		contentPane.add(button_1, gbc_button_1);
		
		textField_3 = new JTextField();
		textField_3.setText("2,195.00");
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 12;
		gbc_textField_3.gridy = 4;
		contentPane.add(textField_3, gbc_textField_3);
		
		JButton button_6 = new JButton("\uD83D\uDCCA");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 13;
		gbc_button_6.gridy = 4;
		contentPane.add(button_6, gbc_button_6);
		
		JLabel lblCurrency = new JLabel("Currency");
		GridBagConstraints gbc_lblCurrency = new GridBagConstraints();
		gbc_lblCurrency.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrency.anchor = GridBagConstraints.WEST;
		gbc_lblCurrency.gridx = 1;
		gbc_lblCurrency.gridy = 5;
		contentPane.add(lblCurrency, gbc_lblCurrency);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"US Dollar", "KR Won"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.gridwidth = 2;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 5;
		contentPane.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblOpportunities = new JLabel("Opportunities");
		GridBagConstraints gbc_lblOpportunities = new GridBagConstraints();
		gbc_lblOpportunities.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpportunities.anchor = GridBagConstraints.WEST;
		gbc_lblOpportunities.gridx = 6;
		gbc_lblOpportunities.gridy = 5;
		contentPane.add(lblOpportunities, gbc_lblOpportunities);
		
		JButton button_2 = new JButton("\u2192");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 11;
		gbc_button_2.gridy = 5;
		contentPane.add(button_2, gbc_button_2);
		
		textField_4 = new JTextField();
		textField_4.setText("2");
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 12;
		gbc_textField_4.gridy = 5;
		contentPane.add(textField_4, gbc_textField_4);
		
		JButton button_7 = new JButton("\uD83D\uDCCA");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 13;
		gbc_button_7.gridy = 5;
		contentPane.add(button_7, gbc_button_7);
		
		JLabel lblFederalTaxId = new JLabel("Federal Tax ID");
		GridBagConstraints gbc_lblFederalTaxId = new GridBagConstraints();
		gbc_lblFederalTaxId.insets = new Insets(0, 0, 5, 5);
		gbc_lblFederalTaxId.anchor = GridBagConstraints.WEST;
		gbc_lblFederalTaxId.gridx = 1;
		gbc_lblFederalTaxId.gridy = 6;
		contentPane.add(lblFederalTaxId, gbc_lblFederalTaxId);
		
		txtUs = new JTextField();
		txtUs.setText("US25-87634");
		GridBagConstraints gbc_txtUs = new GridBagConstraints();
		gbc_txtUs.gridwidth = 2;
		gbc_txtUs.insets = new Insets(0, 0, 5, 5);
		gbc_txtUs.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUs.gridx = 3;
		gbc_txtUs.gridy = 6;
		contentPane.add(txtUs, gbc_txtUs);
		txtUs.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 7;
		contentPane.add(verticalStrut, gbc_verticalStrut);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.gridwidth = 13;
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 8;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("General", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 56, 81, 0, 0, 0, 0, 0, 0, 55, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 1;
		gbc_verticalStrut_1.gridy = 0;
		panel.add(verticalStrut_1, gbc_verticalStrut_1);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_7 = new GridBagConstraints();
		gbc_horizontalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_7.gridx = 12;
		gbc_horizontalStrut_7.gridy = 0;
		panel.add(horizontalStrut_7, gbc_horizontalStrut_7);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 0;
		gbc_horizontalStrut_1.gridy = 1;
		panel.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		JLabel lblTel = new JLabel("Tel 1");
		GridBagConstraints gbc_lblTel = new GridBagConstraints();
		gbc_lblTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTel.anchor = GridBagConstraints.WEST;
		gbc_lblTel.gridx = 1;
		gbc_lblTel.gridy = 1;
		panel.add(lblTel, gbc_lblTel);
		
		textField_5 = new JTextField();
		textField_5.setText("(619) 565-7676");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 1;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 5;
		gbc_horizontalStrut_2.gridy = 1;
		panel.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6 = new GridBagConstraints();
		gbc_horizontalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_6.gridx = 6;
		gbc_horizontalStrut_6.gridy = 1;
		panel.add(horizontalStrut_6, gbc_horizontalStrut_6);
		
		JLabel lblContactPerson = new JLabel("Contact Person");
		GridBagConstraints gbc_lblContactPerson = new GridBagConstraints();
		gbc_lblContactPerson.anchor = GridBagConstraints.WEST;
		gbc_lblContactPerson.insets = new Insets(0, 0, 5, 5);
		gbc_lblContactPerson.gridx = 7;
		gbc_lblContactPerson.gridy = 1;
		panel.add(lblContactPerson, gbc_lblContactPerson);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_4.gridx = 8;
		gbc_horizontalStrut_4.gridy = 1;
		panel.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		txtNormThompson_1 = new JTextField();
		txtNormThompson_1.setEditable(false);
		txtNormThompson_1.setEnabled(false);
		txtNormThompson_1.setText("Norm Thompson");
		txtNormThompson_1.setColumns(10);
		GridBagConstraints gbc_txtNormThompson_1 = new GridBagConstraints();
		gbc_txtNormThompson_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNormThompson_1.gridwidth = 2;
		gbc_txtNormThompson_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtNormThompson_1.gridx = 10;
		gbc_txtNormThompson_1.gridy = 1;
		panel.add(txtNormThompson_1, gbc_txtNormThompson_1);
		
		JLabel lblTel_1 = new JLabel("Tel 2");
		GridBagConstraints gbc_lblTel_1 = new GridBagConstraints();
		gbc_lblTel_1.anchor = GridBagConstraints.WEST;
		gbc_lblTel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTel_1.gridx = 1;
		gbc_lblTel_1.gridy = 2;
		panel.add(lblTel_1, gbc_lblTel_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridwidth = 2;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 2;
		panel.add(textField_6, gbc_textField_6);
		
		JLabel lblIdNo = new JLabel("ID No. 2");
		GridBagConstraints gbc_lblIdNo = new GridBagConstraints();
		gbc_lblIdNo.anchor = GridBagConstraints.WEST;
		gbc_lblIdNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdNo.gridx = 7;
		gbc_lblIdNo.gridy = 2;
		panel.add(lblIdNo, gbc_lblIdNo);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridwidth = 2;
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.gridx = 10;
		gbc_textField_15.gridy = 2;
		panel.add(textField_15, gbc_textField_15);
		
		JLabel lblMobilePhone = new JLabel("Mobile Phone");
		GridBagConstraints gbc_lblMobilePhone = new GridBagConstraints();
		gbc_lblMobilePhone.anchor = GridBagConstraints.WEST;
		gbc_lblMobilePhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblMobilePhone.gridx = 1;
		gbc_lblMobilePhone.gridy = 3;
		panel.add(lblMobilePhone, gbc_lblMobilePhone);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridwidth = 2;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 3;
		panel.add(textField_7, gbc_textField_7);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblRemarks = new GridBagConstraints();
		gbc_lblRemarks.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblRemarks.gridheight = 2;
		gbc_lblRemarks.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemarks.gridx = 7;
		gbc_lblRemarks.gridy = 4;
		panel.add(lblRemarks, gbc_lblRemarks);
		
		JLabel lblFax = new JLabel("Fax");
		GridBagConstraints gbc_lblFax = new GridBagConstraints();
		gbc_lblFax.anchor = GridBagConstraints.WEST;
		gbc_lblFax.insets = new Insets(0, 0, 5, 5);
		gbc_lblFax.gridx = 1;
		gbc_lblFax.gridy = 4;
		panel.add(lblFax, gbc_lblFax);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridwidth = 2;
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.gridx = 2;
		gbc_textField_8.gridy = 4;
		panel.add(textField_8, gbc_textField_8);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.gridheight = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 10;
		gbc_textArea.gridy = 4;
		panel.add(textArea, gbc_textArea);
		
		JLabel lblEmail = new JLabel("E-Mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 5;
		panel.add(lblEmail, gbc_lblEmail);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridwidth = 2;
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.gridx = 2;
		gbc_textField_9.gridy = 5;
		panel.add(textField_9, gbc_textField_9);
		
		JLabel lblWebSite = new JLabel("Web Site");
		GridBagConstraints gbc_lblWebSite = new GridBagConstraints();
		gbc_lblWebSite.anchor = GridBagConstraints.WEST;
		gbc_lblWebSite.insets = new Insets(0, 0, 5, 5);
		gbc_lblWebSite.gridx = 1;
		gbc_lblWebSite.gridy = 6;
		panel.add(lblWebSite, gbc_lblWebSite);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridwidth = 2;
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.gridx = 2;
		gbc_textField_10.gridy = 6;
		panel.add(textField_10, gbc_textField_10);
		
		JLabel lblSalesEmployee = new JLabel("Sales Employee");
		GridBagConstraints gbc_lblSalesEmployee = new GridBagConstraints();
		gbc_lblSalesEmployee.anchor = GridBagConstraints.WEST;
		gbc_lblSalesEmployee.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalesEmployee.gridx = 7;
		gbc_lblSalesEmployee.gridy = 6;
		panel.add(lblSalesEmployee, gbc_lblSalesEmployee);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Brad Thompson", "Kelly", "Jerry", "Fred", "Tom"}));
		GridBagConstraints gbc_comboBox_6 = new GridBagConstraints();
		gbc_comboBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_6.gridx = 10;
		gbc_comboBox_6.gridy = 6;
		panel.add(comboBox_6, gbc_comboBox_6);
		
		JButton button_13 = new JButton("\u2630");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 11;
		gbc_button_13.gridy = 6;
		panel.add(button_13, gbc_button_13);
		
		JLabel lblShippingType = new JLabel("Shipping type");
		GridBagConstraints gbc_lblShippingType = new GridBagConstraints();
		gbc_lblShippingType.anchor = GridBagConstraints.WEST;
		gbc_lblShippingType.insets = new Insets(0, 0, 5, 5);
		gbc_lblShippingType.gridx = 1;
		gbc_lblShippingType.gridy = 7;
		panel.add(lblShippingType, gbc_lblShippingType);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"UPS Ground", "Fedex Air", "Hanjin Ship"}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridwidth = 2;
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.gridx = 2;
		gbc_comboBox_4.gridy = 7;
		panel.add(comboBox_4, gbc_comboBox_4);
		
		JButton button_8 = new JButton("\u2630");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 4;
		gbc_button_8.gridy = 7;
		panel.add(button_8, gbc_button_8);
		
		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 8;
		panel.add(lblPassword, gbc_lblPassword);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridwidth = 2;
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.gridx = 2;
		gbc_textField_12.gridy = 8;
		panel.add(textField_12, gbc_textField_12);
		
		JLabel lblFactoringIndicator = new JLabel("Factoring Indicator");
		GridBagConstraints gbc_lblFactoringIndicator = new GridBagConstraints();
		gbc_lblFactoringIndicator.anchor = GridBagConstraints.WEST;
		gbc_lblFactoringIndicator.insets = new Insets(0, 0, 5, 5);
		gbc_lblFactoringIndicator.gridx = 1;
		gbc_lblFactoringIndicator.gridy = 9;
		panel.add(lblFactoringIndicator, gbc_lblFactoringIndicator);
		
		textField_13 = new JTextField();
		textField_13.setColumns(6);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.gridx = 2;
		gbc_textField_13.gridy = 9;
		panel.add(textField_13, gbc_textField_13);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.gridx = 3;
		gbc_textField_11.gridy = 9;
		panel.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JButton button_9 = new JButton("\u2630");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 4;
		gbc_button_9.gridy = 9;
		panel.add(button_9, gbc_button_9);
		
		JLabel lblBpChannelCode = new JLabel("BP Channel Code");
		GridBagConstraints gbc_lblBpChannelCode = new GridBagConstraints();
		gbc_lblBpChannelCode.anchor = GridBagConstraints.WEST;
		gbc_lblBpChannelCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblBpChannelCode.gridx = 7;
		gbc_lblBpChannelCode.gridy = 9;
		panel.add(lblBpChannelCode, gbc_lblBpChannelCode);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.gridx = 10;
		gbc_textField_16.gridy = 9;
		panel.add(textField_16, gbc_textField_16);
		
		JButton button_12 = new JButton("\u2630");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 11;
		gbc_button_12.gridy = 9;
		panel.add(button_12, gbc_button_12);
		
		JLabel lblProject = new JLabel("Project");
		GridBagConstraints gbc_lblProject = new GridBagConstraints();
		gbc_lblProject.anchor = GridBagConstraints.WEST;
		gbc_lblProject.insets = new Insets(0, 0, 5, 5);
		gbc_lblProject.gridx = 1;
		gbc_lblProject.gridy = 10;
		panel.add(lblProject, gbc_lblProject);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Goverment Works", "My Own Works", "Freelancing"}));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridwidth = 2;
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.gridx = 2;
		gbc_comboBox_5.gridy = 10;
		panel.add(comboBox_5, gbc_comboBox_5);
		
		JLabel lblTechnician = new JLabel("Technician");
		GridBagConstraints gbc_lblTechnician = new GridBagConstraints();
		gbc_lblTechnician.anchor = GridBagConstraints.WEST;
		gbc_lblTechnician.insets = new Insets(0, 0, 5, 5);
		gbc_lblTechnician.gridx = 7;
		gbc_lblTechnician.gridy = 10;
		panel.add(lblTechnician, gbc_lblTechnician);
		
		JButton button_14 = new JButton("\u2192");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 9;
		gbc_button_14.gridy = 10;
		panel.add(button_14, gbc_button_14);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Buyer, Fred"}));
		GridBagConstraints gbc_comboBox_7 = new GridBagConstraints();
		gbc_comboBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_7.gridx = 10;
		gbc_comboBox_7.gridy = 10;
		panel.add(comboBox_7, gbc_comboBox_7);
		
		JButton button_11 = new JButton("\u2630");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 11;
		gbc_button_11.gridy = 10;
		panel.add(button_11, gbc_button_11);
		
		JLabel lblTerritory = new JLabel("Territory");
		GridBagConstraints gbc_lblTerritory = new GridBagConstraints();
		gbc_lblTerritory.insets = new Insets(0, 0, 5, 5);
		gbc_lblTerritory.anchor = GridBagConstraints.WEST;
		gbc_lblTerritory.gridx = 7;
		gbc_lblTerritory.gridy = 11;
		panel.add(lblTerritory, gbc_lblTerritory);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.gridx = 10;
		gbc_textField_17.gridy = 11;
		panel.add(textField_17, gbc_textField_17);
		
		JButton button_10 = new JButton("\u2630");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 11;
		gbc_button_10.gridy = 11;
		panel.add(button_10, gbc_button_10);
		
		JCheckBox chckbxActive = new JCheckBox("Active");
		GridBagConstraints gbc_chckbxActive = new GridBagConstraints();
		gbc_chckbxActive.anchor = GridBagConstraints.WEST;
		gbc_chckbxActive.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxActive.gridx = 1;
		gbc_chckbxActive.gridy = 12;
		panel.add(chckbxActive, gbc_chckbxActive);
		
		JCheckBox chckbxOnHold = new JCheckBox("On Hold");
		GridBagConstraints gbc_chckbxOnHold = new GridBagConstraints();
		gbc_chckbxOnHold.anchor = GridBagConstraints.WEST;
		gbc_chckbxOnHold.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOnHold.gridx = 1;
		gbc_chckbxOnHold.gridy = 13;
		panel.add(chckbxOnHold, gbc_chckbxOnHold);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 14;
		panel.add(verticalStrut_2, gbc_verticalStrut_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cotact Persons", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 279, 85, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 1;
		gbc_verticalStrut_5.gridy = 0;
		panel_1.add(verticalStrut_5, gbc_verticalStrut_5);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_13 = new GridBagConstraints();
		gbc_horizontalStrut_13.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_13.gridx = 0;
		gbc_horizontalStrut_13.gridy = 1;
		panel_1.add(horizontalStrut_13, gbc_horizontalStrut_13);
		
		JToggleButton tglbtnNormThompson = new JToggleButton("Norm Thompson");
		tglbtnNormThompson.setFont(new Font("굴림", Font.BOLD, 12));
		GridBagConstraints gbc_tglbtnNormThompson = new GridBagConstraints();
		gbc_tglbtnNormThompson.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnNormThompson.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnNormThompson.gridx = 1;
		gbc_tglbtnNormThompson.gridy = 1;
		panel_1.add(tglbtnNormThompson, gbc_tglbtnNormThompson);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_12 = new GridBagConstraints();
		gbc_horizontalStrut_12.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_12.gridx = 2;
		gbc_horizontalStrut_12.gridy = 1;
		panel_1.add(horizontalStrut_12, gbc_horizontalStrut_12);
		
		JLabel lblName_1 = new JLabel("Name");
		GridBagConstraints gbc_lblName_1 = new GridBagConstraints();
		gbc_lblName_1.anchor = GridBagConstraints.WEST;
		gbc_lblName_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblName_1.gridx = 3;
		gbc_lblName_1.gridy = 1;
		panel_1.add(lblName_1, gbc_lblName_1);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_11 = new GridBagConstraints();
		gbc_horizontalStrut_11.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_11.gridx = 5;
		gbc_horizontalStrut_11.gridy = 1;
		panel_1.add(horizontalStrut_11, gbc_horizontalStrut_11);
		
		txtPaulMayers = new JTextField();
		txtPaulMayers.setText("Paul Mayers");
		GridBagConstraints gbc_txtPaulMayers = new GridBagConstraints();
		gbc_txtPaulMayers.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPaulMayers.insets = new Insets(0, 0, 5, 5);
		gbc_txtPaulMayers.gridx = 6;
		gbc_txtPaulMayers.gridy = 1;
		panel_1.add(txtPaulMayers, gbc_txtPaulMayers);
		txtPaulMayers.setColumns(15);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_14 = new GridBagConstraints();
		gbc_horizontalStrut_14.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_14.gridx = 7;
		gbc_horizontalStrut_14.gridy = 1;
		panel_1.add(horizontalStrut_14, gbc_horizontalStrut_14);
		
		JToggleButton tglbtnPaulMayers = new JToggleButton("Paul Mayers");
		tglbtnPaulMayers.setSelected(true);
		GridBagConstraints gbc_tglbtnPaulMayers = new GridBagConstraints();
		gbc_tglbtnPaulMayers.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnPaulMayers.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPaulMayers.gridx = 1;
		gbc_tglbtnPaulMayers.gridy = 2;
		panel_1.add(tglbtnPaulMayers, gbc_tglbtnPaulMayers);
		
		JLabel lblTitle = new JLabel("Title");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.WEST;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 3;
		gbc_lblTitle.gridy = 2;
		panel_1.add(lblTitle, gbc_lblTitle);
		
		textField_14 = new JTextField();
		textField_14.setColumns(15);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.gridx = 6;
		gbc_textField_14.gridy = 2;
		panel_1.add(textField_14, gbc_textField_14);
		
		JToggleButton tglbtnDefineEw = new JToggleButton("Define new");
		GridBagConstraints gbc_tglbtnDefineEw = new GridBagConstraints();
		gbc_tglbtnDefineEw.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnDefineEw.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDefineEw.gridx = 1;
		gbc_tglbtnDefineEw.gridy = 3;
		panel_1.add(tglbtnDefineEw, gbc_tglbtnDefineEw);
		
		JLabel lblPosition = new JLabel("Position");
		GridBagConstraints gbc_lblPosition = new GridBagConstraints();
		gbc_lblPosition.anchor = GridBagConstraints.WEST;
		gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosition.gridx = 3;
		gbc_lblPosition.gridy = 3;
		panel_1.add(lblPosition, gbc_lblPosition);
		
		txtProcurementManager = new JTextField();
		txtProcurementManager.setText("Procurement Manager");
		txtProcurementManager.setColumns(15);
		GridBagConstraints gbc_txtProcurementManager = new GridBagConstraints();
		gbc_txtProcurementManager.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProcurementManager.insets = new Insets(0, 0, 5, 5);
		gbc_txtProcurementManager.gridx = 6;
		gbc_txtProcurementManager.gridy = 3;
		panel_1.add(txtProcurementManager, gbc_txtProcurementManager);
		
		JToggleButton toggleButton = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton = new GridBagConstraints();
		gbc_toggleButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton.gridx = 1;
		gbc_toggleButton.gridy = 4;
		panel_1.add(toggleButton, gbc_toggleButton);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.anchor = GridBagConstraints.WEST;
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 3;
		gbc_lblAddress.gridy = 4;
		panel_1.add(lblAddress, gbc_lblAddress);
		
		textField_18 = new JTextField();
		textField_18.setColumns(15);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 6;
		gbc_textField_18.gridy = 4;
		panel_1.add(textField_18, gbc_textField_18);
		
		JToggleButton toggleButton_6 = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton_6 = new GridBagConstraints();
		gbc_toggleButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton_6.gridx = 1;
		gbc_toggleButton_6.gridy = 5;
		panel_1.add(toggleButton_6, gbc_toggleButton_6);
		
		JLabel lblTelephone = new JLabel("Telephone 1");
		GridBagConstraints gbc_lblTelephone = new GridBagConstraints();
		gbc_lblTelephone.anchor = GridBagConstraints.WEST;
		gbc_lblTelephone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephone.gridx = 3;
		gbc_lblTelephone.gridy = 5;
		panel_1.add(lblTelephone, gbc_lblTelephone);
		
		textField_20 = new JTextField();
		textField_20.setText("(610) 565-9000-112");
		textField_20.setColumns(10);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.gridx = 6;
		gbc_textField_20.gridy = 5;
		panel_1.add(textField_20, gbc_textField_20);
		
		JToggleButton toggleButton_5 = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton_5 = new GridBagConstraints();
		gbc_toggleButton_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton_5.gridx = 1;
		gbc_toggleButton_5.gridy = 6;
		panel_1.add(toggleButton_5, gbc_toggleButton_5);
		
		JLabel lblTelephone_1 = new JLabel("Telephone 2");
		GridBagConstraints gbc_lblTelephone_1 = new GridBagConstraints();
		gbc_lblTelephone_1.anchor = GridBagConstraints.WEST;
		gbc_lblTelephone_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephone_1.gridx = 3;
		gbc_lblTelephone_1.gridy = 6;
		panel_1.add(lblTelephone_1, gbc_lblTelephone_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(15);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 6;
		gbc_textField_19.gridy = 6;
		panel_1.add(textField_19, gbc_textField_19);
		
		JToggleButton toggleButton_4 = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton_4 = new GridBagConstraints();
		gbc_toggleButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton_4.gridx = 1;
		gbc_toggleButton_4.gridy = 7;
		panel_1.add(toggleButton_4, gbc_toggleButton_4);
		
		JLabel lblMobilePhone_1 = new JLabel("Mobile Phone");
		GridBagConstraints gbc_lblMobilePhone_1 = new GridBagConstraints();
		gbc_lblMobilePhone_1.anchor = GridBagConstraints.WEST;
		gbc_lblMobilePhone_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMobilePhone_1.gridx = 3;
		gbc_lblMobilePhone_1.gridy = 7;
		panel_1.add(lblMobilePhone_1, gbc_lblMobilePhone_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(15);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 6;
		gbc_textField_21.gridy = 7;
		panel_1.add(textField_21, gbc_textField_21);
		
		JToggleButton toggleButton_3 = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton_3 = new GridBagConstraints();
		gbc_toggleButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton_3.gridx = 1;
		gbc_toggleButton_3.gridy = 8;
		panel_1.add(toggleButton_3, gbc_toggleButton_3);
		
		JLabel lblFax_1 = new JLabel("Fax");
		GridBagConstraints gbc_lblFax_1 = new GridBagConstraints();
		gbc_lblFax_1.anchor = GridBagConstraints.WEST;
		gbc_lblFax_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFax_1.gridx = 3;
		gbc_lblFax_1.gridy = 8;
		panel_1.add(lblFax_1, gbc_lblFax_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(15);
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 6;
		gbc_textField_22.gridy = 8;
		panel_1.add(textField_22, gbc_textField_22);
		
		JToggleButton toggleButton_2 = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton_2 = new GridBagConstraints();
		gbc_toggleButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton_2.gridx = 1;
		gbc_toggleButton_2.gridy = 9;
		panel_1.add(toggleButton_2, gbc_toggleButton_2);
		
		JLabel lblEmail_1 = new JLabel("E-Mail");
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 3;
		gbc_lblEmail_1.gridy = 9;
		panel_1.add(lblEmail_1, gbc_lblEmail_1);
		
		txtPmthompsoncom = new JTextField();
		txtPmthompsoncom.setText("pm@thompson.com");
		txtPmthompsoncom.setColumns(10);
		GridBagConstraints gbc_txtPmthompsoncom = new GridBagConstraints();
		gbc_txtPmthompsoncom.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPmthompsoncom.insets = new Insets(0, 0, 5, 5);
		gbc_txtPmthompsoncom.gridx = 6;
		gbc_txtPmthompsoncom.gridy = 9;
		panel_1.add(txtPmthompsoncom, gbc_txtPmthompsoncom);
		
		JToggleButton toggleButton_1 = new JToggleButton(" ");
		GridBagConstraints gbc_toggleButton_1 = new GridBagConstraints();
		gbc_toggleButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_toggleButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_toggleButton_1.gridx = 1;
		gbc_toggleButton_1.gridy = 10;
		panel_1.add(toggleButton_1, gbc_toggleButton_1);
		
		JLabel lblPager = new JLabel("Pager");
		GridBagConstraints gbc_lblPager = new GridBagConstraints();
		gbc_lblPager.anchor = GridBagConstraints.WEST;
		gbc_lblPager.insets = new Insets(0, 0, 5, 5);
		gbc_lblPager.gridx = 3;
		gbc_lblPager.gridy = 10;
		panel_1.add(lblPager, gbc_lblPager);
		
		textField_23 = new JTextField();
		textField_23.setColumns(15);
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 6;
		gbc_textField_23.gridy = 10;
		panel_1.add(textField_23, gbc_textField_23);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_6.gridx = 1;
		gbc_verticalStrut_6.gridy = 11;
		panel_1.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JLabel lblRemarks_1 = new JLabel("Remarks 1");
		GridBagConstraints gbc_lblRemarks_1 = new GridBagConstraints();
		gbc_lblRemarks_1.anchor = GridBagConstraints.WEST;
		gbc_lblRemarks_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemarks_1.gridx = 3;
		gbc_lblRemarks_1.gridy = 11;
		panel_1.add(lblRemarks_1, gbc_lblRemarks_1);
		
		textField_25 = new JTextField();
		textField_25.setColumns(15);
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 6;
		gbc_textField_25.gridy = 11;
		panel_1.add(textField_25, gbc_textField_25);
		
		JLabel lblRemarks_2 = new JLabel("Remarks 2");
		GridBagConstraints gbc_lblRemarks_2 = new GridBagConstraints();
		gbc_lblRemarks_2.anchor = GridBagConstraints.WEST;
		gbc_lblRemarks_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemarks_2.gridx = 3;
		gbc_lblRemarks_2.gridy = 12;
		panel_1.add(lblRemarks_2, gbc_lblRemarks_2);
		
		textField_26 = new JTextField();
		textField_26.setColumns(15);
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 6;
		gbc_textField_26.gridy = 12;
		panel_1.add(textField_26, gbc_textField_26);
		
		JButton btnSetAsDefault = new JButton("Set as Default");
		GridBagConstraints gbc_btnSetAsDefault = new GridBagConstraints();
		gbc_btnSetAsDefault.anchor = GridBagConstraints.WEST;
		gbc_btnSetAsDefault.insets = new Insets(0, 0, 5, 5);
		gbc_btnSetAsDefault.gridx = 1;
		gbc_btnSetAsDefault.gridy = 13;
		panel_1.add(btnSetAsDefault, gbc_btnSetAsDefault);
		
		JLabel lblPassword_1 = new JLabel("Password");
		GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
		gbc_lblPassword_1.anchor = GridBagConstraints.WEST;
		gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword_1.gridx = 3;
		gbc_lblPassword_1.gridy = 13;
		panel_1.add(lblPassword_1, gbc_lblPassword_1);
		
		textField_27 = new JTextField();
		textField_27.setColumns(15);
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 6;
		gbc_textField_27.gridy = 13;
		panel_1.add(textField_27, gbc_textField_27);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_7.gridx = 6;
		gbc_verticalStrut_7.gridy = 14;
		panel_1.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Addresses", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 342, 72, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 174, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_8.gridx = 1;
		gbc_verticalStrut_8.gridy = 0;
		panel_2.add(verticalStrut_8, gbc_verticalStrut_8);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_9.gridx = 1;
		gbc_verticalStrut_9.gridy = 1;
		panel_2.add(verticalStrut_9, gbc_verticalStrut_9);
		
		JLabel lblBillTo = new JLabel("Bill to");
		GridBagConstraints gbc_lblBillTo = new GridBagConstraints();
		gbc_lblBillTo.anchor = GridBagConstraints.WEST;
		gbc_lblBillTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblBillTo.gridx = 3;
		gbc_lblBillTo.gridy = 1;
		panel_2.add(lblBillTo, gbc_lblBillTo);
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_16 = new GridBagConstraints();
		gbc_horizontalStrut_16.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_16.gridx = 4;
		gbc_horizontalStrut_16.gridy = 1;
		panel_2.add(horizontalStrut_16, gbc_horizontalStrut_16);
		
		Component horizontalStrut_18 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_18 = new GridBagConstraints();
		gbc_horizontalStrut_18.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_18.gridx = 6;
		gbc_horizontalStrut_18.gridy = 1;
		panel_2.add(horizontalStrut_18, gbc_horizontalStrut_18);
		
		Component horizontalStrut_15 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_15 = new GridBagConstraints();
		gbc_horizontalStrut_15.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_15.gridx = 0;
		gbc_horizontalStrut_15.gridy = 2;
		panel_2.add(horizontalStrut_15, gbc_horizontalStrut_15);
		
		Component horizontalStrut_17 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_17 = new GridBagConstraints();
		gbc_horizontalStrut_17.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_17.gridx = 2;
		gbc_horizontalStrut_17.gridy = 2;
		panel_2.add(horizontalStrut_17, gbc_horizontalStrut_17);
		
		JLabel lblAddressName = new JLabel("Address Name");
		GridBagConstraints gbc_lblAddressName = new GridBagConstraints();
		gbc_lblAddressName.anchor = GridBagConstraints.WEST;
		gbc_lblAddressName.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressName.gridx = 3;
		gbc_lblAddressName.gridy = 2;
		panel_2.add(lblAddressName, gbc_lblAddressName);
		
		txtBillTomainAddress = new JTextField();
		txtBillTomainAddress.setText("Bill To/Main Address");
		GridBagConstraints gbc_txtBillTomainAddress = new GridBagConstraints();
		gbc_txtBillTomainAddress.insets = new Insets(0, 0, 5, 5);
		gbc_txtBillTomainAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBillTomainAddress.gridx = 5;
		gbc_txtBillTomainAddress.gridy = 2;
		panel_2.add(txtBillTomainAddress, gbc_txtBillTomainAddress);
		txtBillTomainAddress.setColumns(10);
		
		JLabel lblStreetPo = new JLabel("Street / PO Box");
		GridBagConstraints gbc_lblStreetPo = new GridBagConstraints();
		gbc_lblStreetPo.anchor = GridBagConstraints.WEST;
		gbc_lblStreetPo.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreetPo.gridx = 3;
		gbc_lblStreetPo.gridy = 3;
		panel_2.add(lblStreetPo, gbc_lblStreetPo);
		
		txtBillingsDrive = new JTextField();
		txtBillingsDrive.setText("300 Billings Drive");
		GridBagConstraints gbc_txtBillingsDrive = new GridBagConstraints();
		gbc_txtBillingsDrive.insets = new Insets(0, 0, 5, 5);
		gbc_txtBillingsDrive.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBillingsDrive.gridx = 5;
		gbc_txtBillingsDrive.gridy = 3;
		panel_2.add(txtBillingsDrive, gbc_txtBillingsDrive);
		txtBillingsDrive.setColumns(10);
		
		JLabel lblBlock = new JLabel("Block");
		GridBagConstraints gbc_lblBlock = new GridBagConstraints();
		gbc_lblBlock.anchor = GridBagConstraints.WEST;
		gbc_lblBlock.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlock.gridx = 3;
		gbc_lblBlock.gridy = 4;
		panel_2.add(lblBlock, gbc_lblBlock);
		
		txtSuite = new JTextField();
		txtSuite.setText("Suite 50");
		GridBagConstraints gbc_txtSuite = new GridBagConstraints();
		gbc_txtSuite.insets = new Insets(0, 0, 5, 5);
		gbc_txtSuite.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSuite.gridx = 5;
		gbc_txtSuite.gridy = 4;
		panel_2.add(txtSuite, gbc_txtSuite);
		txtSuite.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.anchor = GridBagConstraints.WEST;
		gbc_lblCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblCity.gridx = 3;
		gbc_lblCity.gridy = 5;
		panel_2.add(lblCity, gbc_lblCity);
		
		txtHavertown = new JTextField();
		txtHavertown.setText("Havertown");
		GridBagConstraints gbc_txtHavertown = new GridBagConstraints();
		gbc_txtHavertown.insets = new Insets(0, 0, 5, 5);
		gbc_txtHavertown.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHavertown.gridx = 5;
		gbc_txtHavertown.gridy = 5;
		panel_2.add(txtHavertown, gbc_txtHavertown);
		txtHavertown.setColumns(10);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		GridBagConstraints gbc_lblZipCode = new GridBagConstraints();
		gbc_lblZipCode.anchor = GridBagConstraints.WEST;
		gbc_lblZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblZipCode.gridx = 3;
		gbc_lblZipCode.gridy = 6;
		panel_2.add(lblZipCode, gbc_lblZipCode);
		
		textField_24 = new JTextField();
		textField_24.setText("19083");
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 5;
		gbc_textField_24.gridy = 6;
		panel_2.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.anchor = GridBagConstraints.WEST;
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.gridx = 3;
		gbc_lblState.gridy = 7;
		panel_2.add(lblState, gbc_lblState);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Pennsylvania", "Newyork", "Newjersey", "Wasington"}));
		GridBagConstraints gbc_comboBox_8 = new GridBagConstraints();
		gbc_comboBox_8.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_8.gridx = 5;
		gbc_comboBox_8.gridy = 7;
		panel_2.add(comboBox_8, gbc_comboBox_8);
		
		JLabel lblCountry = new JLabel("Country");
		GridBagConstraints gbc_lblCountry = new GridBagConstraints();
		gbc_lblCountry.anchor = GridBagConstraints.WEST;
		gbc_lblCountry.insets = new Insets(0, 0, 5, 5);
		gbc_lblCountry.gridx = 3;
		gbc_lblCountry.gridy = 8;
		panel_2.add(lblCountry, gbc_lblCountry);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"USA", "Korea", "Canada", "France", "Germany"}));
		GridBagConstraints gbc_comboBox_9 = new GridBagConstraints();
		gbc_comboBox_9.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_9.gridx = 5;
		gbc_comboBox_9.gridy = 8;
		panel_2.add(comboBox_9, gbc_comboBox_9);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_10.gridx = 1;
		gbc_verticalStrut_10.gridy = 9;
		panel_2.add(verticalStrut_10, gbc_verticalStrut_10);
		
		JButton btnSetAsDefault_1 = new JButton("Set as Default");
		GridBagConstraints gbc_btnSetAsDefault_1 = new GridBagConstraints();
		gbc_btnSetAsDefault_1.anchor = GridBagConstraints.WEST;
		gbc_btnSetAsDefault_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnSetAsDefault_1.gridx = 1;
		gbc_btnSetAsDefault_1.gridy = 10;
		panel_2.add(btnSetAsDefault_1, gbc_btnSetAsDefault_1);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_11.gridx = 1;
		gbc_verticalStrut_11.gridy = 11;
		panel_2.add(verticalStrut_11, gbc_verticalStrut_11);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Payment Terms", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 90, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 52, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		Component verticalStrut_23 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_23 = new GridBagConstraints();
		gbc_verticalStrut_23.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_23.gridx = 1;
		gbc_verticalStrut_23.gridy = 0;
		panel_3.add(verticalStrut_23, gbc_verticalStrut_23);
		
		Component horizontalStrut_29 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_29 = new GridBagConstraints();
		gbc_horizontalStrut_29.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_29.gridx = 0;
		gbc_horizontalStrut_29.gridy = 1;
		panel_3.add(horizontalStrut_29, gbc_horizontalStrut_29);
		
		JLabel lblInterestArrears = new JLabel("Interest Arrears %");
		GridBagConstraints gbc_lblInterestArrears = new GridBagConstraints();
		gbc_lblInterestArrears.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblInterestArrears.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterestArrears.gridx = 1;
		gbc_lblInterestArrears.gridy = 1;
		panel_3.add(lblInterestArrears, gbc_lblInterestArrears);
		
		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 3;
		gbc_textField_32.gridy = 1;
		panel_3.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		JLabel lblBankCode = new JLabel("Bank Code");
		GridBagConstraints gbc_lblBankCode = new GridBagConstraints();
		gbc_lblBankCode.anchor = GridBagConstraints.WEST;
		gbc_lblBankCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblBankCode.gridx = 5;
		gbc_lblBankCode.gridy = 1;
		panel_3.add(lblBankCode, gbc_lblBankCode);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"KB", "SHINHAN", "HANA", "IBK"}));
		GridBagConstraints gbc_comboBox_13 = new GridBagConstraints();
		gbc_comboBox_13.gridwidth = 3;
		gbc_comboBox_13.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_13.gridx = 7;
		gbc_comboBox_13.gridy = 1;
		panel_3.add(comboBox_13, gbc_comboBox_13);
		
		Component horizontalStrut_30 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_30 = new GridBagConstraints();
		gbc_horizontalStrut_30.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_30.gridx = 10;
		gbc_horizontalStrut_30.gridy = 1;
		panel_3.add(horizontalStrut_30, gbc_horizontalStrut_30);
		
		JLabel lblPriceList = new JLabel("Price List");
		GridBagConstraints gbc_lblPriceList = new GridBagConstraints();
		gbc_lblPriceList.anchor = GridBagConstraints.WEST;
		gbc_lblPriceList.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriceList.gridx = 1;
		gbc_lblPriceList.gridy = 2;
		panel_3.add(lblPriceList, gbc_lblPriceList);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"1,000", "10,000", "100,000", "1,000,000"}));
		GridBagConstraints gbc_comboBox_10 = new GridBagConstraints();
		gbc_comboBox_10.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_10.gridx = 3;
		gbc_comboBox_10.gridy = 2;
		panel_3.add(comboBox_10, gbc_comboBox_10);
		
		JLabel lblBankAccountNumber = new JLabel("Bank Account Number");
		GridBagConstraints gbc_lblBankAccountNumber = new GridBagConstraints();
		gbc_lblBankAccountNumber.anchor = GridBagConstraints.WEST;
		gbc_lblBankAccountNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblBankAccountNumber.gridx = 5;
		gbc_lblBankAccountNumber.gridy = 2;
		panel_3.add(lblBankAccountNumber, gbc_lblBankAccountNumber);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.gridwidth = 3;
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 7;
		gbc_textField_36.gridy = 2;
		panel_3.add(textField_36, gbc_textField_36);
		
		JLabel lblTotalDiscount = new JLabel("Total Discount %");
		GridBagConstraints gbc_lblTotalDiscount = new GridBagConstraints();
		gbc_lblTotalDiscount.anchor = GridBagConstraints.WEST;
		gbc_lblTotalDiscount.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalDiscount.gridx = 1;
		gbc_lblTotalDiscount.gridy = 3;
		panel_3.add(lblTotalDiscount, gbc_lblTotalDiscount);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 3;
		gbc_textField_33.gridy = 3;
		panel_3.add(textField_33, gbc_textField_33);
		
		JLabel lblIban = new JLabel("IBAN");
		GridBagConstraints gbc_lblIban = new GridBagConstraints();
		gbc_lblIban.anchor = GridBagConstraints.WEST;
		gbc_lblIban.insets = new Insets(0, 0, 5, 5);
		gbc_lblIban.gridx = 5;
		gbc_lblIban.gridy = 3;
		panel_3.add(lblIban, gbc_lblIban);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.gridwidth = 3;
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 7;
		gbc_textField_37.gridy = 3;
		panel_3.add(textField_37, gbc_textField_37);
		
		JLabel lblMaxCredit = new JLabel("Max Credit");
		GridBagConstraints gbc_lblMaxCredit = new GridBagConstraints();
		gbc_lblMaxCredit.anchor = GridBagConstraints.WEST;
		gbc_lblMaxCredit.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxCredit.gridx = 1;
		gbc_lblMaxCredit.gridy = 4;
		panel_3.add(lblMaxCredit, gbc_lblMaxCredit);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 3;
		gbc_textField_34.gridy = 4;
		panel_3.add(textField_34, gbc_textField_34);
		
		JLabel lblCommitmentLimit = new JLabel("Commitment Limit");
		GridBagConstraints gbc_lblCommitmentLimit = new GridBagConstraints();
		gbc_lblCommitmentLimit.anchor = GridBagConstraints.WEST;
		gbc_lblCommitmentLimit.insets = new Insets(0, 0, 5, 5);
		gbc_lblCommitmentLimit.gridx = 1;
		gbc_lblCommitmentLimit.gridy = 5;
		panel_3.add(lblCommitmentLimit, gbc_lblCommitmentLimit);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 3;
		gbc_textField_35.gridy = 5;
		panel_3.add(textField_35, gbc_textField_35);
		
		JLabel lblCreditCardType = new JLabel("Credit Card Type");
		GridBagConstraints gbc_lblCreditCardType = new GridBagConstraints();
		gbc_lblCreditCardType.anchor = GridBagConstraints.WEST;
		gbc_lblCreditCardType.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreditCardType.gridx = 5;
		gbc_lblCreditCardType.gridy = 5;
		panel_3.add(lblCreditCardType, gbc_lblCreditCardType);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD", "UNIONPAY"}));
		GridBagConstraints gbc_comboBox_12 = new GridBagConstraints();
		gbc_comboBox_12.gridwidth = 3;
		gbc_comboBox_12.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_12.gridx = 7;
		gbc_comboBox_12.gridy = 5;
		panel_3.add(comboBox_12, gbc_comboBox_12);
		
		JLabel lblGeneralLedgerAccount = new JLabel("General Ledger Account");
		GridBagConstraints gbc_lblGeneralLedgerAccount = new GridBagConstraints();
		gbc_lblGeneralLedgerAccount.anchor = GridBagConstraints.WEST;
		gbc_lblGeneralLedgerAccount.insets = new Insets(0, 0, 5, 5);
		gbc_lblGeneralLedgerAccount.gridx = 5;
		gbc_lblGeneralLedgerAccount.gridy = 6;
		panel_3.add(lblGeneralLedgerAccount, gbc_lblGeneralLedgerAccount);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.gridwidth = 3;
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 7;
		gbc_textField_38.gridy = 6;
		panel_3.add(textField_38, gbc_textField_38);
		
		JLabel lblDunningTerm = new JLabel("Dunning Term");
		GridBagConstraints gbc_lblDunningTerm = new GridBagConstraints();
		gbc_lblDunningTerm.anchor = GridBagConstraints.WEST;
		gbc_lblDunningTerm.insets = new Insets(0, 0, 5, 5);
		gbc_lblDunningTerm.gridx = 1;
		gbc_lblDunningTerm.gridy = 7;
		panel_3.add(lblDunningTerm, gbc_lblDunningTerm);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Consumer", "Lead", "Vendor"}));
		GridBagConstraints gbc_comboBox_11 = new GridBagConstraints();
		gbc_comboBox_11.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_11.gridx = 3;
		gbc_comboBox_11.gridy = 7;
		panel_3.add(comboBox_11, gbc_comboBox_11);
		
		JLabel lblCompanyId = new JLabel("Company ID");
		GridBagConstraints gbc_lblCompanyId = new GridBagConstraints();
		gbc_lblCompanyId.anchor = GridBagConstraints.WEST;
		gbc_lblCompanyId.insets = new Insets(0, 0, 5, 5);
		gbc_lblCompanyId.gridx = 5;
		gbc_lblCompanyId.gridy = 7;
		panel_3.add(lblCompanyId, gbc_lblCompanyId);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.gridwidth = 3;
		gbc_textField_39.insets = new Insets(0, 0, 5, 5);
		gbc_textField_39.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_39.gridx = 7;
		gbc_textField_39.gridy = 7;
		panel_3.add(textField_39, gbc_textField_39);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber.gridx = 5;
		gbc_lblPhoneNumber.gridy = 8;
		panel_3.add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.gridwidth = 3;
		gbc_textField_40.insets = new Insets(0, 0, 5, 5);
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 7;
		gbc_textField_40.gridy = 8;
		panel_3.add(textField_40, gbc_textField_40);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		GridBagConstraints gbc_lblCreditCardNumber = new GridBagConstraints();
		gbc_lblCreditCardNumber.anchor = GridBagConstraints.WEST;
		gbc_lblCreditCardNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreditCardNumber.gridx = 5;
		gbc_lblCreditCardNumber.gridy = 10;
		panel_3.add(lblCreditCardNumber, gbc_lblCreditCardNumber);
		
		JLabel lblExpiryDate = new JLabel("Expiry Date");
		GridBagConstraints gbc_lblExpiryDate = new GridBagConstraints();
		gbc_lblExpiryDate.anchor = GridBagConstraints.WEST;
		gbc_lblExpiryDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblExpiryDate.gridx = 7;
		gbc_lblExpiryDate.gridy = 10;
		panel_3.add(lblExpiryDate, gbc_lblExpiryDate);
		
		JLabel lblIdNo_1 = new JLabel("ID No.");
		GridBagConstraints gbc_lblIdNo_1 = new GridBagConstraints();
		gbc_lblIdNo_1.anchor = GridBagConstraints.WEST;
		gbc_lblIdNo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdNo_1.gridx = 9;
		gbc_lblIdNo_1.gridy = 10;
		panel_3.add(lblIdNo_1, gbc_lblIdNo_1);
		
		textField_41 = new JTextField();
		textField_41.setText("1234 1234 1234 1234");
		textField_41.setColumns(12);
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.insets = new Insets(0, 0, 5, 5);
		gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_41.gridx = 5;
		gbc_textField_41.gridy = 11;
		panel_3.add(textField_41, gbc_textField_41);
		
		textField_42 = new JTextField();
		textField_42.setText("09/27");
		textField_42.setColumns(6);
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.insets = new Insets(0, 0, 5, 5);
		gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_42.gridx = 7;
		gbc_textField_42.gridy = 11;
		panel_3.add(textField_42, gbc_textField_42);
		
		textField_43 = new JTextField();
		textField_43.setText("920914");
		textField_43.setColumns(8);
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.insets = new Insets(0, 0, 5, 5);
		gbc_textField_43.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_43.gridx = 9;
		gbc_textField_43.gridy = 11;
		panel_3.add(textField_43, gbc_textField_43);
		
		Component verticalStrut_22 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_22 = new GridBagConstraints();
		gbc_verticalStrut_22.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_22.gridx = 1;
		gbc_verticalStrut_22.gridy = 12;
		panel_3.add(verticalStrut_22, gbc_verticalStrut_22);
		
		JLabel lblAverageDelay = new JLabel("Average Delay");
		GridBagConstraints gbc_lblAverageDelay = new GridBagConstraints();
		gbc_lblAverageDelay.insets = new Insets(0, 0, 5, 5);
		gbc_lblAverageDelay.gridx = 1;
		gbc_lblAverageDelay.gridy = 13;
		panel_3.add(lblAverageDelay, gbc_lblAverageDelay);
		
		textField_44 = new JTextField();
		textField_44.setText("7");
		textField_44.setColumns(10);
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.insets = new Insets(0, 0, 5, 5);
		gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_44.gridx = 3;
		gbc_textField_44.gridy = 13;
		panel_3.add(textField_44, gbc_textField_44);
		
		JLabel lblPriority = new JLabel("Priority");
		GridBagConstraints gbc_lblPriority = new GridBagConstraints();
		gbc_lblPriority.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriority.gridx = 1;
		gbc_lblPriority.gridy = 14;
		panel_3.add(lblPriority, gbc_lblPriority);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"High", "Medium", "Low"}));
		GridBagConstraints gbc_comboBox_14 = new GridBagConstraints();
		gbc_comboBox_14.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_14.gridx = 3;
		gbc_comboBox_14.gridy = 14;
		panel_3.add(comboBox_14, gbc_comboBox_14);
		
		JLabel lblPublicHoliday = new JLabel("Public Holiday");
		GridBagConstraints gbc_lblPublicHoliday = new GridBagConstraints();
		gbc_lblPublicHoliday.insets = new Insets(0, 0, 5, 5);
		gbc_lblPublicHoliday.gridx = 1;
		gbc_lblPublicHoliday.gridy = 15;
		panel_3.add(lblPublicHoliday, gbc_lblPublicHoliday);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"Country", "USA", "Germany", "Korea", "Japan"}));
		GridBagConstraints gbc_comboBox_15 = new GridBagConstraints();
		gbc_comboBox_15.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_15.gridx = 3;
		gbc_comboBox_15.gridy = 15;
		panel_3.add(comboBox_15, gbc_comboBox_15);
		
		JLabel lblPaymentDates = new JLabel("Payment Dates");
		GridBagConstraints gbc_lblPaymentDates = new GridBagConstraints();
		gbc_lblPaymentDates.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaymentDates.gridx = 1;
		gbc_lblPaymentDates.gridy = 16;
		panel_3.add(lblPaymentDates, gbc_lblPaymentDates);
		
		textField_45 = new JTextField();
		textField_45.setText("15");
		textField_45.setColumns(10);
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.insets = new Insets(0, 0, 5, 5);
		gbc_textField_45.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_45.gridx = 3;
		gbc_textField_45.gridy = 16;
		panel_3.add(textField_45, gbc_textField_45);
		
		Component verticalStrut_25 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_25 = new GridBagConstraints();
		gbc_verticalStrut_25.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_25.gridx = 1;
		gbc_verticalStrut_25.gridy = 17;
		panel_3.add(verticalStrut_25, gbc_verticalStrut_25);
		
		JCheckBox chckbxAllowPartialDelivery = new JCheckBox("Allow Partial Delivery of Sales Order");
		GridBagConstraints gbc_chckbxAllowPartialDelivery = new GridBagConstraints();
		gbc_chckbxAllowPartialDelivery.anchor = GridBagConstraints.WEST;
		gbc_chckbxAllowPartialDelivery.gridwidth = 5;
		gbc_chckbxAllowPartialDelivery.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxAllowPartialDelivery.gridx = 1;
		gbc_chckbxAllowPartialDelivery.gridy = 18;
		panel_3.add(chckbxAllowPartialDelivery, gbc_chckbxAllowPartialDelivery);
		
		JCheckBox chckbxAllowPartialDelivery_1 = new JCheckBox("Allow Partial Delivery per Row");
		GridBagConstraints gbc_chckbxAllowPartialDelivery_1 = new GridBagConstraints();
		gbc_chckbxAllowPartialDelivery_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxAllowPartialDelivery_1.gridwidth = 5;
		gbc_chckbxAllowPartialDelivery_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxAllowPartialDelivery_1.gridx = 1;
		gbc_chckbxAllowPartialDelivery_1.gridy = 19;
		panel_3.add(chckbxAllowPartialDelivery_1, gbc_chckbxAllowPartialDelivery_1);
		
		Component verticalStrut_24 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_24 = new GridBagConstraints();
		gbc_verticalStrut_24.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_24.gridx = 1;
		gbc_verticalStrut_24.gridy = 20;
		panel_3.add(verticalStrut_24, gbc_verticalStrut_24);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Payment System", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNoData_1 = new JLabel("No Data");
		GridBagConstraints gbc_lblNoData_1 = new GridBagConstraints();
		gbc_lblNoData_1.gridx = 1;
		gbc_lblNoData_1.gridy = 1;
		panel_4.add(lblNoData_1, gbc_lblNoData_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Accounting", null, panel_5, null);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_12 = new GridBagConstraints();
		gbc_verticalStrut_12.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_12.gridx = 1;
		gbc_verticalStrut_12.gridy = 0;
		panel_5.add(verticalStrut_12, gbc_verticalStrut_12);
		
		Component horizontalStrut_19 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_19 = new GridBagConstraints();
		gbc_horizontalStrut_19.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_19.gridx = 0;
		gbc_horizontalStrut_19.gridy = 1;
		panel_5.add(horizontalStrut_19, gbc_horizontalStrut_19);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_1 = new GridBagConstraints();
		gbc_tabbedPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane_1.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_1.gridx = 1;
		gbc_tabbedPane_1.gridy = 1;
		panel_5.add(tabbedPane_1, gbc_tabbedPane_1);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_1.addTab("General", null, panel_9, null);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{0, 0, 59, 0, 0, 0, 0, 0, 0};
		gbl_panel_9.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_14 = new GridBagConstraints();
		gbc_verticalStrut_14.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_14.gridx = 1;
		gbc_verticalStrut_14.gridy = 0;
		panel_9.add(verticalStrut_14, gbc_verticalStrut_14);
		
		Component horizontalStrut_22 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_22 = new GridBagConstraints();
		gbc_horizontalStrut_22.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_22.gridx = 0;
		gbc_horizontalStrut_22.gridy = 1;
		panel_9.add(horizontalStrut_22, gbc_horizontalStrut_22);
		
		JLabel lblConsolidatingBp = new JLabel("Consolidating BP");
		GridBagConstraints gbc_lblConsolidatingBp = new GridBagConstraints();
		gbc_lblConsolidatingBp.anchor = GridBagConstraints.WEST;
		gbc_lblConsolidatingBp.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsolidatingBp.gridx = 1;
		gbc_lblConsolidatingBp.gridy = 1;
		panel_9.add(lblConsolidatingBp, gbc_lblConsolidatingBp);
		
		Component horizontalStrut_21 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_21 = new GridBagConstraints();
		gbc_horizontalStrut_21.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_21.gridx = 2;
		gbc_horizontalStrut_21.gridy = 1;
		panel_9.add(horizontalStrut_21, gbc_horizontalStrut_21);
		
		JButton button_15 = new JButton("\u2192");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 3;
		gbc_button_15.gridy = 1;
		panel_9.add(button_15, gbc_button_15);
		
		textField_28 = new JTextField();
		textField_28.setText("US25-87634");
		textField_28.setColumns(10);
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 4;
		gbc_textField_28.gridy = 1;
		panel_9.add(textField_28, gbc_textField_28);
		
		JButton button_16 = new JButton("\u2630");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 5;
		gbc_button_16.gridy = 1;
		panel_9.add(button_16, gbc_button_16);
		
		JLabel lblSoftwareSystems = new JLabel("Software Systems");
		GridBagConstraints gbc_lblSoftwareSystems = new GridBagConstraints();
		gbc_lblSoftwareSystems.anchor = GridBagConstraints.WEST;
		gbc_lblSoftwareSystems.insets = new Insets(0, 0, 5, 5);
		gbc_lblSoftwareSystems.gridx = 6;
		gbc_lblSoftwareSystems.gridy = 1;
		panel_9.add(lblSoftwareSystems, gbc_lblSoftwareSystems);
		
		Component horizontalStrut_23 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_23 = new GridBagConstraints();
		gbc_horizontalStrut_23.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_23.gridx = 7;
		gbc_horizontalStrut_23.gridy = 1;
		panel_9.add(horizontalStrut_23, gbc_horizontalStrut_23);
		
		JRadioButton rdbtnPaymentsConsolidation = new JRadioButton("Payments Consolidation");
		GridBagConstraints gbc_rdbtnPaymentsConsolidation = new GridBagConstraints();
		gbc_rdbtnPaymentsConsolidation.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPaymentsConsolidation.gridwidth = 2;
		gbc_rdbtnPaymentsConsolidation.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPaymentsConsolidation.gridx = 1;
		gbc_rdbtnPaymentsConsolidation.gridy = 2;
		panel_9.add(rdbtnPaymentsConsolidation, gbc_rdbtnPaymentsConsolidation);
		
		JRadioButton rdbtnDeliveryConsolidation = new JRadioButton("Delivery Consolidation");
		rdbtnDeliveryConsolidation.setSelected(true);
		GridBagConstraints gbc_rdbtnDeliveryConsolidation = new GridBagConstraints();
		gbc_rdbtnDeliveryConsolidation.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDeliveryConsolidation.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDeliveryConsolidation.gridx = 4;
		gbc_rdbtnDeliveryConsolidation.gridy = 2;
		panel_9.add(rdbtnDeliveryConsolidation, gbc_rdbtnDeliveryConsolidation);
		
		Component verticalStrut_15 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_15 = new GridBagConstraints();
		gbc_verticalStrut_15.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_15.gridx = 1;
		gbc_verticalStrut_15.gridy = 3;
		panel_9.add(verticalStrut_15, gbc_verticalStrut_15);
		
		JLabel lblControlAccounts = new JLabel("Control Accounts");
		GridBagConstraints gbc_lblControlAccounts = new GridBagConstraints();
		gbc_lblControlAccounts.anchor = GridBagConstraints.WEST;
		gbc_lblControlAccounts.insets = new Insets(0, 0, 5, 5);
		gbc_lblControlAccounts.gridx = 1;
		gbc_lblControlAccounts.gridy = 4;
		panel_9.add(lblControlAccounts, gbc_lblControlAccounts);
		
		JButton button_18 = new JButton("...");
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.anchor = GridBagConstraints.WEST;
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 4;
		gbc_button_18.gridy = 4;
		panel_9.add(button_18, gbc_button_18);
		
		JLabel lblAccountsReceivable = new JLabel("Accounts Receivable");
		GridBagConstraints gbc_lblAccountsReceivable = new GridBagConstraints();
		gbc_lblAccountsReceivable.anchor = GridBagConstraints.WEST;
		gbc_lblAccountsReceivable.insets = new Insets(0, 0, 5, 5);
		gbc_lblAccountsReceivable.gridx = 1;
		gbc_lblAccountsReceivable.gridy = 5;
		panel_9.add(lblAccountsReceivable, gbc_lblAccountsReceivable);
		
		JButton button_17 = new JButton("\u2192");
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 3;
		gbc_button_17.gridy = 5;
		panel_9.add(button_17, gbc_button_17);
		
		textField_29 = new JTextField();
		textField_29.setEnabled(false);
		textField_29.setEditable(false);
		textField_29.setText("12100000-01-001-01");
		textField_29.setColumns(10);
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 4;
		gbc_textField_29.gridy = 5;
		panel_9.add(textField_29, gbc_textField_29);
		
		JLabel lblAccoutReceivable = new JLabel("Accout Receivable - Domestic (HO, USA, GA)");
		GridBagConstraints gbc_lblAccoutReceivable = new GridBagConstraints();
		gbc_lblAccoutReceivable.insets = new Insets(0, 0, 5, 5);
		gbc_lblAccoutReceivable.anchor = GridBagConstraints.WEST;
		gbc_lblAccoutReceivable.gridwidth = 2;
		gbc_lblAccoutReceivable.gridx = 5;
		gbc_lblAccoutReceivable.gridy = 5;
		panel_9.add(lblAccoutReceivable, gbc_lblAccoutReceivable);
		
		Component verticalStrut_16 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_16 = new GridBagConstraints();
		gbc_verticalStrut_16.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_16.gridx = 1;
		gbc_verticalStrut_16.gridy = 6;
		panel_9.add(verticalStrut_16, gbc_verticalStrut_16);
		
		JCheckBox chckbxBlcokDunningLetters = new JCheckBox("Blcok Dunning Letters");
		GridBagConstraints gbc_chckbxBlcokDunningLetters = new GridBagConstraints();
		gbc_chckbxBlcokDunningLetters.anchor = GridBagConstraints.WEST;
		gbc_chckbxBlcokDunningLetters.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxBlcokDunningLetters.gridx = 1;
		gbc_chckbxBlcokDunningLetters.gridy = 7;
		panel_9.add(chckbxBlcokDunningLetters, gbc_chckbxBlcokDunningLetters);
		
		JLabel lblDunningLevel = new JLabel("Dunning Level");
		GridBagConstraints gbc_lblDunningLevel = new GridBagConstraints();
		gbc_lblDunningLevel.anchor = GridBagConstraints.WEST;
		gbc_lblDunningLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblDunningLevel.gridx = 1;
		gbc_lblDunningLevel.gridy = 8;
		panel_9.add(lblDunningLevel, gbc_lblDunningLevel);
		
		textField_30 = new JTextField();
		textField_30.setText("1");
		textField_30.setEnabled(false);
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 4;
		gbc_textField_30.gridy = 8;
		panel_9.add(textField_30, gbc_textField_30);
		
		JLabel lblDunningDate = new JLabel("Dunning Date");
		GridBagConstraints gbc_lblDunningDate = new GridBagConstraints();
		gbc_lblDunningDate.anchor = GridBagConstraints.WEST;
		gbc_lblDunningDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblDunningDate.gridx = 1;
		gbc_lblDunningDate.gridy = 9;
		panel_9.add(lblDunningDate, gbc_lblDunningDate);
		
		textField_31 = new JTextField();
		textField_31.setText("02/12/05");
		textField_31.setEnabled(false);
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 4;
		gbc_textField_31.gridy = 9;
		panel_9.add(textField_31, gbc_textField_31);
		
		Component verticalStrut_17 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_17 = new GridBagConstraints();
		gbc_verticalStrut_17.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_17.gridx = 1;
		gbc_verticalStrut_17.gridy = 10;
		panel_9.add(verticalStrut_17, gbc_verticalStrut_17);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_1.addTab("Tax", null, panel_10, null);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{0, 0, 0};
		gbl_panel_10.rowHeights = new int[]{0, 0, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JLabel lblNoData = new JLabel("No data");
		GridBagConstraints gbc_lblNoData = new GridBagConstraints();
		gbc_lblNoData.gridx = 1;
		gbc_lblNoData.gridy = 1;
		panel_10.add(lblNoData, gbc_lblNoData);
		
		Component horizontalStrut_20 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_20 = new GridBagConstraints();
		gbc_horizontalStrut_20.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_20.gridx = 2;
		gbc_horizontalStrut_20.gridy = 1;
		panel_5.add(horizontalStrut_20, gbc_horizontalStrut_20);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_13 = new GridBagConstraints();
		gbc_verticalStrut_13.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_13.gridx = 1;
		gbc_verticalStrut_13.gridy = 2;
		panel_5.add(verticalStrut_13, gbc_verticalStrut_13);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Properties", null, panel_6, null);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 493, 0, 241, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		Component verticalStrut_18 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_18 = new GridBagConstraints();
		gbc_verticalStrut_18.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_18.gridx = 1;
		gbc_verticalStrut_18.gridy = 0;
		panel_6.add(verticalStrut_18, gbc_verticalStrut_18);
		
		Component horizontalStrut_24 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_24 = new GridBagConstraints();
		gbc_horizontalStrut_24.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_24.gridx = 0;
		gbc_horizontalStrut_24.gridy = 1;
		panel_6.add(horizontalStrut_24, gbc_horizontalStrut_24);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "L-East Coast", null},
				{new Integer(2), "L-West Coast", null},
				{new Integer(3), "L-North East", null},
				{new Integer(4), "L-South West", null},
				{new Integer(5), "L-South EAST", null},
				{new Integer(6), "L-West Europe", null},
				{new Integer(7), "L-East Europe", null},
				{new Integer(8), "L-South America", null},
				{new Integer(9), "L-North America", null},
				{new Integer(10), "c-Good Credit", null},
			},
			new String[] {
				"#", "Property Name", " "
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(197);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		panel_6.add(table, gbc_table);
		
		Component horizontalStrut_26 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_26 = new GridBagConstraints();
		gbc_horizontalStrut_26.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_26.gridx = 2;
		gbc_horizontalStrut_26.gridy = 1;
		panel_6.add(horizontalStrut_26, gbc_horizontalStrut_26);
		
		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 5);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 3;
		gbc_panel_11.gridy = 1;
		panel_6.add(panel_11, gbc_panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{0, 0, 0};
		gbl_panel_11.rowHeights = new int[]{0, 0, 0};
		gbl_panel_11.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		JButton btnSelectAll = new JButton("Select All");
		GridBagConstraints gbc_btnSelectAll = new GridBagConstraints();
		gbc_btnSelectAll.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSelectAll.insets = new Insets(0, 0, 5, 5);
		gbc_btnSelectAll.gridx = 0;
		gbc_btnSelectAll.gridy = 0;
		panel_11.add(btnSelectAll, gbc_btnSelectAll);
		
		JButton btnClearSelection = new JButton("Clear Selection");
		GridBagConstraints gbc_btnClearSelection = new GridBagConstraints();
		gbc_btnClearSelection.insets = new Insets(0, 0, 0, 5);
		gbc_btnClearSelection.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClearSelection.gridx = 0;
		gbc_btnClearSelection.gridy = 1;
		panel_11.add(btnClearSelection, gbc_btnClearSelection);
		
		Component horizontalStrut_25 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_25 = new GridBagConstraints();
		gbc_horizontalStrut_25.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_25.gridx = 4;
		gbc_horizontalStrut_25.gridy = 1;
		panel_6.add(horizontalStrut_25, gbc_horizontalStrut_25);
		
		Component verticalStrut_19 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_19 = new GridBagConstraints();
		gbc_verticalStrut_19.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_19.gridx = 1;
		gbc_verticalStrut_19.gridy = 2;
		panel_6.add(verticalStrut_19, gbc_verticalStrut_19);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Remarks", null, panel_7, null);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JButton btnNewButton = new JButton("\uD83D\uDCF7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Component verticalStrut_20 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_20 = new GridBagConstraints();
		gbc_verticalStrut_20.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_20.gridx = 1;
		gbc_verticalStrut_20.gridy = 0;
		panel_7.add(verticalStrut_20, gbc_verticalStrut_20);
		
		Component horizontalStrut_27 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_27 = new GridBagConstraints();
		gbc_horizontalStrut_27.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_27.gridx = 0;
		gbc_horizontalStrut_27.gridy = 1;
		panel_7.add(horizontalStrut_27, gbc_horizontalStrut_27);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel_7.add(btnNewButton, gbc_btnNewButton);
		
		JTextArea txtrRemarkData = new JTextArea();
		txtrRemarkData.setText("Remark data");
		GridBagConstraints gbc_txtrRemarkData = new GridBagConstraints();
		gbc_txtrRemarkData.insets = new Insets(0, 0, 5, 5);
		gbc_txtrRemarkData.fill = GridBagConstraints.BOTH;
		gbc_txtrRemarkData.gridx = 2;
		gbc_txtrRemarkData.gridy = 1;
		panel_7.add(txtrRemarkData, gbc_txtrRemarkData);
		
		Component horizontalStrut_28 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_28 = new GridBagConstraints();
		gbc_horizontalStrut_28.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut_28.gridx = 3;
		gbc_horizontalStrut_28.gridy = 1;
		panel_7.add(horizontalStrut_28, gbc_horizontalStrut_28);
		
		Component verticalStrut_21 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_21 = new GridBagConstraints();
		gbc_verticalStrut_21.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_21.gridx = 1;
		gbc_verticalStrut_21.gridy = 2;
		panel_7.add(verticalStrut_21, gbc_verticalStrut_21);
		
		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_8.gridwidth = 13;
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 1;
		gbc_panel_8.gridy = 9;
		contentPane.add(panel_8, gbc_panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 저장 핸들러
				String name = txtNormThompson.getText();
				System.out.println(name);
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 0, 5);
		gbc_btnOk.gridx = 0;
		gbc_btnOk.gridy = 0;
		panel_8.add(btnOk, gbc_btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 0;
		panel_8.add(btnCancel, gbc_btnCancel);
		
		JButton btnRelatedServiceCalls = new JButton("Related Service Calls");
		GridBagConstraints gbc_btnRelatedServiceCalls = new GridBagConstraints();
		gbc_btnRelatedServiceCalls.insets = new Insets(0, 0, 0, 5);
		gbc_btnRelatedServiceCalls.gridx = 3;
		gbc_btnRelatedServiceCalls.gridy = 0;
		panel_8.add(btnRelatedServiceCalls, gbc_btnRelatedServiceCalls);
		
		JButton btnActivity = new JButton("Activity");
		btnActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnActivity = new GridBagConstraints();
		gbc_btnActivity.insets = new Insets(0, 0, 0, 5);
		gbc_btnActivity.gridx = 4;
		gbc_btnActivity.gridy = 0;
		panel_8.add(btnActivity, gbc_btnActivity);
		
		JButton btnRelatedActivities = new JButton("Related Activities");
		GridBagConstraints gbc_btnRelatedActivities = new GridBagConstraints();
		gbc_btnRelatedActivities.anchor = GridBagConstraints.EAST;
		gbc_btnRelatedActivities.gridx = 5;
		gbc_btnRelatedActivities.gridy = 0;
		panel_8.add(btnRelatedActivities, gbc_btnRelatedActivities);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut_4.gridx = 1;
		gbc_verticalStrut_4.gridy = 10;
		contentPane.add(verticalStrut_4, gbc_verticalStrut_4);
	}
	
	
	void applyResultToForm(ResultSet result) {
		try {
			this.txtC.setText(result.getString("C_BPARTNER_ID"));
			this.txtNormThompson.setText(result.getString("NAME"));
			this.textField.setText(result.getString("NAME2"));
			
			int BPartnerType = 1;
			if (result.getString("ISCUSTOMER") == "Y") {
				BPartnerType = 1;
			} else if (result.getString("ISVENDOR") == "Y") {
				BPartnerType = 3;
			} else {
				BPartnerType = 2;
			}
			this.comboBox.setSelectedIndex(BPartnerType);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
