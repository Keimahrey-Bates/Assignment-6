public class BevShopDriverApp
{
	public static void main(String[] args)
	{
		  int tAge, tOrderNo;
		  double totalMonth;
		  Order tempOrder;
          Customer cust = new Customer("", 0);
          BevShop bev = new BevShop();
          System.out.println(bev.getMaxOrderForAlcohol());
          System.out.println(bev.getMinAgeForAlcohol());
          System.out.println("Start a new order\n");
          bev.startNewOrder(12, Day.TUESDAY, "John", 23);
          System.out.println("Total on the Order:" + bev.getCurrentOrder().calcOrderTotal());
          cust.setName("John");
          cust.setAge(23);
          tAge = cust.getAge();
          System.out.println(cust.getName());
          System.out.println(cust.getAge());
          System.out.println(bev.isValidAge(tAge));
          if(bev.isValidAge(tAge))
          {
        	  System.out.println("Add alcohol drink");
        	  bev.processAlcoholOrder("Tequila", Size.SMALL);
        	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
        	  System.out.println(bev.isEligibleForMore());
        	  System.out.println("Add second alcohol drink");
        	  bev.processAlcoholOrder("Beer", Size.LARGE);
        	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
        	  System.out.println(bev.getNumOfAlcoholDrink());
        	  System.out.println("Add third alcohol drink");
        	  bev.processAlcoholOrder("Wine", Size.SMALL);
        	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
        	  System.out.println(bev.getNumOfAlcoholDrink());
        	  System.out.println("Maximum alcohol drink for this order");
          }
    	  System.out.println("Add a COFFEE to order");
    	  bev.processCoffeeOrder("Cappuccino", Size.SMALL, true, true);
    	  System.out.println(bev.getNumOfAlcoholDrink());
    	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  tOrderNo = bev.getCurrentOrder().getOrderNo();
    	  if(bev.findOrder(tOrderNo) != 1)
    	  {
    		  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  }
    	  tempOrder = bev.getCurrentOrder();
    	  System.out.println("Start a new Order");
    	  bev.startNewOrder(13, Day.WEDNESDAY, "Keimahrey", 17);
    	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  System.out.println("Add a SMOOTHIE to Order");
    	  bev.processSmoothieOrder("Frozen Strawberry Smoothie", Size.LARGE, 2, true);
    	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  System.out.println("Add a COFFEE to order");
    	  bev.processCoffeeOrder("Expresso", Size.MEDIUM, false, false);
    	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  System.out.println(bev.getNumOfAlcoholDrink());
    	  if (bev.isValidAge(cust.getAge()))
    	  {
    		  System.out.println("Age not appropriate for alcohol drink!!");
    	  }
    	  tOrderNo = bev.getCurrentOrder().getOrderNo();
    	  if(bev.findOrder(tOrderNo) != 1)
    	  {
    		  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  }
    	  int numOfFruits = 6;
    	  if(bev.isMaxFruit(numOfFruits) == false)
    	  {
    		  System.out.println("Maximum Number of Fruits\n");
    	  }
    	  numOfFruits = 5;
    	  bev.processSmoothieOrder("Fruity Blast", Size.LARGE, numOfFruits, false);
    	  System.out.println("Total on the Order: " + bev.getCurrentOrder().calcOrderTotal());
    	  totalMonth = bev.getCurrentOrder().calcOrderTotal() + tempOrder.calcOrderTotal();
    	  System.out.println("Total amount for all orders: " + totalMonth);
    	  
	}
}

