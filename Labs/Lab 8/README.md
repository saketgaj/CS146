The approach I used was the Dynamic Programming Tabulation method. The first step is to initialize an array to store the minimum number of coins needed for each amount. Fill this array with max values, in this case, amount+1 is a max value. The base case is the amount is 0 at coin 0. The next step is to iterate over each coin in the coins array and use the previously calculated values for smaller amounts to calculate the solution for the current amount. If using the current coin results in fewer coins needed for the amount, we update the value of the array. We do this by finding the minimum value of the current coin and the minimum number of coins needed to fulfill the remaining amount. Finally, if it is less than the max value, return the value of arr [amount], which is the minimum number of coins needed to fulfill the target amount. If it is not less than the max value, simply return -1.