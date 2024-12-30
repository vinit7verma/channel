package com.research.problems;

import java.util.ArrayList;
import java.util.List;

public class ProjectsToCompany {
    List<List<Integer>> g = new ArrayList<>();
    int N = 6;
    int A[] = new int[]{0, 1, 1, 3, 0};
    int B[] = new int[]{1, 2, 3, 4, 5};
    int H[] = new int[]{2, 4};

    int buildt() {
        for (int i = 0; i < N; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < A.length; i++) {
            build(g, A[i], B[i]);
            //build(i,B[i]);
        }
        System.out.println(g);
        int ans = -1;
        for (int i = 0; i < H.length; i++) {
            int temp = H[i];
            boolean vis[] = new boolean[N];
            List<Integer> temp1 = g.get(temp);
            for (int x : temp1) {
                if (vis[x] == false)
                    ans = ans + dfs(x, vis);
            }

        }
        return ans;
    }

    int dfs(int src, boolean vis[]) {
        int ans = 0;
        List<Integer> temp = g.get(src);
        vis[src] = true;
        for (int i = 0; i < temp.size(); i++) {
            int f = temp.get(i);
            if (vis[f] == false) {
                vis[f] = true;
                ans = ans + dfs(f, vis) + 1;
            }
        }
        return ans;
    }


    static void build(List<List<Integer>> g, int u, int v) {
        g.get(u).add(v);
        g.get(v).add(u);
    }

    public static void main(String[] args) {
        new ProjectsToCompany().buildt();
    }
}
