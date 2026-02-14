// Last updated: 2/14/2026, 1:41:27 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        /*int l = temperatures.length;
        int answer[]=new int[l];
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            if(temperatures[i]==temperatures[i+1])
            answer[i]=0;
            else if(temperatures[i]<temperatures[i+1])
            answer[i]=1;
            else
            {
                c=0;
            for(int j=i;j<l-1;j++)
            {
                if(temperatures[j]>temperatures[j+1])
                c++;
            }
            answer[i]=c;
            }  
        }
        return answer;
    }*/
    /*int n = temperatures.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }

        return answer;*/
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        return answer; 
    }
}