    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package whist;

    import java.util.ArrayList;
    import java.util.Arrays;
import java.util.Collections;

    /**
     *
     * @author Dragos
     */
    public class PachetCarti {

        ArrayList<String> nrCard = new ArrayList<>(Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A"));

        ArrayList<Character> symbol = new ArrayList<>(Arrays.asList('R','T','I','F'));

        ArrayList<String> cardPack = new ArrayList<>(symbol.size()*nrCard.size());

        public void packCard(){

        for(int i=0;i<nrCard.size();i++){

            for (int j=0;j< symbol.size();j++){
                String temp = nrCard.get(i) + symbol.get(j);
                cardPack.add(temp);
            }

        }

    }

        
        
        
        
            public void printCardPack(){
                    Collections.shuffle(cardPack);
                cardPack.forEach((x) -> {
                    System.out.println(x);
            });
        }
    }
