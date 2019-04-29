public class Main {
    public static void main(String[] args){
        Card card = new MasterCard("412345678903555",new CheckMasterCardNumber());
        card.isValide();


    }
}
