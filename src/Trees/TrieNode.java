package Trees;

public class TrieNode {
    public TrieNode [] children = new TrieNode[256];
    public static TrieNode root;
    public boolean terminal;
    public TrieNode(){
        for(int i=0;i<256;i++){
            children[i] = null;
        }
        terminal = false;
    }
    public boolean insert(String str){
        int length = str.length();
        int level, index;
        if(this.root==null) {
            this.root = new TrieNode();
        }
        TrieNode crawler = this.root;
        for(level=0;level<length;level++){
            index = str.charAt(level);
            if(crawler.children[index]==null){
                crawler.children[index] = new TrieNode();
            }
            crawler = crawler.children[index];
        }
        if(crawler.terminal==true) return false;
        crawler.terminal = true;
        return true;
    }

}
