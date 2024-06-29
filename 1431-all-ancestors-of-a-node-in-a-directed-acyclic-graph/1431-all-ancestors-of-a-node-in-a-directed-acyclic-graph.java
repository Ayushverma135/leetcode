class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<Integer>[] adjacencyList = new ArrayList[n];
        List<List<Integer>> ancestors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
            ancestors.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjacencyList[from].add(to);
        }
        for (int i = 0; i < n; i++) {
            findAncestorsDFS(i, adjacencyList, i, ancestors);
        }

        return ancestors;
    }
    private void findAncestorsDFS(
        int ancestor,
        List<Integer>[] adjacencyList,
        int currentNode,
        List<List<Integer>> ancestors
    ) {
        for (int childNode : adjacencyList[currentNode]) {
            if (
                ancestors.get(childNode).isEmpty() ||
                ancestors
                        .get(childNode)
                        .get(ancestors.get(childNode).size() - 1) !=
                    ancestor
            ) {
                ancestors.get(childNode).add(ancestor);
                findAncestorsDFS(ancestor, adjacencyList, childNode, ancestors);
            }
        }
    }
}