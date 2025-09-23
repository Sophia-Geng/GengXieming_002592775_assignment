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
public class ProductDirectory {
    private ArrayList<Product> productlist;
    public ProductDirectory(){
        this.productlist=new ArrayList<Product>();
    }
    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> product) {
        this.productlist = product;
    }
    
    public Product addProduct(){
        Product p=new Product();
        productlist.add(p);
        return p;             
    }
    public void deleteProduct(Product product){
        productlist.remove(product);
    }
    
    public Product searchProduct(String id){
        for(Product p:productlist){
            if(p.getId().contains(id)){
                return p;
            }
        }
        return null;
    }
}
