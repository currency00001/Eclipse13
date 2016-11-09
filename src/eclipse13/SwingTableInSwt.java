package eclipse13;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Vector;

import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SwingTableInSwt {

	public static void main(String[] args){
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		
		//新建swt组件
		Composite composite = new Composite(shell,SWT.NO_BACKGROUND|SWT.EMBEDDED);
		
		try{
			System.setProperty("sun.awt.noerasebackground", "true");
			
		}catch(NoSuchMethodError error){
			
		}
		
		//在swt组件上新建一个Frame容器
		Frame frame = SWT_AWT.new_Frame(composite);
		Panel panel = new Panel(new BorderLayout()){
		
		public void update(java.awt.Graphics g){
		   paint(g);
		}
		};
		//在容器中添加子容器
		frame.add(panel);
		JRootPane root =new JRootPane();
		panel.add(root);
		java.awt.Container contentPane = root.getContentPane();
		
		int nrows=1000,ncolumns=10;
		Vector rows=new Vector();
		for(int i=0;i<nrows;i++){
		  Vector row = new Vector();
		  for(int j=0;j<ncolumns;j++){
		    row.addElement("item "+i+"-"+j);
		  }
		  rows.addElement(row);
		}
		Vector columns=new Vector();
		for(int i=0;i<ncolumns; i++){
		  columns.addElement("Column"+i);
		}
		JTable table = new JTable(rows,columns);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.createDefaultColumnsFromModel();
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.setLayout(new BorderLayout());
		//添加相应组件
		contentPane.add(scrollPane);

		shell.open();
		while(!shell.isDisposed()){
			  if(!display.readAndDispatch()){
				  display.sleep();
			  }
		  }
		  display.dispose();
	}
}
