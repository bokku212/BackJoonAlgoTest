package day4;

import java.util.NoSuchElementException;

public class MyStack {
// 보경 코드 - 260126 혜승님 풀이

        //정수만 저장하는 MyStack 클래스를 배열로 구현하세요.

        private final int[] arr;
        private int top; // 다음에 들어갈 위치(=size)

        public MyStack(int capacity) {
            this.arr = new int[capacity];
            // {0, 0}
        }
//    public MyStack(int capacity, int[] arr) {
//        // TODO 생성자 MyStack(int capacity) : 최대 크기 지정
//        // capacity와 arr.length 의 구별에 어려움이 있음 ,논리적,물리적 용량 ?
//
//
//
//    }

        public void push(int x) {
            // TODO void push(int x) : 스택에 x 추가 (가득 차면 IllegalStateException)
            // IllegalStateException 가 뭔지부터 찾아봄 ㅠ
            //top은 인덱스 같은건가 ?
            if(arr.length == top){
                throw  new IllegalStateException("IllegalStateException");
            }
            arr[top] = x;
            top++;

        }

        public int pop() {
            // TODO int pop() : 맨 위 값 제거 후 반환 (비어있으면 NoSuchElementException)
            //비어있으면이 맨위값이 비어있다는거?
            if(top == 0){
                throw new NoSuchElementException("NoSuchElementException");
            }
            top--; // 맨위값제거 x, 다음에 들어갈 위치 먼저 제거
            return arr[top]; // 반환

//        return -1; // 이건 왜 존재하는거지ㅏ ?
        }

        public int peek() {
            // TODO int peek() : 맨 위 값 반환 (비어있으면 NoSuchElementException)
            if(top==0){
                throw new NoSuchElementException("NoSuchElementException");
            }
            return arr[top-1];
//        return -1;
        }

        public boolean isEmpty() {
//        // TODO boolean isEmpty()
//        return false;

            if (top == 0) {
                return true;
            } else {
                return false;
            }
        }

        public int size() {
            // TODO int size()
            return top;
        }

}
