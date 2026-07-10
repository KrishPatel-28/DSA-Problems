public class problem_14 {
    public static void main(String[] var0) {
        String[] var1 = new String[] { "flower", "flow", "flight" };
        System.out.println(solution(var1));
    }

    static String solution(String[] var0) {
        if (var0 != null && var0.length != 0 && !var0[0].equals("")) {
            String var1 = var0[0];

            for (int var2 = 1; var2 < var0.length; ++var2) {
                while (!var0[var2].startsWith(var1)) {
                    var1 = var1.substring(0, var1.length() - 1);
                }
                if (var1.isEmpty()) {
                    return "";
                }
            }
            return var1;
        } else {
            return "";
        }
    }
}