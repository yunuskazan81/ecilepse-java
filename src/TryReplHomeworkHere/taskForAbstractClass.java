package TryReplHomeworkHere;

public abstract class taskForAbstractClass {

	/*
	
	Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract. 
	Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: Exmaple: to open .
	java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed
	
	
	*/
	
	
	
	public static void main(String[] args) {
		
		taskForAbstractClass test= new JavaFile ();
		
		test.Edit();
		test.Open();
		test.Close();
	
		taskForAbstractClass test1= new WordFile ();
		
		test1.Open();
		
taskForAbstractClass test2= new PDFFile();
		
		test2.Open();
	}
	
	
	public void Edit() {
		System.out.println("All files can be edited by");
	}
	
	public void Close () {
		
		System.out.println("All files ca be closed by ");
	}
	
	public abstract void Open();
	
	
}


class JavaFile extends taskForAbstractClass{

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
		
	}
	
	public void Edit() {
		System.out.println("Java files can be edited by eclipse");
		
		System.out.println("To open Java files we need notepad++, sublime text or Eclipse program");
	}
	

	
}

class WordFile extends taskForAbstractClass {

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
		System.out.println("To open .doc extended files we need Microsoft word to be installed");	
		
	}
}


class PDFFile extends taskForAbstractClass{

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
		System.out.println("To open .pdf extended files we need Adobe Reader program to be installed");	
		
	}
	
}










