
public class AV{

    // gets a certain value from certain index
    public String getAtIndex(String[] names, int index){
        return names[index];
    }
    // sets an index with a value of String
    public void setAtIndex(String[] names, int index, String name){

        String[] array = new String[names.length+1];
        for( int i = 0; i < names.length; i++){
            if( index == i){
                array[i] = name;
            }
            else{
            array[i] = names[i];
            }
        }
    }
    // prints array
    public static void printAll(String[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            if( i != array.length-1){
            System.out.print(array[i]+", ");
            }
            else{
                System.out.print(array[i] + "]");
            }
        }
        }
    // deletes a value at said index
    public static String[] deleteAtIndex(String[] names, int index){
        String[] array = new String[names.length-1];

            for(int i = 0, j = 0; i <names.length; i++){
                if( i != index){
                    array[j] = names[i];
                    j++;
                }
            }
            return array;
  
        }




}
