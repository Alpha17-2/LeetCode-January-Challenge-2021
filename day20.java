class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> mystack = new Stack<>();
        int n=s.length();
        if(n%2==0)
        {
          mystack.push(s.charAt(0));
          char top=mystack.peek();  // Top of stack
          for(int i=1; i<n; i++)
          {
             char current=s.charAt(i);
             if(!mystack.empty() && top=='{' && current == '}')
                 mystack.pop();
              
             else if(!mystack.empty() && top=='(' && current == ')')
                 mystack.pop();
              
             else if(!mystack.empty() && top=='[' && current == ']')
                 mystack.pop();
              
             else
                 mystack.push(current);
              
             if(!mystack.empty()) // Checking if stack is empty 
             top=mystack.peek(); // Storing top of stack
          }
           return mystack.empty();
        }
        else 
            return false;
        
    }
}