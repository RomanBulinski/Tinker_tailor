package View;

public class View {

    public void printArray(int[] arr){
        for(int people : arr){
            System.out.print( people+" ");
        }
    }

    public String arrToString(int[] arr){
        String output = "";
        for(int people : arr){
            output = output + String.valueOf(people);
        }
        return output;
    }


}
