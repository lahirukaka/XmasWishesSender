package madfox.colhh.xmaswishessender;

import android.provider.BaseColumns;

public class DBContract {

	/* Constants */
	public static final String DB_NAME = "jokes.db";
	public static final int DB_VERSION = 1;

	public abstract static class QuoteCategory implements BaseColumns {
		public static final String TABLE_NAME = "JokeCategory";
		public static final String COLUMN_NAME_CATEGORY = "Category";

		public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
				+ " (" + _ID + " INTEGER PRIMARY KEY, " + COLUMN_NAME_CATEGORY
				+ " TEXT);";
	}

	public abstract static class Quotes implements BaseColumns {
		public static final String TABLE_NAME = "Jokes";
		public static final String COLUMN_NAME_QUOTES = "jokeslist";
		public static final String COLUMN_NAME_CATEGORY = "category";

		public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
				+ " (" + _ID + " INTEGER PRIMARY KEY, " + COLUMN_NAME_QUOTES
				+ " TEXT, " + COLUMN_NAME_CATEGORY + " TEXT);";
	}
}
