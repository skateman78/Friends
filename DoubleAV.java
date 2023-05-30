public class DoubleAV{

    // inserts two arrays into one 2D array
    public static String[][] insert(String[] array,String[] array2){
        String[][] dubArray = new String[array.length][2];
        
        for( int i = 0; i < array.length; i++){
            dubArray[i][0] = array[i];
            dubArray[i][1] = array2[i];
        }

        return dubArray;
    }

    // prints a double array
    public static String dubPrintAll(String[][] array){
            String dubArray = "[[";
        for(int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++){
                if( j == 0){
                dubArray += array[i][j] + ", ";
                }
                else{
                    dubArray += array[i][j];
                }
            }
            if((array.length-1) != i ){
            dubArray+= "], [";
            }
            else{
                dubArray += "]]";
            }
        }
        return dubArray;
    }
}
