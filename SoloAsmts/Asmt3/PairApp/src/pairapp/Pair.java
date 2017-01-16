package pairapp;

import java.io.Serializable;

public class Pair<E extends Cloneable & Serializable>
implements Cloneable, Serializable {
    
    public E getFirst() {
        return first;
    }
    
    public E getSecond() {
        return second;
    }
    
    public void setFirst(E f) {
        this.first = f;
    }
    
    public void setSecond(E s) {
        this.second = s;
    }
    
  @Override
    public Pair<E> clone() {
        try {
            return (Pair<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
  
    private E first;
    private E second;
    
}
