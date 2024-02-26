//Rule 02: User example
//EXP06-J

private ArrayList<String> names;

void process(int index) {
	assert names.remove(null); //Side effect
	//...
}