package com.steven.mediaTools;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Main extends JFrame {

	private static final long serialVersionUID = 6935987817256367225L;
	
	private JLabel name_label;
	private JTextField name_field;
	private JLabel all_label;
	private JTextField all_field;
	private JLabel vpip_label;
	private JTextField vpip_field;
	private JLabel pfr_label;
	private JTextField pfr_field;
	private JLabel af_label;
	private JTextField af_field;
	private JLabel desc_label;
	private JTextField desc_field;
	
	private JLabel per_flop_label;
	private JLabel per_flop_all_label;
	private JTextField per_flop_all_field;
	private JLabel per_flop_limp_label;
	private JTextField per_flop_limp_field;
	private JLabel per_flop_limp_call_label;
	private JTextField per_flop_limp_call_field;
	private JLabel per_flop_limp_fold_label;
	private JTextField per_flop_limp_fold_field;
	private JLabel per_flop_limp_raise_label;
	private JTextField per_flop_limp_raise_field;
	private JLabel per_flop_check_label;
	private JTextField per_flop_check_field;
	private JLabel per_flop_raise_label;
	private JTextField per_flop_raise_field;
	private JLabel per_flop_3bet_label;
	private JTextField per_flop_3bet_field;
	private JLabel per_flop_call_3bet_label;
	private JTextField per_flop_call_3bet_field;
	private JLabel per_flop_fold_3bet_label;
	private JTextField per_flop_fold_3bet_field;
	private JLabel per_flop_4bet_label;
	private JTextField per_flop_4bet_field;
	private JLabel per_flop_call_4bet_label;
	private JTextField per_flop_call_4bet_field;
	private JLabel per_flop_fold_4bet_label;
	private JTextField per_flop_fold_4bet_field;
	private JLabel per_flop_fold_raise_label;
	private JTextField per_flop_fold_raise_field;
	private JLabel per_flop_allin_label;
	private JTextField per_flop_allin_field;
	private JLabel per_flop_call_allin_label;
	private JTextField per_flop_call_allin_field;
	private JLabel per_flop_fold_allin_label;
	private JTextField per_flop_fold_allin_field;
	
	private JLabel flop_label;
	private JLabel flop_all_label;
	private JTextField flop_all_field;
	private JLabel flop_check_fold_label;
	private JTextField flop_check_fold_field;
	private JLabel flop_check_call_label;
	private JTextField flop_check_call_field;
	private JLabel flop_check_raise_label;
	private JTextField flop_check_raise_field;
	private JLabel flop_bet_label;
	private JTextField flop_bet_field;
	private JLabel flop_bet_fold_label;
	private JTextField flop_bet_fold_field;
	private JLabel flop_bet_raise_label;
	private JTextField flop_bet_raise_field;
	private JLabel flop_bet_call_label;
	private JTextField flop_bet_call_field;
	private JLabel flop_raise_label;
	private JTextField flop_raise_field;
	private JLabel flop_raise_fold_label;
	private JTextField flop_raise_fold_field;
	private JLabel flop_call_re_raise_label;
	private JTextField flop_call_re_raise_field;
	private JLabel flop_fold_re_raise_label;
	private JTextField flop_fold_re_raise_field;
	private JLabel flop_allin_label;
	private JTextField flop_allin_field;
	private JLabel flop_fold_allin_label;
	private JTextField flop_fold_allin_field;
	private JLabel flop_call_allin_label;
	private JTextField flop_call_allin_field;
	
	private JLabel turn_label;
	private JLabel turn_all_label;
	private JTextField turn_all_field;
	private JLabel turn_check_fold_label;
	private JTextField turn_check_fold_field;
	private JLabel turn_check_call_label;
	private JTextField turn_check_call_field;
	private JLabel turn_check_raise_label;
	private JTextField turn_check_raise_field;
	private JLabel turn_bet_label;
	private JTextField turn_bet_field;
	private JLabel turn_bet_fold_label;
	private JTextField turn_bet_fold_field;
	private JLabel turn_bet_raise_label;
	private JTextField turn_bet_raise_field;
	private JLabel turn_bet_call_label;
	private JTextField turn_bet_call_field;
	private JLabel turn_raise_label;
	private JTextField turn_raise_field;
	private JLabel turn_raise_fold_label;
	private JTextField turn_raise_fold_field;
	private JLabel turn_call_re_raise_label;
	private JTextField turn_call_re_raise_field;
	private JLabel turn_fold_re_raise_label;
	private JTextField turn_fold_re_raise_field;
	private JLabel turn_allin_label;
	private JTextField turn_allin_field;
	private JLabel turn_fold_allin_label;
	private JTextField turn_fold_allin_field;
	private JLabel turn_call_allin_label;
	private JTextField turn_call_allin_field;
	
	private JLabel river_label;
	private JLabel river_all_label;
	private JTextField river_all_field;
	private JLabel river_check_fold_label;
	private JTextField river_check_fold_field;
	private JLabel river_check_call_label;
	private JTextField river_check_call_field;
	private JLabel river_check_raise_label;
	private JTextField river_check_raise_field;
	private JLabel river_bet_label;
	private JTextField river_bet_field;
	private JLabel river_bet_fold_label;
	private JTextField river_bet_fold_field;
	private JLabel river_bet_raise_label;
	private JTextField river_bet_raise_field;
	private JLabel river_bet_call_label;
	private JTextField river_bet_call_field;
	private JLabel river_raise_label;
	private JTextField river_raise_field;
	private JLabel river_raise_fold_label;
	private JTextField river_raise_fold_field;
	private JLabel river_call_re_raise_label;
	private JTextField river_call_re_raise_field;
	private JLabel river_fold_re_raise_label;
	private JTextField river_fold_re_raise_field;
	private JLabel river_allin_label;
	private JTextField river_allin_field;
	private JLabel river_fold_allin_label;
	private JTextField river_fold_allin_field;
	private JLabel river_call_allin_label;
	private JTextField river_call_allin_field;
	
	public static void main(String[] args) {
		Main window = new Main();
		window.setVisible(true);
		window.setTitle("冷静");
		window.setSize(1000, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	int textFieldlength = 4;
	
	private void initComponent(){
		name_label = new JLabel("名字：");
		name_field = new JTextField(10);
		all_label = new JLabel("总数：");
		all_field = new JTextField(textFieldlength);
		all_field.setEnabled(false);
		vpip_label = new JLabel("vpip：");
		vpip_field = new JTextField(textFieldlength);
		vpip_field.setEnabled(false);
		pfr_label = new JLabel("pfr：");
		pfr_field = new JTextField(textFieldlength);
		pfr_field.setEnabled(false);
		af_label = new JLabel("af：");
		af_field = new JTextField(3);
		af_field.setEnabled(false);
		desc_label = new JLabel("备注：");
		desc_field = new JTextField(20);
		
		per_flop_label = new JLabel("翻牌前：");
		per_flop_all_label = new JLabel("总数：");
		per_flop_all_field = new JTextField(textFieldlength);
		per_flop_limp_label = new JLabel("limp：");
		per_flop_limp_field = new JTextField(textFieldlength);
		per_flop_limp_call_label = new JLabel("limp-c：");
		per_flop_limp_call_field = new JTextField(textFieldlength);
		per_flop_limp_fold_label = new JLabel("limp-f：");
		per_flop_limp_fold_field = new JTextField(textFieldlength);
		per_flop_limp_raise_label = new JLabel("limp-r：");
		per_flop_limp_raise_field = new JTextField(textFieldlength);
		per_flop_check_label = new JLabel("check：");
		per_flop_check_field = new JTextField(textFieldlength);
		per_flop_raise_label = new JLabel("raise：");
		per_flop_raise_field = new JTextField(textFieldlength);
		per_flop_3bet_label = new JLabel("3bet：");
		per_flop_3bet_field = new JTextField(textFieldlength);
		per_flop_call_3bet_label = new JLabel("c-3bet：");
		per_flop_call_3bet_field = new JTextField(textFieldlength);
		per_flop_fold_3bet_label = new JLabel("f-3bet：");
		per_flop_fold_3bet_field = new JTextField(textFieldlength);
		per_flop_4bet_label = new JLabel("4bet：");
		per_flop_4bet_field = new JTextField(textFieldlength);
		per_flop_call_4bet_label = new JLabel("c-4bet：");
		per_flop_call_4bet_field = new JTextField(textFieldlength);
		per_flop_fold_4bet_label = new JLabel("f-4bet：");
		per_flop_fold_4bet_field = new JTextField(textFieldlength);
		per_flop_fold_raise_label = new JLabel("f-raise：");
		per_flop_fold_raise_field = new JTextField(textFieldlength);
		per_flop_allin_label = new JLabel("allin：");
		per_flop_allin_field = new JTextField(textFieldlength);
		per_flop_call_allin_label = new JLabel("c-allin：");
		per_flop_call_allin_field = new JTextField(textFieldlength);
		per_flop_fold_allin_label = new JLabel("f-allin：");
		per_flop_fold_allin_field = new JTextField(textFieldlength);
		
		flop_label = new JLabel("翻牌：");
		flop_all_label = new JLabel("总数：");
		flop_all_field = new JTextField(textFieldlength);
		flop_check_fold_label = new JLabel("check-f：");
		flop_check_fold_field = new JTextField(textFieldlength);
		flop_check_call_label = new JLabel("check-c：");
		flop_check_call_field = new JTextField(textFieldlength);
		flop_check_raise_label = new JLabel("check-r：");
		flop_check_raise_field = new JTextField(textFieldlength);
		flop_bet_label = new JLabel("bet：");
		flop_bet_field = new JTextField(textFieldlength);
		flop_bet_fold_label = new JLabel("bet-f：");
		flop_bet_fold_field = new JTextField(textFieldlength);
		flop_bet_raise_label = new JLabel("bet-r：");
		flop_bet_raise_field = new JTextField(textFieldlength);
		flop_bet_call_label = new JLabel("bet-c：");
		flop_bet_call_field = new JTextField(textFieldlength);
		flop_raise_label = new JLabel("raise：");
		flop_raise_field = new JTextField(textFieldlength);
		flop_raise_fold_label = new JLabel("raise-f：");
		flop_raise_fold_field = new JTextField(textFieldlength);
		flop_call_re_raise_label = new JLabel("call-re：");
		flop_call_re_raise_field = new JTextField(textFieldlength);
		flop_fold_re_raise_label = new JLabel("fold-re：");
		flop_fold_re_raise_field = new JTextField(textFieldlength);
		flop_allin_label = new JLabel("allin：");
		flop_allin_field = new JTextField(textFieldlength);
		flop_fold_allin_label = new JLabel("f-allin：");
		flop_fold_allin_field = new JTextField(textFieldlength);
		flop_call_allin_label = new JLabel("c-allin：");
		flop_call_allin_field = new JTextField(textFieldlength);
		
		turn_label = new JLabel("转牌：");
		turn_all_label = new JLabel("总数：");
		turn_all_field = new JTextField(textFieldlength);
		turn_check_fold_label = new JLabel("check-f：");
		turn_check_fold_field = new JTextField(textFieldlength);
		turn_check_call_label = new JLabel("check-c：");
		turn_check_call_field = new JTextField(textFieldlength);
		turn_check_raise_label = new JLabel("check-r：");
		turn_check_raise_field = new JTextField(textFieldlength);
		turn_bet_label = new JLabel("bet：");
		turn_bet_field = new JTextField(textFieldlength);
		turn_bet_fold_label = new JLabel("bet-f：");
		turn_bet_fold_field = new JTextField(textFieldlength);
		turn_bet_raise_label = new JLabel("bet-r：");
		turn_bet_raise_field = new JTextField(textFieldlength);
		turn_bet_call_label = new JLabel("bet-c：");
		turn_bet_call_field = new JTextField(textFieldlength);
		turn_raise_label = new JLabel("raise：");
		turn_raise_field = new JTextField(textFieldlength);
		turn_raise_fold_label = new JLabel("raise-f：");
		turn_raise_fold_field = new JTextField(textFieldlength);
		turn_call_re_raise_label = new JLabel("call-re：");
		turn_call_re_raise_field = new JTextField(textFieldlength);
		turn_fold_re_raise_label = new JLabel("fold-re：");
		turn_fold_re_raise_field = new JTextField(textFieldlength);
		turn_allin_label = new JLabel("allin：");
		turn_allin_field = new JTextField(textFieldlength);
		turn_fold_allin_label = new JLabel("f-allin：");
		turn_fold_allin_field = new JTextField(textFieldlength);
		turn_call_allin_label = new JLabel("c-allin：");
		turn_call_allin_field = new JTextField(textFieldlength);
		
		river_label = new JLabel("河牌：");
		river_all_label = new JLabel("总数：");
		river_all_field = new JTextField(textFieldlength);
		river_check_fold_label = new JLabel("check-f：");
		river_check_fold_field = new JTextField(textFieldlength);
		river_check_call_label = new JLabel("check-c：");
		river_check_call_field = new JTextField(textFieldlength);
		river_check_raise_label = new JLabel("check-r：");
		river_check_raise_field = new JTextField(textFieldlength);
		river_bet_label = new JLabel("bet：");
		river_bet_field = new JTextField(textFieldlength);
		river_bet_fold_label = new JLabel("bet-f：");
		river_bet_fold_field = new JTextField(textFieldlength);
		river_bet_raise_label = new JLabel("bet-r：");
		river_bet_raise_field = new JTextField(textFieldlength);
		river_bet_call_label = new JLabel("bet-c：");
		river_bet_call_field = new JTextField(textFieldlength);
		river_raise_label = new JLabel("raise：");
		river_raise_field = new JTextField(textFieldlength);
		river_raise_fold_label = new JLabel("raise-f：");
		river_raise_fold_field = new JTextField(textFieldlength);
		river_call_re_raise_label = new JLabel("call-re：");
		river_call_re_raise_field = new JTextField(textFieldlength);
		river_fold_re_raise_label = new JLabel("fold-re：");
		river_fold_re_raise_field = new JTextField(textFieldlength);
		river_allin_label = new JLabel("allin：");
		river_allin_field = new JTextField(textFieldlength);
		river_fold_allin_label = new JLabel("f-allin：");
		river_fold_allin_field = new JTextField(textFieldlength);
		river_call_allin_label = new JLabel("c-allin：");
		river_call_allin_field = new JTextField(textFieldlength);
		
		
	}
	
	private void initUI(){
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout(5, 10));
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1,12, 5, 5));
		northPanel.add(createPanelForGrid(new JComponent[]{name_label,name_field,all_label,all_field,vpip_label,vpip_field,pfr_label,pfr_field,af_label,af_field,desc_label,desc_field}));
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(20,20,5,5));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGrid(new JComponent[]{per_flop_label,per_flop_all_label,per_flop_all_field,per_flop_limp_label,per_flop_limp_field,per_flop_limp_call_label,per_flop_limp_call_field,per_flop_limp_fold_label,per_flop_limp_fold_field,per_flop_limp_raise_label,per_flop_limp_raise_field,per_flop_check_label,per_flop_check_field,per_flop_raise_label,per_flop_raise_field,per_flop_3bet_label,per_flop_3bet_field}));
		centerPanel.add(createPanelForGrid(new JComponent[]{per_flop_call_3bet_label,per_flop_call_3bet_field,per_flop_fold_3bet_label,per_flop_fold_3bet_field,per_flop_4bet_label,per_flop_4bet_field,per_flop_call_4bet_label,per_flop_call_4bet_field,per_flop_fold_4bet_label,per_flop_fold_4bet_field,per_flop_fold_raise_label,per_flop_fold_raise_field,per_flop_allin_label,per_flop_allin_field,per_flop_call_allin_label,per_flop_call_allin_field,per_flop_fold_allin_label,per_flop_fold_allin_field}));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGrid(new JComponent[]{flop_label,flop_all_label,flop_all_field,flop_check_fold_label,flop_check_fold_field,flop_check_call_label,flop_check_call_field,flop_check_raise_label,flop_check_raise_field,flop_bet_label,flop_bet_field,flop_bet_fold_label,flop_bet_fold_field,flop_bet_raise_label,flop_bet_raise_field}));
		centerPanel.add(createPanelForGrid(new JComponent[]{flop_bet_call_label,flop_bet_call_field,flop_raise_label,flop_raise_field,flop_raise_fold_label,flop_raise_fold_field,flop_call_re_raise_label,flop_call_re_raise_field,flop_fold_re_raise_label,flop_fold_re_raise_field,flop_allin_label,flop_allin_field,flop_fold_allin_label,flop_fold_allin_field,flop_call_allin_label,flop_call_allin_field}));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGrid(new JComponent[]{turn_label,turn_all_label,turn_all_field,turn_check_fold_label,turn_check_fold_field,turn_check_call_label,turn_check_call_field,turn_check_raise_label,turn_check_raise_field,turn_bet_label,turn_bet_field,turn_bet_fold_label,turn_bet_fold_field,turn_bet_raise_label,turn_bet_raise_field}));
		centerPanel.add(createPanelForGrid(new JComponent[]{turn_bet_call_label,turn_bet_call_field,turn_raise_label,turn_raise_field,turn_raise_fold_label,turn_raise_fold_field,turn_call_re_raise_label,turn_call_re_raise_field,turn_fold_re_raise_label,turn_fold_re_raise_field,turn_allin_label,turn_allin_field,turn_fold_allin_label,turn_fold_allin_field,turn_call_allin_label,turn_call_allin_field}));
		centerPanel.add(new JSeparator(JSeparator.HORIZONTAL));
		centerPanel.add(createPanelForGrid(new JComponent[]{river_label,river_all_label,river_all_field,river_check_fold_label,river_check_fold_field,river_check_call_label,river_check_call_field,river_check_raise_label,river_check_raise_field,river_bet_label,river_bet_field,river_bet_fold_label,river_bet_fold_field,river_bet_raise_label,river_bet_raise_field}));
		centerPanel.add(createPanelForGrid(new JComponent[]{river_bet_call_label,river_bet_call_field,river_raise_label,river_raise_field,river_raise_fold_label,river_raise_fold_field,river_call_re_raise_label,river_call_re_raise_field,river_fold_re_raise_label,river_fold_re_raise_field,river_allin_label,river_allin_field,river_fold_allin_label,river_fold_allin_field,river_call_allin_label,river_call_allin_field}));
		
		contentPanel.add(BorderLayout.NORTH, northPanel);
		contentPanel.add(BorderLayout.CENTER, centerPanel);
		getContentPane().add(contentPanel);
	}
	
	private JPanel createPanelForGrid(JComponent[] allComponents){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		if(null!=allComponents&&allComponents.length>0){
			for(JComponent component : allComponents){
				panel.add(component);
			}
		}
		return panel;
	}

	
	/**
	 * Create the application.
	 */
	public Main() {
		super();
		initComponent();
		initUI();
	}

}