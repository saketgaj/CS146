public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] arr = image;
        if(image[sr][sc] != color){
            fill(arr, sr, sc, image[sr][sc], color);
        }
        return arr;
}

private void fill(int[][] arr, int sr, int sc, int srcColor, int newColor){
        if(sr < 0 || sc < 0 || sr >= arr.length ||
        sc >= arr[0].length || arr[sr][sc] != srcColor){
            return;
        } else {
            arr[sr][sc] = newColor;
            fill(arr, sr-1, sc, srcColor, newColor); //top
            fill(arr, sr+1, sc, srcColor, newColor); //bottom 
            fill(arr, sr, sc-1, srcColor, newColor); //left
            fill(arr, sr, sc+1, srcColor, newColor); //right
        }
}
