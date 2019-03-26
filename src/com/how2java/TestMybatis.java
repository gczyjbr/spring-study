package com.how2java;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.mapper.CategoryMapper;
import com.how2java.mapper.OrderMapper;
import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.Order;
import com.how2java.pojo.OrderItem;
import com.how2java.pojo.Product;

/**
 * 
 * @author 刘森华 2019/03/22
 */

public class TestMybatis {

  public static void main(String[] args) throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session = sqlSessionFactory.openSession();
    CategoryMapper mapper = session.getMapper(CategoryMapper.class);
//    ProductMapper mapper = session.getMapper(ProductMapper.class);
    
//    Category c = new Category();
//    c.setName("新增加的Category");
//    session.insert("addCategory", c);
//    
//    listAll(session);
//    List<Product> ps = session.selectList("listProduct");
//    for (Product p : ps)
//      System.out.println(p.getName());
    
//    Category c = new Category();
//    c.setId(6);
//    session.delete("deleteCategory", c);
//    listAll(session);
    
//    Category c = session.selectOne("getCategory", 3);
//    c.setName("修改了的Category名称");
//    session.update("updateCategory", c);
//    listAll(session);
    
//    List<Category> cs = session.selectList("listCategoryByName", "cat");
//    for (Category c : cs) {
//      System.out.println(c.getName());
//    }
    
//    Map<String, Object> params = new HashMap<String, Object>();
//    params.put("id", 3);
//    params.put("name", "cat");
//    List<Category> cs = session.selectList("listCategoryByIdAndName", params);
//    for (Category c : cs) 
//      System.out.println(c.getName());
    
//    List<Category> cs = session.selectList("listCategory");
//    for (Category c : cs) {
//      System.out.println(c);
//      List<Product> ps = c.getProducts();
//      for (Product p : ps) 
//        System.out.println("\t" + p);
//    }
    
//      List<Product> ps = session.selectList("listProduct");
//      for (Product p : ps) {
//        System.out.println(p+" 对应的分类是 \t "+ p.getCategory());
//      }
//      Category c1 = session.selectOne("getCategory",1);
//  
//      System.out.println(c1.getName());
//      System.out.println(c1.getProducts());
//  
//      Product p5 = session.selectOne("getProduct",5);
//      System.out.println(p5);
//      System.out.println(p5.getCategory());
//      p5.setCategory(c1);
//  
//      session.update("updateProduct",p5);
    
//    List<Product> ps = session.selectList("listProduct");
//    for (Product p : ps) 
//      System.out.println(p + "对应的分类是  \t" + p.getCategory());
    
//    TestMybatis.deleteOrderItem(session);
//    TestMybatis.addOrderItem(session);
//    TestMybatis.deleteOrder(session);
//    TestMybatis.listOrder(session);
    
//    System.out.println("查询所有的");
//    List<Product> ps = session.selectList("listProduct");
//    for (Product p : ps)
//      System.out.println(p);
//    
//    System.out.println("模糊查询");
//    Map<String, Object> params = new HashMap<String, Object>();
//    params.put("name", "a");
//    List<Product> ps2 = session.selectList("listProduct", params);
//    for (Product p : ps2)
//      System.out.println(p);
    
//    System.out.println("多条件查询");
//    Map<String, Object> params = new HashMap<String, Object>();
//    params.put("price", 10);
//    List<Product> ps = session.selectList("listProduct", params);
//    for (Product p : ps)
//      System.out.println(p);
    
//    Product p = new Product();
//    p.setId(6);
//    p.setName("Product zz");
//    p.setPrice(99.99f);
//    session.update("updateProduct", p);
//    listAll(session);
    
//    List<Integer> ids = new ArrayList<Integer>();
//    ids.add(1);
//    ids.add(3);
//    ids.add(6);
//    
//    List<Product> ps = session.selectList("listProduct", ids);
//    for (Product p : ps)
//      System.out.println(p);
    
//    Map<String, String> params = new HashMap<String, String>();
//    params.put("name", "product");
//    List<Product> ps = session.selectList("listProduct", params);
//    for (Product p : ps)
//      System.out.println(p);
    
//    TestMybatis.add(mapper);
//    TestMybatis.delete(mapper, 6);
//    TestMybatis.get(mapper, 2);
//    TestMybatis.update(mapper, 2);
//    TestMybatis.listAll(mapper);
    
//    List<Product> ps = mapper.list();
//    for (Product p : ps) 
//      System.out.println(p + "\t对应的分类是：\t" + p.getCategory().getName());
    
//    listOrder1(session);
    
//    Category c1 = new Category();
//    c1.setName("长度够短的名称");
//    mapper.add(c1);
//    
//    Category c2 = new Category();
//    c2.setName("超过最大长度30的名称超过最大长度30的名称超过最大长度30的名称超过最大长度30的名称超过最"
//        + "大长度30的名称超过最大长度30的名称");
//    mapper.add(c2);
//    listAll(mapper);
    
//    List<Category> cs = mapper.list();
//    for (Category c : cs) {
//      System.out.println(c.getName());
//      List<Product> ps = c.getProducts();
//      for (Product p : ps)
//        System.out.println("\t" + p.getName());
//    }
//    
//    List<Category> cs = session.selectList("listCategory");
//    for (Category c : cs) 
//      session.delete("deleteCategory", c);
//    
//    for (int i = 0; i < 100; i++) {
//      Category c = new Category();
//      c.setName("Category name" + i);
//      session.insert("addCategory", c);
//    }
    
//    xmlWay(session, 10, 15);
//    annotationWay(session, 10, 15);
    
//    PageHelper.offsetPage(0, 5);
//    
//    List<Category> cs = session.selectList("listCategory");
//    for (Category c : cs)
//      System.out.println(c.getName());
//    
//    PageInfo pageInfo = new PageInfo<>(cs);
//    System.out.println("总数：" + pageInfo.getTotal());
//    System.out.println(pageInfo);
    
//    Category c1 = session.selectOne("getCategory", 15);
//    System.out.println(c1);
//    Category c2 = session.selectOne("getCategory", 15);
//    System.out.println(c2);
//    
//    session.commit();
//    session.close();
//    
//    SqlSession session2 = sqlSessionFactory.openSession();
//    Category c3 = session2.selectOne("getCategory", 15);
//    System.out.println(c3);
//    
//    session2.commit();
//    
//    session2.close();
    
