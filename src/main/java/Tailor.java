public class Tailor {


  public int[] playTailor(int amountOfPeople, int cutter){

      int counter = amountOfPeople;
      int posytion = 0;
      int[] listOfPeople = new int[amountOfPeople];
      infillListOfPeople(listOfPeople);

      while(counter > 1){

          posytion = getPosytion(posytion, listOfPeople);
          posytion = getPosytionWithCutter(cutter, posytion, listOfPeople);
          posytion = getPosytion(posytion, listOfPeople);

          listOfPeople[posytion] = 0;
          posytion=posytion+1;
          counter--;
      }
      return listOfPeople;
  }

    private int getPosytion(int posytion, int[] listOfPeople) {
        if (posytion >= listOfPeople.length) {
            posytion = 0;
        }
        while (listOfPeople[posytion] == 0) {
            posytion++;
            if (posytion >= listOfPeople.length) {
                posytion = 0;
            }
        }
        return posytion;
    }

    private int getPosytionWithCutter(int cutter, int posytion, int[] listOfPeople) {
        for(int i =0; i<cutter-1; i++ ){
            if(posytion > listOfPeople.length -1){
                posytion = 0;
            }
            if (listOfPeople[posytion]==0){
               posytion++;
            }
            posytion++;
        }
        return posytion;
    }

    private void infillListOfPeople(int[] listOfPeople) {
        for(int i =0; i<listOfPeople.length; i++){
            listOfPeople[i] = i+1;
        }
    }

}

