package mybiginteger;

public class Main {

    public static void main(String[] args) {

        MyBigInteger myBigInteger_ = new MyBigInteger("-200");
        MyBigInteger myBigInteger0 = new MyBigInteger("200");
        MyBigInteger maximum = myBigInteger_.max(myBigInteger0);
        System.out.println(myBigInteger_.add(myBigInteger0));

//        MyBigInteger myBigInteger1 = new MyBigInteger("2332444000000004777777444");
//        MyBigInteger myBigInteger2 = new MyBigInteger("2666624555555543333244");
//        MyBigInteger addition = myBigInteger1.add(myBigInteger2);
//        System.out.println(addition.getBigInteger());
//
//        MyBigInteger myBigInteger3 = new MyBigInteger("10040999999999999999900000");
//        MyBigInteger myBigInteger4 = new MyBigInteger("444668666888888888886664444444");
//        MyBigInteger difference = myBigInteger3.subtract(myBigInteger4);
//        System.out.println(difference.getBigInteger());
//
//        MyBigInteger myBigInteger5 = new MyBigInteger("113455555555555555550");
//        MyBigInteger myBigInteger6 = new MyBigInteger("-433333336666666666666666666663461");
//        MyBigInteger product = myBigInteger5.multiply(myBigInteger6);
//        System.out.println(product.getBigInteger());
//
//        MyBigInteger myBigInteger7 = new MyBigInteger("-10999998");
//        MyBigInteger myBigInteger8 = new MyBigInteger("9345");
//        MyBigInteger division = myBigInteger7.divide(myBigInteger8);
//        System.out.println(division.getBigInteger());



    }
}
