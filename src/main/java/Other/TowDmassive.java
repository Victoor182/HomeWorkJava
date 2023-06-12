package Other;

public class TowDmassive {
    public static void main(String[] args) {

        // Объявляем массив размером 5х5
        int[][] array = new int[5][5];

        // Заполняем массив тестовыми значениями.
        // Значение каждой клеточки равно сумме индекса строки и индекса столбца
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        // Отображаем массив в консоли
        for (int[] row : array) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
