package com.steven.mediaTools;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.steven.db.TotalSchema;

public class NewVersion extends JFrame {

	private static final long serialVersionUID = 6935987817256367225L;

	private JLabel name_label;
	private JLabel vpip_label;
	private JLabel pfr_label;
	private JLabel desc_label;

	private JLabel per_flop_all_label;
	private JLabel per_flop_bet_label;
	private JLabel per_flop_call_label;
	private JLabel per_flop_fold_label;
	private JLabel per_flop_limp_label;
	private JLabel per_flop_raise_label;
	private JLabel per_flop_bet_fold_label;
	private JLabel per_flop_bet_call_label;
	private JLabel per_flop_bet_raise_label;
	private JLabel per_flop_call_fold_label;
	private JLabel per_flop_call_call_label;
	private JLabel per_flop_call_raise_label;
	private JLabel per_flop_limp_fold_label;
	private JLabel per_flop_limp_call_label;
	private JLabel per_flop_limp_raise_label;
	private JLabel per_flop_raise_fold_label;
	private JLabel per_flop_raise_call_label;
	private JLabel per_flop_raise_raise_label;

	private JLabel flop_all_label;
	private JLabel flop_bet_label;
	private JLabel flop_check_label;
	private JLabel flop_call_label;
	private JLabel flop_fold_label;
	private JLabel flop_raise_label;
	private JLabel flop_bet_call_label;
	private JLabel flop_bet_fold_label;
	private JLabel flop_bet_raise_label;
	private JLabel flop_check_call_label;
	private JLabel flop_check_fold_label;
	private JLabel flop_check_raise_label;
	private JLabel flop_raise_fold_label;
	private JLabel flop_raise_call_label;
	private JLabel flop_raise_raise_label;

	private JLabel turn_all_label;
	private JLabel turn_bet_label;
	private JLabel turn_check_label;
	private JLabel turn_call_label;
	private JLabel turn_fold_label;
	private JLabel turn_raise_label;
	private JLabel turn_bet_call_label;
	private JLabel turn_bet_fold_label;
	private JLabel turn_bet_raise_label;
	private JLabel turn_check_call_label;
	private JLabel turn_check_fold_label;
	private JLabel turn_check_raise_label;
	private JLabel turn_raise_fold_label;
	private JLabel turn_raise_call_label;
	private JLabel turn_raise_raise_label;

	private JLabel river_all_label;
	private JLabel river_bet_label;
	private JLabel river_check_label;
	private JLabel river_call_label;
	private JLabel river_fold_label;
	private JLabel river_raise_label;
	private JLabel river_bet_call_label;
	private JLabel river_bet_fold_label;
	private JLabel river_bet_raise_label;
	private JLabel river_check_call_label;
	private JLabel river_check_fold_label;
	private JLabel river_check_raise_label;
	private JLabel river_raise_fold_label;
	private JLabel river_raise_call_label;
	private JLabel river_raise_raise_label;

	private JTextField name_field;
	private JTextField vpip_field;
	private JTextField pfr_field;
	private JTextField desc_field;

	private JTextField per_flop_all_field;
	private JTextField per_flop_bet_field;
	private JTextField per_flop_call_field;
	private JTextField per_flop_fold_field;
	private JTextField per_flop_limp_field;
	private JTextField per_flop_raise_field;
	private JTextField per_flop_bet_fold_field;
	private JTextField per_flop_bet_call_field;
	private JTextField per_flop_bet_raise_field;
	private JTextField per_flop_call_fold_field;
	private JTextField per_flop_call_call_field;
	private JTextField per_flop_call_raise_field;
	private JTextField per_flop_limp_fold_field;
	private JTextField per_flop_limp_call_field;
	private JTextField per_flop_limp_raise_field;
	private JTextField per_flop_raise_fold_field;
	private JTextField per_flop_raise_call_field;
	private JTextField per_flop_raise_raise_field;

	private JTextField flop_all_field;
	private JTextField flop_bet_field;
	private JTextField flop_check_field;
	private JTextField flop_call_field;
	private JTextField flop_fold_field;
	private JTextField flop_raise_field;
	private JTextField flop_bet_call_field;
	private JTextField flop_bet_fold_field;
	private JTextField flop_bet_raise_field;
	private JTextField flop_check_call_field;
	private JTextField flop_check_fold_field;
	private JTextField flop_check_raise_field;
	private JTextField flop_raise_fold_field;
	private JTextField flop_raise_call_field;
	private JTextField flop_raise_raise_field;

