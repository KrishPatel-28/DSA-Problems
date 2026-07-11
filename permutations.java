public class permutations {
    public static void main(String []args){
        solution("","abc");
    }
    static void solution(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());

            solution(f+ch+l, up.substring(1));
        }
    }
}
