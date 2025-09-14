package __01__ProgrammersQuiz._01_IntroductoryQuestions;

import java.util.Arrays;

public class __FindingMode {
    public static int findNumberOfInt(int[] arr) {
        int countOfInt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                countOfInt += 1;
            } else {
                if (arr[i] != arr[i - 1]) {
                    countOfInt += 1;
                }
            }
        }
        System.out.println("find Number of Int 실행결과 : " + countOfInt);
        return countOfInt;
    }
    public static int[][] placingCounts(int[] arr) {
        int[][] countArr = new int[findNumberOfInt(arr)][2];
        int num = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                countArr[num][0] = arr[i];
                countArr[num][1] += 1;
            } else {
                if (arr[i] == arr[i - 1]) {
                    countArr[num][1] += 1;
                }  else {
                    num += 1;
                    countArr[num][0] = arr[i];
                    countArr[num][1] += 1;
                }
            }
        }
        for (int i = 0; i < countArr.length; i++) {
            System.out.println("placing Counts 실행결과 : " + countArr[i][0] + " " + countArr[i][1]);
        }
        return countArr;
    }

    public static int findMode(int[][] arr) {
        int max = arr[0][0];
        int maxIndex = arr[0][1];
        System.out.println("초기 max 값 : " + max + " maxIndex : " + maxIndex);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][1] > maxIndex) {
                max = arr[i][0];
                maxIndex = arr[i][1];
            }
        }
        System.out.println("max산출 결과 : " + max);


        int maxCount = 0;
        for  (int i = 0; i < arr.length; i++) {
            if (maxIndex == arr[i][1]) {
                maxCount++;
            }
        }
        System.out.println("maxCount 결과 값 : " + maxCount);
        if (maxCount >= 2) {
            return -1;
        }
        return max;
    }

    public static int solution(int[] arr) {

        return findMode(placingCounts(arr));
    }

    public static void main(String[] args) {
        int[] array = {1, 90, 90, 88, 52, 33, 33, 99, 33, 90, 90};
        System.out.println(solution(array));
    }
}


//  chatGPT 한테 받은 map을 활용한 코드

//import java.util.HashMap;
//
//public class ModeFinder {
//    public static int solution(int[] array) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        // 빈도 수 세기
//        for (int num : array) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        int maxFreq = 0;
//        int mode = -1;
//        boolean isDuplicated = false;
//
//        for (int key : map.keySet()) {
//            int freq = map.get(key);
//            if (freq > maxFreq) {
//                maxFreq = freq;
//                mode = key;
//                isDuplicated = false;
//            } else if (freq == maxFreq) {
//                isDuplicated = true;
//            }
//        }
//
//        return isDuplicated ? -1 : mode;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1, 90, 90, 88, 52, 33, 33, 99, 33, 90, 90};
//        System.out.println(solution(array)); // 90
//    }
//}


//  map 안쓰고 최적 코드
//public class ModeFinder {
//    public static int solution(int[] array) {
//        int[] counts = new int[1000]; // 원소는 0~999까지
//
//        for (int num : array) {
//            counts[num]++;
//        }
//
//        int maxFreq = 0;
//        int mode = -1;
//        boolean isDuplicated = false;
//
//        for (int i = 0; i < counts.length; i++) {
//            if (counts[i] > maxFreq) {
//                maxFreq = counts[i];
//                mode = i;
//                isDuplicated = false;
//            } else if (counts[i] == maxFreq && counts[i] != 0) {
//                isDuplicated = true;
//            }
//        }
//
//        return isDuplicated ? -1 : mode;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1, 90, 90, 88, 52, 33, 33, 99, 33, 90, 90};
//        System.out.println(solution(array)); // 90
//    }
//}
