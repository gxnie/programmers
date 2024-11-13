import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // 배열 길이 정리
        int[] answer = new int[n];
        
        for(int i = 0; i < n; i++){
            answer[i] += num_list[i];
        }
        return answer;
    }
}