def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        matrix = [[float('inf')] * n for _ in range(n)]

        for edge in edges:
            start, end, weight = edge
            matrix[start][end] = weight
            matrix[end][start] = weight

        for k in range(n):
            for i in range(n):
                for j in range(n):
                    matrix[i][j] = min(matrix[i][j], matrix[i][k] + matrix[k][j])

        minCount = n
        vertex = -1

        for i in range(n):
            count = sum(1 for j in range(n) if i != j and matrix[i][j] <= distanceThreshold)
            if count <= minCount:
                minCount = count
                vertex = i

        return vertex
