import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



public class Main extends JFrame {

    JPanel panel;

    JButton pencil, eraser,erase;

    JTextField thick_field;  //도구 굵기가 정해질 텍스트 필드





    int thick = 10;

    int a ;

    int startX;

    int startY;

    int endX;

    int endY;

    boolean tf = false;



    public Main() {

        setLayout(null);

        setTitle("암호판");

        setSize(900,750);

        setLocationRelativeTo(null);  //프로그램 시작시 화면 중앙에 출력됨.

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        panel = new JPanel();

        panel.setBackground(Color.GRAY);

        panel.setLayout(null);  //panel의 레이아웃을 null로 지정하여 컴포넌트 위치를 직접 지정할 수 있음.


        thick_field = new JTextField(Integer.toString(thick), 5); // 도구 굵기 입력 텍스트 필드 생성

        thick_field.setHorizontalAlignment(JTextField.CENTER);

        thick_field.setFont(new Font("Serif", Font.PLAIN, 25));




        thick_field.setBounds(720,22,50,35);  //도구 굵기 텍스트 필드 위치 조정




        panel.add(thick_field);  //panel에 도구굵기 텍스트 필트 추가

        panel.setBounds(0,0,900,75);  //panel이 프레임에 배치될 위치 지정





        add(panel); //메인프레임에 연필 패널 추가 - 위치는 위에서 다 정해줌.


        setFocusable(true);  //컨텐트 팬이 포커스를 받을 수 있도록 설정

        requestFocus();  //컨텐트팬에 포커스 설정

        setVisible(true);  //메인프레임을 보이게 함.









        addKeyListener(new KeyListener() {       //key리스너 추가

            public void keyPressed(KeyEvent e) {



                switch(e.getKeyChar()) {

                    case '[':                      //'[' 버튼 누를 시 선 굵기가 10만큼 줄어듬

                        a = a-10;

                        thick_field.setText(Integer.toString(a));

                        break;



                    case ']':                    //']' 버튼 누를 시 선 굵기가 10만큼 늘어남

                        a = a+10;

                        thick_field.setText(Integer.toString(a));

                        break;



                    case 'q':              //'q'버튼을 누를 시  패널 종료

                        System.exit(0);



                }

            }



            @Override

            public void keyReleased(KeyEvent e) {

                // TODO Auto-generated method stub



            }



            @Override

            public void keyTyped(KeyEvent e) {

                // TODO Auto-generated method stub



            }



        });

        pencil.addActionListener(new ToolActionListener()); //연필버튼 액션처리

    }



    public class PaintDraw implements MouseMotionListener{



        public void mouseDragged(MouseEvent e) { //paint 패널에서 마우스 드래그 액션이 처리될떄 매소드 실행

            thick = Integer.parseInt(thick_field.getText());



            endX = e.getX();



            endY = e.getY();




            startX = endX;

            startY = endY;

        }



        @Override

        public void mouseMoved(MouseEvent e) {}

    }







    public class ToolActionListener implements ActionListener {  // 연필,지우개, 모두지우기 버튼의 액션처리시 실행되는 클래스

        public void actionPerformed(ActionEvent e ) { //오버 라이딩 된 actionPerformed 메소드 실행



            if(e.getSource() == pencil) {

                if(tf == false){

                }

            }

        }

    }







    public static void main(String[] args) {

        new Main();

    }



}