package game.chess;

public class BoardConsoleRenderer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_PIECE_COLOR = "\u001B[97m";
    public static final String ANSI_BLACK_PIECE_COLOR = "\u001B[30m";

    public static final String ANSI_WHITE_SQUARE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_BLACK_SQUARE_BACKGROUND = "\u001B[0;100m";

    public void render(Board board){
        for (int rank=8;rank!=0;rank--){
            String line="";
            for (File file:File.values()){
                line+=getSpriteForEmptySquare(new Coordinates(file,rank));
            }
            line+=ANSI_RESET;
            System.out.println(line);


        }


    }


    /***
     * Функция colorizeSprite в классе BoardConsoleRenderer предназначена для изменения цвета спрайта (в данном случае, символьной строки) в зависимости от цвета фигуры и цвета клетки на шахматной доске. Вот шаги, которые она выполняет:
     *
     * Если цвет фигуры белый (Color.WHITE), к sprite добавляется ANSI-код цвета для белого цвета (ANSI_WHITE_PIECE_COLOR).
     * Если цвет фигуры черный, к sprite добавляется ANSI-код цвета для черного цвета (ANSI_BLACK_PIECE_COLOR).
     * Применение цвета клетки:
     *
     * Если клетка темная (isSquareDark == true), к результату добавляется ANSI-код для фона темной клетки (ANSI_BLACK_SQUARE_BACKGROUND).
     * Если клетка светлая, добавляется ANSI-код для фона светлой клетки (ANSI_WHITE_SQUARE_BACKGROUND).
     * Возвращаемое значение: Функция возвращает итоговую строку (result), которая представляет собой спрайт с примененными цветами фигуры и клетки.
     *
     * Таким образом, colorizeSprite изменяет визуальное представление спрайта, используя ANSI-коды для цветов текста и фона, чтобы отобразить шахматные фигуры и клетки в консоли с соответствующими цветами.
     * @param sprite Cтрока, представляющая спрайт (в данном контексте, это может быть просто текстовое представление шахматной фигуры)
     * @param piececolor цвет поля
     * @param isSquareDark Булево значение, указывающее, тёмная ли клетка (true для темной клетки, false для светлой).
     *      * Применение цвета фигуры:
     * @return
     */

    private String colorizeSprite(String sprite,Color piececolor, boolean isSquareDark){

        String result=sprite;

//        if (piececolor== Color.WHITE){
//            result=ANSI_WHITE_PIECE_COLOR+result;
//
//        }else {
//            result=ANSI_BLACK_PIECE_COLOR+result;
//        }

        if(isSquareDark){
            result=ANSI_BLACK_SQUARE_BACKGROUND+result;

        }else {

            result=ANSI_WHITE_SQUARE_BACKGROUND+result;

        }

        return result;

    }

    private String  getSpriteForEmptySquare(Coordinates coordinates){
        return colorizeSprite("   ",Color.WHITE,Board.isSquareDark(coordinates));

    }
}
