package eclipse13;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWT13_1 {
  public static void main(String[] args){
	  Display display = new Display();
	  Shell shell = new Shell(display);
	  shell.setText("hello world!SWT!");
	  shell.open();
	  while(!shell.isDisposed()){
		  if(!display.readAndDispatch()){
			  display.sleep();
		  }
	  }
	  display.dispose();
  }
}
