import java.util.Scanner;
import java.util.Stack;

public class StackURL {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int option;
        Stack<String> urlStack= new Stack<>();
        do{
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n"+
                                "1.Nhập URL muốn truy cập \n"+
                                "2. Quay lại\n"+
                                "3. Thoát\n");
            System.out.print("Vui lòng chọn 1 lựa chọn ");
            option = input.nextInt();
            switch (option){
                case 1: //Nhập url muốn truy cập
                    System.out.println("Nhập url muốn truy cập ");
                    input.nextLine();
                    String url= input.nextLine();
                    urlStack.push(url);
                    break;
                case 2:// Quay lại
                    System.out.println();
                    urlStack.pop();
                    System.out.println(urlStack.peek());
                    break;
                case 3:
                    System.out.println("Bạn đã thoát khỏi chương trình ");
                    System.exit(0);
                    break;
            }
        }while (option !=3);
    }
}
