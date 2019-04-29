public class CheckMasterCardNumber implements CheckCardNumber {
    @Override
    public boolean checkdNumber(String str) {
        if(str.length() == 15 && (str.startsWith("41") || str.startsWith("42"))&&(new Luhn().validateCreditCardNumber(str)))
            return true;
        return false;
    }
}
