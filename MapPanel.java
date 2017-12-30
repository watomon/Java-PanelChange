//package TestGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//�Q�[���{�҂̉��
public class MapPanel extends JPanel {
    
    MainFrame mf;
    String str;
    
    public MapPanel(MainFrame m,String s){
        mf = m;
        str = s;
        this.setName(s);
        this.setLayout(null);
        this.setSize(400, 200);
        JLabel paneltitle = new JLabel("�����"
                +getClass().getCanonicalName()+"�N���X�̃p�l���ł�");
        paneltitle.setBounds(0, 5, 400, 40);
        this.add(paneltitle);
        
        JButton btn1 = new JButton("�Q�[���N���A");
        btn1.setBounds(20, 50, 150, 40);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[4]);//�N���A������A�����Ăяo��
            }
        });
        this.add(btn1);
        
        JButton btn2 = new JButton("�Q�[���I�[�o�[");
        btn2.setBounds(200, 50, 150, 40);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pc(mf.PanelNames[4]);///�Q�[���I�[�o�[������A�����Ăяo��
            }
        });
        this.add(btn2);
    }

	public void pc(String str){
	    mf.PanelChange((JPanel)this, str);
	}
	    
}