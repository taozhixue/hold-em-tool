package com.steven.mediaTools;

import java.awt.BorderLayout;
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

public class NewVersion extends JFrame {

	private static final long serialVersionUID = 6935987817256367225L;
	
	private JLabel per_flop_step_label_1;
	private JLabel per_flop_step_label_2;
	private JLabel per_flop_step_label_3;
	private JLabel flop_step_label_1;
	private JLabel flop_step_label_2;
	private JLabel flop_step_label_3;
	private JLabel turn_step_label_1;
	private JLabel turn_step_label_2;
	private JLabel turn_step_label_3;
	private JLabel river_step_label_1;
	private JLabel river_step_label_2;
	private JLabel river_step_label_3;
	
	private JLabel name_label;
	private JTextField name_field;
	private JLabel vpip_label;
	private JTextField vpip_field;
	private JLabel pfr_label;
	private JTextField pfr_field;
	private JLabel desc_label;
	private JTextField desc_field;
	
	private JLabel per_flop_label;
	private JLabel per_flop_all_label;
	private JTextField per_flop_all_field;
	private JLabel per_flop_desc_label;
	private JTextField per_flop_desc_field;
	
	private JLabel per_flop_call_label;
	private JTextField per_flop_call_field;
	private JLabel per_flop_fold_label;
	private JTextField per_flop_fold_field;
	private JLabel per_flop_raise_label;
	private JTextField per_flop_raise_field;
	private JLabel per_flop_check_label;
	private JTextField per_flop_check_field;
	private JLabel per_flop_allin_label;
	private JTextField per_flop_allin_field;
	
	private JLabel per_flop_call_label_2;
	private JTextField per_flop_call_field_2;
	private JLabel per_flop_fold_label_2;
	private JTextField per_flop_fold_field_2;
	private JLabel per_flop_raise_label_2;
	private JTextField per_flop_raise_field_2;
	private JLabel per_flop_check_label_2;
	private JTextField per_flop_check_field_2;
	private JLabel per_flop_allin_label_2;
	private JTextField per_flop_allin_field_2;
	
	private JLabel per_flop_call_label_3;
	private JTextField per_flop_call_field_3;
	private JLabel per_flop_fold_label_3;
	private JTextField per_flop_fold_field_3;
	private JLabel per_flop_raise_label_3;
	private JTextField per_flop_raise_field_3;
	private JLabel per_flop_check_label_3;
	private JTextField per_flop_check_field_3;
	private JLabel per_flop_allin_label_3;
	private JTextField per_flop_allin_field_3;
	
	private JLabel flop_label;
	private JLabel flop_all_label;
	private JTextField flop_all_field;
	private JLabel flop_desc_label;
	private JTextField flop_desc_field;
	
	private JLabel flop_call_label;
	private JTextField flop_call_field;
	private JLabel flop_fold_label;
	private JTextField flop_fold_field;
	private JLabel flop_raise_label;
	private JTextField flop_raise_field;
	private JLabel flop_check_label;
	private JTextField flop_check_field;
	private JLabel flop_allin_label;
	private JTextField flop_allin_field;
	
	private JLabel flop_call_label_2;
	private JTextField flop_call_field_2;
	private JLabel flop_fold_label_2;
	private JTextField flop_fold_field_2;
	private JLabel flop_raise_label_2;
	private JTextField flop_raise_field_2;
	private JLabel flop_check_label_2;
	private JTextField flop_check_field_2;
	private JLabel flop_allin_label_2;
	private JTextField flop_allin_field_2;
	
	private JLabel flop_call_label_3;
	private JTextField flop_call_field_3;
	private JLabel flop_fold_label_3;
	private JTextField flop_fold_field_3;
	private JLabel flop_raise_label_3;
	private JTextField flop_raise_field_3;
	private JLabel flop_check_label_3;
	private JTextField flop_check_field_3;
	private JLabel flop_allin_label_3;
	private JTextField flop_allin_field_3;
	
	private JLabel turn_label;
	private JLabel turn_all_label;
	private JTextField turn_all_field;
	private JLabel turn_desc_label;
	private JTextField turn_desc_field;
	
