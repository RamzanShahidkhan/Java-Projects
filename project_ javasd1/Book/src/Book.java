
public class Book {
	private String book;
	private String author;
	private String title;
	public Book()
	{
		book=null;
		author=null;
		title=null;
	}
	public Book(String book, String author, String title)
	{
		this.book=book;
		this.author=author;
		this.title=title;
	}
	public void setbook(String book)
	{
		this.book=book;
	}
	public String getbook()
	{
		return book;
	}
	public void setauthor(String author)
	{
		this.author=author;
	}
	public String getauthor()
	{
		return author;
	}
	public void settitle(String title)
	{
		this.title=title;
	}
	public String gettitle()
	{
		return title;
	}

}
