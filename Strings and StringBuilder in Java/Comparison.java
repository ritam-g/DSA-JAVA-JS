public class Comparison {
    public static void main(String[] args) {

        // STEP 1: Using string literals → goes to String Pool
        String name = "ritam";      // "ritam" created in String Pool (if not already there)
        String serName = "ritam";  // Same "ritam" → Java reuses the same object!

        // So both name and serName point to SAME object
        System.out.println(name == serName); // true (because same reference )

        // STEP 2: Using 'new' keyword → creates object in NORMAL HEAP (outside pool)
        String a = new String("rohit"); // 1. "rohit" literal goes to pool
                                        // 2. BUT 'new' makes a NEW copy in normal heap
        String b = new String("rohit"); // Again: "rohit" already in pool, but 'new' makes ANOTHER new copy!

        // So a and b are TWO DIFFERENT objects even if text is same
        System.out.println(a == b); // false (different objects in memory)

        System.out.println(a.charAt(0));
    }
}