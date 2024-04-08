private int[] parent;
private int[] rank;

public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
    parent = new int[n + 1];
    rank = new int[n + 1];

    for (int i = 0; i <= n; i++) {
        parent[i] = i;
        rank[i] = 0;
    }

    List<int[]> arr = new ArrayList<>();

    for (int i = 0; i < wells.length; i++) {
        arr.add(new int[]{wells[i], 0, i + 1});
    }

    for (int[] pipe : pipes) {
        arr.add(new int[]{pipe[2], pipe[0], pipe[1]});
    }

    Collections.sort(arr, Comparator.comparingInt(a -> a[0]));

    int result = 0;

    for (int[] connection : arr) {
        int cost = connection[0];
        int house1 = connection[1];
        int house2 = connection[2];
        if (union(house1, house2)) {
            result += cost;
        }
    }

    return result;
}

private int find(int x) {
    if (parent[x] != x) {
        parent[x] = find(parent[x]);
    }
    return parent[x];
}

private boolean union(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);

    if (rootX == rootY) {
        return false;
    }

    if (rank[rootX] < rank[rootY]) {
        parent[rootX] = rootY;
    } else if (rank[rootX] > rank[rootY]) {
        parent[rootY] = rootX;
    } else {
        parent[rootY] = rootX;
        rank[rootX]++;
    }

    return true;
}
