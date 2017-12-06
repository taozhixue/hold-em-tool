package com.steven.mediaTools;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.steven.db.DBHelper;

public class ExportMovie {

	private JFrame frame;
	private JTextField text_fileurl;
	private JTextField text_cpid;
	private JTextField text_birateid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExportMovie window = new ExportMovie();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExportMovie() {
		initialize();
	}

	JLabel label = new JLabel("文件地址：");
	JButton button_1 = new JButton("上传文件");
	JLabel lblCpid = new JLabel("CPID：");
	JLabel lblid = new JLabel("码率ID：");
	JButton button = new JButton("提取地址");

	public void export() {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text_fileurl.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请选择文件上传", "提示", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (text_cpid.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入CPID", "提示", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (text_birateid.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "请输入码率ID", "提示", JOptionPane.ERROR_MESSAGE);
					return;
				}
				Map<String, String> contentMap = getContent(text_fileurl.getText().trim(), text_cpid.getText().trim(),
						text_birateid.getText().trim());
				try {
					String path = saveData();
					if (path == null || path.equals("")) {
						JOptionPane.showMessageDialog(null, "请选择文件保存地址", "提示", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if(contentMap == null || contentMap.size() == 0){
						JOptionPane.showMessageDialog(null, "请检查文件编码或者视频名称是否正确", "查询无数据", JOptionPane.ERROR_MESSAGE);
						return;
					}
					
					// 第一步，创建一个webbook，对应一个Excel文件
					HSSFWorkbook wb = new HSSFWorkbook();
					// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
					HSSFSheet sheet = wb.createSheet("视频提取");
					// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
					HSSFRow row = sheet.createRow((int) 0);
					// 第四步，创建单元格，并设置值表头 设置表头居中
					HSSFCellStyle style = wb.createCellStyle();
					style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

					HSSFCell cell = row.createCell(0);
					cell.setCellValue("视频名称");
					cell.setCellStyle(style);
					cell = row.createCell(1);
					cell.setCellValue("视频地址");
					cell.setCellStyle(style);
					int i=0;
					for (Map.Entry<String, String> entry : contentMap.entrySet()) {
						row = sheet.createRow(i + 1);
						// 第四步，创建单元格，并设置值
						row.createCell(0).setCellValue(entry.getKey());
						row.createCell(1).setCellValue(entry.getValue());
						i++;
					}

					// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
					FileOutputStream fout = new FileOutputStream(path);
					wb.write(fout);
					fout.flush();
					fout.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	// 读取文件中的视频名称，拼接sql，获取数据，并组成map反馈
	public Map<String, String> getContent(String fileurl, String CPID, String BitRateID) {
		Map<String, String> contentMap = new HashMap<String, String>();
		if (fileurl == null || fileurl.equals("")) {
			return null;
		}
		File file = new File(fileurl);
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
				BufferedReader read = new BufferedReader(isr);) {
			StringBuffer sb = new StringBuffer();
			String tempString = "";
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = read.readLine()) != null) {
				// 显示行号
				sb.append("'" + tempString + "',");
			}
			System.out.println("文本内容："+sb.toString());
			read.close();
			String names = sb.substring(0, sb.length() - 1);
			contentMap = DBHelper.getConntent(names, CPID, BitRateID);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return contentMap;
	}

	private String saveData() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
		String name = dateformat.format(new Date());
		name = name + ".xls";
		// 构造文件保存对话框
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setDialogType(JFileChooser.SAVE_DIALOG);
		chooser.setMultiSelectionEnabled(false);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setDialogTitle("保存单位数据文件");
		chooser.addChoosableFileFilter(new FileFilter() {
			public boolean accept(File f) {
				if (f.getName().endsWith("xls") || f.isDirectory()) {
					return true;
				} else {
					return false;
				}
			}

			public String getDescription() {
				return "Excel文件(*.xls)";
			}

		});

		// 打开对话框
		int result = chooser.showSaveDialog(null);// null

		// 文件确定
		if (result == JFileChooser.APPROVE_OPTION) {
			String outPath = chooser.getSelectedFile().getAbsolutePath();
			return outPath + ".xls";
		}
		return null;
	}

	public void uploadFile() {
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String path = null;
				JFileChooser fc = new JFileChooser();
				fc.setDialogTitle("请选择要上传的文件...");
				fc.setApproveButtonText("确定");
				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				if (JFileChooser.APPROVE_OPTION == fc.showOpenDialog(frame)) {
					path = fc.getSelectedFile().getPath();
				}
				text_fileurl.setText(path);
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("地址导出");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		text_fileurl = new JTextField();
		text_fileurl.setColumns(10);

		
		text_cpid = new JTextField();
		text_cpid.setColumns(10);

		text_birateid = new JTextField();
		text_birateid.setColumns(10);

		export();// 导出按钮点击事件
		uploadFile();// 文件上传事件

		groupInit();
	}

	private void groupInit() {
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING,
						groupLayout.createSequentialGroup().addContainerGap(158, Short.MAX_VALUE).addComponent(button_1)
								.addGap(51).addComponent(button).addGap(111))
				.addGroup(groupLayout.createSequentialGroup().addGap(25)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(label)
								.addComponent(lblCpid).addComponent(lblid))
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(text_birateid)
								.addComponent(text_cpid)
								.addComponent(text_fileurl, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
						.addContainerGap(55, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(29)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(text_fileurl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblCpid).addComponent(
						text_cpid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblid).addComponent(
						text_birateid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(42)
				.addGroup(
						groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button).addComponent(button_1))
				.addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);
	}
}
