import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;


public class MainFrame extends JFrame{
	//菜单
	private JMenuBar mainMenu;
	private JMenu fileMenu; //文件菜单
	private JMenu newMenu;
	private JMenu exitMenu;
	
	//读取数据Panel
	private JPanel dataPanel;
	private JPanel workflowdataPanel;
	private JPanel constructdataPanel;
	
	//显示workflowPanel
	private JPanel workflowPanel;
	
	//显示服务组合结果Panel
	private JPanel resultPanel;
		
	public MainFrame(){
		setLayout(new GridBagLayout());
		InitFrame();
	}
	
	//载入固定的窗体框架
	private void InitFrame()
	{
		//初始化控件
		mainMenu = new JMenuBar();
		fileMenu = new JMenu();
		newMenu = new JMenu();
		exitMenu = new JMenu();
		dataPanel = new JPanel();
		workflowdataPanel = new JPanel();
		constructdataPanel = new JPanel();
		workflowPanel = new JPanel();
		resultPanel = new JPanel();
		
		//菜单
		fileMenu.setText("File");
		newMenu.setText("New");
		newMenu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt) 
			{
				jNewMenuActionPerformed(evt);
			}
		});
		exitMenu.setText("Exit");
		exitMenu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt) 
			{
				jExitMenuActionPerformed(evt);
			}
		});
		fileMenu.add(newMenu);
		fileMenu.add(exitMenu);
		
		mainMenu.add(fileMenu);
		setJMenuBar(mainMenu);
		
		//导入数据Panel
		dataPanel.setBackground(new Color(240,240,240));
		workflowdataPanel.setBackground(Color.red);
		constructdataPanel.setBackground(Color.black);
		dataPanel.setLayout(new GridBagLayout());
		this.add(dataPanel, new GBC(0,0,1,1).setFill(GBC.BOTH).setIpad(200, 70).setWeight(100, 0));		
		dataPanel.add(workflowdataPanel, new GBC(0,0,1,1).setFill(GBC.BOTH).setIpad(200, 30).setWeight(100, 100));
		dataPanel.add(constructdataPanel, new GBC(0,1,1,1).setFill(GBC.BOTH).setIpad(200, 30).setWeight(100, 100));
		
		//导入工作流Panel
		workflowPanel.setBackground(Color.blue);
		this.add(workflowPanel,new GBC(0,1,1,1).setFill(GBC.BOTH).setIpad(200, 100).setWeight(100, 100));
		
		//导入服务结果Panel
		resultPanel.setBackground(Color.green);
		this.add(resultPanel,new GBC(0,2,1,1).setFill(GBC.BOTH).setIpad(200, 100).setWeight(100, 100));
	}
	
	//点击New菜单
	private void jNewMenuActionPerformed(ActionEvent evt)
	{
		
	}
	
	//点击Exit菜单
	private void jExitMenuActionPerformed(ActionEvent evt)
	{
		System.exit(0);
	}
	
	//主程序
	public static void main(String args[]) 
	{
        JFrame f = new MainFrame( );
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);
        f.setVisible(true);
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private void addGridBagPanes() {  
	       //上侧的工具选择面板  
       JPanel toolSelectPanel = new JPanel();  
       toolSelectPanel.setBackground(Color.GRAY);  
       this.add(toolSelectPanel, new GBC(0,0,1,1).  
                    setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));  
       
       button = new JButton("添加节点");
       toolSelectPanel.add(button);
       button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JLabel obj1=new JLabel("XXX");
	        obj1.setPreferredSize(new Dimension(100,40));
	        obj1.setMaximumSize(new Dimension(100,40));
	        obj1.setMinimumSize(new Dimension(100,40));
	        obj1.setHorizontalAlignment(0);    
	        obj1.setBorder(BorderFactory.createLineBorder(Color.red));
	        JLabel obj2=new JLabel("——>");
	        obj2.setPreferredSize(new Dimension(35,40));
	        obj2.setMaximumSize(new Dimension(35,40));
	        obj2.setMinimumSize(new Dimension(35,40));
	        obj2.setHorizontalAlignment(0);    
	        drawPanel.add(obj1);
	        drawPanel.add(obj2);
			
	        
	        drawPanel.validate();
	        drawPanel.repaint();
	        drawPanel.getParent().doLayout();
	        jScrollPane.validate();
		}
    	   
       });
       
        //右侧的绘图面板  
        jScrollPane = new JScrollPane();  
        jScrollPane.setBounds(0, 0, 400, 300);
        this.add(jScrollPane,new GBC(0,1,1,1).setFill(GBC.BOTH).setIpad(70, 90).setWeight(100, 100));  
       
         
        drawPanel = new JPanel(); 
        drawPanel.setBackground(Color.WHITE); 
        jScrollPane.setViewportView(drawPanel);
       
//        drawPanel.setLayout(new GridLayout(3,1)  );
     
        //下侧的状态面板  
        JPanel statePanel = new JPanel();  
        statePanel.setBackground(Color.CYAN);  
        this.add(statePanel,new GBC(0,3,2,1).  
                      setFill(GBC.BOTH).setIpad(200, 10).setWeight(100, 0));  
    }  */

}
