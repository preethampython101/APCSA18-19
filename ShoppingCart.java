//****************************************************************
// Name: Preetham Thelluri
// 
// Date: 1/16/19
//
// Shopping Cart lab
//
// This deals with array lists and simulates a shopping session.
//****************************************************************

import java.text.NumberFormat;

public class ShoppingCart
{
  private Item[] cart;
  private int itemCount;
  private double totalPrice;
  private int capacity;

  public ShoppingCart(int cartSize)
  {
    cart = new Item[cartSize];
    capacity = cartSize;
    itemCount = 0;
    totalPrice = 0;
  }

  private void increaseSize()
  {
    Item[] temp = new Item [cart.length+10];
    
    for (int i = 0; i < cart.length; i ++)
    {
      temp[i] = cart[i];
    }
    cart = temp;
  }

  public void addToCart(Item object)
  {
    cart[itemCount] = object;
    itemCount++;
    totalPrice += (object.getQuantity() * object.getPrice());
  }

  public String toString()
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String result="";
    result += "\t\t\tShopping Cart\n";
    // You can define the length of a term by just mentioning the length in between brackets
    result += (String.format("%-20s", "Item"))+"Unit Price\t\tQuantity\t\tTotal\n";
    for (int i = 0; i < itemCount; i++)
    {
      result += cart[i]+"\n";
    }
    result += "\nTotal Price of cart: "+fmt.format(totalPrice);
    return result;
  }

  public double getTotal()
  {
    return totalPrice;
  }


}