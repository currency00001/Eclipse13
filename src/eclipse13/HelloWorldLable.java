package eclipse13;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldLable {
	public HelloWorldLable() {
		Display display = new Display();
		Shell shell = new Shell(display);
		//**add shellLyout
		shell.setLayout(new FillLayout());
		
		Label labe11 = new Label(shell,SWT.WRAP);
		labe11.setText("very good");
		Label labe12 = new Label(shell,SWT.WRAP);
		labe12.setText("hello ,me!");
		new Label(shell,SWT.SEPARATOR|SWT.HORIZONTAL);
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
		new HelloWorldLable();
	}

}
