public class Author implements Comparable <Author>  {
 
private String firstName;
private String lastName;
private String bookName;
public Author(String firstName, String lastName, String bookName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.bookName = bookName;
}

@Override
public int compareTo(Author o) {
	// TODO Auto-generated method stub
	return this.firstName.compareTo(o.firstName);
}
 
}
