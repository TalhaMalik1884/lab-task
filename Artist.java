public class Artist{

        private String title;
        private int year;
        private Artist artist;
           title="No title";
           year="NO Year";
           artist="Unknown artist";
  
public void settitle(String title){
         this.title=title;
}
public String gettitle(){
          return title;
}   
public void setyear(int year){
         this.year=year;
}
public int getyear(){
          return year;
}  
 public void setartist(Artist artist){
         this.artist=artist;
}
public Artist getartist(){
          return artist;
} 
A1.display();
A2.display();   

}





















}