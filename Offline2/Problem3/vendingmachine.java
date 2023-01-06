

import java.io.IOException;

public class vendingmachine {
    int price;
    int quantity;
    int storemoney=0;
    exactmoneystate exactmoney;
    excessmoneystate excessmoney;
    nomoneystate nomoney;
    shortmoneystate shortmoney;
    stockoutstate stockout;
    deliverystate delivery;
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
        delivery =  new deliverystate(this);
        currState=nomoney;
        System.out.println("The Vending Machine Has Started.");
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
    int getstoremoney()
    {
        return storemoney;
    }
    void setquantity(int new_quantity)
    {
        quantity = new_quantity;
    }
    void refill(int add)
    {
        quantity+=add;
    }
    void addmoney(int money)
    {
        storemoney+=money;
    }
    void resetstore()
    {
        storemoney=0;
    }
    void reducestock()
    {
        if(quantity>0)
        {
        quantity-=1;
        }
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
    state getdeliverystate()
    {
        return delivery;
    }
    void start() throws IOException
    {
        currState.work();
    }

}
