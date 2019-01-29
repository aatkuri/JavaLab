package linkedlists;


/**
 * @author Ashok Atkuri
 * @param <E>
 */
public class Node<E>
{
   E data;
   Node<E> nextNode;
   
    /**
     *
     * @param data
     */
    public Node(E data)
   {
      this.data = data;
   }
   
   @Override
   public String toString()
   {
      return data.toString();
   }
}
