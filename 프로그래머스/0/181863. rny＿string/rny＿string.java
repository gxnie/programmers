// class Solution {
//     public String solution(String rny_string) {
//         // 결과를 담을 StringBuilder
//         StringBuilder result = new StringBuilder();

//         // 입력 문자열을 순회하며 처리
//         for (int i = 0; i < rny_string.length(); i++) {
//             char c = rny_string.charAt(i);
//             if (c == 'm') {
//                 // 'm'을 'rn'으로 대체
//                 result.append("rn");
//             } else {
//                 // 다른 문자는 그대로 추가
//                 result.append(c);
//             }
//         }

//         // 최종 결과 반환
//         return result.toString();
//     }
// }


class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}