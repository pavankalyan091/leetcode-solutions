public class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        // Fill queues with indices
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        
        // Simulation
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();
            
            if (rIndex < dIndex) {
                // Radiant bans Dire
                radiant.offer(rIndex + n);
            } else {
                // Dire bans Radiant
                dire.offer(dIndex + n);
            }
        }
        
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}