package heap;

public class Heap {
Node[]heapArray;
int maxSize;
int current;

public Heap(int size) {
	this.maxSize=size;
	current=0;
	heapArray= new Node[size]; // actually creating the heap array 
}
public int getSize() {
	return current;
}
public boolean isEmpty() {
	return(current==0);
}
public boolean insert (int key) {
	if(current==maxSize) {
		return false;
	}
	else {
		Node newNode= new Node(key);
		heapArray[current]=newNode;
trickleUp(current);
		current++;
		return true;
	}
}

public void trickleUp(int id) {
	int parentId=(id-1)/2;
	Node nodeToInsert= heapArray[id];
	while(id>0&&heapArray[parentId].getKey()<nodeToInsert.getKey()) {
		heapArray[id]= heapArray[parentId]; // Moving parent upward
		id=parentId;
		parentId=(parentId-1)/2;
		
		
	}
	heapArray[id]=nodeToInsert;
	
	
}

public Node remove() {
	Node root= heapArray[0];
current--; // decrementing current to get last inserted element , it currently refers to the next position to insert an element
heapArray[0]=heapArray[current];
trickleDown(0);
return root;
}

public void trickleDown(int id) {
	
	int largerChildId;
	Node top = heapArray[id];
	// check whether id has at least  one child
	while(id<current/2) {
		int leftChildId= current*2+1;
		int rightChildId=leftChildId+1;
	// check whether whether  we have reached the end & find find greater child
		if(rightChildId<current&&heapArray[leftChildId].getKey()<heapArray[rightChildId].getKey()) {
			largerChildId=rightChildId;
		}
		else {
			largerChildId=leftChildId;
		}
		if(top.getKey()>=heapArray[largerChildId].getKey()) {
			break;
		}
	heapArray[id]=heapArray[largerChildId]; // swap the larger value
	id=largerChildId; // swap the id & go down
	
	
	}
	heapArray[id]= top; // assigning the top to its right positon
	
	
}
public void display() {
    System.out.println("Heap Array: ");
    for(int m = 0; m < current; m++) {
        if(heapArray[m] != null) {
            System.out.print( heapArray[m].getKey() + " ");
        }
        System.out.println();
        
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0; // current item
        
        String dots = "...............................";
        System.out.println(dots+dots);
        while(current > 0) {
            if(column == 0) {
                for(int k = 0; k < nBlanks; k++) {
                    System.out.print(" ");
                }
            }
            System.out.print(heapArray[j].getKey());
            j++;
            if(j == current) {
                break;
            }
            
            column++;
            // end of row
            if(column == itemsPerRow) {
                nBlanks = nBlanks/2; // half the blanks
                itemsPerRow = itemsPerRow * 2;     // twice the items
                column = 0;
                System.out.println();
            } else {
                for(int k=0; k<nBlanks*2; k++) {
                    System.out.print(" ");
                }
            }
                
        }
        System.out.println("\n"+dots+dots);
    }
    
    
}
}
