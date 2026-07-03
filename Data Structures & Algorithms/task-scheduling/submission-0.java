class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxFreq = 0;
        

        for (char task : tasks) {
            freq[task - 'A']++;
            maxFreq = Math.max(maxFreq, freq[task - 'A']);
        }
        
    
        int maxFreqTasks = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                maxFreqTasks++;
            }
        }
        
    
        int ans = (maxFreq - 1) * (n + 1) + maxFreqTasks;
        return Math.max(tasks.length, ans);
    }
}