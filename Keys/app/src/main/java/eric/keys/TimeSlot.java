//package eric.keys;
//
//import java.util.Random;
//
//public class TimeSlot {
//    private String mCode;
//    private String mUser;
//
//    public TimeSlot() {}
//
//    public TimeSlot(String code, String user) {
//        mCode = code;
//        mUser = user;
//    }
//
//    public String getCode() {
//        return mCode;
//    }
//
//    private int getRandomNumber() {
//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
//        return randomNumber;
//    }
//
//    private void stringify(int first, int second, int third, int fourth, int fifth, int sixth) {
//        mCode = Integer.toString(first) + Integer.toString(second) + Integer.toString(third) + Integer.toString(fourth) + Integer.toString(fifth) + Integer.toString(sixth);
//        //printString(password);
//        return;
//    }
//
//    public void generateCode() {
//        int first = getRandomNumber();
//        int second = getRandomNumber();
//        int third = getRandomNumber();
//        int fourth = getRandomNumber();
//        int fifth = getRandomNumber();
//        int sixth = getRandomNumber();
//        stringify(first, second, third, fourth, fifth, sixth);
//        return;
//    }
//
//    public String getUser() {
//        return mUser;
//    }
//
//    public void setUser(String user) {
//        mUser = user;
//        return;
//    }
//}
