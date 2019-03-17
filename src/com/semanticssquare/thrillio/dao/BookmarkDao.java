package com.semanticssquare.thrillio.dao;

import java.util.ArrayList;

import com.semanticssquare.thrillio.DataStore;
import com.semanticssquare.thrillio.entities.Bookmark;
import com.semanticssquare.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public ArrayList<ArrayList<Bookmark>> getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
	}
}
