package chapter16;
//ArrayStack class
//
// CONSTRUCTION: with no initializer
 //
 // ******************PUBLIC OPERATIONS*********************
 // void push( x ) --> Insert x
 // void pop( ) --> Remove most recently inserted item
 // AnyType top( ) --> Return most recently inserted item
 // AnyType topAndPop( ) --> Return and remove most recent item
 // boolean isEmpty( ) --> Return true if empty; else false
 // void makeEmpty( ) --> Remove all items
 // ******************ERRORS********************************
 // top, pop, or topAndPop on empty stack

public class ArrayStack<AnyType> implements Stack<AnyType>  {
	private AnyType [] theArray;
	private int  topOfStack;
	private static final int DEFAULT_CAPACITY =10;
	
	public ArrayStack() {
		theArray = (AnyType[]) new Object[DEFAULT_CAPACITY];
		topOfStack = -1;
	}
	/**
	 * Test if stack is logically empty 
	 * @return true if empty , false otherwise
	 */
	public boolean isEmpty()
	{
		return topOfStack == -1;
	}
	/**
	 * make the stack logically empty
	 */
	public void makeEmpty()
	{
		topOfStack = -1;
	}
	/**
	 * Insert a new item into the stack
	 * @param x to insert the item
	 */
	public AnyType push(AnyType x)
	{
		if(topOfStack + 1== theArray.length)
			doubleArray();
		theArray[++topOfStack] = x;
		
	}
	/**
	 * Get the most recently inserted item
	 * Does not alter the stack
	 * @return the most recently inserted item in the stack
	 * @throws UnderFlowException if the stack is empty
	 */
	public AnyType top()
	{
		if(isEmpty())
			throw new UnderflowException("ArrayStack top");
		return theArray[topOfStack];
	}
	/**
	 * Remove the most recently inserted item from the stack
	 * @throws UnderFlowException if stack is empty. 
	 */
	public AnyType pop()
	{
		if(isEmpty())
			throw new UnderflowException("ArrayStack pop");
		topOfStack--;
	}
	public AnyType topAndPop()
	{
		if(isEmpty())
			throw new UnderflowException("ArrayStack topAndPop");
		return theArray[topOfStack--];
	}
	
	private void doubleArray()
	{
		
	}
	
	
}
