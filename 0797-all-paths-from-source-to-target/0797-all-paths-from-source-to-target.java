class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return f1(0, graph);
    }

    private List<List<Integer>> f1(int src, int[][] graph) {
        if (src == graph.length - 1) {
            List<List<Integer>> baseCase = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            path.add(src);
            baseCase.add(path);
            return baseCase;
        } else {
            List<List<Integer>> allPaths = new ArrayList<>();
            for (int neighbor : graph[src]) {
                List<List<Integer>> res = f1(neighbor, graph);
                for (List<Integer> path : res) {
                    path.add(0, src);  // Insert src at the beginning
                    allPaths.add(path);
                }
            }
            return allPaths;
        }
    }
}