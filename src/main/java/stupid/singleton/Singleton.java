package stupid.singleton;

/**
 * Violation of Singleton basically decreases the flexibility and reusability
 * of the existing code, which deals with the object creation mechanism.
 *
 * It is an anti-pattern, where we define a class and its object in the same
 * script/file and export the object for reusability.
 *
 * This is pattern is not wrong, but using it everywhere inappropriately
 * is an symptom sick codebase.
 *
 */
class Singleton {
    private static Singleton instance;

    private int value;

    private Singleton() { }

    public static Singleton getInstance() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton();
            Singleton.instance.value = 0;
        }
        return Singleton.instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int incrementValueByOne() {
        return this.value += 1;
    }

    public static void main(String[] args) {

        Singleton myInstance1 = Singleton.getInstance();
        Singleton myInstance2 = Singleton.getInstance();

        System.out.println(myInstance1.getValue()); // SAIDA: 0
        System.out.println(myInstance2.getValue()); // SAIDA: 0

        myInstance1.incrementValueByOne(); // value = 1
        myInstance2.incrementValueByOne(); // value = 2

        System.out.println(myInstance1.getValue()); // SAIDA: 2
        System.out.println(myInstance2.getValue()); // SAIDA: 2

    }

}

