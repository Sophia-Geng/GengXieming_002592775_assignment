/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class OrderDirectory {
    private ArrayList<Order> orderlist;
    public OrderDirectory(){
        this.orderlist=new ArrayList<Order>();
    }
    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
  public Order addOrder(){
      Order o=new Order();
      orderlist.add(o);
      return o;
  }
  public void deleteOrder(Order order){
      orderlist.remove(order);
  }
  public Order searchOrder(String id){
      for(Order o:orderlist){
          if(o.getId().contains(id)){
              return o;
          }
      }
      return null;
  }
    
}