	private JTextField turn_all_field;
	private JTextField turn_bet_field;
	private JTextField turn_check_field;
	private JTextField turn_call_field;
	private JTextField turn_fold_field;
	private JTextField turn_raise_field;
	private JTextField turn_bet_call_field;
	private JTextField turn_bet_fold_field;
	private JTextField turn_bet_raise_field;
	private JTextField turn_check_call_field;
	private JTextField turn_check_fold_field;
	private JTextField turn_check_raise_field;
	private JTextField turn_raise_fold_field;
	private JTextField turn_raise_call_field;
	private JTextField turn_raise_raise_field;

	private JTextField river_all_field;
	private JTextField river_bet_field;
	private JTextField river_check_field;
	private JTextField river_call_field;
	private JTextField river_fold_field;
	private JTextField river_raise_field;
	private JTextField river_bet_call_field;
	private JTextField river_bet_fold_field;
	private JTextField river_bet_raise_field;
	private JTextField river_check_call_field;
	private JTextField river_check_fold_field;
	private JTextField river_check_raise_field;
	private JTextField river_raise_fold_field;
	private JTextField river_raise_call_field;
	private JTextField river_raise_raise_field;

	JButton query_button = new JButton("查询");
	JButton save_button = new JButton("保存");
	JButton clear_button = new JButton("重置");

