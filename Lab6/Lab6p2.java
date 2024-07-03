class Book{
	private  String author_name;
	public Book(){
		System.out.println("author_name"+author_name);
	}
}
class Book_publication extends Book{
	private  String title;
	
}
class Paper_publication extends Book{
	private String title;
}
public class Lqab6p2{
	public static void main(String[] args) {
		
		Book_publication b1=new Book_publication();

	}
}