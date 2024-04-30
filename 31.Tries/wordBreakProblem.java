public class wordBreakProblem {

    static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                childern[i] = null;
            }
        }
    }

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                curr.childern[idx] = new Node();
            }

            curr = curr.childern[idx];
            // System.out.println(word.charAt(level));
        }

        curr.eow = true;
        System.out.println("Word Inserted");
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                return false;
            }

            curr = curr.childern[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key) {  //O(lenth of KEy L)
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static Node root = new Node();

    public static void main(String[] args) {

        String word[] = { "adhish", "three", "thee", "there", "adhishree", "is", "best" };

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        // System.out.println(search("adhish"));
        String key = "adhishisbest";
        System.out.println(wordBreak(key));

    }
}