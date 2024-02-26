//Rule 04: User example
//STR01-J

public static String trim(String string) {
	char ch;
	int i;
	for (i = 0; i < string.length(); i += 1){
		ch = string.charAt(i);
		if (!Character.isLetter(ch)){
			break;
		}
	}
	return string.substring(i);
}