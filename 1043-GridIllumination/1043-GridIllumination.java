// Last updated: 8/12/2026, 11:59:09 AM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {

        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> diag1 = new HashMap<>();
        Map<Integer, Integer> diag2 = new HashMap<>();

        Set<Long> lampSet = new HashSet<>();

        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];

            long key = ((long) r << 32) | c;

            if (lampSet.contains(key))
                continue;

            lampSet.add(key);

            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
            diag1.put(r - c, diag1.getOrDefault(r - c, 0) + 1);
            diag2.put(r + c, diag2.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[][] dirs = {
            {0,0},{0,1},{0,-1},{1,0},{-1,0},
            {1,1},{1,-1},{-1,1},{-1,-1}
        };

        for (int i = 0; i < queries.length; i++) {

            int r = queries[i][0];
            int c = queries[i][1];

            if (rows.containsKey(r) ||
                cols.containsKey(c) ||
                diag1.containsKey(r - c) ||
                diag2.containsKey(r + c)) {
                ans[i] = 1;
            }

            for (int[] d : dirs) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;

                long key = ((long) nr << 32) | nc;

                if (!lampSet.contains(key))
                    continue;

                lampSet.remove(key);

                rows.put(nr, rows.get(nr) - 1);
                if (rows.get(nr) == 0) rows.remove(nr);

                cols.put(nc, cols.get(nc) - 1);
                if (cols.get(nc) == 0) cols.remove(nc);

                diag1.put(nr - nc, diag1.get(nr - nc) - 1);
                if (diag1.get(nr - nc) == 0) diag1.remove(nr - nc);

                diag2.put(nr + nc, diag2.get(nr + nc) - 1);
                if (diag2.get(nr + nc) == 0) diag2.remove(nr + nc);
            }
        }

        return ans;
    }
}