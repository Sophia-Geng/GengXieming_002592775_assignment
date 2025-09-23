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
public class CustomerDirectory {
    private ArrayList<Customer> customerlist;
    public CustomerDirectory(){
        this.customerlist=new ArrayList<Customer>();
    }
    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    public Customer addCustomer(){
      Customer o=new Customer();
      customerlist.add(o);
      return o;
  }
  public void deleteCustomer(Customer order){
      customerlist.remove(order);
  }
  public Customer searchCustomer(String id){
      for(Customer o:customerlist){
          if(o.getId().contains(id)){
              return o;
          }
      }
      return null;
  }
    
}
