import java.util.BitSet;

public class _13_BitSet {
    public static void main(String[] args) {
        BitSet b1 = new BitSet();
        b1.set(0);
        b1.set(2);
        b1.set(4);
        b1.set(6);
        b1.set(8);

        System.out.println(b1);
        BitSet b2 = new BitSet();
        b2.set(0);
        b2.set(1);
        b2.set(2);
        b2.set(3);
        b2.set(4);
        b2.set(5);
        b2.set(6);
        b2.set(7);
        b2.set(8);

        //BitSet b = new BitSet();
        //b.set(0);
        //b.set(1);
        //b.set(2);
        //b.set(3);
        //b.set(4);
        //b.set(5);
        ////b.set(6);
        //b.set(7);
        //b.set(8);

        System.out.println("\nb\n");
        System.out.println(b2);
        System.out.println();

        // imp      it gives all the bits that are set to true ( Even numbers )
        b1.and(b2);
        System.out.println("AND   ->  " + b1);

        // imp     
        //b1.or(b2);
        //System.out.println("OR    ->  " + b1);

        // imp    to get odd numbers
        b1.xor(b2);
        System.out.println("XOR   ->  " + b1);

        //b1.cardinality();
        System.out.println("Cardinality   ->  " + b1.cardinality());

        System.out.println("Length   ->  " + b1.length());
        System.out.println();
        b1.flip(0, b2.length());
        System.out.println("flip   ->  " + b1);
        System.out.println("----------------------------------------------");

        // get()
        // it returns the value of the bit with the specified index
        System.out.println(b2.get(6));

        // set()
        // it sets the bit at the specified index to true
        b2.set(9);
        System.out.println(b2);

        // clear()
        // it sets the bit at the specified index to false
        //b2.clear(9);
        //System.out.println(b2);

        // flip()
        // it flips the bit at the specified index
        b2.flip(9);
        System.out.println(b2);
        System.out.println();

        // flip(fromIndex, toIndex)
        // and()
        // it performs a logical AND between the two BitSets
        b2.and(b1);
        System.out.println(b2);
        System.out.println();

        // or()
        // it performs a logical OR between the two BitSets
        b2.or(b1);
        System.out.println(b2);
        System.out.println();

        // xor()
        // it performs a logical XOR between the two BitSets
        b2.xor(b1);
        System.out.println("XOR\n" + b2);
        System.out.println();

        // cardinality()
        // it returns the number of bits set to true in the BitSet
        System.out.println("Cardinality " + b2.cardinality());
        System.out.println();

        // length()
        // it returns the length of the BitSet
        System.out.print("length() ");
        System.out.println(b2.length());
        System.out.println();

        // isEmpty()
        // it returns true if the BitSet contains no bits set to true
        System.out.println(b2.isEmpty());
        System.out.println();

        // nextSetBit()
        // it returns the index of the next bit set to true starting from the specified index
        System.out.println(b2.nextSetBit(0));
        System.out.println();

        // nextClearBit()
        // it returns the index of the next bit set to false starting from the specified index
        System.out.println(b2.nextClearBit(0));
        System.out.println();

        // previousSetBit()
        // it returns the index of the previous bit set to true starting from the specified index
        System.out.println(b2.previousSetBit(0));
        System.out.println();

        // previousClearBit()
        // it returns the index of the previous bit set to false starting from the specified index
        System.out.println(b2.previousClearBit(0));
        System.out.println();

        // hashCode()
        // it returns the hash code value for the BitSet
        System.out.println(b2.hashCode());
        System.out.println();

        // equals()
        // it compares the specified Object with the BitSet for equality
        System.out.println(b2.equals(b1));
        System.out.println();

        // clone()
        // it returns a copy of the BitSet
        System.out.println(b2.clone());
        System.out.println();

        // toString()
        // it returns a string representation of the BitSet
        System.out.println(b2.toString());
        System.out.println();

        // toLongArray()
        // it returns a long array containing all the bits in the BitSet
        System.out.println(b2.toLongArray());
        System.out.println();

        // toByteArray()
        // it returns a byte array containing all the bits in the BitSet
        System.out.println(b2.toByteArray());
        System.out.println();

        // toIntStream()    
        // it returns an IntStream containing all the bits in the BitSet
        System.out.println(b2.stream());
        System.out.println();

        // toLongStream()
        // it returns a LongStream containing all the bits in the BitSet
        System.out.println(b2.stream());
        System.out.println();

        // toStream()
        // it returns a Stream containing all the bits in the BitSet
        System.out.println(b2.stream());
        System.out.println();

        // stream()
        // it returns a Stream containing all the bits in the BitSet
        System.out.println(b2.stream());
        System.out.println();

    }
}
