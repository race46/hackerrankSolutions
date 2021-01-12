static String isBalanced(String s) {
            Stack<Character> st=new Stack<>();
            for(Character c: s.toCharArray()){
                switch(c){
                    case '}':
                    if(st.isEmpty()||st.pop()!='{')return "NO";
                    break;
                    case ')':
                    if(st.isEmpty()||st.pop()!='(')return "NO";
                    break;
                    case ']':
                    if(st.isEmpty()||st.pop()!='[')return "NO";
                    break;
                    default:
                    st.push(c);
                    break;
                }
            }

        return st.isEmpty()?"YES":"NO";

        }
