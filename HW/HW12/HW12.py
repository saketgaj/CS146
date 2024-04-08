def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        parent = [i for i in range(n+1)]
        rank = [0]*(n+1)
        
        def find(house):
            if house != parent[house]:
                parent[house] = find(parent[house])
            return parent[house]
        
        def union(h1, h2):
            root1 = find(h1)
            root2 = find(h2)

            if root1 == root2:
                return False
            
            if rank[root1] > rank[root2]:
                parent[h2] = root1
            elif rank[root1] < rank[root2]:
                parent[h1] = root2
            else:
                parent[root1] = root2
                rank[root2] += 1
            
            return True

        arr = []
        for i in range(len(wells)):
            arr.append([wells[i], 0, i+1])
        
        for house1,house2,cost in pipes:
            arr.append([cost, house1, house2])
        
        arr.sort(key=lambda x: x[0])
        
        result = 0
        for cost,house1,house2 in arr:
            if union(house1, house2):
                result += cost
        return result
