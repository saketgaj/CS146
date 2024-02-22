def minMeetingRooms(self, intervals: List[List[int]]) -> int:       
        start = []
        end = [] 

        for i in range(len(intervals)):
            start.append(intervals[i][0])

        for i in range(len(intervals)):
            end.append(intervals[i][1])

        start.sort()
        end.sort()

        s = 0
        e = 0
        servers = 0

        while s < len(start):
            if start[s] < end[e]:
                s += 1
                servers += 1
            else:
                e += 1
                servers -= 1

        return servers
