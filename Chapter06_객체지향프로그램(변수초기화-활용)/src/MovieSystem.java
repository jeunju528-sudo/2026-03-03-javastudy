import java.io.FileReader;

public class MovieSystem {
	static Movie[]	movies = new Movie[1938];
	static {
		try {
			StringBuffer sb = new StringBuffer();
			FileReader in = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			while((i=in.read())!=-1) {
				sb.append((char)i);
			}
			in.close();
			
			String strMovie = sb.toString();
			
			String[] datas = strMovie.split("\n");
			i = 0;
			for(String m : datas) {
				String[] mm = m.split("\\|");
				movies[i] = new Movie();
				movies[i].mno = Integer.parseInt(mm[0]);
				movies[i].title = mm[1];
				movies[i].genre = mm[2];
				movies[i].poster = mm[3];
				movies[i].actor = mm[4];
				movies[i].regdate = mm[5];
				movies[i].grade = mm[6];
				movies[i].director = mm[7];
				i++;
			}
			
		}catch(Exception e){
			
		}
	}
}
