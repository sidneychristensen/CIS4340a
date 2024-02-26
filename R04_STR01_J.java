//Rule 04: User example
//STR01-J

public static String trim(String string) {
	char ch;
	int i;
	for (i = 0; i < string.length(); i += Character.charCount(ch)){
		ch = string.codePointAt(i);
		if (!Character.isLetter(ch)){
			break;
		}
	}
	return string.substring(i);
}
