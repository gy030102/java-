package interfaces;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Statistics_DeliverInfo {

	protected Shell shell;
	private Table table;
	private Text deliveryId_text;
	private Text goodname_text;
	private Text customerName_text;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Statistics_DeliverInfo window = new Statistics_DeliverInfo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1239, 786);
		shell.setText("SWT Application");

		Button selectByTime = new Button(shell, SWT.CHECK);
		selectByTime.setText("按时间筛选：");
		selectByTime.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		selectByTime.setBounds(234, 228, 157, 33);

		Label label = new Label(shell, SWT.NONE);
		label.setText("从");
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		label.setBounds(399, 228, 22, 30);

		DateTime startDate = new DateTime(shell, SWT.BORDER);
		startDate.setBounds(427, 228, 135, 33);

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("至");
		label_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		label_1.setBounds(571, 228, 22, 30);

		DateTime terminateDate = new DateTime(shell, SWT.BORDER);
		terminateDate.setBounds(613, 228, 135, 33);

		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setBounds(76, 321, 1083, 397);

		TableColumn tableColumn_7 = new TableColumn(table, SWT.NONE);
		tableColumn_7.setWidth(100);
		tableColumn_7.setText("出库单号");

		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(113);
		tblclmnNewColumn.setText("日期");

		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(122);
		tableColumn.setText("货物名称");

		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(85);
		tableColumn_1.setText("数量");

		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setWidth(100);
		tableColumn_2.setText("采购单价");

		TableColumn tableColumn_3 = new TableColumn(table, SWT.NONE);
		tableColumn_3.setWidth(100);
		tableColumn_3.setText("校验员");

		TableColumn tableColumn_4 = new TableColumn(table, SWT.NONE);
		tableColumn_4.setWidth(100);
		tableColumn_4.setText("操作员");

		TableColumn tableColumn_5 = new TableColumn(table, SWT.NONE);
		tableColumn_5.setWidth(100);
		tableColumn_5.setText("购买客户");

		TableColumn tableColumn_6 = new TableColumn(table, SWT.NONE);
		tableColumn_6.setWidth(96);
		tableColumn_6.setText("出货员");

		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(150);
		tblclmnNewColumn_1.setText("备注");

		Label label_3 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_3.setBounds(289, 68, 616, 30);

		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("出库记录查询");
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		label_2.setBounds(512, 10, 240, 52);

		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("出库单号");
		label_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		label_4.setBounds(189, 129, 88, 30);

		deliveryId_text = new Text(shell, SWT.BORDER);
		deliveryId_text.setBounds(289, 131, 135, 30);

		Label label_4_1 = new Label(shell, SWT.NONE);
		label_4_1.setText("货物名称");
		label_4_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		label_4_1.setBounds(484, 131, 88, 30);

		goodname_text = new Text(shell, SWT.BORDER);
		goodname_text.setBounds(586, 131, 135, 30);

		Label label_4_1_1 = new Label(shell, SWT.NONE);
		label_4_1_1.setText("客户姓名");
		label_4_1_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		label_4_1_1.setBounds(776, 131, 88, 30);

		customerName_text = new Text(shell, SWT.BORDER);
		customerName_text.setBounds(872, 129, 135, 30);

		Button queryDelivery = new Button(shell, SWT.NONE);
		queryDelivery.setBounds(809, 229, 96, 33);
		queryDelivery.setText("查询");

		Button queryAllDelivery = new Button(shell, SWT.NONE);
		queryAllDelivery.setText("查询全部");
		queryAllDelivery.setBounds(952, 228, 96, 33);

	}
}