	private JLabel turn_call_label;
	private JTextField turn_call_field;
	private JLabel turn_fold_label;
	private JTextField turn_fold_field;
	private JLabel turn_raise_label;
	private JTextField turn_raise_field;
	private JLabel turn_check_label;
	private JTextField turn_check_field;
	private JLabel turn_allin_label;
	private JTextField turn_allin_field;
	
	private JLabel turn_call_label_2;
	private JTextField turn_call_field_2;
	private JLabel turn_fold_label_2;
	private JTextField turn_fold_field_2;
	private JLabel turn_raise_label_2;
	private JTextField turn_raise_field_2;
	private JLabel turn_check_label_2;
	private JTextField turn_check_field_2;
	private JLabel turn_allin_label_2;
	private JTextField turn_allin_field_2;
	
	private JLabel turn_call_label_3;
	private JTextField turn_call_field_3;
	private JLabel turn_fold_label_3;
	private JTextField turn_fold_field_3;
	private JLabel turn_raise_label_3;
	private JTextField turn_raise_field_3;
	private JLabel turn_check_label_3;
	private JTextField turn_check_field_3;
	private JLabel turn_allin_label_3;
	private JTextField turn_allin_field_3;
	
	private JLabel river_label;
	private JLabel river_all_label;
	private JTextField river_all_field;
	private JLabel river_desc_label;
	private JTextField river_desc_field;
	
	private JLabel river_call_label;
	private JTextField river_call_field;
	private JLabel river_fold_label;
	private JTextField river_fold_field;
	private JLabel river_raise_label;
	private JTextField river_raise_field;
	private JLabel river_check_label;
	private JTextField river_check_field;
	private JLabel river_allin_label;
	private JTextField river_allin_field;
	
	private JLabel river_call_label_2;
	private JTextField river_call_field_2;
	private JLabel river_fold_label_2;
	private JTextField river_fold_field_2;
	private JLabel river_raise_label_2;
	private JTextField river_raise_field_2;
	private JLabel river_check_label_2;
	private JTextField river_check_field_2;
	private JLabel river_allin_label_2;
	private JTextField river_allin_field_2;
	
	private JLabel river_call_label_3;
	private JTextField river_call_field_3;
	private JLabel river_fold_label_3;
	private JTextField river_fold_field_3;
	private JLabel river_raise_label_3;
	private JTextField river_raise_field_3;
	private JLabel river_check_label_3;
	private JTextField river_check_field_3;
	private JLabel river_allin_label_3;
	private JTextField river_allin_field_3;
	
	JButton save_button = new JButton("保存");
	JButton query_button = new JButton("查询");
	
	
	
