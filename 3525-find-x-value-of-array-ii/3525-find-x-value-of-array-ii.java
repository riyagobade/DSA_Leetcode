class Solution {
    static class Node {
        int prod;
        int[] pref;
        Node(int k) {
            pref = new int[k];
        }
    }
    int n, k;
    Node[] tree;
    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.n = nums.length;
        this.k = k;
        tree = new Node[4 * n];
        build(1, 0, n - 1, nums);
        int[] result = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int index = queries[q][0];
            int value = queries[q][1];
            int start = queries[q][2];
            int x = queries[q][3];
            update(1, 0, n - 1, index, value);
            Node res = query(1, 0, n - 1, start, n - 1);
            result[q] = res.pref[x];
        }
        return result;
    }
    private void build(int node, int left, int right, int[] nums) {
        if (left == right) {
            tree[node] = new Node(k);
            int value = nums[left] % k;
            tree[node].prod = value;
            tree[node].pref[value] = 1;
            return;
        }
        int mid = left + (right - left) / 2;
        build(node * 2, left, mid, nums);
        build(node * 2 + 1, mid + 1, right, nums);
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }
    private Node merge(Node a, Node b) {
        Node res = new Node(k);
        res.prod = (int) ((long) a.prod * b.prod % k);
        for (int r = 0; r < k; r++) {
            res.pref[r] += a.pref[r];
        }
        for (int r = 0; r < k; r++) {
            if (b.pref[r] == 0) {
                continue;
            }
            int newResidue = (int) ((long) a.prod * r % k);
            res.pref[newResidue] += b.pref[r];
        }
        return res;
    }
    private void update(int node, int left, int right,
                        int index, int value) {
        if (left == right) {
            tree[node] = new Node(k);
            value %= k;
            tree[node].prod = value;
            tree[node].pref[value] = 1;
            return;
        }
        int mid = left + (right - left) / 2;
        if (index <= mid) {
            update(node * 2, left, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, right, index, value);
        }
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }
    private Node query(int node, int left, int right,
                       int ql, int qr) {
        if (ql <= left && right <= qr) {
            return tree[node];
        }
        int mid = left + (right - left) / 2;
        if (qr <= mid) {
            return query(node * 2, left, mid, ql, qr);
        }
        if (ql > mid) {
            return query(node * 2 + 1, mid + 1, right, ql, qr);
        }
        Node a = query(node * 2, left, mid, ql, qr);
        Node b = query(node * 2 + 1, mid + 1, right, ql, qr);
        return merge(a, b);
    }
}