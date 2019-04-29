public class CheckVisaNumber implements CheckCardNumber {
    @Override
    public boolean checkdNumber(String str) {
        if(str.length() == 12 && (str.startsWith("39") || str.startsWith("40")) && (new Luhn().validateCreditCardNumber(str)))
            return true;
        return false;
    }
}
