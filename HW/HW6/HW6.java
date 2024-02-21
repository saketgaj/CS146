public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int[] sorted = sort(nums);
    for(int i = 0; i < nums.length-2; i++){
        int x = nums[i];
        int l = i+1;
        int r = nums.length-1;
        int sum = 0 - x;
        while(l < r){
            if(nums[l] + nums[r] == sum){
                List list = Arrays.asList(x, nums[l], nums[r]);
                if(!result.contains(list)){
                    result.add(list);
                }
                while(l < r && nums[l] == nums[l+1]){
                    l++;
                }

                while(l < r && nums[r] == nums[r-1]){
                    r--;
                }
                l++;
                r--;
            } else if(nums[l] + nums[r] > sum){
                r--;
            } else{
                l++;
            }
        }
    }
    return result;
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
