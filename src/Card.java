public abstract class Card {

    private String number;
    private CheckCardNumber cardValidation;

    public Card(String number,CheckCardNumber cardValidation) {
        this.number = number;
        this.cardValidation = cardValidation;
    }
    public void isValide(){

        if (cardValidation.checkdNumber(this.number))
            System.out.println(number + " is a valid credit card number");
        else
            System.out.println(number + " is an invalid credit card number");
    }

    public CheckCardNumber getCardValidation() {
        return cardValidation;
    }
}
