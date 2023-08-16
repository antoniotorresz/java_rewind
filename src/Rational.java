import java.util.Arrays;
import java.util.Collections;

public class Rational implements Comparable{
    private int n, d;

    
    public int getN() {
        return n;
    }


    public void setN(int n) {
        this.n = n;
    }


    public int getD() {
        return d;
    }


    public void setD(int d) {
        this.d = d;
    }

    
    public Rational(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public Rational(){
        this.n = 0;
        this.d = 1;
    }

    

    @Override
    public String toString() {
        return this.n + "/" + this.d;
    }

    public int compareTo(Object o)
    {
        Rational r;
        r = (Rational) o;
        if (r.getValue() > this.getValue()) {
            return 1;
        }else if (r.getValue() < this.getValue()) {
            return -1;
        }
        return 0;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + n;
        result = prime * result + d;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rational other = (Rational) obj;
        if (n != other.n)
            return false;
        if (d != other.d)
            return false;
        return true;
    }

    public double getValue(){
        return (double)this.n / (double)this.d;
    }

    public static void main(String[] args) {
        final int MAX_NUMBERS = 10;
        Rational [] arr = new Rational[MAX_NUMBERS];

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Rational((int)(Math.random() * 21 + 1), (int)(Math.random() * 21 + 1));
        }

        System.out.println("Not ordered list: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Ordered list");
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
