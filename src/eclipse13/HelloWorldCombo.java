package eclipse13;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloWorldCombo {
	private static final String[] ITEMS={"alpha","bravo","charlie","delta","Echo","Forxtrot",
			"Golf","Hotl"};
	
	public HelloWorldCombo() {
		Display display = new Display();
		Shell shell = new Shell(display);
		//add shellLyout
		//shell.setLayout(new FillLayout());
        //**alter layout
		//shell.setLayout(new GridLayout(1,false));

		shell.setLayout(new RowLayout());
		
		Combo combo = new Combo(shell,SWT.DROP_DOWN);
		combo.setItems(ITEMS);
		
	    Combo readOnly = new Combo(shell,SWT.DROP_DOWN|SWT.READ_ONLY);
	    readOnly.setItems(ITEMS);
	    
	    Combo simple = new Combo(shell,SWT.SIMPLE);
	    simple.setItems(ITEMS);
		//add text
//		new Text(shell,SWT.BORDER);
//		new Text(shell,SWT.RIGHT|SWT.BORDER);
//		new Text(shell,SWT.PASSWORD|SWT.BORDER);
//		new Text(shell,SWT.READ_ONLY|SWT.BORDER).setText("readOnly");
//		Text t = new Text(shell,SWT.MULTI|SWT.BORDER|SWT.WRAP|SWT.V_SCROLL);
//		
//		t.setText("multsadfsadfjsaldfjldsajfldsjfljlsajfl  aldsfjlsad fjdsaj");
//		t.setLayoutData(new GridData(GridData.FILL_BOTH));
		
//		Label labe11 = new Label(shell,SWT.WRAP);
//		labe11.setText("very good");
//		Label labe12 = new Label(shell,SWT.WRAP);
//		labe12.setText("hello ,me!");
//		new Label(shell,SWT.SEPARATOR|SWT.HORIZONTAL);
		//new Label(shell,SWT.SEPARATOR|SWT.VERTICAL);

		
		
		shell.setSize(400,400);
	
//		//指定父组件和按钮样式
//		Button button = new Button(shell,SWT.PUSH);
//		//指定button位置
//		button.setBounds(40,50,100,30);
//		//指定按钮的显示标签
//		button.setText("click me");
//		
//		//设置窗体大小
//		shell.setSize(200,200);
		shell.open();
		
		while(!shell.isDisposed()){
			  if(!display.readAndDispatch()){
				  display.sleep();
			  }
		  }
		  display.dispose();
		
	}
	
	public static void main(String[] args){
		new HelloWorldCombo();
	}
}