	public static void main(String[] args) {
		NewVersion window = new NewVersion();
		window.setVisible(true);
		window.setTitle("冷静");
		window.setSize(1000, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	int textFieldlength = 10;

	private void initComponent() {

		name_field = new JTextField(textFieldlength);
		vpip_field = new JTextField(textFieldlength);
		pfr_field = new JTextField(textFieldlength);
		desc_field = new JTextField(30);

		per_flop_all_field = new JTextField(textFieldlength);
		per_flop_bet_field = new JTextField(textFieldlength);
		per_flop_call_field = new JTextField(textFieldlength);
		per_flop_fold_field = new JTextField(textFieldlength);
		per_flop_limp_field = new JTextField(textFieldlength);
		per_flop_raise_field = new JTextField(textFieldlength);
		per_flop_bet_fold_field = new JTextField(textFieldlength);
		per_flop_bet_call_field = new JTextField(textFieldlength);
		per_flop_bet_raise_field = new JTextField(textFieldlength);
		per_flop_call_fold_field = new JTextField(textFieldlength);
		per_flop_call_call_field = new JTextField(textFieldlength);
		per_flop_call_raise_field = new JTextField(textFieldlength);
		per_flop_limp_fold_field = new JTextField(textFieldlength);
		per_flop_limp_call_field = new JTextField(textFieldlength);
		per_flop_limp_raise_field = new JTextField(textFieldlength);
		per_flop_raise_fold_field = new JTextField(textFieldlength);
		per_flop_raise_call_field = new JTextField(textFieldlength);
		per_flop_raise_raise_field = new JTextField(textFieldlength);

		flop_all_field = new JTextField(textFieldlength);
		flop_bet_field = new JTextField(textFieldlength);
		flop_check_field = new JTextField(textFieldlength);
		flop_call_field = new JTextField(textFieldlength);
		flop_fold_field = new JTextField(textFieldlength);
		flop_raise_field = new JTextField(textFieldlength);
		flop_bet_call_field = new JTextField(textFieldlength);
		flop_bet_fold_field = new JTextField(textFieldlength);
		flop_bet_raise_field = new JTextField(textFieldlength);
		flop_check_call_field = new JTextField(textFieldlength);
		flop_check_fold_field = new JTextField(textFieldlength);
		flop_check_raise_field = new JTextField(textFieldlength);
		flop_raise_fold_field = new JTextField(textFieldlength);
		flop_raise_call_field = new JTextField(textFieldlength);
		flop_raise_raise_field = new JTextField(textFieldlength);

		turn_all_field = new JTextField(textFieldlength);
		turn_bet_field = new JTextField(textFieldlength);
		turn_check_field = new JTextField(textFieldlength);
		turn_call_field = new JTextField(textFieldlength);
		turn_fold_field = new JTextField(textFieldlength);
		turn_raise_field = new JTextField(textFieldlength);
		turn_bet_call_field = new JTextField(textFieldlength);
		turn_bet_fold_field = new JTextField(textFieldlength);
		turn_bet_raise_field = new JTextField(textFieldlength);
		turn_check_call_field = new JTextField(textFieldlength);
		turn_check_fold_field = new JTextField(textFieldlength);
		turn_check_raise_field = new JTextField(textFieldlength);
		turn_raise_fold_field = new JTextField(textFieldlength);
		turn_raise_call_field = new JTextField(textFieldlength);
		turn_raise_raise_field = new JTextField(textFieldlength);

		river_all_field = new JTextField(textFieldlength);
		river_bet_field = new JTextField(textFieldlength);
		river_check_field = new JTextField(textFieldlength);
		river_call_field = new JTextField(textFieldlength);
		river_fold_field = new JTextField(textFieldlength);
		river_raise_field = new JTextField(textFieldlength);
		river_bet_call_field = new JTextField(textFieldlength);
		river_bet_fold_field = new JTextField(textFieldlength);
		river_bet_raise_field = new JTextField(textFieldlength);
		river_check_call_field = new JTextField(textFieldlength);
		river_check_fold_field = new JTextField(textFieldlength);
		river_check_raise_field = new JTextField(textFieldlength);
		river_raise_fold_field = new JTextField(textFieldlength);
		river_raise_call_field = new JTextField(textFieldlength);
		river_raise_raise_field = new JTextField(textFieldlength);

		name_label = new JLabel("名字");
		vpip_label = new JLabel("vpip");
		pfr_label = new JLabel("pfr");
		desc_label = new JLabel("备注");

		per_flop_all_label = new JLabel("翻牌前");
		per_flop_bet_label = new JLabel("bet");
		per_flop_call_label = new JLabel("call");
		per_flop_fold_label = new JLabel("fold");
		per_flop_limp_label = new JLabel("limp");
		per_flop_raise_label = new JLabel("raise");
		per_flop_bet_fold_label = new JLabel("bet-fold    ");
		per_flop_bet_call_label = new JLabel("bet-call   ");
		per_flop_bet_raise_label = new JLabel("bet-raise    ");
		per_flop_call_fold_label = new JLabel("call-fold   ");
		per_flop_call_call_label = new JLabel("call-call   ");
		per_flop_call_raise_label = new JLabel("call-raise   ");
		per_flop_limp_fold_label = new JLabel("limp-fold  ");
		per_flop_limp_call_label = new JLabel("limp-call ");
		per_flop_limp_raise_label = new JLabel("limp-raise  ");
		per_flop_raise_fold_label = new JLabel("raise-fold");
		per_flop_raise_call_label = new JLabel("raise-call");
		per_flop_raise_raise_label = new JLabel("raise-raise");

		flop_all_label = new JLabel("翻牌");
		flop_bet_label = new JLabel("bet");
		flop_check_label = new JLabel("check");
		flop_call_label = new JLabel("call");
		flop_fold_label = new JLabel("fold");
		flop_raise_label = new JLabel("raise");
		flop_bet_call_label = new JLabel("bet-call     ");
		flop_bet_fold_label = new JLabel("bet-fold      ");
		flop_bet_raise_label = new JLabel("bet-raise      ");
		flop_check_call_label = new JLabel("check-call");
		flop_check_fold_label = new JLabel("check-fold");
		flop_check_raise_label = new JLabel("check-raise");
		flop_raise_fold_label = new JLabel("raise-fold  ");
		flop_raise_call_label = new JLabel("raise-call  ");
		flop_raise_raise_label = new JLabel("raise-raise  ");

		turn_all_label = new JLabel("转牌");
		turn_bet_label = new JLabel("bet");
		turn_check_label = new JLabel("check");
		turn_call_label = new JLabel("call");
		turn_fold_label = new JLabel("fold");
		turn_raise_label = new JLabel("raise");
		turn_bet_call_label = new JLabel("bet-call     ");
		turn_bet_fold_label = new JLabel("bet-fold      ");
		turn_bet_raise_label = new JLabel("bet-raise      ");
		turn_check_call_label = new JLabel("check-call");
		turn_check_fold_label = new JLabel("check-fold");
		turn_check_raise_label = new JLabel("check-raise");
		turn_raise_fold_label = new JLabel("raise-fold  ");
		turn_raise_call_label = new JLabel("raise-call  ");
		turn_raise_raise_label = new JLabel("raise-raise  ");

		river_all_label = new JLabel("河牌");
		river_bet_label = new JLabel("bet");
		river_check_label = new JLabel("check");
		river_call_label = new JLabel("call");
		river_fold_label = new JLabel("fold");
		river_raise_label = new JLabel("raise");
		river_bet_call_label = new JLabel("bet-call     ");
		river_bet_fold_label = new JLabel("bet-fold      ");
		river_bet_raise_label = new JLabel("bet-raise      ");
		river_check_call_label = new JLabel("check-call");
		river_check_fold_label = new JLabel("check-fold");
		river_check_raise_label = new JLabel("check-raise");
		river_raise_fold_label = new JLabel("raise-fold  ");
		river_raise_call_label = new JLabel("raise-call  ");
		river_raise_raise_label = new JLabel("raise-raise  ");

	}

	private void initUI() {
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout(5, 10));

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(2, 12, 0, 0));
		northPanel.add(createPanelForGridLeft(new JComponent[] { name_label, name_field, vpip_label, vpip_field,
				pfr_label, pfr_field, desc_label, desc_field }));
		northPanel.add(createPanelForSep(5));
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(22, 3, 0, 0));
		centerPanel.add(createPanelForGridLeft(
				new JComponent[] { per_flop_all_label, per_flop_all_field, per_flop_limp_label, per_flop_limp_field,
						per_flop_bet_label, per_flop_bet_field, per_flop_raise_label, per_flop_raise_field,
						per_flop_call_label, per_flop_call_field, per_flop_fold_label, per_flop_fold_field }));
		centerPanel.add(createPanelForGridLeft(
				new JComponent[] { per_flop_bet_fold_label, per_flop_bet_fold_field, per_flop_bet_call_label,
						per_flop_bet_call_field, per_flop_bet_raise_label, per_flop_bet_raise_field }));
		centerPanel.add(createPanelForGridLeft(
				new JComponent[] { per_flop_call_fold_label, per_flop_call_fold_field, per_flop_call_call_label,
						per_flop_call_call_field, per_flop_call_raise_label, per_flop_call_raise_field }));
		centerPanel.add(createPanelForGridLeft(
				new JComponent[] { per_flop_limp_fold_label, per_flop_limp_fold_field, per_flop_limp_call_label,
						per_flop_limp_call_field, per_flop_limp_raise_label, per_flop_limp_raise_field }));
		centerPanel.add(createPanelForGridLeft(
				new JComponent[] { per_flop_raise_fold_label, per_flop_raise_fold_field, per_flop_raise_call_label,
						per_flop_raise_call_field, per_flop_raise_raise_label, per_flop_raise_raise_field }));
		centerPanel.add(createPanelForSep(3));

