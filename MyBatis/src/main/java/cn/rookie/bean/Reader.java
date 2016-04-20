package cn.rookie.bean;

/**
 * Created by 201601120071 on 2016/3/16.
 */
public class Reader {
    private int readerID;
    private int userID;
    private int money;

    public Reader(){}
    public Reader(int userID,int money){
        this.userID = userID;
        this.money = money;
    }
    public Reader(int readerID,int userID,int money){
        this.readerID = readerID;
        this.userID = userID;
        this.money = money;
    }
    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "readerID:" + readerID + "; userID:" + userID + "; money:" + money;
    }
}
