package com.semanticssquare.controllers;

import com.semanticssquare.managers.BookmarkManager;
import com.semanticssquare.thrillio.entities.Bookmark;
import com.semanticssquare.thrillio.entities.User;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {
	}

	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);

	}

	public static void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
		BookmarkManager.getInstance().setKidFriendlyStatus(user,kidFriendlyStatus,bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user,bookmark);		
	}
}
