
public class 정리 {
	String title;
	String originalTitle;
	String releaseDate;
	String genre;
	String country;
	String filmRating;
	String runningTime;
	double score;
	String boxOfficeRank;
	String contents;
	String poster;
}

class News {
	String picture;
	String title;
	String contents;
	String regdate;
	String publisher;
}


class Food {
	String backImage;
	String title;
	String subTitle;
}

class Restaurant {
	String name;
	double score;
	String address;
	String tel;
	String category;
	String priceRange;
	String parkingInfo;
	String businessHours;
	RestaurantMenu[] menu;
}

class RestaurantMenu {
	String menuName;
	String price;
}

class Recipe {
	String title;
	String user;
	String grade;
	int commentCnt;
	int hit;
	String image;
}

class Music{
	String poster;
	String title;
	String artist;
	String album;
	int like;
	int grade;
}

class Sale{
	String image;
	String title;
	int price;
	int saleRate;
}

class Concert{
	String title;
	int status;
	String poster;
	String up_genre;
	String genre;
	String startDate;
	String endDate;
	String address;
	String[] actors;
	int grade;
	int runningTime;
	
}