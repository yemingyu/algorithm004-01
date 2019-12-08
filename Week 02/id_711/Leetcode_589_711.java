package Week2;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_589 {
    public static void main(String[] args) {
        List<Node> list = new LinkedList<>();
        list.add(new Node(5,null));
        list.add(new Node(6,null));
        Node l1 = new Node(3,list);
        List<Node> list1 = new LinkedList<>();
        list1.add(l1);
        list1.add(new Node(2,null));
        list1.add(new Node(4,null));
        Node root = new Node(1,list1);

        System.out.println(Arrays.toString(preorder(root).toArray()));
    }

    /**
     * 简单递归
     * 执行用时 :1 ms, 在所有 java 提交中击败了100.00%的用户
     * 内存消耗 :45.8 MB, 在所有 java 提交中击败了98.07%的用户
     * @param root
     * @return
     */
    private static List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        bl(list,root);
        return list;
    }

    private static void bl(List<Integer> list, Node root) {
        if (root == null)
            return;
        list.add(root.val);
        if (root.children != null) {
            for (Node node : root.children) {
                bl(list,node);
            }
        }
    }
}
