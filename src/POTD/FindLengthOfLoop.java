package POTD;

import Trees.Node;

public class FindLengthOfLoop {
    static int countNodesinLoop(Node head)
    {
        //Add your code here

        Node s=head,f=head;
        if(head==null)
            return 0;
        while(f!=null &&f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)
            {
                int c=1;
                s=f.next;
                while(s!=f)
                {
                    c++;
                    s=s.next;
                }
                return c;
            }
        }
        return 0;
    }
}
