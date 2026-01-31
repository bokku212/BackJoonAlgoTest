package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon26069 {

    //https://www.acmicpc.net/problem/26069
    // 제목 : 붙임성 좋은 총총이
    // 처음에 문제이해가 잘 안되어 헤멤
    // 지피티 봐도 잘 이해안되어서 보류
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(br.readLine()); // 사람들이 만난 기록의 수
        int result = 0; // 출력값의 초기값
        //ChongChong

        for(int i=0; i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            if(A == ChongChong ||B==ChongChong){
                result += 1;
                //총총이를 만난 줄 그 다음줄부터 서로 다른 사람들이 만난것에 대해 +1 을 어떻게 써야하는지 고민 배열로 ?
                //총총이 이름은 문자인데 int랑 어떻게 비교해야할지도 고민 , 처음엔 모두 string으로 비교하고 나중에 그 중복아닌 갯수를 세서 result 해야하나?

            }





        }

    }

}
