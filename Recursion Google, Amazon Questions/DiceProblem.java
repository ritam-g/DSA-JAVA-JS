public class DiceProblem {
    public static void main(String[] args) {
        combination("", 4);
    }
    
    public static void combination(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        
        for (int i = 1; i <= 6 && i <= target; i++) {
            combination(p + i, target - i);  // ← Fixed: p + i, not p + 1
        }
    }
}