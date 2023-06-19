import java.util.Stack;

class Solution
{
    boolean is_number(Character ch)
    {
        if(ch>='0' && ch<='9'){
            return true;
        }
        return  false;
    }

    String decodeTheString(String s){
        int N  = s.length();
        String result = "";
        Stack<Character> S = new Stack<>();
        for(int i=0;i< N;i++)
        {
            if(s.charAt(i) != ']')
            {
                S.push(s.charAt(i));
            }
            else
            {
                String substring = "";
                while(!S.empty() && S.peek()!='['){
                    substring = S.peek()+ substring;
                    S.pop();
                }
                S.pop();
                String number = "";
                while(!S.empty() && is_number(S.peek())){
                    number = S.peek()+ number;
                    S.pop();
                }
                int num = Integer.parseInt(number);
                String expression = "";
                for(int j = 1;j<=num;j++){
                    expression += substring;
                }
                for(int j = 0; j<expression.length();j++){
                    S.push(expression.charAt(j));
                }
            }
        }
        
        while(!S.empty()){
            result = S.peek()+result;
            S.pop();
        }
        
        return result;
    }
    public static void main(String[] args) {    
        Solution solution = new Solution();
        System.out.println(solution.decodeTheString("3[a]2[bc]"));
    }
}