import java.util.Arrays;  // java.util.Arraysのインポート

class Kadai_Array {
    public static void main(String[] args) {
        // 課題1
        int x = Integer.parseInt(args[0]), y;
        System.out.println("xを入力してください：" + args[0]);
        for(int i = 1; i < 10; i++) {
            y = x * i;
            System.out.println(y);
        }
        System.out.println("");

        // 課題2
        int[] nums = {20, 1, 2, 23, 5, 11, 5, 67};
        int sum = 0;
        double avg;
        System.out.println("4個目の要素：" + nums[3]);
        System.out.println("要素数：" + nums.length);
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        avg = (double) sum / nums.length;
        System.out.println("平均値：" +  avg);
        double medAvg = 0;
        Arrays.sort(nums);  // 配列を昇順に並び替え
        if(nums.length % 2 == 0) {
            medAvg = (nums[nums.length / 2 - 1] + nums[nums.length/ 2]) / 2.0;
            System.out.println("中央値：" + medAvg);
        } else {
            System.out.println("中央値：" + nums[nums.length / 2]);
        }
        double sum2 = 0;
        double variance = 0;
        for(int j = 0; j < nums.length; j++) {
            sum2 = sum2 + (double) (nums[j] - avg) * (nums[j] - avg);
        }
        variance = sum2 / nums.length;
        System.out.println("分散：" + variance);
        System.out.println("");

        // 課題3
        int[][] array = {
            {1, 8, 12, 17, 20},  // 0行目
            {2, 5, 11, 13, 18},  // 1行目
            {4, 6, 9, 19, 21}    // 2行目
        };
        for(int k = 0; k < array.length; k++) {
            for(int l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l]);
                if(l < array[k].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        // 課題4
        for(int m = 0; m < 4; m++) {
            for(int n = 0; n <= m; n++) {
                System.out.print("$");
            }
            System.out.println("");
        }
        String[][] dollar = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
        };
        for (int o = 0; o < 4; o++) {
            // スペースを出力
            for (int p = 0; p < 4 - o - 1; p++) {
                System.out.print(" ");
            }
            
            // $ を出力
            for (int p = 0; p <= o; p++) {
                System.out.print("$");
            }
            
            System.out.println(); // 行を変える
        }
    }
}