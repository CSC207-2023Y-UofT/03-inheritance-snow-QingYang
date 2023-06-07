/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class CrossbodyBag extends Bag
        {
            private int numberOfStraps;
            public int getNumberOfStraps()
            {
                return numberOfStraps;
            }
            CrossbodyBag(String colour, int capacity, int straps)
            {
                super(colour, capacity);
                this.numberOfStraps = straps;
            }
            @Override
            public void enhance() {
                super.increaseCapacity(2);
            }
            @Override
            public String toString()
            {
                return super.getColor() + " Crossbody Bag with " +Integer.toString(this.numberOfStraps)+ " straps (" + super.getNumberOfContents() + " / " +
                        super.getCapacity() + ")";
            }
        }
