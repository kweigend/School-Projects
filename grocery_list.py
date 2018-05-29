grocery_item = {} #Create an empty dictionary
grocery_history =[] #Create an empty list

stop = 'go' #Initialize stop to a string

while stop != 'q': #Use while loop to loop through while users wants to add more items
    item_name = input("Item name: \n") #Get name of item
    quantity = input("Quantity purchased: \n") #Get quantity of item     
    cost = input("Price per item: \n") #Get per item cost                        
    
    #Create dictionary entry with information user just entered about grocery items
    grocery_item = {'name': item_name, 'number': int(quantity), 'price': float(cost)}                           
    
    #Adding each grocery item to the grocery history list
    grocery_history.append(grocery_item) 

    #Ask user if they want to continue to add grocery items
    stop = input("Would you like to enter another item?\nType 'c' for continue or 'q' to quit: \n")


grand_total = 0 #Initialize grand total variable to 0

#Loop over each grocery item to add total to grand total
for grocery_item in grocery_history:
  #Print grocery items in grocery history list
  print(" %d %s @ $%.2f ea $%.2f " %(grocery_item['number'], grocery_item['name'], grocery_item['price'], (grocery_item['price'] * grocery_item['number'])));
  
  #Calculate grand total for all grocery items in list
  grand_total += (grocery_item['price'] * grocery_item['number']);
    
  #Set the  equal to 0
  item_total = 0

#Print the grand total
print("Grand total: $%.2f" % grand_total)

