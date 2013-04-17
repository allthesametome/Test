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
import javax.swing.JScrollPane;


public class Main extends JFrame{
	private  JPanel  drawPanel;
	private  JButton button;
	private  JScrollPane jScrollPane;
//	private  int		CurX = 0,CurY = 0; 
	public static void main(String args[]) {
        JFrame f = new Main( );

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);
        f.setVisible(true);
     }
	Main(){
		setLayout(new GridBagLayout());
		addGridBagPanes();
	}
	
	private void addGridBagPanes() {  
	       //上侧的工具选择面板  
       JPanel toolSelectPanel = new JPanel();  
       toolSelectPanel.setBackground(Color.GRAY);  
       this.add(toolSelectPanel, new GBC(0,0,1,1).  
                    setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));  
       
       button = new JButton("添加节点");
       toolSelectPanel.add(button);
       button.addActionListener(new ActionListener(){

		@Override
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
			
//			 CurY =  drawPanel.getHeight()/2-20 ;
//		    JLabel obj1=new JLabel("XXX");
//		    obj1.setHorizontalAlignment(0);    
//	        obj1.setBorder(BorderFactory.createLineBorder(Color.red));
//	        JLabel obj2=new JLabel("——>");
//	        obj2.setHorizontalAlignment(0);    
//	        obj1.setBounds(CurX , CurY, 100, 40);
//	        CurX+=100;
//	        obj2.setBounds(CurX , CurY,35, 40);
//	        CurX+=35;
//	        drawPanel.add(obj1);
//	        drawPanel.add(obj2 );
	        
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
    }  

}
