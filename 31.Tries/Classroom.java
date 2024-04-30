public class Classroom {
    static class Node {
        Node childern[] = new Node[26];
        boolean endOfWord = false;

        Node() {
            for (var i  : childern) {
                i = null;
            }

        }

    }

    // Childern Containg the array for the all alphabets for the char - char it
    // gives return to identify the given the char is present or not;
    // if present no need to add into chidern array.
    // Else we jave to add new Node for that char.

    public static void insert(String word) // O(L)
    {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) // Node Not present that why the Add new node
            {
                curr.childern[idx] = new Node();
                
            }

            curr = curr.childern[idx]; // taverse to nxt node.
            System.out.print(word.charAt(level));
        }

        curr.endOfWord = true;

        // Printinng
        System.out.println();
        System.out.println("Word inserted");

    }

    public static boolean search(String key)
    {
        Node curr = root;
        for(int level =0; level<key.length();level++)
        {
            int idx = key.charAt(level) - 'a';
            if(curr.childern[idx] == null)
            {
                return false;
            }
            
            curr = curr.childern[idx];
        }

        return curr.endOfWord == true;

    }

    public static Node root = new Node();
    public static void main(String[] args) {
        String word[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
         System.out.println(search("thor"));
    }
   

}