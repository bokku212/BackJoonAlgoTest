package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10870 {
    //260205 시도
    //260207 지피티에게 재귀에 대해 확인 후 보면서 적음
    //https://www.acmicpc.net/problem/10870
    // 제목 : 피보나치 수 5
    //재귀사용 문제

    private static int fibo(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fibo(n-2)+fibo(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int n = Integer.parseInt(br.readLine()); // 입력값

        System.out.println(fibo(n));
    }

}
