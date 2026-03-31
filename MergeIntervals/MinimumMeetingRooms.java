
class GfG {
  
    // Function to find the minimum number of rooms required
    static int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;

        // room indicates number of rooms needed at a time
        int room = 1, res = 1;

        // Run a nested for-loop to find the overlap
        for (int i = 0; i < n; i++) {
          
            // Initially one room is needed
            room = 1;
            for (int j = 0; j < n; j++) {
              
                if (i != j) {
                    // Increment room when there is an
                    // overlap
                    if (start[i] >= start[j]
                        && end[j] > start[i]) {
                        room++;
                    }
                }
            }
            // Update the result
            res = Math.max(room, res);
        }
        return res;
    }
}
