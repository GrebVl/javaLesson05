import java.util.HashMap;

/**
 * На шахматной доске расставить 8 ферзей так,
 * чтобы они не били друг друга.
 */
import java.util.Map;


public class task04 {
    public static boolean provP(int[] arr){
        arr[0] = 0;
        boolean b1, b2, b3;
        for (int i = 1; i < 8; i++){
            for (int j = i + 1; j <= 8; j++){
                b1 = (arr[i] != arr[j]); 
                b2 = (arr[j] - arr[i]) != (j - i);
                b3 = (arr[i] + i) != (arr[j] + j);
                if (b1 && b2 && b3){
                    arr[0]++;
                }
            }
        }
        if (arr[0] == 28){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void provM(int[] arr) {
        int count = 0;
        int size = arr.length - 1;
        for (int i1 = 1; i1 <= size; i1++){
            arr[1] = i1;
            for (int i2 = 1; i2 <= size; i2++){
                arr[2] = i2;
                for (int i3 = 1; i3 <= size; i3++){
                    arr[3] = i3;
                    for (int i4 = 1; i4 <= size; i4++){
                        arr[4] = i4;
                        for (int i5 = 1; i5 <= size; i5++){
                            arr[5] = i5;
                            for (int i6 = 1; i6 <= size; i6++){
                                arr[6] = i6;
                                for (int i7 = 1; i7 <= size; i7++){
                                    arr[7] = i7;
                                    for (int i8 = 1; i8 <= size; i8++){
                                        arr[8] = i8;
                                        boolean b = provP(arr); 
                                            if (b) {
                                                count++;
                                                printArr(arr, count);
                                            }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void printArr(int[] arr, int con) {
        System.out.println("Вариант номер - " + con);
        Map<String, Integer> arrMap = new HashMap<>();
        arrMap.put("a", arr[1]);
        arrMap.put("b", arr[2]);
        arrMap.put("c", arr[3]);
        arrMap.put("d", arr[4]);
        arrMap.put("e", arr[5]);
        arrMap.put("f", arr[6]);
        arrMap.put("g", arr[7]);
        arrMap.put("h", arr[8]);
        System.out.println(arrMap);
        printChessBoard(arrMap);
    }

    private static void printChessBoard(Map<String, Integer> map) {
        String[] arrA = {"a", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] arrB = {"b", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] arrC = {"c", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] arrD = {"d", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] arrE = {"e", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] arrF = {"f", "0", "0", "0", "0", "0", "0", "0", "0"}; 
        String[] arrG = {"g", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] arrH = {"h", "0", "0", "0", "0", "0", "0", "0", "0"};

        for(int i = 0; i <= 8; i++){
            if(map.get("a") == i){
                arrA[i] = "X";
            }else if(map.get("b") == i){
                arrB[i] = "X";
            }else if(map.get("c") == i){
                arrC[i] = "X";
            }else if(map.get("d") == i){
                arrD[i] = "X";
            }else if(map.get("e") == i){
                arrE[i] = "X";
            }else if(map.get("f") == i){
                arrF[i] = "X";
            }else if(map.get("g") == i){
                arrG[i] = "X";
            }else if(map.get("h") == i){
                arrH[i] = "X";
            }
            System.out.printf(" %s  %s  %s  %s  %s  %s  %s  %s\n", arrA[i], arrB[i],arrC[i], arrD[i], arrE[i], arrF[i], arrG[i],arrH[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrLst = new int[9];
        provM(arrLst);
    }    
}
