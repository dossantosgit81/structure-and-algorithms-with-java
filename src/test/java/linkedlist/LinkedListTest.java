package linkedlist;

import org.example.linkedlist.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void shouldInsertElementsWithSuccess(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        Assert.assertEquals(5, linkedList.size());
    }
}
