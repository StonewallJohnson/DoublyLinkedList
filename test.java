public class test {
    
    public static void main(String[] args){
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<Integer>();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 234532, 1235, 34564, 56};


        for(int num : numbers){
            System.out.println("Adding: " + num);
            myList.add(num); 
            System.out.println(myList.toString());
            System.out.println("Size: " + myList.size());
        }

        System.out.println();
        
        for(int num : numbers){
            System.out.println("Getting: " + num);
             System.out.println(myList.get(num));
        }

        System.out.println();

        for(int num: numbers){
            System.out.println("Removing: " + num);
            myList.remove(num);
            System.out.println(myList.toString());
            System.out.println("Size: " + myList.size());
        }

        System.out.println();

        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.remove(5);
        System.out.println(myList.toString());
        System.out.println("Size: " + myList.size());
        myList.addFront(10);
        System.out.println(myList.toString());
        System.out.println("Size: " + myList.size());
        myList.removeFront();
        System.out.println(myList.toString());
        System.out.println("Size: " + myList.size());
        myList.empty();
        System.out.println(myList.toString());
        System.out.println("Size: " + myList.size());
        myList.addFront(10);
        myList.add(20);
        System.out.println(myList.toString());
        System.out.println("Size: " + myList.size());
        
    }
}
