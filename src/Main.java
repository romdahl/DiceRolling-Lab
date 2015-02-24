public class Main {
  public static void main(String[] args) {
    
    int total = 0;
    
    Histogram h = new Histogram();
    
    Die d1 = new Die();
    Die d2 = new Die();
    
    for(int i = 0; i < 300000; i++) {
      d1.roll();
      d2.roll();
      total = d1.getUpValue() + d2.getUpValue();
      h.tally(total);
    }
    h.print();
  }
}
    
    
    