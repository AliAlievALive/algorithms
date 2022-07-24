package tr.learn;

public class Lesson96_PrefixTree_Trie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("he");
        trie.add("she");
        trie.add("his");
        trie.add("hers");
        System.out.println(trie.find("he"));
        System.out.println(trie.find("her"));
        System.out.println(trie.find("hers"));
        System.out.println();
        System.out.println(trie.erase("he"));
        System.out.println(trie.erase("her"));
        System.out.println();
        System.out.println(trie.find("he"));
        System.out.println(trie.find("her"));
        System.out.println(trie.find("hers"));
    }

    private static class Trie {
        static final int alphabetSize = 26;

        public Trie() {
            this.root = null;
        }

        Node root;

        public void add(String word) {
            add(root, word, 0);
        }

        public boolean find(String word) {
            return find(root, word, 0);
        }

        public boolean erase(String word) {
            return erase(root, word, 0);
        }

        private void add(Node curr, String word, int ind) {
            if (curr == null) {
                curr = new Node();
            }

            if (word.length() == ind) {
                curr.wordEnd = true;
                return;
            }
            add(curr.alphabet[word.charAt(ind) - 'a'], word, ind + 1);
        }

        private boolean find(Node curr, String word, int ind) {
            if (curr == null) {
                return false;
            }

            if (word.length() == ind) {
                return curr.wordEnd;
            }
            return find(curr.alphabet[word.charAt(ind) - 'a'], word, ind + 1);
        }

        private boolean erase(Node curr, String word, int ind) {
            if (curr == null) {
                return false;
            }

            if (word.length() == ind) {
                boolean temp = curr.wordEnd;
                curr.wordEnd = false;
                return temp;
            }
            return erase(curr.alphabet[word.charAt(ind) - 'a'], word, ind + 1);
        }

        private static class Node {
            Node[] alphabet;
            boolean wordEnd;

            public Node() {
                this.alphabet = new Node[26];
                this.wordEnd = false;
            }
        }
    }
}
