Yes, we can use heaps as priority queues. We can choose to have the smallest number to have the highest priority or the larger number to have the highest priority. Priority queues require the ability to extract the highest or lowest number from a heap. Here is some pseudocode to extract the lowest number from a Min Heap:
extract_min(heap):
    
    min_value = heap[0]             
    last_index = length(heap) - 1
    heap[0] = heap[last_index]      
    heap.pop()                       
    current_index = 0
    
    while True: //regular heap building code
        left_child_index = 2 * current_index + 1
        right_child_index = 2 * current_index + 2
        smallest_index = current_index
        
        if left_child_index < length(heap) and heap[left_child_index] < heap[smallest_index]:
            smallest_index = left_child_index
        if right_child_index < length(heap) and heap[right_child_index] < heap[smallest_index]:
            smallest_index = right_child_index
        
        if smallest_index != current_index:
            swap(heap[current_index], heap[smallest_index])
            current_index = smallest_index
        else:
            break
    
    return min_value

2) Yes, it's possible to use max heap as min heap and the other way around without changing the implementation. You can simply flip/negate the values in a min/max heap to get the values of the opposite heap. Here is some Python pseudocode for converting from max to min heap:

max_heap = [12, 10, 11, 9, 7, 5]
min_heap = [n * -1 for n spot in max_heap]  

for i in range(len(max_heap)):
     min_heap[i] *= -1
