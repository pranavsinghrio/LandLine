public class LandLine implements Phone {

    private String myNumber;
    private  boolean isRinging;
    boolean powerOn;


    @Override
    public void powerOn() {
       powerOn=true;
    }

    @Override
    public void dialOn(String no) {
        System.out.println("Dialing the no"+ no );
    }

    @Override
    public boolean answerPhone() {
        if(isRinging==true){
            System.out.println("Please answer the phone");
            isRinging=true;
            return true;
        }
        return false;
    }

    @Override
    public boolean receivedPhone(String phoneNo) {
        if(phoneNo==myNumber){
            System.out.println("The phone is ringing"+myNumber);
            isRinging=true;
            return  true;
        }
        return false;
    }
    public  LandLine(String phoneNo){
        myNumber=phoneNo;
        isRinging=false;
        powerOn=true;
    }

    @Override
    public boolean isRinging() {
        if(isRinging==true){
            return true;
        }
        return false;
    }
}
