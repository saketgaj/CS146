The first step would be to sort the array. I used the insertion sort algorithm to sort the nums array. The next step is to use a similar 2-pointer approach as the Two Sum problem from our earlier homework. Loop through each index in the array. I created a left and right-hand pointer, in which the left starts at i+1 and the right starts at the last index of the array. I move these pointers toward each other until they meet (use a while loop). If the elements at each pointer add up to the target sum of 0-element at the current index (i), I append these triplets(elements at i, l, r) to the output list. However, to avoid duplicate lists, I have to check if the triplets already exist in the output list before appending them. After appending the triplets, the next step would be to move the pointers. To avoid checking duplicate values, I used 2 while loops to check if the next element when I move the pointers is the same as the previous element. Until this is false, I keep moving the corresponding pointers. On the other hand, if the elements at each pointer add up to greater or less than the target sum, I move the corresponding pointers (right if too high, and left is too low). Finally, I return the output list.