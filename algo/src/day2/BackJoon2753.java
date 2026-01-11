package day2;

import java.util.Scanner;

public class BackJoon2753 {
    //제목:윤년
    //https://www.acmicpc.net/problem/2753
    //260106 풀기완료
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int year = sc.nextInt(); //nextInt 문제있다곤 들었지만 한번 같이 테스트해봄 - 아직 이상은 없음
        int year = Integer.parseInt(sc.nextLine()); //nextLine 은 무조건 string을 반환

        //1. 가장 간단하게 풀어보기

//        if(year % 400 == 0 || (year % 100 !=0 && year %4 ==0)){
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }


        //2. boolean을 써서 풀어보기
//
        boolean isYear = (year %4==0 && year%100!=0)||year%400==0;

        if(isYear){
            System.out.println(1);
        }else {
            System.out.println(0);
        }



    }

}
