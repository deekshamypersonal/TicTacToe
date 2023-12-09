package model;

public class Pair<T,U> {
    T first;
    U second;

    // constructor for assigning values
    Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    // function which returns a pair
    Pair values() { return new Pair(first, second); }

    // printing the pair class
    @Override public String toString()
    {
        return first + "," + second;
    }
}
