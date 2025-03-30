class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int newStart = newInterval[0], newEnd = newInterval[1];
        boolean isInserted = false;
        
        for (int[] interval : intervals) {
            int currStart = interval[0], currEnd = interval[1]; 
            
            // If the current interval ends before newInterval starts or if it's already inserted
            if (currEnd < newStart || isInserted) {
                result.add(new int[]{currStart, currEnd});
                continue;
            }
            // Merge overlapping intervals
            newStart = Math.min(newStart, currStart);
            if (newEnd < currStart) {  
                result.add(new int[]{newStart, newEnd});
                result.add(new int[]{currStart, currEnd});
                isInserted = true;
                continue;
            }
            // Update the merged interval's end if necessary
            if (newEnd <= currEnd) {
                result.add(new int[]{newStart, currEnd});
                isInserted = true;
            }
        }
        // If the new interval wasn't added yet, add it at the end
        if (!isInserted) {
            result.add(new int[]{newStart, newEnd});
        }
        return result.toArray(new int[result.size()][]);
    }
}
