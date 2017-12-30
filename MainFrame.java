//package TestGame;

//�ǂݍ��ޕW���N���X�̉��͂����������Ȃ��A��Ȃ��������i�A���p���}���̍�ҁj�A��邹������
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class MainFrame extends JFrame{
    
    public String[] PanelNames = {"start","stsel","map1","map2","result"};
    StartPanel start = new StartPanel(this,PanelNames[0]);
    StageSelect stsel = new StageSelect(this,PanelNames[1]);
    MapPanel map1 = new MapPanel(this,PanelNames[2]);
    MapPanel map2 = new MapPanel(this,PanelNames[3]);
    ResultPanel result = new ResultPanel(this,PanelNames[4]);
     
    public MainFrame(){
        this.add(start);start.setVisible(true);//�Q�[���N�����A�ŏ��̃p�l��������\��
        this.add(stsel);stsel.setVisible(false);
        this.add(map1);map1.setVisible(false);
        this.add(map2);map2.setVisible(false);
        this.add(result);result.setVisible(false);
        this.setBounds(100, 100, 400, 200);
    }
    
    //���C�����\�b�h
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(EXIT_ON_CLOSE);//�o�c����ƏI��
        mf.setVisible(true);
    }
    
    //�����P : ���݂̃p�l�� , �����Q: �ړ��������p�l��
    public void PanelChange(JPanel jp, String str){
        System.out.println("���݂̃p�l��:" + jp.getName());
        String name = jp.getName();
        
        if(name==PanelNames[0]){
            start = (StartPanel)jp;
            start.setVisible(false);
        }else if(name==PanelNames[1]){
            stsel = (StageSelect)jp;
            stsel.setVisible(false);
        }else if(name==PanelNames[2]){
            map1 = (MapPanel)jp;
            map1.setVisible(false);
        }else if(name==PanelNames[3]){
            map2 = (MapPanel)jp;
            map2.setVisible(false);
        }else if(name==PanelNames[4]){
            result = (ResultPanel)jp;
            result.setVisible(false);
        }
        
        
        if(str==PanelNames[0]){
            start.setVisible(true);
        }else if(str==PanelNames[1]){
            stsel.setVisible(true);
        }else if(str==PanelNames[2]){
            map1.setVisible(true);
        }else if(str==PanelNames[3]){
            map2.setVisible(true);
        }else if(str==PanelNames[4]){
            result.setVisible(true);
        }
    }
}