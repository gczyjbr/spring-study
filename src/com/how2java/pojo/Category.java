package com.how2java.pojo;

import java.util.List;

/**
 * 
 * @author ÁõÉ­»ª 2019/03/22
 */

public class Category {
  private int id;
  private String name;
  List<Product> products;

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return "Category [id=" + id + ", name=" + name + "]"; 
  }
}
