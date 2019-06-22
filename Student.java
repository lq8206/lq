package lqdzy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Student 
{
	
   public static void main(String[] args) 
   {
	   
		new Student();
		
   }
    public Student()
    {
    	new MainFrame().setVisible(true);
    }
    public String xuesheng[][]=new String[100][9];   //存储学生基本信息
    int cou=0;                                    //记录有多少学生信息记录
    public static int a; 
    class MainFrame extends JFrame implements ActionListener
    {   //主的窗口
    	JButton button1,button2,button3,button4,button5;
    	JPanel jp=new JPanel();
    	JLabel label;
    	public MainFrame()
    	{
    		super("管理系统");
    		jp.setLayout(null);
    		add(jp);
    		label=new JLabel("学生信息管理系统");
    		label.setFont(new Font( "宋体_GB2312",Font.BOLD,24));
    		label.setBounds(180,20,250,30);
    		jp.add(label);
    		setVisible(true);
    		setResizable(false);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(300,200,600,400);
    		button1=new JButton("学生信息输入");
    		button2=new JButton("查询");
    		button3=new JButton("修改");
    		button4=new JButton("删除");
    		button5=new JButton("写入文件");
    	    button1.setBounds(200,90,170,30);
    	    button2.setBounds(200,140,170,30);
    	    button3.setBounds(200,190,170,30);
    	    button4.setBounds(200,240,170,30);
    	    button5.setBounds(200,290,170,30);
    	    jp.add(button1);
    	    jp.add(button2);
    	    jp.add(button3);
    	    jp.add(button4);
    	    jp.add(button5);
    	    button1.addActionListener(this);
    	    button2.addActionListener(this);
    	    button3.addActionListener(this);
    	    button4.addActionListener(this);
    	    button5.addActionListener(this);
    	}
    	
    	public void actionPerformed(ActionEvent e)
    	{
    		if(e.getSource()==button1)
    		{             
    			new AddFrame().setVisible(true);
    		
    		}
    		else if(e.getSource()==button2)
    		{
    		  new search().setVisible(true);
    		}
    	    else if(e.getSource()==button3){
    			new changexz().setVisible(true);
         	}
    	   else if(e.getSource()==button4){
    			new deletexs().setVisible(true);
    		}
    		else if(e.getSource()==button5){
    			new xrfile().setVisible(true);
    		}
    		
    	}
    }
    class AddFrame extends JFrame implements ActionListener{   //实现学生对象插入的窗口
  	    JLabel label1 = new JLabel("添加基本信息",JLabel.CENTER);
	    JLabel labxuehao=new JLabel("学号：",JLabel.CENTER);
	    JLabel labName=new JLabel("姓名：",JLabel.CENTER);
	    JLabel labsex = new JLabel("性别：",JLabel.CENTER);
	    JLabel labND=new JLabel("身份证号：",JLabel.CENTER);
	    JLabel labmz=new JLabel("籍贯：",JLabel.CENTER);
	    JLabel labphone=new JLabel("电话：",JLabel.CENTER);
	    JLabel labDate=new JLabel("出身年月：",JLabel.CENTER);
	    JLabel labclass=new JLabel("班级：",JLabel.CENTER);
	    JLabel labzy=new JLabel("专业：",JLabel.CENTER);
	    JTextField txtXueHao=new JTextField(20);
	    JTextField txtName=new JTextField(20);
	    JTextField txtSex=new JTextField(18);
	    JTextField txtND=new JTextField(20);
	    JTextField txtMZ=new JTextField(20);
	    JTextField txtphone=new JTextField(20);
	    JTextField txtDate=new JTextField(20);
	    JTextField txtClass=new JTextField(20);
	    JTextField txtZY=new JTextField(20);
	    JButton btnAdd=new JButton("添加");
	    JButton btnCancel=new JButton("返回");
	    JButton btnReset = new JButton("重置");
	    JPanel jpl=new JPanel();
	    //File file=new File("I:\\javawj","letter.txt");
	   
    	public AddFrame(){
	    	super("输入学生信息");
			this.setResizable(false);
			this.setSize(550,500);
			this.setVisible(true);
			this.setLocation(300,180);
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.add(jpl);
			jpl.setLayout(null);
			btnAdd.addActionListener(this);
			btnReset.addActionListener(this);
			btnCancel.addActionListener(this);
			jpl.setBackground(Color.white);
			label1.setBounds(100,20,300,20);
			jpl.add(label1);
			//学号设置
			labxuehao.setBounds(100,50,70,20);
			jpl.add(labxuehao);
			txtXueHao.setBounds(190,50,140,20);
			jpl.add(txtXueHao);
			//姓名设置
			labName.setBounds(100,90,70,20);
			jpl.add(labName);
			txtName.setBounds(190,90,140,20);
			jpl.add(txtName);
			//性别
			labsex.setBounds(110,130,60,20);
			jpl.add(labsex);
			txtSex.setBounds(190,130,140,20);
			jpl.add(txtSex);
			//身份证
		    labND.setBounds(100,170,70,20);
			jpl.add(labND);
			txtND.setBounds(190,170,140,20);
			jpl.add(txtND);
			//籍贯
			labmz.setBounds(100,210,70,20);
			jpl.add(labmz);
			txtMZ.setBounds(190,210,140,20);
			jpl.add(txtMZ);
			//电话
			labphone.setBounds(100,250,70,20);
			jpl.add(labphone);
			txtphone.setBounds(190,250,140,20);
			jpl.add(txtphone);
			//出身年月
	        labDate.setBounds(100,290,70,20);
			jpl.add(labDate);
			txtDate.setBounds(190,290,140,20);
			jpl.add(txtDate);
			//班级
			labclass.setBounds(100,330,70,20);
			jpl.add(labclass);
			txtClass.setBounds(190,330,140,20);
			jpl.add(txtClass);
			//专业
			labzy.setBounds(100,370,70,20);
			jpl.add(labzy);
			txtZY.setBounds(190,370,140,20);
			jpl.add(txtZY);
			btnReset.setBounds(80,420,90,20);
			btnAdd.setBounds(200,420,90,20);
			btnCancel.setBounds(320,420,90,20);
			jpl.add(btnReset);
			jpl.add(btnAdd);
			jpl.add(btnCancel);
			/*try{
				file.createNewFile();
			}
			catch(Exception e){}*/
    	}
    	public void actionPerformed(ActionEvent ee){
	    	if(ee.getSource()==btnReset){        //重置
	    		   txtXueHao.setText(null);
	    		   txtName.setText(null);
	    		   txtSex.setText(null);
	    		   txtND.setText(null);
	    		   txtMZ.setText(null);
	    		   txtphone.setText(null);
	    		   txtDate.setText(null);
	    		   txtClass.setText(null);
	    		   txtZY.setText(null);
	    	}
	    	if(ee.getSource()==btnCancel){     //返回
	    		dispose();
	    	}
	    	if(ee.getSource()==btnAdd){
    			boolean bool=false;
    			for(int i=0;i<cou;i++){
    				String temp=txtXueHao.getText();
    				if(temp.equals(xuesheng[i][0])){     //判断学号是否已存在
    					bool=true;
    					break;
    				}
    			}
    			if(bool){                                   //若学号已经存在 错误提示
    				JOptionPane.showMessageDialog(null, "学号重复，请重新输入", "错误提示", JOptionPane.INFORMATION_MESSAGE);
    				txtXueHao.setText(null);
    				
    			}
    			else{
	    		    if (txtXueHao.getText().toString().equals("")){
	  		           JOptionPane.showMessageDialog(null, "请输入学号", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
	  		         }
	                 else if (txtName.getText().toString().equals("")){
	  		            JOptionPane.showMessageDialog(null, "请输入姓名", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
	  		         }
	                 else if (txtSex.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "请输入性别", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
		  		         }
	                 else if (txtND.getText().toString().equals("")){
	  		            JOptionPane.showMessageDialog(null, "请输入身份证号", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
	  		         }  
	                 else if (txtMZ.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "请输入籍贯", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
		  		         }  
	                 else if (txtphone.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "请输入电话", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
		  		         }
	                 else if (txtDate.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "请输入出生日期", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
		  		         }
	                 else if (txtClass.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "请输入班级", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
		                 }
	                 else if (txtZY.getText().toString().equals("")){
	  		             JOptionPane.showMessageDialog(null, "请输入专业", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
	  		         }
	                 else{
	    		       int j=0;
	    		       xuesheng[cou][j++]=txtXueHao.getText();
	    		       xuesheng[cou][j++]=txtName.getText();
	    		       xuesheng[cou][j++]=txtSex.getText();
	    		       xuesheng[cou][j++]=txtND.getText();
	    		       xuesheng[cou][j++]=txtMZ.getText();
	    		       xuesheng[cou][j++]=txtphone.getText();
	    		       xuesheng[cou][j++]=txtDate.getText();
	    		       xuesheng[cou][j++]=txtClass.getText();
	    		       xuesheng[cou][j++]=txtZY.getText();
	    		       cou++;                                  //数组中学生信息的个数加一
	    		     /*  byte a1[]=txtXueHao.getText().getBytes();
	    		       byte b[]=txtName.getText().getBytes();
	    		       byte c[]=txtSex.getText().getBytes();
	    		       byte d[]=txtND.getText().getBytes();
	    		       byte e[]=txtMZ.getText().getBytes();
	    		       byte f[]=txtphone.getText().getBytes();
	    		       byte g[]=txtDate.getText().getBytes();
	    		       byte h[]=txtClass.getText().getBytes();
	    		       byte k[]=txtZY.getText().getBytes();
	    		      /* try{
	    			      FileOutputStream out=new FileOutputStream(file,true);  //把学生信息写入文件
	    			      out.write(a);
	    			      out.write('\t');
	    			      out.write(b);
	    			      out.write('\t');
	    			      out.write(c);
	    		    	  out.write('\t');
	    			      out.write(d);
	    			      out.write('\t');
	    			      out.write(e);
	    			      out.write('\t');
	    			      out.write(f);
	    			      out.write('\t');
	    			      out.write(g);
	    			      out.write('\t');
	    			      out.write(h);
	    			      out.write('\t');
	    			      out.write(k);
	    			      out.write('\r');
	    			      out.write('\n');
	    			      
	    			      out.close();
	    			   
	    		      }
	    		       catch(IOException e1){}
	    		       */
	    		       JOptionPane.showMessageDialog(null,"已成功添加","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	    		       txtName.setText(null);
	    		       txtSex.setText(null);    
	    		       txtND.setText(null);
	    		       txtMZ.setText("河北");
	    		       txtphone.setText(null);
	    		       txtDate.setText(null);
	    		       txtClass.setText(null);
	    		       txtZY.setText(null);
	    		       int temp=Integer.parseInt(txtXueHao.getText());
	    		       temp++;                                              //实现学号自动编号功能，也就是自动加一
	    		       txtXueHao.setText(String.valueOf(temp));
	                 }
	            }
	    	}
	     }
    }
    class search extends JFrame implements ActionListener   //实现学生对象查询选择
    {
    	JButton button11,button21,button31;
    	JPanel jp1=new JPanel();
    	JLabel label1;
    	public search()
    	{
    		super("查询选择");
    		jp1.setLayout(null);
    		add(jp1);
    		label1=new JLabel("请选择：");
    		label1.setFont(new Font( "宋体_GB2312",Font.BOLD,22));
    		label1.setBounds(210,30,250,30);
    		jp1.add(label1);
    		setResizable(false);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(300,200,600,400);
    		button11=new JButton("学号查询");
    		button21=new JButton("姓名查询");
    		button31=new JButton("返回");
    		button11.setBounds(200,100,170,40);
      	    button21.setBounds(200,160,170,40);
      	    button31.setBounds(200,220,170,40);
      	   jp1.add(button11);
  	       jp1.add(button21);
  	       jp1.add(button31);
  	       button11.addActionListener(this);
  	       button21.addActionListener(this);
  	       button31.addActionListener(this);
  	       
    	}
    	public void actionPerformed(ActionEvent e1)
    	{
    		if(e1.getSource()==button11)
    		{    
    			new Serchxuehao().setVisible(true);
    		}
    	   if(e1.getSource()==button21){
    			new searchname().setVisible(true);
    		}
    	   if(e1.getSource()==button31)
   		{      //返回
   			 dispose();
   		}
    	}
    }
    class  Serchxuehao extends JFrame implements ActionListener
    {   //实现学生按照学号查询的窗口
    	   JPanel jpl = new JPanel();
    	   JLabel SCH = new JLabel("查询学生信息",JLabel.CENTER);
    	   Font f = new Font("楷体",Font.BOLD+Font.ITALIC,30);
    	   JLabel labelxuehao = new JLabel("请输入学号：",JLabel.CENTER);
    	   JButton btnQuery = new JButton("查询");
    	   JLabel labelname = new JLabel("姓名：",JLabel.CENTER);
    	   JLabel labelsex = new JLabel("性别：",JLabel.CENTER);
    	   JLabel labelND=new JLabel("身份证号：",JLabel.CENTER);
    	   JLabel labelMZ=new JLabel("籍贯：",JLabel.CENTER);
    	   JLabel labelphone=new JLabel("电话：",JLabel.CENTER);
    	   JLabel labeldate=new JLabel("出生年月：",JLabel.CENTER);
    	   JLabel labelclass = new JLabel("班级：",JLabel.CENTER);
    	   JLabel labelzhuanye = new JLabel("专业：",JLabel.CENTER);
    	   JTextField number = new JTextField();
    	   JTextField tname = new JTextField();
    	   JTextField tsex = new JTextField();
    	   JTextField tND = new JTextField();
    	   JTextField tMZ = new JTextField();
    	   JTextField tphone = new JTextField();
    	   JTextField tdate = new JTextField();
    	   JTextField tclass = new JTextField();
    	   JTextField tzhuanye = new JTextField();
    	 //  JButton btnDelete = new JButton("删除");
    	   JButton btnCancel = new JButton("取消");
    	public Serchxuehao()
    	{
    		super("查询学生信息(按学号)");
    	    this.setSize(560,460);
    	    setLocation(300,200);
    		this.setVisible(true);
    		this.setResizable(false);
    		SCH.setForeground(Color.blue);//最上中间文字颜色
    		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    		this.add(jpl);
    		jpl.setBackground(Color.white);
    		jpl.setLayout(null);
    		btnQuery.addActionListener(this);
    	 //   btnDelete.addActionListener(this);
    		btnCancel.addActionListener(this);
    		SCH.setBounds(100,20,300,20);
    		jpl.add(SCH);
    		//设置学号框
    		labelxuehao.setBounds(100,60,100,20);
    		jpl.add(labelxuehao);
    		number.setBounds(220,60,140,20);
    		jpl.add(number);
    		btnQuery.setBounds(160,100,90,20);
    	  //  btnDelete.setBounds(230,100,90,20);
    		btnCancel.setBounds(300,100,90,20);
    		jpl.add(btnQuery);
    	//	jpl.add(btnDelete);
    		jpl.add(btnCancel);
    		//设置姓名框
    		labelname.setBounds(100,150,70,20);
    		jpl.add(labelname);
    		tname.setBounds(190,150,140,20);
    		jpl.add(tname);
    		//设置性别框
    		labelsex.setBounds(100,180,70,20);
    		jpl.add(labelsex);
    		tsex.setBounds(190,180,140,20);
    		jpl.add(tsex);
    		//设置身份证号框
    		labelND.setBounds(100,210,70,20);
    		jpl.add(labelND);
    		tND.setBounds(190,210,140,20);
    		jpl.add(tND);
    		//设置籍贯
            labelMZ.setBounds(100,240,70,20);
    		jpl.add(labelMZ);
    		tMZ.setBounds(190,240,140,20);
    		jpl.add(tMZ);
    		//设置电话
    		labelphone.setBounds(100,270,70,20);
    		jpl.add(labelphone);
    		tphone.setBounds(190,270,140,20);
    		jpl.add(tphone);
    		//设置出身年月
    		labeldate.setBounds(100,300,70,20);
    		jpl.add(labeldate);
    		tdate.setBounds(190,300,140,20);
    		jpl.add(tdate);
    		//设置班级
    		labelclass.setBounds(100,330,70,20);
    		jpl.add(labelclass);
    		tclass.setBounds(190,330,140,20);
    		jpl.add(tclass);
    		//设置专业
    		labelzhuanye.setBounds(100,360,70,20);
    		jpl.add(labelzhuanye);
    		tzhuanye.setBounds(190,360,140,20);
    		jpl.add(tzhuanye);
    	  //  btnDelete.setEnabled(false);    //取消删除按钮的功能
    		tname.setEditable(false);
    	    tsex.setEditable(false);
    	    tND.setEditable(false);
    	    tMZ.setEditable(false);
    	    tphone.setEditable(false);
    	    tdate.setEditable(false);
    	    tclass.setEditable(false);
    	    tzhuanye.setEditable(false);
    	    setVisible(true);
    	    number.requestFocus();
    	}
    
    	public void actionPerformed(ActionEvent e)
    	{
    		if(e.getSource()==btnQuery)
    		{            //查询操作
    			String temp=number.getText();
    			boolean bool=true;
    			for(int i=0;i<cou;i++)
    			{
    				if(temp.equals(xuesheng[i][0]))
    				{        //如果存在该查找的学号执行
    					tname.setText(xuesheng[i][1]);
    					tsex.setText(xuesheng[i][2]);
    					tND.setText(xuesheng[i][3]);
    					tMZ.setText(xuesheng[i][4]);
    					tphone.setText(xuesheng[i][5]);
    					tdate.setText(xuesheng[i][6]);
    					tclass.setText(xuesheng[i][7]);
    					tzhuanye.setText(xuesheng[i][8]);
    					bool=false;
    					//btnDelete.setEnabled(true);
    					break;
    				}
    			 }
				 if(bool)
				 {
					 JOptionPane.showMessageDialog(null,"不存在记录，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);
						number.setText(null);
						tname.setText(null);
						tsex.setText(null);
						tND.setText(null);
						tMZ.setText(null);
						tphone.setText(null);
						tdate.setText(null);
						tclass.setText(null);
						tzhuanye.setText(null);
					       // btnDelete.setEnabled(false);
    			}
    		}
    		if(e.getSource()==btnCancel)
    		{      //返回
    			 dispose();
    		}
    	}
    }
   class  searchname extends JFrame implements ActionListener
    {
    	//实现学生按照名字查询的窗口
 	   JPanel jpl = new JPanel();
 	   JLabel SCH = new JLabel("查询学生信息",JLabel.CENTER);
 	   Font f = new Font("楷体",Font.BOLD+Font.ITALIC,30);
 	   JLabel labelname1 = new JLabel("请输入姓名：",JLabel.CENTER);
 	   JButton btnQuery = new JButton("查询");
 	   JLabel labelxuehao = new JLabel("学号：",JLabel.CENTER);
 	   JLabel labelsex = new JLabel("性别：",JLabel.CENTER);
 	   JLabel labelND=new JLabel("身份证号：",JLabel.CENTER);
 	   JLabel labelMZ=new JLabel("籍贯：",JLabel.CENTER);
 	   JLabel labelphone=new JLabel("电话：",JLabel.CENTER);
 	   JLabel labelclass = new JLabel("班级：",JLabel.CENTER);
 	   JLabel labeldate = new JLabel("出身年月：",JLabel.CENTER);
 	   JLabel labelzhuanye = new JLabel("专业：",JLabel.CENTER);
 	   JTextField number1 = new JTextField();
 	   JTextField tname1 = new JTextField();
 	   JTextField tsex = new JTextField();
 	   JTextField tND = new JTextField();
 	   JTextField tMZ = new JTextField();
 	   JTextField tphone = new JTextField();
 	   JTextField tdate = new JTextField();
 	   JTextField tclass = new JTextField();
 	   JTextField tzhuanye = new JTextField();
 	 //  JButton btnDelete = new JButton("删除");
 	   JButton btnCancel = new JButton("取消");
 	public searchname()
 	{
 		super("查询学生信息（按姓名）");
 	    this.setSize(560,460);
 	    setLocation(300,200);
 		this.setVisible(true);
 		this.setResizable(false);
 		SCH.setForeground(Color.blue);//最上中间文字颜色
 		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 		this.add(jpl);
 		jpl.setBackground(Color.white);
 		jpl.setLayout(null);
 		btnQuery.addActionListener(this);
 	 //   btnDelete.addActionListener(this);
 		btnCancel.addActionListener(this);
 		SCH.setBounds(100,20,300,20);
 		jpl.add(SCH);
 		//设置姓名框
 		labelname1.setBounds(100,60,100,20);
 		jpl.add(labelname1);
 		tname1.setBounds(220,60,140,20);
 		jpl.add(tname1);
 		btnQuery.setBounds(160,100,90,20);
 	  //  btnDelete.setBounds(230,100,90,20);
 		btnCancel.setBounds(300,100,90,20);
 		jpl.add(btnQuery);
 	//	jpl.add(btnDelete);
 		jpl.add(btnCancel);
 		//设置学号
 		labelxuehao.setBounds(100,150,70,20);
 		jpl.add(labelxuehao);
 		number1.setBounds(190,150,140,20);
 		jpl.add(number1);
 		//设置性别框
 		labelsex.setBounds(100,180,70,20);
 		jpl.add(labelsex);
 		tsex.setBounds(190,180,140,20);
 		jpl.add(tsex);
 		//设置身份证号框
 		labelND.setBounds(100,210,70,20);
 		jpl.add(labelND);
 		tND.setBounds(190,210,140,20);
 		jpl.add(tND);
 		//设置籍贯
         labelMZ.setBounds(100,240,70,20);
 		jpl.add(labelMZ);
 		tMZ.setBounds(190,240,140,20);
 		jpl.add(tMZ);
 		//设置电话
 		labelphone.setBounds(100,270,70,20);
 		jpl.add(labelphone);
 		tphone.setBounds(190,270,140,20);
 		jpl.add(tphone);
 		//设置出身年月
 		labeldate.setBounds(100,300,70,20);
 		jpl.add(labeldate);
 		tdate.setBounds(190,300,140,20);
 		jpl.add(tdate);
 		//设置班级
 		labelclass.setBounds(100,330,70,20);
 		jpl.add(labelclass);
 		tclass.setBounds(190,330,140,20);
 		jpl.add(tclass);
 		//设置专业
 		labelzhuanye.setBounds(100,360,70,20);
 		jpl.add(labelzhuanye);
 		tzhuanye.setBounds(190,360,140,20);
 		jpl.add(tzhuanye);
 	  //  btnDelete.setEnabled(false);    //取消删除按钮的功能
 	    number1.setEditable(false);
 	    tsex.setEditable(false);
 	    tND.setEditable(false);
 	    tMZ.setEditable(false);
 	    tphone.setEditable(false);
 	    tdate.setEditable(false);
 	    tclass.setEditable(false);
 	    tzhuanye.setEditable(false);
 	    setVisible(true);
 	   tname1.requestFocus();
 	}
 
 	public void actionPerformed(ActionEvent e1)
 	{
 		if(e1.getSource()==btnQuery)
 		{            //查询操作
 			String temp=tname1.getText();
 			boolean bool=true;
 			for(int i=0;i<cou;i++)
 			{
 				if(temp.equals(xuesheng[i][1]))
 				{        //如果存在该查找的姓名执行
 					number1.setText(xuesheng[i][0]);
 					tsex.setText(xuesheng[i][2]);
 					tND.setText(xuesheng[i][3]);
 					tMZ.setText(xuesheng[i][4]);
 					tphone.setText(xuesheng[i][5]);
 					tdate.setText(xuesheng[i][6]);
 					tclass.setText(xuesheng[i][7]);
 					tzhuanye.setText(xuesheng[i][8]);
 					bool=false;
 					//btnDelete.setEnabled(true);
 					break;
 				}
 			 }
				 if(bool)
				 {
					 JOptionPane.showMessageDialog(null,"不存在记录，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);
						number1.setText(null);
						tname1.setText(null);
						tsex.setText(null);
						tND.setText(null);
						tMZ.setText(null);
						tphone.setText(null);
						tdate.setText(null);
						tclass.setText(null);
						tzhuanye.setText(null);
					       // btnDelete.setEnabled(false);
 			}
 		}
 		if(e1.getSource()==btnCancel)
 		{      //返回
 			 dispose();
 		}
    }
    }
   class  deletexs extends JFrame implements ActionListener
   {   //实现学生删除窗口
	   JPanel jpl = new JPanel();
	   JLabel SCH;
	   JLabel labelxuehao = new JLabel("请输入学号：",JLabel.CENTER);
	   JButton btnQuery = new JButton("删除");
	   JTextField number = new JTextField();
	   JButton btnCancel = new JButton("返回");
	   public deletexs()
   	{
		   super("删除界面");
		   this.setSize(500,300);
   	    setLocation(300,200);
   		this.setVisible(true);
   		this.setResizable(false);
   		labelxuehao.setForeground(Color.white);
   		SCH= new JLabel("删除学生信息",JLabel.CENTER);
 	    SCH.setFont(new Font( "宋体_GB2312",Font.BOLD,22));
   		SCH.setForeground(Color.red);//最上中间文字颜色
   		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(jpl);
		jpl.setBackground(Color.gray);
		jpl.setLayout(null);
		btnQuery.addActionListener(this);
		btnCancel.addActionListener(this);
		SCH.setBounds(100,20,300,20);
		jpl.add(SCH);
		labelxuehao.setBounds(100,60,100,20);
		jpl.add(labelxuehao);
		number.setBounds(220,60,140,20);
		jpl.add(number);
		btnQuery.setBounds(140,100,90,20);
		btnCancel.setBounds(280,100,90,20);
		jpl.add(btnQuery);
		jpl.add(btnCancel);
		//btnQuery.setEnabled(false); 
		setVisible(true);
 	    number.requestFocus();
   	}
	   public void actionPerformed(ActionEvent e)
   	{
		   if(e.getSource()==btnQuery)
		   {
			   boolean bool=true;
   			String temp=number.getText();
   			for(int i=0;i<cou;i++)
   			{
   				if(temp.equals(xuesheng[i][0]))
                {
   					for(int j=0;j<9;j++)
   					{
   						xuesheng[i][j]=null;      //删除操作
   				    }
                                   JOptionPane.showMessageDialog(null,"删除成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
                                   bool=false;
                                  // cou--;                          //学生信息数组的学生信息个数减一
                                   break;
   				}
   			
   		   }
   			if(bool)
			  {
				 JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);
		     }
 			}
		   if(e.getSource()==btnCancel)
  	 		{      //返回
  	 			 dispose();
  	 		}
   	     }
   }
    
   class changexz extends JFrame implements ActionListener   //实现对学生信息修改的选择
   {
	   JButton button01,button11,button21,button31,button41,button51,button61,button71,button81,button91;
   	   JPanel jp1=new JPanel();
   	   JLabel label1;
   	public changexz()
	{
		super("修改选择");
		jp1.setLayout(null);
		add(jp1);
		label1=new JLabel("请选择要修改的内容：");
		label1.setFont(new Font( "宋体_GB2312",Font.BOLD,22));
		label1.setBounds(190,30,250,30);
		jp1.add(label1);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,200,600,400);
		button01=new JButton("返回");
		button11=new JButton("学号");
		button21=new JButton("姓名");
		button31=new JButton("性别");
		button41=new JButton("身份证号");
		button51=new JButton("籍贯");
		button61=new JButton("电话");
		button71=new JButton("出生年月");
		button81=new JButton("班级");
		button91=new JButton("专业");
		button01.setBounds(450,30,60,30);
		button11.setBounds(160,100,120,30);
  	    button21.setBounds(160,140,120,30);
  	    button31.setBounds(160,180,120,30);
  	    button41.setBounds(160,220,120,30);
  	    button51.setBounds(300,100,120,30);
  	    button61.setBounds(300,140,120,30);
  	    button71.setBounds(300,180,120,30);
  	    button81.setBounds(300,220,120,30);
  	    button91.setBounds(230,260,120,30);
  	    jp1.add(button01);
  	    jp1.add(button11);
	    jp1.add(button21);
	    jp1.add(button31);
	    jp1.add(button41);
	    jp1.add(button51);
	    jp1.add(button61);
	    jp1.add(button71);
	    jp1.add(button81);
	    jp1.add(button91);
	    button01.addActionListener(this);
	    button11.addActionListener(this);
	    button21.addActionListener(this);
	    button31.addActionListener(this);
	    button41.addActionListener(this);
	    button51.addActionListener(this);
	    button61.addActionListener(this);
	    button71.addActionListener(this);
	    button81.addActionListener(this);
	    button91.addActionListener(this);
	}
   	public void actionPerformed(ActionEvent e1)
   	{
   		if(e1.getSource()==button11)
		{    
   			a=1;
   			new change().setVisible(true);
		}
	   if(e1.getSource()==button21){
		   a=2;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button31){
		   a=3;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button41){
		   a=4;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button51){
		   a=5;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button61){
		   a=6;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button71){
		   a=7;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button81){
		   a=8;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button91){
		   a=9;
		   new change().setVisible(true);
		}
	   if(e1.getSource()==button01)
		{      //返回
			 dispose();
		}
	   
   	}
   }
   class change extends JFrame implements ActionListener   //实现对学生信息修改
   {
	   JPanel jpl = new JPanel();
	   JLabel SCH;
	   JLabel labelxuehao = new JLabel("输入修改者学号",JLabel.CENTER);
	   JLabel labelxiugai = new JLabel("请输入修改结果",JLabel.CENTER);
	   JButton btnQuery = new JButton("修改");
	   JTextField number = new JTextField();
	   JTextField xg = new JTextField();
	   JButton btnCancel = new JButton("返回");
	   public change()
	   {
	       //if(a==9)
	      // {
	    	  // System.out.println("aaaaaaaa");
	      // }
		   super("修改界面");
		   this.setSize(500,300);
   	    setLocation(300,200);
   		this.setVisible(true);
   		this.setResizable(false);
   		labelxuehao.setForeground(Color.white);
   		labelxiugai.setForeground(Color.blue);
   		SCH= new JLabel("修改学生信息",JLabel.CENTER);
 	    SCH.setFont(new Font( "宋体_GB2312",Font.BOLD,22));
   		SCH.setForeground(Color.blue);//最上中间文字颜色
   		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(jpl);
		jpl.setBackground(Color.gray);
		jpl.setLayout(null);
		btnQuery.addActionListener(this);
		btnCancel.addActionListener(this);
		SCH.setBounds(100,20,300,20);
		jpl.add(SCH);
		//添加学号框
		labelxuehao.setBounds(100,60,100,20);
		jpl.add(labelxuehao);
		number.setBounds(220,60,140,20);
		jpl.add(number);
		//添加修改框
		labelxiugai.setBounds(100,100,100,20);
		jpl.add(labelxiugai);
		xg.setBounds(220,100,140,20);
		jpl.add(xg);
		//添加按钮
		btnQuery.setBounds(140,150,90,20);
		btnCancel.setBounds(280,150,90,20);
		jpl.add(btnQuery);
		jpl.add(btnCancel);
		//btnQuery.setEnabled(false); 
		setVisible(true);
 	    number.requestFocus();
 	    xg.requestFocus();   
	   }
	   public void actionPerformed(ActionEvent e)
	   {
		   if(a==1)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==2)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==3)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==4)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==5)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==6)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==7)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==8)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   if(a==9)
		   {
			   if(e.getSource()==btnQuery)
			   {
				   boolean bool=true;
	   			String temp=number.getText();
	   			String temp2=xg.getText();
	   			for(int i=0;i<cou;i++)
	   			{
	   				if(temp.equals(xuesheng[i][0]))
	                {
	   					
	   					      xuesheng[i][a-1]=xg.getText();
	                          JOptionPane.showMessageDialog(null,"修改成功","温馨提示",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"学生信息不存在，请重新输入!","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //返回
	  	 			 dispose();
	  	 		    }
		   }
		   
		   
	   }
	   
	   
	   
   }
   class xrfile extends JFrame implements ActionListener//实现学生存入文件
   {
	   JPanel jpl = new JPanel();
	   JLabel SCH;
	   JButton btnQuery = new JButton("存盘");
	   JButton btnCancel = new JButton("返回");
	   File file=new File("I:\\javawj","letter.txt");
	   public xrfile()
	   	{
			   super("存盘界面");
			   this.setSize(500,300);
	   	    setLocation(300,200);
	   		this.setVisible(true);
	   		this.setResizable(false);
	   		SCH= new JLabel("储存学生信息",JLabel.CENTER);
	 	    SCH.setFont(new Font( "宋体_GB2312",Font.BOLD,22));
	   		SCH.setForeground(Color.black);//最上中间文字颜色
	   		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.add(jpl);
			jpl.setBackground(Color.white);
			jpl.setLayout(null);
			btnQuery.addActionListener(this);
			btnCancel.addActionListener(this);
			SCH.setBounds(100,20,300,20);
			jpl.add(SCH);
			btnQuery.setBounds(140,100,90,30);
			btnCancel.setBounds(280,100,90,30);
			jpl.add(btnQuery);
			jpl.add(btnCancel);
			setVisible(true);
			try{
				file.createNewFile();
			}
			catch(Exception e){}
	   	}
	   public void actionPerformed(ActionEvent e)
	   {
		   if(e.getSource()==btnQuery)
		   {
			   for(int i=0;i<cou;i++)
			   {
				   for(int j=0;j<9;j++)
  					{
  					
					   try{
		    			      FileOutputStream out=new FileOutputStream(file,true);  //把学生信息写入文件
		    			      if(xuesheng[i][0]!=null)
		    			      {
		    			      out.write(xuesheng[i][j].getBytes());
		    			      out.write('\t');
		    			      }
		    			      if(j==8)
		    			      {
		    			    	  out.write('\r');
		    			    	  out.write('\n');
		    			    	
		    			      }
		    			      out.close();
		    		      }
					   catch(IOException e1){}
					   
  					}
			   }
			   JOptionPane.showMessageDialog(null,"已成功存盘","温馨提示",JOptionPane.INFORMATION_MESSAGE);
 		   }
		   if(e.getSource()==btnCancel)
 	 		{      //返回
 	 			 dispose();
 	 		}
	   }
   }
    
 
    
  }
