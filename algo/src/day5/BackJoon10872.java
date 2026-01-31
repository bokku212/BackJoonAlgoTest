package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10872 {

    //https://www.acmicpc.net/problem/10872
    //제목 : 팩토리얼

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(
            new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(br.readLine()); //입력값
        int result = 1; // 출력될값,곱의 항등원1
        // N! = result

        //260131 - int result = 0 으로했고 원리를 정확히 파악하지못한채로 진행함
        //반복문으로 -1수를 곱해서 출력하나 ?
//        for(int i=1;i<=N;i++){
//            result = N * (N-1);
//        }
//        System.out.println(result);
//

        //260131 : *= 쓰기
        for (int i=1;i<=N;i++){
            result *= i;
        }
        System.out.println(result);


    }


}
