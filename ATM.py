import sys

#account balance 
account_balance = float(500.25)

#printbalance function to simply display current account balance value to customer
def printbalance():
    print("Your current balance : %.2f" % account_balance)

#deposit function to calculate the new account balance after the customer deposits money
def deposit():
    #First I am asking for how much the customer wants to deposit. I am setting the input to float immediately to guard against errors in displaying the account balance in the print statement
    deposit_amount = float(input("How much would you like to deposit today?\n")) 
    #Adding the deposit amount to the previous account balance to get the new account balance
    balance = account_balance + deposit_amount
    #Displaying how much the customer deposited and the new account balance 
    print("Deposit was $%.2f, current balance is $%.2f" % (deposit_amount, balance))

#withdraw function to calculate new balance after withdrawal and to make sure customer doesn't withdraw more money than they have
def withdraw():
    #First I am asking for how much the customer wants to withdraw. I am setting the input to float immediately to guard against errors in displaying the account balance in the print statement
    withdraw_amount = float(input("How much would you like to withdraw today?\n"))
    #Using an if/else branch to determine if customer is trying to withdraw more than they have
    if withdraw_amount > account_balance:
        print("$%.2f is greater than your account balance of $%.2f" % (withdraw_amount, account_balance))
    else:
        balance = account_balance - withdraw_amount
        print("Withdrawal amount was $%.2f, current balance is $%.2f" % (withdraw_amount, balance))

userchoice = str(input("Choose D to deposit funds, W to withdraw funds, or B to view your account balance.\n"))

#Using if/elif/else branch to determine which function to run based on userchoice
if userchoice == 'D':
  deposit()
elif userchoice == 'W':
  withdraw()
elif userchoice == 'B':
  printbalance()
else:
  print("Thank you for banking with us.")
