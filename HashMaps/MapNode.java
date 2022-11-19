package HashMaps;

public class MapNode<GenericKey, GenericValue> {
    GenericKey key;
    GenericValue value;
    MapNode<GenericKey, GenericValue> next;

    public MapNode(GenericKey key, GenericValue value){
        this.key=key;
        this.value=value;
    }
}
