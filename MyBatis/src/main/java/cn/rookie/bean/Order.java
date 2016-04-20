package cn.rookie.bean;

/**
 * Created by 201601120071 on 2016/1/16.
 */

/**
 * 此类中的属性与数据库中表的字段是不对应的
 * order_id -->id
 * order_no -->no
 * order_price -->price
 */
public class Order {
    private int id;
    private String no;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Price: id = " + id + " ,no = " + no + " ,price = " + price + "------------";
    }
}