    int count = mapper.count();
    System.out.println(count);
    
    session.commit();
    session.close();
    
  }
  
  private static void xmlWay(SqlSession session, int start, int count) {
    Map<String, Integer> params = new HashMap<String, Integer>();
    params.put("start", start);
    params.put("count", count);
    List<Category> cs = session.selectList("listCategory", params);
    for (Category c : cs) 
      System.out.println(c);
  }
  
  private static void annotationWay(SqlSession session, int start, int count) {
    CategoryMapper mapper = session.getMapper(CategoryMapper.class);
    
    List<Category> cs = mapper.listByPage(start, count);
    for (Category c : cs)
      System.out.println(c);
  }
  
  private static void listOrder1(SqlSession session) {
    OrderMapper mapper = session.getMapper(OrderMapper.class);
    List<Order> os = mapper.list();
    for (Order o : os) {
      System.out.println(o.getCode());
      List<OrderItem> ois = o.getOrderItems();
      if (null != ois)
        for (OrderItem oi : ois)
          System.out.format("\t%s\t%f\t%d\n", oi.getProduct().getName(), oi.getProduct().getPrice(), oi.getNumber());
    }
  }
  
  private static void update(CategoryMapper mapper, int id) {
    Category c = mapper.get(id);
    c.setName("修改了的Category名称");
    mapper.update(c);
    listAll(mapper);
  }
  
  private static void get(CategoryMapper mapper, int id) {
    Category c = mapper.get(id);
    System.out.println(c.getName());
  }
  
  private static void delete(CategoryMapper mapper, int id) {
    mapper.delete(id);
    listAll(mapper);
  }
  
  private static void add(CategoryMapper mapper) {
    Category c = new Category();
    c.setName("新增加的Category");
    mapper.add(c);
    listAll(mapper);
  }
  
  private static void listAll(SqlSession session) {
//    List<Category> cs = session.selectList("listCategory");
//    for (Category c : cs)
//      System.out.println(c.getName());
    
    Map<String, Object> params = new HashMap<String, Object>();
    List<Product> ps = session.selectList("listProduct", params);
    for (Product p : ps)
      System.out.println(p);
  }
  
  private static void listAll(CategoryMapper mapper) {
    List<Category> cs = mapper.list();
    for (Category c : cs) {
      System.out.println(c.getName());
//      List<Product> ps = c.getProducts();
//      for (Product p : ps)
//        System.out.println("\t" + p.getName());
    }
  }
  
  private static void deleteOrder(SqlSession session) {
//    Order o1 = session.selectOne("getOrder", 1);
//    List<OrderItem> ois = o1.getOrderItems();
//    for (OrderItem oi : ois) 
//      session.delete("deleteOrderItem", oi);
    session.delete("deleteOrder", 1);
  } 
  
  private static void deleteOrderItem(SqlSession session) {
    Order o1 = session.selectOne("getOrder", 1);
    Product p6 = session.selectOne("getProduct", 6);
    OrderItem oi = new OrderItem();
    oi.setProduct(p6);
    oi.setOrder(o1);
    session.delete("deleteOrderItem", oi);
  }
  
  private static void addOrderItem(SqlSession session) {
    Order o1 = session.selectOne("getOrder", 1);
    Product p6 = session.selectOne("getProduct", 6);
    OrderItem oi = new OrderItem();
    oi.setProduct(p6);
    oi.setOrder(o1);
    oi.setNumber(200);
    
    session.insert("addOrderItem", oi);
  }
  
  private static void listOrder(SqlSession session) {
    List<Order> os = session.selectList("listOrder");
    for (Order o : os) {
      System.out.println(o.getCode());
      List<OrderItem> ois = o.getOrderItems();
      for (OrderItem oi : ois) {
        System.out.format("\t%s\t%f\t%d\n", oi.getProduct().getName(), oi.getProduct().getPrice(), oi.getNumber());
      }
    }
  }
}
