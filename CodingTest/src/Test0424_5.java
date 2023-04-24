import java.util.Arrays;

public class Test0424_5 {
	public int solution(int k, int m, int[] score) {
		int answer = 0;

        Arrays.sort(score);  // 과일장수가 가지고 있는 사과들을 오름차순으로 정리해줍니다.

       //for반복문을 돌립니다. 반복문읜 총 사과갯수부터 시작을 하며, i가 m(포장 갯수)보다 높거나 같을때까지 반복문을 돌립니다.
       // i는 반복문이 돌아갈때마다 -m개씩 해줍니다.
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m; // answer에 최저 사과 점수에 포장갯수를 곱한 값을 넣습니다.
        }
        
        
        return answer;
        
     // 예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면,﻿
    //  for(int i = 7; i >= 4; i -= 4) answer += score[3] * 3;
    // 한번 반복문을 돌고 i는 3이 되기때문에 반복문을 벗어납니다.
   
    }
}
