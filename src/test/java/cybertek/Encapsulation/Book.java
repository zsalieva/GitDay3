package cybertek.Encapsulation;

public class Book {
      private String title;
      private  String author;
      private int pages;

      public String getTitle(){  // To be able to read the title since it is string we passed String
        return title;
      }

      public void setTitle(String newTitle){  //to make change in Title we give one param as the type of title String
        title=newTitle;
      }

      // Getter and Setter methods for each given private variable
      public String getAuthor(){
            return author;
      }

      public void setAuthor(String newAuthor){
          author=  newAuthor;
      }


        // Getter and Setter methods for each given private variable
      public int getPages(){
            return pages;
      }

      public void setPages(int newPages){
              pages=newPages;
      }


}
