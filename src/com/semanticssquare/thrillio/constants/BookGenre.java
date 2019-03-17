package com.semanticssquare.thrillio.constants;

public enum BookGenre {
	

	 ART ("Art"),
	 BIOGRAPHY ("Biography"),
	 CHILDREN ("Children"),
	 FICTION ("Fiction"),
	 HISTORY ("HIstory"),
	 Mystery ("Mystery"),
	 PHILOSOPHY ("Philosophy"),
	 RELEGION ("Religion"),
	 ROMANCE ("Romance"),
	 SELF_HELP ("Self help"),
	 Technical ("Technical");
	
	private BookGenre(String name) {
		this.name=name;
	}

	private String name;

	public String getName() {
		return name;
	}
	
}
