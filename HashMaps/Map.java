package HashMaps;
import java.util.ArrayList;

public class Map<K,V> {

    ArrayList<MapNode<K,V>> buckets;
    int count;
    int numOfBuckets;

    public Map(){
        buckets=new ArrayList<>();
        numOfBuckets=20;
        for(int index=0; index<numOfBuckets; index++){
            buckets.add(null);
        }
    }

    private int getHashIndex(K key){
        int hashCode = key.hashCode(); //InBuilt Hash Code function, present in object class.
        int hashIndex = hashCode % numOfBuckets; //Compressing the generated hash function.
        return hashIndex;
    }
    public void insert(K key, V value){
        int hashIndex=getHashIndex(key);
        MapNode<K, V> head=buckets.get(hashIndex);
        while(head != null){
            if (head.key.equals(key)){
                //Element is already there, just update the value.
                head.value=value;
                return;
            }
            head=head.next;
        }

        //Element is not there just inserted at 0th position of the linked list and update the head in the arraylist.
        head= buckets.get(hashIndex);
        MapNode<K,V> insertNode= new MapNode<>(key, value);//Making new node to insert in linked list.
        insertNode.next=head;//insert node pointing to the head;
        buckets.set(hashIndex, insertNode);//setting the new head at the hash index.
        count++;

        double loadFactor = (1.0*count)/numOfBuckets;
        if (loadFactor > 0.7){
            reHash();
        }
    }

    public int getSize(){
        return count;
    }//NUmber of elements in the hashMap.

    public V getValue(K key){
        int hashIndex=getHashIndex(key);
        MapNode<K,V> head= buckets.get(hashIndex);
        while (head != null){
            if (head.key.equals(key)) return head.value;
            head=head.next;
        }
        return null;
    }

    public V removeKeyValue(K key){
        int hashIndex=getHashIndex(key);
        MapNode<K,V> head= buckets.get(hashIndex);
        MapNode<K,V> prevNode=null;
        while(head != null){
            if (head.key.equals(key)){
                V value= head.value;
                if (prevNode != null) prevNode.next=head.next;
                else{
                    //When the first node is to be removed.
                    buckets.set(hashIndex, head.next);
                }
                return value;
            }

            prevNode=head;
            head=head.next;
        }
        return null;
    }

    private void reHash(){
        ArrayList<MapNode<K,V>> oldBuckets=buckets;
        buckets=new ArrayList<>();

        //Reinitializing the variables.
        count = 0;
        numOfBuckets *= 2;

        //Inserting null in all the place of the arraylist.
        for(int index=0; index<numOfBuckets; index++) buckets.add(null);

        //Inserting the elements;
        for(int index=0; index<oldBuckets.size(); index++){
            MapNode<K,V> head=oldBuckets.get(index);
            while (head != null){
                insert(head.key, head.value); //Inserting in buckets as default.
            }
        }
    }
}
