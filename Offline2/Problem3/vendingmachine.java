package Offline2.Problem3;

public class vendingmachine {
    int price;
    int quantity;
    exactmoneystate exactmoney;
    excessmoneystate excessmoney;
    nomoneystate nomoney;
    shortmoneystate shortmoney;
    stockoutstate stockout;
    state currState;
    public vendingmachine(int quantity,int price)
    {
        this.price=price;
        this.quantity=quantity;
        exactmoney = new exactmoneystate(this);
        excessmoney = new excessmoneystate(this);
        nomoney = new nomoneystate(this);
        shortmoney = new shortmoneystate(this);
        stockout = new stockoutstate(this);
        currState=nomoney;
    }
    int getprice()
    {
        return price;
    }
    void setprice(int newprice)
    {
        price=newprice;
    }
    int getquantity()
    {
        return quantity;
    }
    void setquantity(int new_quantity)
    {
        quantity = new_quantity;
    }
    void refill(int add)
    {
        quantity+=add;
    }
    state getcurrstate()
    {
        return currState;
    }
    void setcurrstate(state temp)
    {
        currState=temp;
    }
    state getexactmoneystate()
    {
        return exactmoney;
    }
    state getexcessmoneystate()
    {
        return excessmoney;
    }
    state getnomoneystate()
    {
        return nomoney;
    }
    state getshortmoneystate()
    {
        return shortmoney;
    }
    state getstockoutstate()
    {
        return stockout;
    }

}
