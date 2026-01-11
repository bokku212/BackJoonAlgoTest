package day1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class BackJoon18108 {
// ⭐ psvm 메인메소드 생성

    //제목:1998년생인 내가 태국에서는 2541년생?!
     //https://www.acmicpc.net/problem/18108
    public static void main(String[] args) throws IOException{ // IOException 입출력중 발생하는 예외 , Exception 모든 예외

        //Scanner로 새로 풀어봄

//        Scanner sc = new Scanner(System.in);
//
//        int A = Integer.parseInt(sc.nextLine());
//        int B = A-543;
//
//        System.out.println(B);
//


        //기존 VSC에서 풀었던 방법

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int bulgiYear = Integer.parseInt(br.readLine());
        // readLine 은 위에 throws Exception 같이 써주지않으니 실행안됨 > BufferedReader.readLine()은 “에러가 날 수 있는 메서드”이기 때문 = 자바에선 이런걸 Checked Exception 메서드 라 부름
        //scanner는 내부적으로 try-catch 처리를 다 해서 throws Exception 없어도 상관무,
        //readLine()의 실제 선언 형태는 개념적으로 public String readLine() throws IOException 이렇기 때문에 반드시 throws Exception가 필요!
        int seogiYear = bulgiYear-543;

        System.out.println(seogiYear);




    }

}
