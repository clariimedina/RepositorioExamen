package Domain;

class Payment {
  private float amount;

  public Payment(float receivedCash) {
    this.amount = receivedCash;
  }

  public float getAmount() {
    return amount;
    
  }

}
