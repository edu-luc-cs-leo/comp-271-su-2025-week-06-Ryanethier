public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

    /**
     * Adds an element to the end of the queue
     * Uses inherited {@code add()} method to insert at back
     * 
     * @param e the element to insert
     */

    @Override
    public void add(String e) {
        // FIFO -> add to back
        super.add(e); // append to end of array
    }

    /**
     * Compares this queue to another by occupancy (size)
     * 
     * @param other the other Queue to compare
     * @return a negative, zero, or positive integer depending on size difference
     */


    @Override
    public int compareTo(Queue other) {
        return this.getOccupancy() - other.getOccupancy();
    } // method compareTo


    /**
     * Returns (without removing) the front element of queue
     * 
     * @return front element, or null if queue is empty
     */


    @Override
    public String peek() {

        return this.getOccupancy() > 0 ? this.getElement(0): null;

    } // method peek


    /**
     * Removes and returns front element of queue
     * 
     * @return the front element, or null if queue is empty
     */


    @Override
    public String pop() {

        // Remove from the front
        return this.remove(0);

    } // method pop


    /**
     * Returns string representation of the queue
     * Shows front element first, back element last
     */


    @Override
    public String toString() {

        String result = "Queue front -> [ ";
        for (int i = 0; i < this.getOccupancy(); i++) {
            result += this.underlying[i];
            if (i < this.getOccupancy() - 1) {
                result += ", ";
            }
        }

        result += " ] <- back";
        return result;

    } // method toString

} // class Queue