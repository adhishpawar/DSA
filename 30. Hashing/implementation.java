import java.util.*;
public class implementation {
    static class HashMap<K,V>     //generic data types
    {
        private class Node
        {
            K key;
            V value;

            public Node(K key, V value)
            {
                this.key= key;
                this.value=value;
            }
        }

        private int n; //n
        private int N; //N
        private LinkedList<Node>buckets[];   //N= bunkets.length

        @SuppressWarnings("unchecked")    //for define types of LL

        public HashMap()
        {
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++)
            {
                this.buckets[i]= new LinkedList<>();
            }
        }

        private int hashFunction(K key)
        {

            int hc =key.hashCode(); //inBuilt function for to cover the key into somthing called code
            return (Math.abs(hc)) % N;
        }

        private int SearchInLL(K key, int bi)
        {
            LinkedList<Node> ll =buckets[bi];
            int di=0;

            for(int i=0; i<ll.size(); i++)
            {
                Node node = ll.get(i);
                if(node.key == key)
                {
                    return di;
                }
                di++;
            }
            return -1;

        }

        private void rehash()
        {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N= 2*N;
            for(int i=0; i<buckets.length;i++)
            {
                buckets[i]= new LinkedList<>();
            } 

            //nodes --> add in buckets;
            for 
        }

        public void put(K key, V value)
        {
            int bi = hashFunction(key);
            int di= SearchInLL(key,bi);  //valid index or  -1 for no key present
            
            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else
            {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda  =(double) n/N;
            if(lambda>2.0)
            {
                rehash();
            }




        }


    }

}
