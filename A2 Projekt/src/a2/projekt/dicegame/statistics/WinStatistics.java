package dicegame.statistics;

import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics {
    
    public Map<String, Integer> stats = new HashMap<>();
    
    public WinStatistics() {
        
    }
    
    public void statsAdd(String name) {
        int score = stats.getOrDefault(name, 0);
        ++score;
        stats.put(name, score);
    }
    
    public void deleteStats() {
        stats.clear();
    }
    
    public void showStats() {
        for (String name : stats.keySet()) {
            System.out.println(name + " " + stats.get(name));
        }
    }
    
}
