package day2;

import java.util.Scanner;
import java.util.StringTokenizer; //공백 인식..

public class BackJoon25304 {

    //제목:영수증
    //https://www.acmicpc.net/problem/25304
    //260106 풀기완료
    public static void main(String[] args) {
        //입력 : 총금액=X/물건종류수=N/각물건의 가격=a과 갯수=b ... , 출력 : Yes 또는 No
        Scanner sc = new Scanner(System.in);

        int X = Integer.parseInt(sc.nextLine()); //총금액입력값
        int N =  Integer.parseInt(sc.nextLine());//물건 종류수 - N밑에 몇줄이 더 있는지 컴퓨터에게 알려주기위해 필요

        int sum = 0; //실제합금액

        for(int i=0; i<N; i++){
            //split 으로 공백나누기
//            String[] hey = sc.nextLine().split(" ");
//            int a = Integer.parseInt(hey[0]);
//            int b = Integer.parseInt(hey[1]);

            //StringTokenizer 으로 공백나누기
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += a*b;
        }

        //총금액입력값 = 실제합금액
        if(X==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
