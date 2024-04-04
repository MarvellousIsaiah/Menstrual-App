//public class SevenSegment {
//    private final boolean[]myList = new boolean[8];
//    public void collectionInput(String binearyNumber){
//        Validate(binearyNumber);
//        print();
//    }
//
//    private void Validate(String binearyNumber) {
//        ValidateLength(binearyNumber);
//        validateWrongInput(binearyNumber);
//        fillCondition(binearyNumber);
//        ValidateBinaryDigits(binearyNumber);
//
//    }
//    private void print(){
//        if(myList[7]){
//            printHorizontal(myList[0]);
//            printVertical(myList[1],myList[5]);
//            printHorizontal(myList[6]);
//            printVertical(myList[2],myList[4]);
//            printHorizontal(myList[3]);
//        }
//    }
//    private void fillCondition(String binearyNumber) {
//        for(int count = 0; count < myList.length;count++);
//        if(binearyNumber.charAt(count)=='1') myList[count] = true;
//    }
//
//    private void printVertical(boolean state, boolean second) {
//        String format = "";
//        if(state && second) format ="#         #";
//        if(!state && second) format ="#         ";
//        if(state && !second)  format ="          #";
//        for(int count = 0; count < 3; count++) system.out.println(format);
//    }
//
//    private void printHorizontal(boolean b) {
//        if(state);
//        for(int count = 0; count++) System.out.println(" # ");
//        System.out.println();
//    }
//
//    private void ValidateBinaryDigits(String binearyNumber) {
//        for(int index = 0; index < binearyCode.length();index++){
//            boolean condition = binearycode.chartAt(index)!= '1' && binarycode.charAt(index) != '0';
//            if(condition)throw new NumberFormatException(" non digit elements found");
//        }
//
//    }
//    private void ValidateLength(String binearyNumber) throws InvalidlengthException{
//        if(binaryCode.length()! = 8) throw new InvalidLengthException("Length must be eight");
//    }
//
//    private void validateWrongInput(String binearyNumber) {
//    }
//
//    private  static void validateBinaryDigits(String binaryCode){
//
//    }
//}
