class StringCompression {

	public int compress(char[] chars) {
	  
		int anchor = 0, write = 0;
		for(int read = 0; read < chars.length; read++) {
		
			// End of file or different character
			if(read + 1 == chars.length || chars[read + 1] != chars[read]) {
			
				chars[write++] = chars[anchor];
				if(read > anchor) {
					for(char c: Integer.toString((read - anchor + 1)).toCharArray())
						chars[write++] = c;
				}
				// Move to next char
				anchor = read + 1;
			}
		}
		return write;
        
	}

}