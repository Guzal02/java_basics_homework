public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] dimensional = new char[size][size];
        for (int i = 0; i < dimensional.length; i++) {
            for (int j = 0, x = dimensional[i].length - 1; j < dimensional[i].length; j++, x--) {
                if (i == j || i == x) dimensional[i][j] = symbol;
                else dimensional[i][j] = ' ';
            }
    }
        return dimensional;
    }
}


/*
        for(int i = 0; i < dimen.length; i++) {
        for (int j = 0; j < dimen[i].length; j++) {

        }
        }
*/
