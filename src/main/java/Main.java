import View.View;

public class Main {



    public static void main(String[] args) {

        Tailor tailor = new Tailor();
        View view = new View();

        int amountOfPeople = 4;
        int cutter = 4;

        view.printArray( tailor.playTailor( amountOfPeople, cutter) );

        System.out.println(  view.arrToString(tailor.playTailor( amountOfPeople, cutter))  );


    }
}
