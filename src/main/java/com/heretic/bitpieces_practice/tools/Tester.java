package com.heretic.bitpieces_practice.tools;

import java.util.List;
import java.util.Properties;

import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Model;

import com.heretic.bitpieces_practice.tables.Tables.Bid;
import com.heretic.bitpieces_practice.tables.Tables.Creators_page_fields;
import com.heretic.bitpieces_practice.tables.Tables.Date_testing;
import com.heretic.bitpieces_practice.tables.Tables.Pieces_owned_value_accum;
import com.heretic.bitpieces_practice.web_service.HTMLTools;
import com.heretic.bitpieces_practice.web_service.WebTools;

public class Tester {
	public static void main(String[] args) {
		Properties prop = Tools.loadProperties("/home/tyler/db.properties");
		dbInit(prop);
//		WebTools.getPiecesOwnedValueAccumSeriesJson("3", null);
//		WebTools.getPiecesOwnedValueCurrentSeriesJson("3", null);
//		WebTools.getUsersFundsAccumSeriesJson("3", null);
//		WebTools.getUsersTransactionsJson("3", null);
//		WebTools.getUsersReputationJson("1", null);
//		System.out.println(WebTools.getPiecesOwnedValueCurrentByCreatorJson("Leonardo_Davinci", null));
//		System.out.println(WebTools.getPricePerPieceCurrentJson("Leonardo_Davinci", null));
//		System.out.println(WebTools.getRewardsOwedJson("Leonardo_Davinci", null));
//		System.out.println(WebTools.getBackersCurrentCountJson("Leonardo_Davinci", null));
//		System.out.println(WebTools.getPiecesOwnedValueCurrentSeriesJson("2", "Leonardo_Davinci", null));
		// The datetime .toJson shows "2014-07-18T20:46Z"
		// The timestamp .toJson shows 2014-07-18T20:46Z
		Date_testing m = Date_testing.findById(1);
//		Model m = list.get(0);
		String json = m.toJson(false);
		System.out.println(json);
		
		Bid bid = (Bid)Bid.findById(1);
		System.out.println(bid.toJson(true));
//		WebTools.customToJson(list.get(0));
		
//		SeriesFetcher sf = new SeriesFetcher();
//		Map<DateTime, Double> dv = sf.getDateValueMapFromTable(list, "price_time_", "value_accum");
//		System.out.println(Tools.GSON2.toJson(dv));
		
		dbClose();
		
	}
	public static void main2(String[] args) {
	
		
		Properties prop = Tools.loadProperties("/home/tyler/db.properties");
		
		dbInit(prop);
		Creators_page_fields page = Creators_page_fields.findFirst("creators_id = ?",  1);
		
		dbClose();
		HTMLTools.saveCreatorHTMLPage(page.getString("creators_id"), page);
		
		
	}
	
	private static final void dbInit(Properties prop) {
		Base.open("com.mysql.jdbc.Driver", 
				prop.getProperty("dburl"), 
				prop.getProperty("dbuser"), 
				prop.getProperty("dbpassword"));
	}
	private static final void dbClose() {
		Base.close();
	}

}
