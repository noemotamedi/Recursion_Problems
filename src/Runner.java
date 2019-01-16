public class Runner {

    public int triangle(int rows) {
        if(rows==0){
            return 0;
        }
        return rows+triangle(rows-1);
    }


    public int fibonacci(int n) {
        if(n==0){return 0;}
        if(n==1){return 1;}
        if(n==1){return 1;}
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public int countHi(String str) {
        if(str.length()<2){return 0;}
        if(str.substring(0,2).equals("hi")){return 1+countHi(str.substring(1));}
        return countHi(str.substring(1));
    }


    public int sumDigits(int n) {
        if(n<10){return n;}
        return n%10+sumDigits(n/10);
    }


    public String allStar(String str) {
        if(str.length()==0){return "";}
        if(str.length()==1){return str;}
        return str.substring(0,1)+"*"+allStar(str.substring(1));
    }


    public int countAbc(String str) {
        if(str.length()<3){return 0;}
        if(str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba")){return 1+countAbc(str.substring(1));}
        return countAbc(str.substring(1));
    }


    public int count11(String str) {
        if(str.length()<2){return 0;}
        if(str.substring(0,2).equals("11")){return 1+count11(str.substring(2));}
        return count11(str.substring(1));
    }


    public int strCount(String str, String sub) {
        if(str.length()<sub.length()){return 0;}
        if(str.substring(0,sub.length()).equals(sub)){return 1+strCount(str.substring(sub.length()), sub);}
        return strCount(str.substring(1), sub);
    }

}