		centerPanel.add(createPanelForGridLeft(new JComponent[] { flop_all_label, flop_all_field, flop_check_label,
				flop_check_field, flop_bet_label, flop_bet_field, flop_raise_label, flop_raise_field, flop_call_label,
				flop_call_field, flop_fold_label, flop_fold_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { flop_bet_fold_label, flop_bet_fold_field,
				flop_bet_call_label, flop_bet_call_field, flop_bet_raise_label, flop_bet_raise_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { flop_check_fold_label, flop_check_fold_field,
				flop_check_call_label, flop_check_call_field, flop_check_raise_label, flop_check_raise_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { flop_raise_fold_label, flop_raise_fold_field,
				flop_raise_call_label, flop_raise_call_field, flop_raise_raise_label, flop_raise_raise_field }));
		centerPanel.add(createPanelForSep(3));

		centerPanel.add(createPanelForGridLeft(new JComponent[] { turn_all_label, turn_all_field, turn_check_label,
				turn_check_field, turn_bet_label, turn_bet_field, turn_raise_label, turn_raise_field, turn_call_label,
				turn_call_field, turn_fold_label, turn_fold_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { turn_bet_fold_label, turn_bet_fold_field,
				turn_bet_call_label, turn_bet_call_field, turn_bet_raise_label, turn_bet_raise_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { turn_check_fold_label, turn_check_fold_field,
				turn_check_call_label, turn_check_call_field, turn_check_raise_label, turn_check_raise_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { turn_raise_fold_label, turn_raise_fold_field,
				turn_raise_call_label, turn_raise_call_field, turn_raise_raise_label, turn_raise_raise_field }));

		centerPanel.add(createPanelForSep(3));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { river_all_label, river_all_field, river_check_label,
				river_check_field, river_bet_label, river_bet_field, river_raise_label, river_raise_field,
				river_call_label, river_call_field, river_fold_label, river_fold_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { river_bet_fold_label, river_bet_fold_field,
				river_bet_call_label, river_bet_call_field, river_bet_raise_label, river_bet_raise_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { river_check_fold_label, river_check_fold_field,
				river_check_call_label, river_check_call_field, river_check_raise_label, river_check_raise_field }));
		centerPanel.add(createPanelForGridLeft(new JComponent[] { river_raise_fold_label, river_raise_fold_field,
				river_raise_call_label, river_raise_call_field, river_raise_raise_label, river_raise_raise_field }));

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2, 5, 5));
		southPanel.add(createPanelForGrid(new JComponent[] { query_button, save_button, clear_button }));

		contentPanel.add(BorderLayout.NORTH, northPanel);
		contentPanel.add(BorderLayout.CENTER, centerPanel);
		contentPanel.add(BorderLayout.SOUTH, southPanel);
		getContentPane().add(contentPanel);
	}

	private JPanel createPanelForGridLeft(JComponent[] allComponents) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		if (null != allComponents && allComponents.length > 0) {
			for (JComponent component : allComponents) {
				panel.add(component);
			}
		}
		return panel;
	}

	private JPanel createPanelForGridLeft(JComponent[] allComponents, Color color) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		if (null != allComponents && allComponents.length > 0) {
			for (JComponent component : allComponents) {
				panel.add(component);
			}
		}
		panel.setBorder(BorderFactory.createLineBorder(color));
		return panel;
	}

	private JPanel createPanelForGrid(JComponent[] allComponents) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		if (null != allComponents && allComponents.length > 0) {
			for (JComponent component : allComponents) {
				panel.add(component);
			}
		}
		return panel;
	}

