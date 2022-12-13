public class Main {
    public static void main(String[] args) {
      LandLine l1 = new LandLine("123");
      LandLine l2 = new LandLine("1999");
      LandLine l3 = new LandLine("0101");
      l1.dialOn("1999");
      l2.receivedPhone("1999");
      l3 .dialOn("1234");
      l2.receivedPhone("1999");
    }
}