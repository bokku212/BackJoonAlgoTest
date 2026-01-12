package day3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BackJoon2738 {

    //제목 : 행렬 덧셈
    //https://www.acmicpc.net/problem/2738
    //260111 제출 풀이..2차원 배열..어렵..
    public static void main(String[] args) throws Exception {
        //Scanner 사용
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[][] arrA = new int[N][M];
//
//        //행렬A 입력
//        for(int i=0;i<N;i++){
//           for(int j=0; j<M;j++){
//               arrA[i][j] = sc.nextInt();
//           }
//        }
//
//        int[][] arrB = new int[N][M];
//
//        //행렬B 입력
//        for(int i=0;i<=N-1;i++){
//            for(int j=0;j<=M-1;j++){
//                arrB[i][j] = sc.nextInt();
//            }
//        }
//
//        //결과출력
//        for(int i=0;i<=N-1;i++){
//            for(int j=0;j<=M-1;j++){
//                System.out.print(arrA[i][j]+arrB[i][j]);
//                if(j < M-1) System.out.print(" ");
//            }    System.out.println();
//        }


        // BufferedReader + StringTokenizer 사용
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[N][M];

        //행렬A:입력+저장
        for(int i=0;i<N;i++){
           st = new StringTokenizer(br.readLine()); //행으로 읽어온걸 여백기준 토큰분리,이미 위에서 존재하는 st변수에 새로운 StringTokenizer를 다시 넣는거임
            for(int j=0;j<M;j++){
                arrA[i][j]=Integer.parseInt(st.nextToken()); //나중에 다시 쓰기위한 배열저장, 여기st는 for문안에서 선언된 st임
            }
        }

        StringBuilder sb = new StringBuilder(); //바로출력x 출력문자열 미리 만들어두고 >한번에 출력 위함

        //행렬B 입력+더해서 출력 준비
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                int b = Integer.parseInt(st.nextToken()); // 나중에 안씀, 당장쓰고말거라서 배열아닌 임시변수 하나로 충분,이 for문 순간순간에 해당하는 행렬B의 값하나씩 b에 들어감
                sb.append(arrA[i][j]+b); // .append : 출력아닌 문자열을 StringBuilder에 저장하는 동작
                if(j<M-1) sb.append(" ");
            }
            sb.append("\n");
        }
        String result = sb.toString();
        System.out.print(result);

    }

}
