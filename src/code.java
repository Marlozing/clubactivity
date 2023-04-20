import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class code extends JFrame {

    JTextField InputString;

    public code(){

        setLayout(null);

        setTitle("암호 생성기");

        setSize(400,200);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        InputString = new JTextField("바꿀 문장을 적어주세요", 5); // 도구 굵기 입력 텍스트 필드 생성

        InputString.setBounds(0,0,200,50);

        Color color=new Color(128,128,128);

        InputString.setForeground(color);

        InputString.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(InputString.getForeground()==color){
                    InputString.setText("");
                    Color color2 = new Color(0,0,0);
                    InputString.setForeground(color2);
                }
            }

        });

        add(InputString);

        setFocusable(true);  //컨텐트 팬이 포커스를 받을 수 있도록 설정

        requestFocus();  //컨텐트팬에 포커스 설정

        setVisible(true);  //메인프레임을 보이게 함.

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new code();
    }
}
