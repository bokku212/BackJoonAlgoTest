package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2747 {
    //https://www.acmicpc.net/problem/2747
    // 제목 : 피보나치 수

    // 피보나치 수는 0,1 로 시작 (시작값 고정)
    // 2번째 숫자부터는 바로 앞 두 피보나치 수의 합(점화식 고정) - 그러므로 피보나치의 수열은 .. 정의가 고정된 수열임
    //입력값 n은 0<=n<=45 인 자연수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int[] fibo = new int[46];
        int n = Integer.parseInt(br.readLine()); //입력값

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i<=n;i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        System.out.println(fibo[n]);

    }

}
