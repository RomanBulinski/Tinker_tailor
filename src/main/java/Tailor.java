public class Tailor {


    public static void main(String[] args) {

        int cutter = 4;
        int amountOfPeople = 4;
        int counter = amountOfPeople;
        int posytion = 0;

        //infill empty list by people
        int[] listOfPeople = new int[amountOfPeople];
        for(int i =0; i<listOfPeople.length; i++){
            listOfPeople[i] = i+1;
        }

        while(counter > 1){
            if(posytion >= listOfPeople.length){
                posytion = 0;
            }
            while(listOfPeople[posytion]==0){
                posytion++;
                if(posytion >= listOfPeople.length){
                    posytion = 0;
                }
            }
            for(int i =0; i<cutter-1; i++ ){
                if(posytion > listOfPeople.length -1){
                    posytion = 0;
                }
                if (listOfPeople[posytion]==0){
                   posytion++;
                }
                posytion++;
            }
            if(posytion >= listOfPeople.length){
                posytion = 0;
            }
            while(listOfPeople[posytion]==0){
                posytion++;
                if(posytion >= listOfPeople.length){
                    posytion = 0;
                }
            }

            listOfPeople[posytion] = 0;
            posytion=posytion+1;
            counter--;

        }

        for(int people : listOfPeople){
            System.out.println(people);
        }
        System.out.println("----------------------------");


    }
}
