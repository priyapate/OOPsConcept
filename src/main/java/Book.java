class BookType {
 private String author;
 private int pages;
 private String publisher;

 public String getAuthor(){
	return this.author;
}
public void setAuthor(String author){
	this.author=author;
}
public int getPages(){
	return this.pages;
}
public void setPages(int pages){
	this.pages=pages;
}
public String getPublisher(){
	return this.publisher;
}
public void setPublisher(String publisher){
	this.publisher=publisher;
	}
}
class Magazine extends BookType
{
	String type ="computer engineering";
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type=type;
		}
}
class Novel extends BookType{
	int price =200;
	public int getPrice(){
		return this.price;
	}
	public void setType(int price){
		this.price=price;
		}
	}

class Book {
public static void main(String[] args) {
	BookType b= new BookType();
	BookType c =new Magazine();
	BookType n=new Novel();
	c.setAuthor("swara");
	n.setPages(52);
	n.setPublisher("canada");
	System.out.println(c.getAuthor());
	System.out.println(n.getPages());
	System.out.println(n.getPublisher());
	

	}


}