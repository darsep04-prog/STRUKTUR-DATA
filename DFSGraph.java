import java.util.*;

public class DFSGraph {
    private Map<String, List<String>> graph = new HashMap<>();
    private Map<String, Integer> values = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public DFSGraph() {
        
        graph.put("a0", Arrays.asList("a1", "a2"));
        graph.put("a1", Arrays.asList("a3", "a4"));
        graph.put("a2", Arrays.asList("a5", "a6"));
        graph.put("a3", Arrays.asList("a7"));
        graph.put("a4", Arrays.asList("a8"));
        graph.put("a5", Arrays.asList("a9"));
        graph.put("a6", new ArrayList<>());
        graph.put("a7", new ArrayList<>());
        graph.put("a8", new ArrayList<>());
        graph.put("a9", new ArrayList<>());
        
        values.put("a0", 10);
        values.put("a1", 15);
        values.put("a2", 20);
        values.put("a3", 25);
        values.put("a4", 30);
        values.put("a5", 35);
        values.put("a6", 40);
        values.put("a7", 45);
        values.put("a8", 50);
        values.put("a9", 55);

    }
    public boolean dfs(String node, int target) {
        if (visited.contains(node))
            return false;

        visited.add(node);

    System.out.println("Mengunjungi " + node + " nilai = " + values.get(node));

    if (values.get(node) == target) {
        System.out.println("Data ditemukan pada " + node);
        return true;
    }
    for (String neighbor : graph.get(node)) {
        if (dfs(neighbor, target))
            return true;
    }
    return false;
    }
    public static void main(String[] args) {
        DFSGraph g = new DFSGraph();
        int n = 50;

        if (!g.dfs("a0", n))
            System.out.println("Data tidak ditemukan");
    }
}
