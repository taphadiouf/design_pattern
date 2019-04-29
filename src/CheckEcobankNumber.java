public class CheckEcobankNumber implements CheckCardNumber {
    @Override
    public boolean checkdNumber(String str) {
        if(str.length() == 11 && (str.startsWith("E") || str.startsWith("A"))&& (new Luhn().validateCreditCardNumber(str.substring(1,str.length()))))
            return true;
        return false;
    }
}
