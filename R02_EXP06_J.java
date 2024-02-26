//Rule 02: User example
//EXP06-J

private ArrayList<String> names;

void process(int index) {
	boolean nullsRemoved = names.remove(null);
	assert nullsRemoved; // No side effect
	//...
}
