public class Order {
  private OrderStatus orderStatus;  /* 訂單狀態 */
  private int paidAmount;  /* 已付價值 */
  private int orderAmount;  /* 訂單價值 */

  
  public Order(int orderAmount) {  /* Order(訂單價值(訂單價值,訂單狀態)) */
    this.orderAmount = orderAmount;
    this.orderStatus = OrderStatus.ORDERED;
  }
  
  public void credit(int amount) {  /*  */
    this.paidAmount += amount;
    // Encapsulation
    if (this.isPaid() && this.orderStatus == OrderStatus.ORDERED) {
       // this.setOrderStatus(this.orderStatus.next());
       // this.setOrderStatus(OrderStatus.PAID);
       setToPaid();
    }
  }

  public void setToPaid() {
    this.setOrderStatus(orderStatus.PAID);
  }


  public boolean isPaid() {
    return this.paidAmount == this.orderAmount;  /* isPaid() 已付未付, paidAmount已付價值 == orderAmount訂單價值 , 如個isPaid(ture)或isPaid(false) */
  }

  public OrderStatus getOrderStatus() {
    return this.orderStatus;
  }

  public void setOrderStatus(OrderStatus status) {
    this.orderStatus = status;
  }
  

  public static void main(String[] args) {
    Order order = new Order(100);
    // ...
    // credit card -> 50
    order.credit(50);
    System.out.println(order.isPaid());  // false

    order.credit(50);
    // OrderStatus currenOrderStatus = order.gOrderStatus();
    // if (order.isPaid() && currenOrderStatus == OrderStatus.ORDERED) {
    //   order.setOrderStatus(currenStatus.next());
    // }
    System.out.println(order.getOrderStatus());  // PAID



  }
  
}