	private JPanel createPanelForSep(int hight) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1000, hight));
		return panel;
	}

	public void addSaveButtonListener() {
		save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (name_field.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入名字", "提示", JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {
					TotalSchema schema = getText();
					SaveUtils.save(schema);
					clear();
					name_field.setText(schema.getName());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "保存错误，截图给你大爷", "提示", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	public void addLister() {
		addSaveButtonListener();
		addClearButtonListener();
		addQueryButtonListener();
	}

	public void addClearButtonListener() {
		clear_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
	}

	public void addQueryButtonListener() {
		query_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (name_field.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入名字", "提示", JOptionPane.ERROR_MESSAGE);
					return;
				}
				TotalSchema schema = SaveUtils.map.get(name_field.getText().trim());
				if(schema!=null){
					setText(schema);
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public NewVersion() {
		super();
		initComponent();
		initUI();
		addLister();
	}

	public void clear() {
		name_field.setText("");
		vpip_field.setText("");
		pfr_field.setText("");
		desc_field.setText("");

		per_flop_all_field.setText("");
		per_flop_bet_field.setText("");
		per_flop_call_field.setText("");
		per_flop_fold_field.setText("");
		per_flop_limp_field.setText("");
		per_flop_raise_field.setText("");
		per_flop_bet_fold_field.setText("");
		per_flop_bet_call_field.setText("");
		per_flop_bet_raise_field.setText("");
		per_flop_call_fold_field.setText("");
		per_flop_call_call_field.setText("");
		per_flop_call_raise_field.setText("");
		per_flop_limp_fold_field.setText("");
		per_flop_limp_call_field.setText("");
		per_flop_limp_raise_field.setText("");
		per_flop_raise_fold_field.setText("");
		per_flop_raise_call_field.setText("");
		per_flop_raise_raise_field.setText("");

		flop_all_field.setText("");
		flop_bet_field.setText("");
		flop_check_field.setText("");
		flop_call_field.setText("");
		flop_fold_field.setText("");
		flop_raise_field.setText("");
		flop_bet_call_field.setText("");
		flop_bet_fold_field.setText("");
		flop_bet_raise_field.setText("");
		flop_check_call_field.setText("");
		flop_check_fold_field.setText("");
		flop_check_raise_field.setText("");
		flop_raise_fold_field.setText("");
		flop_raise_call_field.setText("");
		flop_raise_raise_field.setText("");

		turn_all_field.setText("");
		turn_bet_field.setText("");
		turn_check_field.setText("");
		turn_call_field.setText("");
		turn_fold_field.setText("");
		turn_raise_field.setText("");
		turn_bet_call_field.setText("");
		turn_bet_fold_field.setText("");
		turn_bet_raise_field.setText("");
		turn_check_call_field.setText("");
		turn_check_fold_field.setText("");
		turn_check_raise_field.setText("");
		turn_raise_fold_field.setText("");
		turn_raise_call_field.setText("");
		turn_raise_raise_field.setText("");

		river_all_field.setText("");
		river_bet_field.setText("");
		river_check_field.setText("");
		river_call_field.setText("");
		river_fold_field.setText("");
		river_raise_field.setText("");
		river_bet_call_field.setText("");
		river_bet_fold_field.setText("");
		river_bet_raise_field.setText("");
		river_check_call_field.setText("");
		river_check_fold_field.setText("");
		river_check_raise_field.setText("");
		river_raise_fold_field.setText("");
		river_raise_call_field.setText("");
		river_raise_raise_field.setText("");
	}

	public TotalSchema getText() {
		TotalSchema schema = new TotalSchema();
		if (isNotEmpty(name_field.getText())) {
			schema.setName(name_field.getText());
		}
		if (isNotEmpty(vpip_field.getText())) {
			schema.setVpip(vpip_field.getText());
		}
		if (isNotEmpty(pfr_field.getText())) {
			schema.setPfr(pfr_field.getText());
		}
		if (isNotEmpty(desc_field.getText())) {
			schema.setDesc(desc_field.getText());
		}
		if (isNotEmpty(per_flop_all_field.getText())) {
			schema.setPer_flop_all(Integer.parseInt(per_flop_all_field.getText()));
		}
		if (isNotEmpty(per_flop_bet_field.getText())) {
			schema.setPer_flop_bet(per_flop_bet_field.getText());
		}
		if (isNotEmpty(per_flop_call_field.getText())) {
			schema.setPer_flop_call(per_flop_call_field.getText());
		}
		if (isNotEmpty(per_flop_fold_field.getText())) {
			schema.setPer_flop_fold(per_flop_fold_field.getText());
		}
		if (isNotEmpty(per_flop_limp_field.getText())) {
			schema.setPer_flop_limp(per_flop_limp_field.getText());
		}
		if (isNotEmpty(per_flop_raise_field.getText())) {
			schema.setPer_flop_raise(per_flop_raise_field.getText());
		}
		if (isNotEmpty(per_flop_bet_fold_field.getText())) {
			schema.setPer_flop_bet_fold(per_flop_bet_fold_field.getText());
		}
		if (isNotEmpty(per_flop_bet_call_field.getText())) {
			schema.setPer_flop_bet_call(per_flop_bet_call_field.getText());
		}
		if (isNotEmpty(per_flop_bet_raise_field.getText())) {
			schema.setPer_flop_bet_raise(per_flop_bet_raise_field.getText());
		}
		if (isNotEmpty(per_flop_call_fold_field.getText())) {
			schema.setPer_flop_call_fold(per_flop_call_fold_field.getText());
		}
		if (isNotEmpty(per_flop_call_call_field.getText())) {
			schema.setPer_flop_call_call(per_flop_call_call_field.getText());
		}
		if (isNotEmpty(per_flop_call_raise_field.getText())) {
			schema.setPer_flop_call_raise(per_flop_call_raise_field.getText());
		}
		if (isNotEmpty(per_flop_limp_fold_field.getText())) {
			schema.setPer_flop_limp_fold(per_flop_limp_fold_field.getText());
		}
		if (isNotEmpty(per_flop_limp_call_field.getText())) {
			schema.setPer_flop_limp_call(per_flop_limp_call_field.getText());
		}
		if (isNotEmpty(per_flop_limp_raise_field.getText())) {
			schema.setPer_flop_limp_raise(per_flop_limp_raise_field.getText());
		}
		if (isNotEmpty(per_flop_raise_fold_field.getText())) {
			schema.setPer_flop_raise_fold(per_flop_raise_fold_field.getText());
		}
		if (isNotEmpty(per_flop_raise_call_field.getText())) {
			schema.setPer_flop_raise_call(per_flop_raise_call_field.getText());
		}
		if (isNotEmpty(per_flop_raise_raise_field.getText())) {
			schema.setPer_flop_raise_raise(per_flop_raise_raise_field.getText());
		}
		if (isNotEmpty(flop_all_field.getText())) {
			schema.setFlop_all(Integer.parseInt(flop_all_field.getText()));
		}
		if (isNotEmpty(flop_bet_field.getText())) {
			schema.setFlop_bet(flop_bet_field.getText());
		}
		if (isNotEmpty(flop_check_field.getText())) {
			schema.setFlop_check(flop_check_field.getText());
		}
		if (isNotEmpty(flop_call_field.getText())) {
			schema.setFlop_call(flop_call_field.getText());
		}
		if (isNotEmpty(flop_fold_field.getText())) {
			schema.setFlop_fold(flop_fold_field.getText());
		}
		if (isNotEmpty(flop_raise_field.getText())) {
			schema.setFlop_raise(flop_raise_field.getText());
		}
		if (isNotEmpty(flop_bet_call_field.getText())) {
			schema.setFlop_bet_call(flop_bet_call_field.getText());
		}
		if (isNotEmpty(flop_bet_fold_field.getText())) {
			schema.setFlop_bet_fold(flop_bet_fold_field.getText());
		}
		if (isNotEmpty(flop_bet_raise_field.getText())) {
			schema.setFlop_bet_raise(flop_bet_raise_field.getText());
		}
		if (isNotEmpty(flop_check_call_field.getText())) {
			schema.setFlop_check_call(flop_check_call_field.getText());
		}
		if (isNotEmpty(flop_check_fold_field.getText())) {
			schema.setFlop_check_fold(flop_check_fold_field.getText());
		}
		if (isNotEmpty(flop_check_raise_field.getText())) {
			schema.setFlop_check_raise(flop_check_raise_field.getText());
		}
		if (isNotEmpty(flop_raise_fold_field.getText())) {
			schema.setFlop_raise_fold(flop_raise_fold_field.getText());
		}
		if (isNotEmpty(flop_raise_call_field.getText())) {
			schema.setFlop_raise_call(flop_raise_call_field.getText());
		}
		if (isNotEmpty(flop_raise_raise_field.getText())) {
			schema.setFlop_raise_raise(flop_raise_raise_field.getText());
		}
		if (isNotEmpty(turn_all_field.getText())) {
			schema.setTurn_all(Integer.parseInt(turn_all_field.getText()));
		}
		if (isNotEmpty(turn_bet_field.getText())) {
			schema.setTurn_bet(turn_bet_field.getText());
		}
		if (isNotEmpty(turn_check_field.getText())) {
			schema.setTurn_check(turn_check_field.getText());
		}
		if (isNotEmpty(turn_call_field.getText())) {
			schema.setTurn_call(turn_call_field.getText());
		}
		if (isNotEmpty(turn_fold_field.getText())) {
			schema.setTurn_fold(turn_fold_field.getText());
		}
		if (isNotEmpty(turn_raise_field.getText())) {
			schema.setTurn_raise(turn_raise_field.getText());
		}
		if (isNotEmpty(turn_bet_call_field.getText())) {
			schema.setTurn_bet_call(turn_bet_call_field.getText());
		}
		if (isNotEmpty(turn_bet_fold_field.getText())) {
			schema.setTurn_bet_fold(turn_bet_fold_field.getText());
		}
		if (isNotEmpty(turn_bet_raise_field.getText())) {
			schema.setTurn_bet_raise(turn_bet_raise_field.getText());
		}
		if (isNotEmpty(turn_check_call_field.getText())) {
			schema.setTurn_check_call(turn_check_call_field.getText());
		}
		if (isNotEmpty(turn_check_fold_field.getText())) {
			schema.setTurn_check_fold(turn_check_fold_field.getText());
		}
		if (isNotEmpty(turn_check_raise_field.getText())) {
			schema.setTurn_check_raise(turn_check_raise_field.getText());
		}
		if (isNotEmpty(turn_raise_fold_field.getText())) {
			schema.setTurn_raise_fold(turn_raise_fold_field.getText());
		}
		if (isNotEmpty(turn_raise_call_field.getText())) {
			schema.setTurn_raise_call(turn_raise_call_field.getText());
		}
		if (isNotEmpty(turn_raise_raise_field.getText())) {
			schema.setTurn_raise_raise(turn_raise_raise_field.getText());
		}
		if (isNotEmpty(river_all_field.getText())) {
			schema.setRiver_all(Integer.parseInt(river_all_field.getText()));
		}
		if (isNotEmpty(river_bet_field.getText())) {
			schema.setRiver_bet(river_bet_field.getText());
		}
		if (isNotEmpty(river_check_field.getText())) {
			schema.setRiver_check(river_check_field.getText());
		}
		if (isNotEmpty(river_call_field.getText())) {
			schema.setRiver_call(river_call_field.getText());
		}
		if (isNotEmpty(river_fold_field.getText())) {
			schema.setRiver_fold(river_fold_field.getText());
		}
		if (isNotEmpty(river_raise_field.getText())) {
			schema.setRiver_raise(river_raise_field.getText());
		}
		if (isNotEmpty(river_bet_call_field.getText())) {
			schema.setRiver_bet_call(river_bet_call_field.getText());
		}
		if (isNotEmpty(river_bet_fold_field.getText())) {
			schema.setRiver_bet_fold(river_bet_fold_field.getText());
		}
		if (isNotEmpty(river_bet_raise_field.getText())) {
			schema.setRiver_bet_raise(river_bet_raise_field.getText());
		}
		if (isNotEmpty(river_check_call_field.getText())) {
			schema.setRiver_check_call(river_check_call_field.getText());
		}
		if (isNotEmpty(river_check_fold_field.getText())) {
			schema.setRiver_check_fold(river_check_fold_field.getText());
		}
		if (isNotEmpty(river_check_raise_field.getText())) {
			schema.setRiver_check_raise(river_check_raise_field.getText());
		}
		if (isNotEmpty(river_raise_fold_field.getText())) {
			schema.setRiver_raise_fold(river_raise_fold_field.getText());
		}
		if (isNotEmpty(river_raise_call_field.getText())) {
			schema.setRiver_raise_call(river_raise_call_field.getText());
		}
		if (isNotEmpty(river_raise_raise_field.getText())) {
			schema.setRiver_raise_raise(river_raise_raise_field.getText());
		}
		return schema;
	}

	public void setText(TotalSchema schema) {
		name_field.setText(schema.getName());
		vpip_field.setText(schema.getVpip());
		pfr_field.setText(schema.getPfr());
		desc_field.setText(schema.getDesc());

		per_flop_all_field.setText(schema.getPer_flop_all()+"");
		per_flop_bet_field.setText(schema.getPer_flop_bet());
		per_flop_call_field.setText(schema.getPer_flop_call());
		per_flop_fold_field.setText(schema.getPer_flop_fold());
		per_flop_limp_field.setText(schema.getPer_flop_limp());
		per_flop_raise_field.setText(schema.getPer_flop_raise());
		per_flop_bet_fold_field.setText(schema.getPer_flop_bet_fold());
		per_flop_bet_call_field.setText(schema.getPer_flop_bet_call());
		per_flop_bet_raise_field.setText(schema.getPer_flop_bet_raise());
		per_flop_call_fold_field.setText(schema.getPer_flop_call_fold());
		per_flop_call_call_field.setText(schema.getPer_flop_call_call());
		per_flop_call_raise_field.setText(schema.getPer_flop_call_raise());
		per_flop_limp_fold_field.setText(schema.getPer_flop_limp_fold());
		per_flop_limp_call_field.setText(schema.getPer_flop_limp_call());
		per_flop_limp_raise_field.setText(schema.getPer_flop_limp_raise());
		per_flop_raise_fold_field.setText(schema.getPer_flop_raise_fold());
		per_flop_raise_call_field.setText(schema.getPer_flop_raise_call());
		per_flop_raise_raise_field.setText(schema.getPer_flop_raise_raise());

		flop_all_field.setText(schema.getFlop_all()+"");
		flop_bet_field.setText(schema.getFlop_bet());
		flop_check_field.setText(schema.getFlop_check());
		flop_call_field.setText(schema.getFlop_call());
		flop_fold_field.setText(schema.getFlop_fold());
		flop_raise_field.setText(schema.getFlop_raise());
		flop_bet_call_field.setText(schema.getFlop_bet_call());
		flop_bet_fold_field.setText(schema.getFlop_bet_fold());
		flop_bet_raise_field.setText(schema.getFlop_bet_raise());
		flop_check_call_field.setText(schema.getFlop_check_call());
		flop_check_fold_field.setText(schema.getFlop_check_fold());
		flop_check_raise_field.setText(schema.getFlop_check_raise());
		flop_raise_fold_field.setText(schema.getFlop_raise_fold());
		flop_raise_call_field.setText(schema.getFlop_raise_call());
		flop_raise_raise_field.setText(schema.getFlop_raise_raise());

		turn_all_field.setText(schema.getTurn_all()+"");
		turn_bet_field.setText(schema.getTurn_bet());
		turn_check_field.setText(schema.getTurn_check());
		turn_call_field.setText(schema.getTurn_call());
		turn_fold_field.setText(schema.getTurn_fold());
		turn_raise_field.setText(schema.getTurn_raise());
		turn_bet_call_field.setText(schema.getTurn_bet_call());
		turn_bet_fold_field.setText(schema.getTurn_bet_fold());
		turn_bet_raise_field.setText(schema.getTurn_bet_raise());
		turn_check_call_field.setText(schema.getTurn_check_call());
		turn_check_fold_field.setText(schema.getTurn_check_fold());
		turn_check_raise_field.setText(schema.getTurn_check_raise());
		turn_raise_fold_field.setText(schema.getTurn_raise_fold());
		turn_raise_call_field.setText(schema.getTurn_raise_call());
		turn_raise_raise_field.setText(schema.getTurn_raise_raise());

		river_all_field.setText(schema.getRiver_all()+"");
		river_bet_field.setText(schema.getRiver_bet());
		river_check_field.setText(schema.getRiver_check());
		river_call_field.setText(schema.getRiver_call());
		river_fold_field.setText(schema.getRiver_fold());
		river_raise_field.setText(schema.getRiver_raise());
		river_bet_call_field.setText(schema.getRiver_bet_call());
		river_bet_fold_field.setText(schema.getRiver_bet_fold());
		river_bet_raise_field.setText(schema.getRiver_bet_raise());
		river_check_call_field.setText(schema.getRiver_check_call());
		river_check_fold_field.setText(schema.getRiver_check_fold());
		river_check_raise_field.setText(schema.getRiver_check_raise());
		river_raise_fold_field.setText(schema.getRiver_raise_fold());
		river_raise_call_field.setText(schema.getRiver_raise_call());
		river_raise_raise_field.setText(schema.getRiver_raise_raise());
	}

	private static boolean isNotEmpty(String str) {
		if (str == null || str.length() <= 0) {
			return false;
		}
		return true;
	}

}