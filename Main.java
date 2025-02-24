import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        String id = "";
        String pw = "";
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        while(true){
            System.out.println("Please enter your ID : ");
            id = scanner.nextLine();
            System.out.println("Please enter your PW : ");
            pw = scanner.nextLine();
            Login login = new Login();
            if(login.LoginFunction(id, pw, user)){
                break; // 로그인 성공시 빠져나옴
            }
  

        }
        scanner.close(); //scanner 닫기

    }

}
    
