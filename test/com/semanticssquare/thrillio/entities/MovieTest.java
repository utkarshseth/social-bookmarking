package com.semanticssquare.thrillio.entities;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.semanticssquare.managers.BookmarkManager;
import com.semanticssquare.thrillio.constants.MovieGenre;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		
		//Test 1
		Movie movie=BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);	
		Boolean isKidFriendlyEligible=movie.isKidFriendlyEligible();
		assertFalse("form movie in horror-isKidFriendlyEligible must return false",isKidFriendlyEligible);
		//Test 2
		movie=BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);	
		 isKidFriendlyEligible=movie.isKidFriendlyEligible();
		assertFalse("form movie in thriller-isKidFriendlyEligible must return false",isKidFriendlyEligible);

	}

}
