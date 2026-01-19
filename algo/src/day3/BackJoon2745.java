package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2745 {
    //제목 : 진법 변환
    // https://www.acmicpc.net/problem/2745

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken(); // 진법수 N , 문자숫자 둘다 들어올수있으므로
//        int N = Integer.parseInt(st.nextToken()); // 진법수 N
        int B = Integer.parseInt(st.nextToken()); // B진법

        long result = 0; // 결과값선언 > result = result × B + 현재값

        for(int i=0; i<N.length();i++){
            char c = N.charAt(i);
            int value; // 현재 자리에 들어갈 숫자값을 담는 변수

            //입력값이 숫자,문자 둘다 가능성있으므로 판별if문 필요
            if(c>=0 && c <='9' ){
                value = c-'0';

            }


        }




        System.out.println(); //2~36진법인 입력값을 10진법으로 변환한 결과









    }
}
