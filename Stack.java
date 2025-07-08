public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    /**
     * Compares this stack to another by occupancy(size)
     * 
     * @param other the other Stack to compare
     * @return a negative, zero, or positive integer depending on size difference
     */


    @Override
    public int compareTo(Stack other) {
        return this.getOccupancy() - other.getOccupancy();
    } // method compareTo


    /**
     * Returns (without removing) the top element of stack
     * 
     * @return the top element, or null if the stack is empty
     */


    @Override
    public String peek() {
        return this.getOccupancy() > 0 ? this.getElement(0) : null;
    } // method peek


    /**
     * Removes and returns the top element of stack
     * Pops from index 0 (front)
     * 
     * @return the popped string, or null if the stack is empty
     */


    @Override
    public String pop() {

        // Remove from the front
        return this.remove(0);

    } // method pop


    /**
     * Returns a string representation of the stack
     * Shows top element first, and bottom last
     */



    @Override
    public String toString() {

        String result = "Stack top -> [ ";
        for (int i = 0; i < this.getOccupancy(); i++) {
            result += this.underlying[i];
            if (i < this.getOccupancy() - 1) {
                result += ", ";
            }

        }
        result += " ]";
        return result;

    } // method toString


    /**
     * Pushes an element onto the top of stack
     * Inserts at index 0 (front), shifting to the right
     */


    @Override
    public void push(String e) {
       this.add(0, e); // insert at front

    } // method push


} // class Stack