public class problem_12{
    public static void main(String [] args){
        int num = 3749;
        System.out.println(solution2(num));
    }
    static String solution1(int num){
        String result = "";
        int flag = 0;
        while(num > 0){
            if(num >= 1000){
                flag = num / 1000;
                result += "M".repeat(flag);
                num = num - (1000*flag);
            } else if(num >= 900){
                result += "CM";
                num -= 900;
            } else if(num >= 500){
                flag = num / 500;
                result += "D".repeat(flag);
                num = num - (500*flag);
            } else if(num >= 400){
                result += "CD";
                num -= 400;
            } else if(num >= 100){
                flag = num / 100;
                result += "C".repeat(flag);
                num = num - (100*flag);
            } else if(num >= 90){
                result += "XC";
                num -= 90;
            } else if(num >= 50){
                flag = num / 50;
                result += "L".repeat(flag);
                num = num - (50*flag);
            } else if(num >= 40){
                result += "XL";
                num -= 40;
            } else if(num >= 10){
                flag = num / 10;
                result += "X".repeat(flag);
                num = num - (10*flag);
            } else if(num >= 9){
                result += "IX";
                num -= 9;
            } else if(num >= 5){
                flag = num / 5;
                result += "V".repeat(flag);
                num = num - (5*flag);
            } else if(num >= 4){
                result += "IV";
                num -= 4;
            } else{
                result += "I".repeat(num);
                num = num - (1000*num);
            }
        }
        return result;
    }
    static String solution2(int num) {
        String[] romanDict = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] numsDict = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder result = new StringBuilder();

        for(int i=0; i<numsDict.length; i++){
            while(num >= numsDict[i]){
                result.append(romanDict[i]);
                num -= numsDict[i];
            }
        }
        return result.toString();
    }
}