	public static void main(String[] args) {
		NewVersion window = new NewVersion();
		window.setVisible(true);
		window.setTitle("冷静");
		window.setSize(1000, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	int textFieldlength = 10;
	
	private void initComponent(){
		
		per_flop_step_label_1 = new JLabel("第一次操作：");
		per_flop_step_label_2 = new JLabel("第二次操作：");
		per_flop_step_label_3 = new JLabel("第三次操作：");
		flop_step_label_1 = new JLabel("第一次操作：");
		flop_step_label_2 = new JLabel("第二次操作：");
		flop_step_label_3 = new JLabel("第三次操作：");
		turn_step_label_1 = new JLabel("第一次操作：");
		turn_step_label_2 = new JLabel("第二次操作：");
		turn_step_label_3 = new JLabel("第三次操作：");
		river_step_label_1 = new JLabel("第一次操作：");
		river_step_label_2 = new JLabel("第二次操作：");
		river_step_label_3 = new JLabel("第三次操作：");
		
		name_label = new JLabel("名字：");
		name_field = new JTextField(10);
		vpip_label = new JLabel("vpip：");
		vpip_field = new JTextField(textFieldlength);
		vpip_field.setEnabled(false);
		pfr_label = new JLabel("pfr：");
		pfr_field = new JTextField(textFieldlength);
		pfr_field.setEnabled(false);
		desc_label = new JLabel("备注：");
		desc_field = new JTextField(20);
		
		per_flop_label = new JLabel("翻牌前：");
		per_flop_all_label = new JLabel("总数：");
		per_flop_all_field = new JTextField(textFieldlength);
		per_flop_desc_label = new JLabel("翻牌前备注：");
		per_flop_desc_field = new JTextField(20);
		
		per_flop_call_label = new JLabel("call：");
		per_flop_call_field = new JTextField(textFieldlength);
		per_flop_fold_label = new JLabel("fold：");
		per_flop_fold_field = new JTextField(textFieldlength);
		per_flop_check_label = new JLabel("check：");
		per_flop_check_field = new JTextField(textFieldlength);
		per_flop_raise_label = new JLabel("raise：");
		per_flop_raise_field = new JTextField(textFieldlength);
		per_flop_allin_label = new JLabel("allin：");
		per_flop_allin_field = new JTextField(textFieldlength);
		
		per_flop_call_label_2 = new JLabel("call：");
		per_flop_call_field_2 = new JTextField(textFieldlength);
		per_flop_fold_label_2 = new JLabel("fold：");
		per_flop_fold_field_2 = new JTextField(textFieldlength);
		per_flop_check_label_2 = new JLabel("check：");
		per_flop_check_field_2 = new JTextField(textFieldlength);
		per_flop_raise_label_2 = new JLabel("raise：");
		per_flop_raise_field_2 = new JTextField(textFieldlength);
		per_flop_allin_label_2 = new JLabel("allin：");
		per_flop_allin_field_2 = new JTextField(textFieldlength);
		
		per_flop_call_label_3 = new JLabel("call：");
		per_flop_call_field_3 = new JTextField(textFieldlength);
		per_flop_fold_label_3 = new JLabel("fold：");
		per_flop_fold_field_3 = new JTextField(textFieldlength);
		per_flop_check_label_3 = new JLabel("check：");
		per_flop_check_field_3 = new JTextField(textFieldlength);
		per_flop_raise_label_3 = new JLabel("raise：");
		per_flop_raise_field_3 = new JTextField(textFieldlength);
		per_flop_allin_label_3 = new JLabel("allin：");
		per_flop_allin_field_3 = new JTextField(textFieldlength);
		
		
		flop_label = new JLabel("翻牌：");
		flop_all_label = new JLabel("总数：");
		flop_all_field = new JTextField(textFieldlength);
		flop_desc_label = new JLabel("翻牌备注：");
		flop_desc_field = new JTextField(20);
		
		flop_call_label = new JLabel("call：");
		flop_call_field = new JTextField(textFieldlength);
		flop_fold_label = new JLabel("fold：");
		flop_fold_field = new JTextField(textFieldlength);
		flop_check_label = new JLabel("check：");
		flop_check_field = new JTextField(textFieldlength);
		flop_raise_label = new JLabel("raise：");
		flop_raise_field = new JTextField(textFieldlength);
		flop_allin_label = new JLabel("allin：");
		flop_allin_field = new JTextField(textFieldlength);
		
		flop_call_label_2 = new JLabel("call：");
		flop_call_field_2 = new JTextField(textFieldlength);
		flop_fold_label_2 = new JLabel("fold：");
		flop_fold_field_2 = new JTextField(textFieldlength);
		flop_check_label_2 = new JLabel("check：");
		flop_check_field_2 = new JTextField(textFieldlength);
		flop_raise_label_2 = new JLabel("raise：");
		flop_raise_field_2 = new JTextField(textFieldlength);
		flop_allin_label_2 = new JLabel("allin：");
		flop_allin_field_2 = new JTextField(textFieldlength);
		
		flop_call_label_3 = new JLabel("call：");
		flop_call_field_3 = new JTextField(textFieldlength);
		flop_fold_label_3 = new JLabel("fold：");
		flop_fold_field_3 = new JTextField(textFieldlength);
		flop_check_label_3 = new JLabel("check：");
		flop_check_field_3 = new JTextField(textFieldlength);
		flop_raise_label_3 = new JLabel("raise：");
		flop_raise_field_3 = new JTextField(textFieldlength);
		flop_allin_label_3 = new JLabel("allin：");
		flop_allin_field_3 = new JTextField(textFieldlength);
		
		turn_label = new JLabel("转牌：");
		turn_all_label = new JLabel("总数：");
		turn_all_field = new JTextField(textFieldlength);
		turn_desc_label = new JLabel("转牌备注：");
		turn_desc_field = new JTextField(20);
		
		turn_call_label = new JLabel("call：");
		turn_call_field = new JTextField(textFieldlength);
		turn_fold_label = new JLabel("fold：");
		turn_fold_field = new JTextField(textFieldlength);
		turn_check_label = new JLabel("check：");
		turn_check_field = new JTextField(textFieldlength);
		turn_raise_label = new JLabel("raise：");
		turn_raise_field = new JTextField(textFieldlength);
		turn_allin_label = new JLabel("allin：");
		turn_allin_field = new JTextField(textFieldlength);
		
		turn_call_label_2 = new JLabel("call：");
		turn_call_field_2 = new JTextField(textFieldlength);
		turn_fold_label_2 = new JLabel("fold：");
		turn_fold_field_2 = new JTextField(textFieldlength);
		turn_check_label_2 = new JLabel("check：");
		turn_check_field_2 = new JTextField(textFieldlength);
		turn_raise_label_2 = new JLabel("raise：");
		turn_raise_field_2 = new JTextField(textFieldlength);
		turn_allin_label_2 = new JLabel("allin：");
		turn_allin_field_2 = new JTextField(textFieldlength);
		
		turn_call_label_3 = new JLabel("call：");
		turn_call_field_3 = new JTextField(textFieldlength);
		turn_fold_label_3 = new JLabel("fold：");
		turn_fold_field_3 = new JTextField(textFieldlength);
		turn_check_label_3 = new JLabel("check：");
		turn_check_field_3 = new JTextField(textFieldlength);
		turn_raise_label_3 = new JLabel("raise：");
		turn_raise_field_3 = new JTextField(textFieldlength);
		turn_allin_label_3 = new JLabel("allin：");
		turn_allin_field_3 = new JTextField(textFieldlength);
		
		river_label = new JLabel("河牌：");
		river_all_label = new JLabel("总数：");
		river_all_field = new JTextField(textFieldlength);
		river_desc_label = new JLabel("河牌备注：");
		river_desc_field = new JTextField(20);
		
		river_call_label = new JLabel("call：");
		river_call_field = new JTextField(textFieldlength);
		river_fold_label = new JLabel("fold：");
		river_fold_field = new JTextField(textFieldlength);
		river_check_label = new JLabel("check：");
		river_check_field = new JTextField(textFieldlength);
		river_raise_label = new JLabel("raise：");
		river_raise_field = new JTextField(textFieldlength);
		river_allin_label = new JLabel("allin：");
		river_allin_field = new JTextField(textFieldlength);
		
		river_call_label_2 = new JLabel("call：");
		river_call_field_2 = new JTextField(textFieldlength);
		river_fold_label_2 = new JLabel("fold：");
		river_fold_field_2 = new JTextField(textFieldlength);
		river_check_label_2 = new JLabel("check：");
		river_check_field_2 = new JTextField(textFieldlength);
		river_raise_label_2 = new JLabel("raise：");
		river_raise_field_2 = new JTextField(textFieldlength);
		river_allin_label_2 = new JLabel("allin：");
		river_allin_field_2 = new JTextField(textFieldlength);
		
		river_call_label_3 = new JLabel("call：");
		river_call_field_3 = new JTextField(textFieldlength);
		river_fold_label_3 = new JLabel("fold：");
		river_fold_field_3 = new JTextField(textFieldlength);
		river_check_label_3 = new JLabel("check：");
		river_check_field_3 = new JTextField(textFieldlength);
		river_raise_label_3 = new JLabel("raise：");
		river_raise_field_3 = new JTextField(textFieldlength);
		river_allin_label_3 = new JLabel("allin：");
		river_allin_field_3 = new JTextField(textFieldlength);
		
	}
	
	private void initUI(){
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout(5, 10));
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1,12, 5, 5));
		northPanel.add(createPanelForGridLeft(new JComponent[]{name_label,name_field,desc_label,desc_field}));
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(22,3,5,5));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{per_flop_label,per_flop_all_label,per_flop_all_field,vpip_label,vpip_field,pfr_label,pfr_field,per_flop_desc_label,per_flop_desc_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{per_flop_step_label_1,per_flop_call_label,per_flop_call_field,per_flop_fold_label,per_flop_fold_field,per_flop_check_label,per_flop_check_field,per_flop_raise_label,per_flop_raise_field,per_flop_allin_label,per_flop_allin_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{per_flop_step_label_2,per_flop_call_label_2,per_flop_call_field_2,per_flop_fold_label_2,per_flop_fold_field_2,per_flop_check_label_2,per_flop_check_field_2,per_flop_raise_label_2,per_flop_raise_field_2,per_flop_allin_label_2,per_flop_allin_field_2}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{per_flop_step_label_3,per_flop_call_label_3,per_flop_call_field_3,per_flop_fold_label_3,per_flop_fold_field_3,per_flop_check_label_3,per_flop_check_field_3,per_flop_raise_label_3,per_flop_raise_field_3,per_flop_allin_label_3,per_flop_allin_field_3}));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{flop_label,flop_all_label,flop_all_field,flop_desc_label,flop_desc_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{flop_step_label_1,flop_call_label,flop_call_field,flop_fold_label,flop_fold_field,flop_check_label,flop_check_field,flop_raise_label,flop_raise_field,flop_allin_label,flop_allin_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{flop_step_label_2,flop_call_label_2,flop_call_field_2,flop_fold_label_2,flop_fold_field_2,flop_check_label_2,flop_check_field_2,flop_raise_label_2,flop_raise_field_2,flop_allin_label_2,flop_allin_field_2}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{flop_step_label_3,flop_call_label_3,flop_call_field_3,flop_fold_label_3,flop_fold_field_3,flop_check_label_3,flop_check_field_3,flop_raise_label_3,flop_raise_field_3,flop_allin_label_3,flop_allin_field_3}));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{turn_label,turn_all_label,turn_all_field,turn_desc_label,turn_desc_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{turn_step_label_1,turn_call_label,turn_call_field,turn_fold_label,turn_fold_field,turn_check_label,turn_check_field,turn_raise_label,turn_raise_field,turn_allin_label,turn_allin_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{turn_step_label_2,turn_call_label_2,turn_call_field_2,turn_fold_label_2,turn_fold_field_2,turn_check_label_2,turn_check_field_2,turn_raise_label_2,turn_raise_field_2,turn_allin_label_2,turn_allin_field_2}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{turn_step_label_3,turn_call_label_3,turn_call_field_3,turn_fold_label_3,turn_fold_field_3,turn_check_label_3,turn_check_field_3,turn_raise_label_3,turn_raise_field_3,turn_allin_label_3,turn_allin_field_3}));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{river_label,river_all_label,river_all_field,river_desc_label,river_desc_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{river_step_label_1,river_call_label,river_call_field,river_fold_label,river_fold_field,river_check_label,river_check_field,river_raise_label,river_raise_field,river_allin_label,river_allin_field}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{river_step_label_2,river_call_label_2,river_call_field_2,river_fold_label_2,river_fold_field_2,river_check_label_2,river_check_field_2,river_raise_label_2,river_raise_field_2,river_allin_label_2,river_allin_field_2}));
		centerPanel.add(createPanelForGridLeft(new JComponent[]{river_step_label_3,river_call_label_3,river_call_field_3,river_fold_label_3,river_fold_field_3,river_check_label_3,river_check_field_3,river_raise_label_3,river_raise_field_3,river_allin_label_3,river_allin_field_3}));

		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2, 5, 5));
		southPanel.add(createPanelForGrid(new JComponent[]{save_button,query_button}));
		
		contentPanel.add(BorderLayout.NORTH, northPanel);
		contentPanel.add(BorderLayout.CENTER, centerPanel);
		contentPanel.add(BorderLayout.SOUTH,southPanel);
		getContentPane().add(contentPanel);
	}
	
	private JPanel createPanelForGridLeft(JComponent[] allComponents){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		if(null!=allComponents&&allComponents.length>0){
			for(JComponent component : allComponents){
				panel.add(component);
			}
		}
		return panel;
	}
	
	private JPanel createPanelForGrid(JComponent[] allComponents){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		if(null!=allComponents&&allComponents.length>0){
			for(JComponent component : allComponents){
				panel.add(component);
			}
		}
		return panel;
	}
	
	public void addSaveButtonListener() {
		save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (name_field.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入名字", "提示", JOptionPane.ERROR_MESSAGE);
					return;
				}
				System.out.println(name_field.getText());
				vpip_field.setText("26,10.3%");
			}
		});
	}
	
	public void addLister(){
		addSaveButtonListener();
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

}