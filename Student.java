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
    public String xuesheng[][]=new String[100][9];   //�洢ѧ��������Ϣ
    int cou=0;                                    //��¼�ж���ѧ����Ϣ��¼
    public static int a; 
    class MainFrame extends JFrame implements ActionListener
    {   //���Ĵ���
    	JButton button1,button2,button3,button4,button5;
    	JPanel jp=new JPanel();
    	JLabel label;
    	public MainFrame()
    	{
    		super("����ϵͳ");
    		jp.setLayout(null);
    		add(jp);
    		label=new JLabel("ѧ����Ϣ����ϵͳ");
    		label.setFont(new Font( "����_GB2312",Font.BOLD,24));
    		label.setBounds(180,20,250,30);
    		jp.add(label);
    		setVisible(true);
    		setResizable(false);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(300,200,600,400);
    		button1=new JButton("ѧ����Ϣ����");
    		button2=new JButton("��ѯ");
    		button3=new JButton("�޸�");
    		button4=new JButton("ɾ��");
    		button5=new JButton("д���ļ�");
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
    class AddFrame extends JFrame implements ActionListener{   //ʵ��ѧ���������Ĵ���
  	    JLabel label1 = new JLabel("��ӻ�����Ϣ",JLabel.CENTER);
	    JLabel labxuehao=new JLabel("ѧ�ţ�",JLabel.CENTER);
	    JLabel labName=new JLabel("������",JLabel.CENTER);
	    JLabel labsex = new JLabel("�Ա�",JLabel.CENTER);
	    JLabel labND=new JLabel("���֤�ţ�",JLabel.CENTER);
	    JLabel labmz=new JLabel("���᣺",JLabel.CENTER);
	    JLabel labphone=new JLabel("�绰��",JLabel.CENTER);
	    JLabel labDate=new JLabel("�������£�",JLabel.CENTER);
	    JLabel labclass=new JLabel("�༶��",JLabel.CENTER);
	    JLabel labzy=new JLabel("רҵ��",JLabel.CENTER);
	    JTextField txtXueHao=new JTextField(20);
	    JTextField txtName=new JTextField(20);
	    JTextField txtSex=new JTextField(18);
	    JTextField txtND=new JTextField(20);
	    JTextField txtMZ=new JTextField(20);
	    JTextField txtphone=new JTextField(20);
	    JTextField txtDate=new JTextField(20);
	    JTextField txtClass=new JTextField(20);
	    JTextField txtZY=new JTextField(20);
	    JButton btnAdd=new JButton("���");
	    JButton btnCancel=new JButton("����");
	    JButton btnReset = new JButton("����");
	    JPanel jpl=new JPanel();
	    //File file=new File("I:\\javawj","letter.txt");
	   
    	public AddFrame(){
	    	super("����ѧ����Ϣ");
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
			//ѧ������
			labxuehao.setBounds(100,50,70,20);
			jpl.add(labxuehao);
			txtXueHao.setBounds(190,50,140,20);
			jpl.add(txtXueHao);
			//��������
			labName.setBounds(100,90,70,20);
			jpl.add(labName);
			txtName.setBounds(190,90,140,20);
			jpl.add(txtName);
			//�Ա�
			labsex.setBounds(110,130,60,20);
			jpl.add(labsex);
			txtSex.setBounds(190,130,140,20);
			jpl.add(txtSex);
			//���֤
		    labND.setBounds(100,170,70,20);
			jpl.add(labND);
			txtND.setBounds(190,170,140,20);
			jpl.add(txtND);
			//����
			labmz.setBounds(100,210,70,20);
			jpl.add(labmz);
			txtMZ.setBounds(190,210,140,20);
			jpl.add(txtMZ);
			//�绰
			labphone.setBounds(100,250,70,20);
			jpl.add(labphone);
			txtphone.setBounds(190,250,140,20);
			jpl.add(txtphone);
			//��������
	        labDate.setBounds(100,290,70,20);
			jpl.add(labDate);
			txtDate.setBounds(190,290,140,20);
			jpl.add(txtDate);
			//�༶
			labclass.setBounds(100,330,70,20);
			jpl.add(labclass);
			txtClass.setBounds(190,330,140,20);
			jpl.add(txtClass);
			//רҵ
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
	    	if(ee.getSource()==btnReset){        //����
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
	    	if(ee.getSource()==btnCancel){     //����
	    		dispose();
	    	}
	    	if(ee.getSource()==btnAdd){
    			boolean bool=false;
    			for(int i=0;i<cou;i++){
    				String temp=txtXueHao.getText();
    				if(temp.equals(xuesheng[i][0])){     //�ж�ѧ���Ƿ��Ѵ���
    					bool=true;
    					break;
    				}
    			}
    			if(bool){                                   //��ѧ���Ѿ����� ������ʾ
    				JOptionPane.showMessageDialog(null, "ѧ���ظ�������������", "������ʾ", JOptionPane.INFORMATION_MESSAGE);
    				txtXueHao.setText(null);
    				
    			}
    			else{
	    		    if (txtXueHao.getText().toString().equals("")){
	  		           JOptionPane.showMessageDialog(null, "������ѧ��", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
	  		         }
	                 else if (txtName.getText().toString().equals("")){
	  		            JOptionPane.showMessageDialog(null, "����������", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
	  		         }
	                 else if (txtSex.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "�������Ա�", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
		  		         }
	                 else if (txtND.getText().toString().equals("")){
	  		            JOptionPane.showMessageDialog(null, "���������֤��", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
	  		         }  
	                 else if (txtMZ.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "�����뼮��", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
		  		         }  
	                 else if (txtphone.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "������绰", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
		  		         }
	                 else if (txtDate.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "�������������", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
		  		         }
	                 else if (txtClass.getText().toString().equals("")){
		  		            JOptionPane.showMessageDialog(null, "������༶", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
		                 }
	                 else if (txtZY.getText().toString().equals("")){
	  		             JOptionPane.showMessageDialog(null, "������רҵ", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);
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
	    		       cou++;                                  //������ѧ����Ϣ�ĸ�����һ
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
	    			      FileOutputStream out=new FileOutputStream(file,true);  //��ѧ����Ϣд���ļ�
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
	    		       JOptionPane.showMessageDialog(null,"�ѳɹ����","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	    		       txtName.setText(null);
	    		       txtSex.setText(null);    
	    		       txtND.setText(null);
	    		       txtMZ.setText("�ӱ�");
	    		       txtphone.setText(null);
	    		       txtDate.setText(null);
	    		       txtClass.setText(null);
	    		       txtZY.setText(null);
	    		       int temp=Integer.parseInt(txtXueHao.getText());
	    		       temp++;                                              //ʵ��ѧ���Զ���Ź��ܣ�Ҳ�����Զ���һ
	    		       txtXueHao.setText(String.valueOf(temp));
	                 }
	            }
	    	}
	     }
    }
    class search extends JFrame implements ActionListener   //ʵ��ѧ�������ѯѡ��
    {
    	JButton button11,button21,button31;
    	JPanel jp1=new JPanel();
    	JLabel label1;
    	public search()
    	{
    		super("��ѯѡ��");
    		jp1.setLayout(null);
    		add(jp1);
    		label1=new JLabel("��ѡ��");
    		label1.setFont(new Font( "����_GB2312",Font.BOLD,22));
    		label1.setBounds(210,30,250,30);
    		jp1.add(label1);
    		setResizable(false);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(300,200,600,400);
    		button11=new JButton("ѧ�Ų�ѯ");
    		button21=new JButton("������ѯ");
    		button31=new JButton("����");
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
   		{      //����
   			 dispose();
   		}
    	}
    }
    class  Serchxuehao extends JFrame implements ActionListener
    {   //ʵ��ѧ������ѧ�Ų�ѯ�Ĵ���
    	   JPanel jpl = new JPanel();
    	   JLabel SCH = new JLabel("��ѯѧ����Ϣ",JLabel.CENTER);
    	   Font f = new Font("����",Font.BOLD+Font.ITALIC,30);
    	   JLabel labelxuehao = new JLabel("������ѧ�ţ�",JLabel.CENTER);
    	   JButton btnQuery = new JButton("��ѯ");
    	   JLabel labelname = new JLabel("������",JLabel.CENTER);
    	   JLabel labelsex = new JLabel("�Ա�",JLabel.CENTER);
    	   JLabel labelND=new JLabel("���֤�ţ�",JLabel.CENTER);
    	   JLabel labelMZ=new JLabel("���᣺",JLabel.CENTER);
    	   JLabel labelphone=new JLabel("�绰��",JLabel.CENTER);
    	   JLabel labeldate=new JLabel("�������£�",JLabel.CENTER);
    	   JLabel labelclass = new JLabel("�༶��",JLabel.CENTER);
    	   JLabel labelzhuanye = new JLabel("רҵ��",JLabel.CENTER);
    	   JTextField number = new JTextField();
    	   JTextField tname = new JTextField();
    	   JTextField tsex = new JTextField();
    	   JTextField tND = new JTextField();
    	   JTextField tMZ = new JTextField();
    	   JTextField tphone = new JTextField();
    	   JTextField tdate = new JTextField();
    	   JTextField tclass = new JTextField();
    	   JTextField tzhuanye = new JTextField();
    	 //  JButton btnDelete = new JButton("ɾ��");
    	   JButton btnCancel = new JButton("ȡ��");
    	public Serchxuehao()
    	{
    		super("��ѯѧ����Ϣ(��ѧ��)");
    	    this.setSize(560,460);
    	    setLocation(300,200);
    		this.setVisible(true);
    		this.setResizable(false);
    		SCH.setForeground(Color.blue);//�����м�������ɫ
    		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    		this.add(jpl);
    		jpl.setBackground(Color.white);
    		jpl.setLayout(null);
    		btnQuery.addActionListener(this);
    	 //   btnDelete.addActionListener(this);
    		btnCancel.addActionListener(this);
    		SCH.setBounds(100,20,300,20);
    		jpl.add(SCH);
    		//����ѧ�ſ�
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
    		//����������
    		labelname.setBounds(100,150,70,20);
    		jpl.add(labelname);
    		tname.setBounds(190,150,140,20);
    		jpl.add(tname);
    		//�����Ա��
    		labelsex.setBounds(100,180,70,20);
    		jpl.add(labelsex);
    		tsex.setBounds(190,180,140,20);
    		jpl.add(tsex);
    		//�������֤�ſ�
    		labelND.setBounds(100,210,70,20);
    		jpl.add(labelND);
    		tND.setBounds(190,210,140,20);
    		jpl.add(tND);
    		//���ü���
            labelMZ.setBounds(100,240,70,20);
    		jpl.add(labelMZ);
    		tMZ.setBounds(190,240,140,20);
    		jpl.add(tMZ);
    		//���õ绰
    		labelphone.setBounds(100,270,70,20);
    		jpl.add(labelphone);
    		tphone.setBounds(190,270,140,20);
    		jpl.add(tphone);
    		//���ó�������
    		labeldate.setBounds(100,300,70,20);
    		jpl.add(labeldate);
    		tdate.setBounds(190,300,140,20);
    		jpl.add(tdate);
    		//���ð༶
    		labelclass.setBounds(100,330,70,20);
    		jpl.add(labelclass);
    		tclass.setBounds(190,330,140,20);
    		jpl.add(tclass);
    		//����רҵ
    		labelzhuanye.setBounds(100,360,70,20);
    		jpl.add(labelzhuanye);
    		tzhuanye.setBounds(190,360,140,20);
    		jpl.add(tzhuanye);
    	  //  btnDelete.setEnabled(false);    //ȡ��ɾ����ť�Ĺ���
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
    		{            //��ѯ����
    			String temp=number.getText();
    			boolean bool=true;
    			for(int i=0;i<cou;i++)
    			{
    				if(temp.equals(xuesheng[i][0]))
    				{        //������ڸò��ҵ�ѧ��ִ��
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
					 JOptionPane.showMessageDialog(null,"�����ڼ�¼������������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
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
    		{      //����
    			 dispose();
    		}
    	}
    }
   class  searchname extends JFrame implements ActionListener
    {
    	//ʵ��ѧ���������ֲ�ѯ�Ĵ���
 	   JPanel jpl = new JPanel();
 	   JLabel SCH = new JLabel("��ѯѧ����Ϣ",JLabel.CENTER);
 	   Font f = new Font("����",Font.BOLD+Font.ITALIC,30);
 	   JLabel labelname1 = new JLabel("������������",JLabel.CENTER);
 	   JButton btnQuery = new JButton("��ѯ");
 	   JLabel labelxuehao = new JLabel("ѧ�ţ�",JLabel.CENTER);
 	   JLabel labelsex = new JLabel("�Ա�",JLabel.CENTER);
 	   JLabel labelND=new JLabel("���֤�ţ�",JLabel.CENTER);
 	   JLabel labelMZ=new JLabel("���᣺",JLabel.CENTER);
 	   JLabel labelphone=new JLabel("�绰��",JLabel.CENTER);
 	   JLabel labelclass = new JLabel("�༶��",JLabel.CENTER);
 	   JLabel labeldate = new JLabel("�������£�",JLabel.CENTER);
 	   JLabel labelzhuanye = new JLabel("רҵ��",JLabel.CENTER);
 	   JTextField number1 = new JTextField();
 	   JTextField tname1 = new JTextField();
 	   JTextField tsex = new JTextField();
 	   JTextField tND = new JTextField();
 	   JTextField tMZ = new JTextField();
 	   JTextField tphone = new JTextField();
 	   JTextField tdate = new JTextField();
 	   JTextField tclass = new JTextField();
 	   JTextField tzhuanye = new JTextField();
 	 //  JButton btnDelete = new JButton("ɾ��");
 	   JButton btnCancel = new JButton("ȡ��");
 	public searchname()
 	{
 		super("��ѯѧ����Ϣ����������");
 	    this.setSize(560,460);
 	    setLocation(300,200);
 		this.setVisible(true);
 		this.setResizable(false);
 		SCH.setForeground(Color.blue);//�����м�������ɫ
 		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 		this.add(jpl);
 		jpl.setBackground(Color.white);
 		jpl.setLayout(null);
 		btnQuery.addActionListener(this);
 	 //   btnDelete.addActionListener(this);
 		btnCancel.addActionListener(this);
 		SCH.setBounds(100,20,300,20);
 		jpl.add(SCH);
 		//����������
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
 		//����ѧ��
 		labelxuehao.setBounds(100,150,70,20);
 		jpl.add(labelxuehao);
 		number1.setBounds(190,150,140,20);
 		jpl.add(number1);
 		//�����Ա��
 		labelsex.setBounds(100,180,70,20);
 		jpl.add(labelsex);
 		tsex.setBounds(190,180,140,20);
 		jpl.add(tsex);
 		//�������֤�ſ�
 		labelND.setBounds(100,210,70,20);
 		jpl.add(labelND);
 		tND.setBounds(190,210,140,20);
 		jpl.add(tND);
 		//���ü���
         labelMZ.setBounds(100,240,70,20);
 		jpl.add(labelMZ);
 		tMZ.setBounds(190,240,140,20);
 		jpl.add(tMZ);
 		//���õ绰
 		labelphone.setBounds(100,270,70,20);
 		jpl.add(labelphone);
 		tphone.setBounds(190,270,140,20);
 		jpl.add(tphone);
 		//���ó�������
 		labeldate.setBounds(100,300,70,20);
 		jpl.add(labeldate);
 		tdate.setBounds(190,300,140,20);
 		jpl.add(tdate);
 		//���ð༶
 		labelclass.setBounds(100,330,70,20);
 		jpl.add(labelclass);
 		tclass.setBounds(190,330,140,20);
 		jpl.add(tclass);
 		//����רҵ
 		labelzhuanye.setBounds(100,360,70,20);
 		jpl.add(labelzhuanye);
 		tzhuanye.setBounds(190,360,140,20);
 		jpl.add(tzhuanye);
 	  //  btnDelete.setEnabled(false);    //ȡ��ɾ����ť�Ĺ���
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
 		{            //��ѯ����
 			String temp=tname1.getText();
 			boolean bool=true;
 			for(int i=0;i<cou;i++)
 			{
 				if(temp.equals(xuesheng[i][1]))
 				{        //������ڸò��ҵ�����ִ��
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
					 JOptionPane.showMessageDialog(null,"�����ڼ�¼������������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
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
 		{      //����
 			 dispose();
 		}
    }
    }
   class  deletexs extends JFrame implements ActionListener
   {   //ʵ��ѧ��ɾ������
	   JPanel jpl = new JPanel();
	   JLabel SCH;
	   JLabel labelxuehao = new JLabel("������ѧ�ţ�",JLabel.CENTER);
	   JButton btnQuery = new JButton("ɾ��");
	   JTextField number = new JTextField();
	   JButton btnCancel = new JButton("����");
	   public deletexs()
   	{
		   super("ɾ������");
		   this.setSize(500,300);
   	    setLocation(300,200);
   		this.setVisible(true);
   		this.setResizable(false);
   		labelxuehao.setForeground(Color.white);
   		SCH= new JLabel("ɾ��ѧ����Ϣ",JLabel.CENTER);
 	    SCH.setFont(new Font( "����_GB2312",Font.BOLD,22));
   		SCH.setForeground(Color.red);//�����м�������ɫ
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
   						xuesheng[i][j]=null;      //ɾ������
   				    }
                                   JOptionPane.showMessageDialog(null,"ɾ���ɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
                                   bool=false;
                                  // cou--;                          //ѧ����Ϣ�����ѧ����Ϣ������һ
                                   break;
   				}
   			
   		   }
   			if(bool)
			  {
				 JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
		     }
 			}
		   if(e.getSource()==btnCancel)
  	 		{      //����
  	 			 dispose();
  	 		}
   	     }
   }
    
   class changexz extends JFrame implements ActionListener   //ʵ�ֶ�ѧ����Ϣ�޸ĵ�ѡ��
   {
	   JButton button01,button11,button21,button31,button41,button51,button61,button71,button81,button91;
   	   JPanel jp1=new JPanel();
   	   JLabel label1;
   	public changexz()
	{
		super("�޸�ѡ��");
		jp1.setLayout(null);
		add(jp1);
		label1=new JLabel("��ѡ��Ҫ�޸ĵ����ݣ�");
		label1.setFont(new Font( "����_GB2312",Font.BOLD,22));
		label1.setBounds(190,30,250,30);
		jp1.add(label1);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,200,600,400);
		button01=new JButton("����");
		button11=new JButton("ѧ��");
		button21=new JButton("����");
		button31=new JButton("�Ա�");
		button41=new JButton("���֤��");
		button51=new JButton("����");
		button61=new JButton("�绰");
		button71=new JButton("��������");
		button81=new JButton("�༶");
		button91=new JButton("רҵ");
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
		{      //����
			 dispose();
		}
	   
   	}
   }
   class change extends JFrame implements ActionListener   //ʵ�ֶ�ѧ����Ϣ�޸�
   {
	   JPanel jpl = new JPanel();
	   JLabel SCH;
	   JLabel labelxuehao = new JLabel("�����޸���ѧ��",JLabel.CENTER);
	   JLabel labelxiugai = new JLabel("�������޸Ľ��",JLabel.CENTER);
	   JButton btnQuery = new JButton("�޸�");
	   JTextField number = new JTextField();
	   JTextField xg = new JTextField();
	   JButton btnCancel = new JButton("����");
	   public change()
	   {
	       //if(a==9)
	      // {
	    	  // System.out.println("aaaaaaaa");
	      // }
		   super("�޸Ľ���");
		   this.setSize(500,300);
   	    setLocation(300,200);
   		this.setVisible(true);
   		this.setResizable(false);
   		labelxuehao.setForeground(Color.white);
   		labelxiugai.setForeground(Color.blue);
   		SCH= new JLabel("�޸�ѧ����Ϣ",JLabel.CENTER);
 	    SCH.setFont(new Font( "����_GB2312",Font.BOLD,22));
   		SCH.setForeground(Color.blue);//�����м�������ɫ
   		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(jpl);
		jpl.setBackground(Color.gray);
		jpl.setLayout(null);
		btnQuery.addActionListener(this);
		btnCancel.addActionListener(this);
		SCH.setBounds(100,20,300,20);
		jpl.add(SCH);
		//���ѧ�ſ�
		labelxuehao.setBounds(100,60,100,20);
		jpl.add(labelxuehao);
		number.setBounds(220,60,140,20);
		jpl.add(number);
		//����޸Ŀ�
		labelxiugai.setBounds(100,100,100,20);
		jpl.add(labelxiugai);
		xg.setBounds(220,100,140,20);
		jpl.add(xg);
		//��Ӱ�ť
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
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
	                          JOptionPane.showMessageDialog(null,"�޸ĳɹ�","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
	                          bool=false;
	                          break;
	   				}
	   			
	   		         }
	   			     if(bool)
				     {
					     JOptionPane.showMessageDialog(null,"ѧ����Ϣ�����ڣ�����������!","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
	                 }
	 	          } 
			          if(e.getSource()==btnCancel)
	  	 		   {      //����
	  	 			 dispose();
	  	 		    }
		   }
		   
		   
	   }
	   
	   
	   
   }
   class xrfile extends JFrame implements ActionListener//ʵ��ѧ�������ļ�
   {
	   JPanel jpl = new JPanel();
	   JLabel SCH;
	   JButton btnQuery = new JButton("����");
	   JButton btnCancel = new JButton("����");
	   File file=new File("I:\\javawj","letter.txt");
	   public xrfile()
	   	{
			   super("���̽���");
			   this.setSize(500,300);
	   	    setLocation(300,200);
	   		this.setVisible(true);
	   		this.setResizable(false);
	   		SCH= new JLabel("����ѧ����Ϣ",JLabel.CENTER);
	 	    SCH.setFont(new Font( "����_GB2312",Font.BOLD,22));
	   		SCH.setForeground(Color.black);//�����м�������ɫ
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
		    			      FileOutputStream out=new FileOutputStream(file,true);  //��ѧ����Ϣд���ļ�
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
			   JOptionPane.showMessageDialog(null,"�ѳɹ�����","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);
 		   }
		   if(e.getSource()==btnCancel)
 	 		{      //����
 	 			 dispose();
 	 		}
	   }
   }
    
 
    
  }
