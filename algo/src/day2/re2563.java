package day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class re2563 {
    //2563 복습 (260112)

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int[][] dowhazi = new int[100][100];
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int xsak=x; xsak<x+10; xsak++){
                for(int ysak=y; ysak<y+10; ysak++){
                    dowhazi[xsak][ysak] = 1;
                }
            }

        }

        int area = 0;

        for(int i=0; i<100; i++){
            for(int j=0;j<100;j++){
                if(dowhazi[i][j] == 1) area++;
            }
        }

        System.out.println(area);



    }

}
