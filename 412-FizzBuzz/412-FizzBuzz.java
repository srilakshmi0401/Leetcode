// Last updated: 8/12/2026, 12:07:13 PM
class Solution {
    public List fizzBuzz(int n) {
        List ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ans.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0  ? "Buzz" :
                i % 3 == 0  ? "Fizz" :
                String.valueOf(i)
            );
        }

        return ans;
    }
}

// TC: O(n), SC: O(n)