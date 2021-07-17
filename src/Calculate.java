public class Calculate {
    public static int magicNum = 1;
    public static void orderingTheMatrix(int[][] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] == magicNum) {
                    count++;
                }
                if(count != i) {
                    array[i][j] = 0;
                }
            }
            count = 0;
        }
    }
}
