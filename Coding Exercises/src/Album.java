import java.util.*;

public class Album{
	    public String name;
	    public String artist;
	    public ArrayList<Song> album; 
	    
	    public Album(){
	        this.name=name;
	        this.artist=artist;
	        this.album=new ArrayList<Song>();
	    }
	    public String getAlbumTitle(){
	        return this.name;
	    }
	   	static boolean addSong(String title, double duration){
	   	    
	   	    Song song = findSong(title);
	   	    
	   	   if ( song != null){
	   	       System.out.println("The song is in the album so it cannot be added again");
	   	       return false;
	   	   }else{
	   	       this.album.add(song);
	   	       System.out.println("title: " + title + " duration " + duration + " added in album " + getAlbumTitle() );
	   	   }
	   	    
	   	}
     	static Song findSong(String title){
     	    for (int i=0; i<this.album.size(); i++){
	   	        Song song = this.album.get(i);
	   	        if( song.getTitle().equals(title) ){
	   	          System.out.println("Name of song found: " + song);
	   	          return song;   
	   	        }else{
	   	            System.out.println("Not this song found");
	   	            return null;
	   	        } 
	   	    }return null;
     	}
}
