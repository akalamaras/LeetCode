class ValidParentheses {

	public boolean isValid(String s) {
	
		HashMap<Character,Character> map = new HashMap<Character,Character>() {{
			put(')','(');
			put(']','[');
			put('}','{');
		}};
		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()) {

			if(map.containsKey(c)) {
			
				if(stack.isEmpty())
					return false;

				char expected = stack.pop();
                char actual = map.get(c);

				if(actual != expected)
					return false;
			} else
				stack.push(c);
		}
		return stack.isEmpty();	
	}
}