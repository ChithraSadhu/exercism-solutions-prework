import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class Music<T>{
    T musicId;
    Music<T> next;
    Music(T musicId){
        this.musicId = musicId;
        this.next = null;
    }
}
class SimpleLinkedList<T> {

    private Music<T> head;
    private int size;

    SimpleLinkedList() {
        this.head = null;

        this.size = 0;
    }

    SimpleLinkedList(T[] values) {
        for(T each : values ){
            this.push(each);
        }
    }

    void push(T value) {
        Music<T> music = new Music<>(value);
        if( this.head == null){
            this.head = music;
        }
        else{
            Music<T> temp = this.head;
            music.next = head;
            this.head = music;

        }
        this.size++;
    }

    T pop() {
        if( this.head == null ){
            throw new NoSuchElementException();
        }

        Music<T> temp = head;
        head = this.head.next;
        this.size--;
        return temp.musicId;
    }

    void reverse() {
        Music<T> prev = null;
        Music<T> current = head;
        Music<T> nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    @SuppressWarnings("unchecked")
    T[] asArray(Class<T> clazz) {
        Music<T> itr = head;
        T[] listArr = (T[]) Array.newInstance(clazz, this.size);;
        int idx = 0;

        while( itr != null){
            listArr[idx++] = itr.musicId;
            itr = itr.next;
        }
        return listArr;
    }

    int size() {
        return this.size;
    }
}
