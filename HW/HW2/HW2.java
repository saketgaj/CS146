public int firstBadVersion(int n) {
  int left = 1;
  int right = n;
  
  while(left < right){
    int mid = (left+right)/2;
    if(isBadVersion(mid)){
    right = mid;
    } else {
    left = mid+1;
    }
  }
  return left;
}
