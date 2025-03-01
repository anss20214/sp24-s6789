

public class JavaExercises {

    public static void starTriangle(){

        for (int i = 0; i < 5; i ++){
            String line = "";
            for (int j = 0; j < i + 1; j ++ ){
                line += "*";
            }
            System.out.println(line);
        }
    }

    public static int quadrant(int x, int y){
        if (x == 0 || y == 0){
            return 0;
        }else if (y > 0  && x > 0){
            return 1;
        }else if (y > 0  && x < 0){
            return 2;
        }else if (x < 0  && y < 0){
            return 3;
        }else {
            return 4;
        }
    }

}
