package Trees;

public class TrieNode {
    public TrieNode [] children = new TrieNode[256];
    public static TrieNode root;
    boolean terminal;
    TrieNode(){
        for(int i=0;i<256;i++){
            children[i] = null;
        }
        terminal = false;
    }
    public boolean insert(String str){
        int length = str.length();
        int level, index;
        TrieNode crawler = this.root;
        for(level=0;level<length;level++){
            index = str.charAt(level) - 'a';
            if(this.children[index]==null)
                this.children[index] = new TrieNode();
            crawler = crawler.children[index];
        }
        if(crawler.terminal==true) return false;
        crawler.terminal = true;
        return true;
    }

}
