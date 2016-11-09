package eclipse13;



import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloWorldSashForm {
	private static final String[] ITEMS={"alpha","bravo","charlie","delta","Echo","Forxtrot",
			"Golf","Hotl","alpha","bravo","charlie","delta","Echo","Forxtrot",
			"Golf","Hotl"};
	SashForm sashForm1;
	SashForm sashForm2;
	
	public HelloWorldSashForm(Shell shell) {
		

		shell.setLayout(new FillLayout());
		
		sashForm1 = new SashForm(shell,SWT.HORIZONTAL);
		
		Text text1 = new Text(sashForm1,SWT.CENTER);
		text1.setText("Text in panel #1");
		Text text2 = new Text(sashForm1,SWT.CENTER);
		text2.setText("Text in panel #2");
		
		sashForm2 = new SashForm(shell,SWT.VERTICAL);
		
		final Label label1 = new Label(sashForm2,SWT.BORDER|SWT.CENTER);
		label1.setText("Label in panelA");
		final Label label2 = new Label(sashForm2,SWT.BORDER|SWT.CENTER);
		label2.setText("Label in panelA");
		
		text1.addControlListener(new ControlListener(){

			@Override
			public void controlMoved(ControlEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void controlResized(ControlEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("resized");
			}
		});
		
		sashForm1.setWeights(new int[]{1,2});
		label1.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(sashForm2.getMaximizedControl()==label1)
					sashForm2.setMaximizedControl(null);
				else
					sashForm2.setMaximizedControl(label1);
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
//		final TabFolder tabFolder = new TabFolder(shell,SWT.BORDER);
//		
//		for(int loopIndex=0; loopIndex<3;loopIndex++){
//			TabItem tabItem = new TabItem(tabFolder,SWT.NULL);
//			tabItem.setText("tab "+loopIndex);
//			
//			Text text = new Text(tabFolder,SWT.BORDER);
//			text.setText("this is page "+loopIndex);
//			
//			tabItem.setControl(text);
//			
//		}
//		
//		TabItem tabItem = new TabItem(tabFolder,SWT.NULL);
//		tabItem.setText("tab 3");
//		
//		Composite composite = new Composite(tabFolder,SWT.BORDER);
//		Text text = new Text(composite,SWT.BORDER);
//		text.setText("this is page 3");
//		text.setBounds(10,10,100,20);
//		
//		tabItem.setControl(composite);
		
//		Group group1 = new Group(shell,SWT.SHADOW_IN);
//		group1.setText("what's your name?");
//		group1.setLayout(new RowLayout(SWT.VERTICAL));
//		new Button(group1,SWT.RADIO).setText("alpha");
//		new Button(group1,SWT.RADIO).setText("bravo");
//		new Button(group1,SWT.RADIO).setText("charlie");
//		new Button(group1,SWT.RADIO).setText("John");
//		
//		Group group2 = new Group(shell,SWT.NO_RADIO_GROUP);
//		group2.setText("what's your name?");
//		group2.setLayout(new RowLayout(SWT.VERTICAL));
//		new Button(group2,SWT.CHECK).setText("alpha");
//		new Button(group2,SWT.CHECK).setText("bravo");
//		new Button(group2,SWT.CHECK).setText("charlie");
//		new Button(group2,SWT.CHECK).setText("John");
		
//		Composite composite1 = new Composite(shell,SWT.BORDER);
//		composite1.setLayout(new RowLayout(SWT.VERTICAL));
//		new Button(composite1,SWT.RADIO).setText("John");
//		new Button(composite1,SWT.RADIO).setText("alpha");
//		new Button(composite1,SWT.RADIO).setText("bravo");
//		new Button(composite1,SWT.RADIO).setText("charlie");
//		
//		Composite composite2 =new Composite(shell,SWT.NONE);
//		composite2.setLayout(new RowLayout(SWT.VERTICAL));
//		new Button(composite2,SWT.CHECK).setText("John");
//		new Button(composite2,SWT.CHECK).setText("alpha");
//		new Button(composite2,SWT.CHECK).setText("bravo");
//		new Button(composite2,SWT.CHECK).setText("charlie");
		
		
//		List single = new List(shell,SWT.BORDER|SWT.SINGLE|SWT.V_SCROLL);
//		
//		for(int i=0, n=ITEMS.length; i<n;i++){
//			single.add(ITEMS[i]);
//		}
//		
//		single.select(4);
//		
//		List multi = new List(shell,SWT.BORDER|SWT.MULTI|SWT.V_SCROLL);
//		multi.setItems(ITEMS);
//		multi.select(3, 6);
		
		
		
//		Combo combo = new Combo(shell,SWT.DROP_DOWN);
//		combo.setItems(ITEMS);
//		
//	    Combo readOnly = new Combo(shell,SWT.DROP_DOWN|SWT.READ_ONLY);
//	    readOnly.setItems(ITEMS);
//	    
//	    Combo simple = new Combo(shell,SWT.SIMPLE);
//	    simple.setItems(ITEMS);
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

		
		
		
	
//		//指定父组件和按钮样式
//		Button button = new Button(shell,SWT.PUSH);
//		//指定button位置
//		button.setBounds(40,50,100,30);
//		//指定按钮的显示标签
//		button.setText("click me");
//		
//		//设置窗体大小
//		shell.setSize(200,200);
		
		
	}
	
	public static void main(String[] args){
		Display display = new Display();
		Shell shell = new Shell(display);
		//add shellLyout
		//shell.setLayout(new FillLayout());
        //**alter layout
		//shell.setLayout(new GridLayout(1,false));
		new HelloWorldSashForm(shell);
		shell.setSize(800,800);
		shell.open();
		
		while(!shell.isDisposed()){
			  if(!display.readAndDispatch()){
				  display.sleep();
			  }
		  }
		  display.dispose();
	}
}
