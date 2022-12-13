public interface Phone {
    void powerOn();
    void dialOn(String no);
    boolean answerPhone();
    boolean receivedPhone(String phoneNo);
    boolean isRinging();
}
