class Node
{
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val) {val = _val;}
    public Node(int _val, List<Node> _children) {val = _val;children = _children;}
}
void main()
{
    System.out.println(preorderRecursion(
            new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5), new Node(6)))
                    , new Node(2), new Node(4)))));
    System.out.println(preorder(
            new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5), new Node(6)))
                    , new Node(2), new Node(4)))));
}
// with Recursion
List<Integer> preorderRecursion(Node root)
{
    List<Integer> result = new ArrayList<>();
    traverse(root, result);
    return result;
}
void traverse(Node node, List<Integer> result)
{
    if (node == null) return;
    result.add(node.val);
    if (node.children != null)
        for (Node child : node.children) traverse(child, result);
}

// wit Deque (Faster than Stack)
List<Integer> preorder(Node root)
{
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;
    Deque<Node> stack = new ArrayDeque<>();

    stack.push(root);
    while (!stack.isEmpty())
    {
        Node node = stack.pop();
        result.add(node.val);
        if(node.children == null) continue;
        for (int i = node.children.size() - 1; i >= 0; i--) stack.push(node.children.get(i));
    }
    return result;
}