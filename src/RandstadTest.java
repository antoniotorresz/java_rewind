import java.util.ArrayList;
import java.util.Collections;

public class RandstadTest {
    private int nElements, nOperations;
    private int from, to, k;
    private static ArrayList<Integer> numbers = new ArrayList<>();

    public int getnElements() {
        return nElements;
    }

    public void setnElements(int nElements) {
        this.nElements = nElements;
    }

    public int getnOperations() {
        return nOperations;
    }

    public void setnOperations(int nOperations) {
        this.nOperations = nOperations;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public static ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public static void setNumbers(ArrayList<Integer> numbers) {
        RandstadTest.numbers = numbers;
    }

    public RandstadTest(int nElements, int nOperations) {// this is for initialize operation object
        this.nElements = nElements;
        this.nOperations = nOperations;
    }

    public RandstadTest(int from, int to, int k) {
        this.from = from;
        this.to = to;
        this.k = k;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nElements;
        result = prime * result + nOperations;
        result = prime * result + from;
        result = prime * result + to;
        result = prime * result + k;
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
        RandstadTest other = (RandstadTest) obj;
        if (nElements != other.nElements)
            return false;
        if (nOperations != other.nOperations)
            return false;
        if (from != other.from)
            return false;
        if (to != other.to)
            return false;
        if (k != other.k)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RandstadTest [nElements=" + nElements + ", nOperations=" + nOperations + ", from=" + from + ", to=" + to
                + ", k=" + k + "]";
    }

    private static void perfomSubAddition(RandstadTest r)
    {
        for(int i = r.from -1; i <= r.to -1; i++){
            numbers.set(i, numbers.get(i) + r.k);
        }
    }

    public static void main(String[] args) {

        //Perfom as many test as you need:
        //Base test:
        String input = """
                5 3
                1 2 100
                2 5 100
                3 4 100
                    """;

        // String input = """
        //         5 4
        //         1 2 100
        //         2 5 100
        //         3 4 100
        //         1 2 200
        //             """;
        String[] a = input.split("\n");
        ArrayList<RandstadTest> steps = new ArrayList<>();
        
        RandstadTest instructions = null;
        
        for (String l : input.split("\n")) {
            String[] line = l.split(" ");
            if (line.length == 2) {
                instructions = new RandstadTest(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            } else {
                steps.add(
                        new RandstadTest(Integer.parseInt(line[0]),
                                Integer.parseInt(line[1]),
                                Integer.parseInt(line[2])));
            }
        }
        
        
        for(int i = 0; i <= instructions.nElements - 1; i++)
        {
            numbers.add(0);
        }

        System.out.println("--- Instructions: " + instructions.toString());
        System.out.println("--- Steps: " + steps.toString());
        System.out.println("--- Initial list of " + numbers.size() + " elements: " + numbers.toString());
        System.out.println("Process: ");
        for(int i = 0; i <= instructions.nOperations - 1; i++)
        {
            perfomSubAddition(steps.get(i));
            System.out.println(numbers.toString());
        }

        System.out.println(Collections.max(numbers));
    }
}
