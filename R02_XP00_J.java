//Rule 02: Expressions (EXP)
//XP00-J
public void deleteFile(){
	File someFile = new File("someFileName.txt");
	//Do something with someFile
	if (!someFile.delete()){
		//Handle failure to delete the file
	}
}
