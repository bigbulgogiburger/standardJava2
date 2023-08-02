public class Deck {
    final int CARD_NUM=52;
    Card[] cardArr = new Card[CARD_NUM];


    Deck(){
        int cardnum = 0;
        for(int i =1; i<=Card.KIND_MAX;i++){
            for(int j = 0;j<Card.NUM_MAX;j++){
                cardArr[cardnum++] = new Card(i,j+1);
            }
        }
    }

    Card pick(int index){
        return cardArr[index];
    }

    Card pick(){
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void suffle(){
        for(int i = 0; i<cardArr.length;i++){
            int random = (int)(Math.random() * CARD_NUM);
            Card temp = cardArr[i];

            cardArr[i]=cardArr[random];

            cardArr[random]= temp;

        }
    }
}
