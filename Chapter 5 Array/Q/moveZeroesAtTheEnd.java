public class moveZeroesAtTheEnd {

    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 2, 1, 2, 0, 1, 1, 8, 5, 0, 0, 0, 9, 0, 0, 0, -9, 100, 0, 9 };

        // r      store value of previous array to new array ✅ , best way to solve Questions
        int[] array1 = new int[array.length];
        System.out.println(array1.length);
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array1[j] = array[i];
                j++;
            }
        }

        for (int i : array1) {
            System.out.print(" " + i);
        }
    }

}