public int minMeetingRooms(int[][] intervals) { 
      int[] start = new int[intervals.length];
      int[] end = new int[intervals.length];

      for(int i = 0; i < intervals.length; i++){
          start[i] = intervals[i][0];
      }

      for(int i = 0; i < intervals.length; i++){
          end[i] = intervals[i][1];
      }
      
      
      
      int[] sortedStart = sort(start);
      int[] sortedEnd = sort(end);

      int s = 0;
      int e = 0;
      int servers = 0;

      while(s < sortedStart.length){
          if(sortedStart[s] < sortedEnd[e]){
              s++;
              servers++;
          } else {
              e++;
              servers--;
          }
      }

      return servers;
}

public int[] sort(int[] arr){
    int n = arr.length;
    int[] newArr = arr;
    for (int i = 1; i < n; ++i) {
        int key = newArr[i];
        int j = i - 1;

        while (j >= 0 && newArr[j] > key) {
            newArr[j + 1] = newArr[j];
            j = j - 1;
        }
        newArr[j + 1] = key;
    }
    return newArr;
}
