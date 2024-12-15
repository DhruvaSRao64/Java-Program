public class Book{
    String name;
    String author;
    double price;
    int num_pages;

    public Book(String name, String author, double price, int num_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getNumPages(){
        return num_pages;
    }

    public void setNumPages(int num_pages){
        this.num_pages = num_pages;
    }

    @Override
    public String toString(){
        return "The book name is: "+name+"\nAuthor: "+author+"\nPrice: "+price+"Number of pages: "+num_pages;
        }


}