I used a recursive approach. First is a check to avoid the Null Pointer Exception error. The next check is to determine if the left child is valid. Use recursion for this. Return false if this fails. Maintain a minimum value variable and check if the variable is less than or equal to the root's value. Return false if this fails. The final check is if the right value is valid or not. Use recursion for this. If all cases pass, return true finally.