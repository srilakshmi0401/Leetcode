// Last updated: 8/12/2026, 11:55:29 AM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // Step 1: Build graph
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u); // because undirected graph
        }

        // Step 2: BFS
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            if (node == destination) {
                return true;
            }

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return false;
    }
}