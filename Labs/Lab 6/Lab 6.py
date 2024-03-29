def canFinish(self, numCourses, prerequisites):
        graph = [[] for _ in range(numCourses)]
        visited = [0] * numCourses

        for prerequisite in prerequisites:
            graph[prerequisite[0]].append(prerequisite[1])
        
        def hasCycle(course):
            if visited[course] == 1:
                return True
            if visited[course] == 2:
                return False
            
            visited[course] = 1
            for neighbor in graph[course]:
                if hasCycle(neighbor):
                    return True
            
            visited[course] = 2
            return False
        
        for course in range(numCourses):
            if hasCycle(course):
                return False
        return True
        
