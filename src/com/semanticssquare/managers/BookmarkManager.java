package com.semanticssquare.managers;

import java.util.ArrayList;

import com.semanticssquare.thrillio.dao.BookmarkDao;
import com.semanticssquare.thrillio.entities.Book;
import com.semanticssquare.thrillio.entities.Bookmark;
import com.semanticssquare.thrillio.entities.Movie;
import com.semanticssquare.thrillio.entities.User;
import com.semanticssquare.thrillio.entities.UserBookmark;
import com.semanticssquare.thrillio.entities.WebLink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();

	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public WebLink createWebLink(long id, String title, String profileUrl, String url, String host) {
		WebLink webLink = new WebLink();
		webLink.setId(id);
		webLink.setTitle(title);
		webLink.setProfileUrl(profileUrl);
		webLink.setUrl(url);
		webLink.setHost(host);

		return webLink;
	}

	public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher,
			String[] authors, String genre, double amazonRating) {
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setProfileUrl(profileUrl);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);

		return book;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);

		return movie;
	}

	public ArrayList<ArrayList<Bookmark>> getBookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);

		dao.saveUserBookmark(userBookmark);

	}

	public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
		bookmark.setKidFriendlyStatus(kidFriendlyStatus);
		bookmark.setKidFriendlyMarkedBy(user);

		System.out.println(
				"kid friendly status: " + kidFriendlyStatus + "," + "marked by" + user.getEmail() + "," + bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		
		bookmark.setSharedBy(user);
		
		System.out.println("Data to be shared :");
		if(bookmark instanceof Book) {
			System.out.println(((Book)bookmark).getItemData());
		}else if(bookmark instanceof WebLink) {
			System.out.println(((WebLink)bookmark).getItemData());
		}
	}
}
