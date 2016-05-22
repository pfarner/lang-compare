class AnimalI {
  public void eat(String food) {
    if (smell(food))
      System.out.println("Om nom nom");
  }

  private boolean smell(String food) {
    return food.equals("meat");
  }
}

class ClassPrivateMethod {
  public static void main(String[] args) {
    new AnimalI().eat("meat");
  }
}
