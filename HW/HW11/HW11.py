def floodFill(self, image, sr, sc, color):
            def fill(arr, sr, sc, srcColor, newColor):
                if (sr < 0 or sc < 0 or sr >= len(arr) or sc >= len(arr[0]) or
                arr[sr][sc] != srcColor):
                    return
                else:
                    arr[sr][sc] = newColor
                    fill(arr, sr-1, sc, srcColor, newColor)
                    fill(arr, sr+1, sc, srcColor, newColor) 
                    fill(arr, sr, sc-1, srcColor, newColor)
                    fill(arr, sr, sc+1, srcColor, newColor)
            
            arr = image
            if (image[sr][sc] != color):
                fill(image, sr, sc, image[sr][sc], color)
            return arr
