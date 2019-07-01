package org.CognizantQA.PageObject;

import org.openqa.selenium.By;

public class Elements1 extends POMabstract {
	
	 public static final By xbowlingreservebttn=By.xpath("//input[@value='RESERVE']");
	    public static final By xfind_bowling_lane_heading1=By.xpath("//h1[@class='page-headings']");
	    public static final By xfind_bowling_lane_heading2=By.cssSelector("body > div.menu-main.ng-scope > div.progress-page.ng-isolate-scope.lane > div > div > p");
	    public static final By xfind_bowling_lane_heading3=By.xpath("//h2[@class='search-sect-head']");
	    public static final By xfind_bowling_lane_heading4=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(2) > div.container.bowlinglanecont.ng-scope > div > div.col-xs-12.text-center > p.select-location.hidden-xs");
	    public static final By xbarcolorempty_red=By.xpath("//*[@id=\"location\"]");
	    public static final By xlocationsearchbar=By.xpath("//input[@id=\"location\"]");
        public static final By xexternalclickfindpage=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(2)");
        public static final By xinactivetype_city_field=By.xpath("(//label[@class='control-label'])");
        public static final By xactivetype_city_field=By.xpath("(//label[@class='control-label active'])");
        public static final By xcity_field=By.xpath("//*[@id='location']");
        public static final By xfind_a_mainevent_bttn=By.xpath("//input[@value='Find A MAIN EVENT']");
        public static final By xexternalclickfindpage1=By.cssSelector("body > div.menu-main.ng-scope > div.progress-page.ng-isolate-scope.lane");
        public static final By xstorepopup=By.xpath("//*[@id=\"storeModal\"]/div");
        public static final By xpopuplocationfield=By.xpath("(//*[@id=\"location\"])[2]");
        public static final By xfind_bttn_in_popup=By.xpath("(//input[@id=\"location\"])[2]");
        public static final By xstore_popupclose_bbtn=By.cssSelector("#storeModal > div > button");
        public static final By xmapbttn_store_popup=By.xpath("//a[@ng-click='openMap()']");
        public static final By xmapview_placename=By.xpath("//*[@id=\"firstStoreList\"]/div[2]/span[1]");
        public static final By xselect_and_continue=By.xpath("//input[@class='btn btn-p btn-block mobile-btn']");
        
}
