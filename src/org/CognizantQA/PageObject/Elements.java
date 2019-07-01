package org.CognizantQA.PageObject;

import org.openqa.selenium.By;

public class Elements extends POMabstract {
	
	public static final By xpopupclose =By.xpath("//*[@id=\"onesignal-popover-cancel-button\"]");
	public static final By xdrdforsignin = By.xpath("//span[@class='fun-dropdown-caret']");
	public static final By xsignin1 = By.xpath("//*[@id=\"myNavbar\"]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/div/a/input");
	public static final By xsignin2=By.cssSelector("#SignInEmail");
	public static final By xsignin3=By.cssSelector("#SignInEmail");
	public static final By xpassword=By.cssSelector("#password");
	public static final By xpassword1=By.cssSelector("#password");
	public static final By xsigninb=By.cssSelector("#slidesEffect > div.login_cms.ng-scope > div > div > div > div > div.col-lg-4.col-md-4.col-sm-6.col-xs-12 > form > div > div.padding-top-20 > input");
	public static final By xddacctbttn=By.cssSelector("#langDropdown > span");
	public static final By xlogoutbttn=By.xpath("//a[starts-with(text(),'Logout')]");
	public static final By xlogoutbbtnmssg=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(1) > div > div.container.ng-scope > div > div.row > form > div > div > div.login-msg-area > div.alert.alert-success > strong");
	public static final By xinavlidsignin_mssg=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(1) > div > div.container.ng-scope > div > div.row > form > div > div > div.login-msg-area > div.alert.alert-danger > strong");
	public static final By xinvalidemail_mssg=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(1) > div > div.container.ng-scope > div > div.row > form > div > div > div:nth-child(3) > div > div > div > span.error-red");
	public static final By xusernot_found_mssg=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(1) > div > div.container.ng-scope > div > div.row > form > div > div > div.login-msg-area > div.alert.alert-danger > strong");
	public static final By xproductionpopupclose=By.cssSelector("#onesignal-popover-cancel-button");
	public static final By xcreateanaccnt=By.xpath("//*[@id=\"navbar\"]/div/div[1]/div[2]/div[1]/ul/li[2]/div/a");
	public static final By xcreate_accnt_bttn=By.xpath("//a[@class='not-member'][1]");
	//*****************************************************************************************
	//Registration
	public static final By xfirstname1=By.cssSelector("#firstname");
	public static final By xlastname=By.cssSelector("#lastname");
	public static final By xemail1=By.cssSelector("#emailid");
	public static final By xemail2=By.xpath("//*[@id=\"email\"]");
	public static final By xinvalid_email_mssg=By.xpath("(//span[starts-with(text(),'Invalid Email')])[3]");
	public static final By xpass=By.cssSelector("#password");
    public static final By xregisterbttn=By.xpath("//input[@class=\"btn btn-p\"]");
    public static final By xaccntcreatemssg=By.xpath("//strong[@class='ng-binding'][1]");
    public static final By xsuccesslogin_mssg=By.xpath("//strong[@class='ng-binding'][1]");
    public static final By xalready_reg_accnt_msg=By.xpath("(//strong[@class='ng-binding'])[2]");
    public static final By xmssgclosebttn=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(1) > div > div > div.row > form > div > div > div:nth-child(2) > div.alert.alert-danger > button");
    public static final By xreginvalidemailmssg=By.xpath("//span[@class='error-red']");
    public static final By xreginvalidpswwrdmssg1=By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/form/div/div/div[4]/div/div/div/span[3]");
    public static final By xreginvalidpswwrdmssg2=By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/form/div/div/div[4]/div/div/div/span[2]");
    //*********************************************************************************************
    //Bowling lane flow in mainevent production site
    public static final By xonline_pop_up_close_bttn=By.xpath("//*[@id=\"landingHome\"]/div/div/div/button");
    public static final By xbowling_booknow_bttn=By.xpath("//*[@id='hero-cta']");
    public static final By xfind_bowling_lane_heading1=By.xpath("//h1[@class='page-headings']");
    public static final By xfind_bowling_lane_heading2=By.cssSelector("body > div.menu-main.ng-scope > div.progress-page.ng-isolate-scope.lane > div > div > p");
    public static final By xfind_bowling_lane_heading3=By.xpath("//h2[@class='search-sect-head']");
    public static final By xfind_bowling_lane_heading4=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(2) > div.container.bowlinglanecont.ng-scope > div > div.col-xs-12.text-center > p.select-location.hidden-xs");
    public static final By xbarcolorempty_red=By.xpath("//*[@id=\"location\"]");
    public static final By xlocationsearchbar=By.cssSelector("#locationParty");
    public static final By xlocationsearchbar2=By.cssSelector("#locationLane");
    public static final By xexternalclickfindpage=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(2)");
    public static final By xinactivetype_city_field=By.xpath("((//label[@class='control-label']))[9]");
    public static final By xactivetype_city_field=By.cssSelector("#locationLane");
    public static final By xcity_field=By.xpath("//*[@id='locationLane']");
    public static final By xseelct_main_event_text=By.xpath("//*[@id='storeModal']//h2[contains(text(),'SELECT A MAIN EVENT')]");
    public static final By xfind_a_mainevent_bttn=By.xpath("//input[@value='FIND A MAIN EVENT']");
    public static final By xfind_a_mainevent_bttn1=By.xpath("//input[@value='Find A MAIN EVENT']");
    public static final By xexternalclickfindpage1=By.cssSelector("body > div.menu-main.ng-scope > div.progress-page.ng-isolate-scope.lane");
    public static final By xstorepopup=By.xpath("//*[@id=\"storeModal\"]/div");
    public static final By xpopuplocationfield=By.xpath("(//*[@id=\"location\"])[2]");
    public static final By xfind_bttn_in_popup=By.xpath("//*[@id='storeModal']//input[contains(@value,'FIND')]");
    public static final By xstore_popupclose_bbtn=By.cssSelector("#storeModal > div > div.mapListHolder > button");
    public static final By xmapbttn_store_popup=By.xpath("(//div[starts-with(text(),'Map')])[2]");
    public static final By xmapview_placename=By.xpath("//*[@id='firstStoreList']/div[2]/span[1]");
    public static final By xselecttime_placename=By.xpath("//*[@id='main-contentHome']//strong[contains(text(),'MAIN EVENT Knoxville')]");
    public static final By xselect_and_continue=By.xpath("(//input[@class='btn btn-p btn-block mobile-btn'])[1]");
    public static final By xlocation_field_select_mainevent_popup=By.xpath("(//input[@id='location'])[2]");
    //4th sept,2018
    public static final By xslctdate=By.xpath("//input[@id='datePicker']");
    public static final By xslctdate1=By.cssSelector("#datePicker");
    public static final By xslctdate_txt=By.xpath("/html/body//div/form/div[1]/div/small");
    public static final By xchooseduration=By.xpath("(/html/body//div/form//dropdowncustom//div/input)[1]");
    public static final By xnooflanes=By.xpath("(/html/body//div/form//dropdowncustom//div/input)[4]");
    public static final By xnoofbowlers=By.xpath("(/html/body//div/form//div/double-spinner//div/input)[1]");
    public static final By xse_av_times_bttn=By.xpath("/html/body//div/form/div[5]/div/input[1]");
    public static final By xtoday_bttn_calender=By.xpath("//button[@class='btn-flat picker__today']");
    public static final By xadults=By.cssSelector("#main-contentHome > div:nth-child(2) > div.container.bowlinglanecont.ng-scope > div > div.col-xs-12.searchCriteriaMain > form > div:nth-child(3) > div > double-spinner > div > div.doubleSpinner-dropdown > div.col-xs-6.adultbox > dropdowncustom > div > div > input");
    public static final By xchild=By.xpath("(/html/body//div/double-spinner//dropdowncustom//input)[2]");
    public static final By xno_of_bowlers_popup=By.xpath("/html/body//div/form/div[3]/div/double-spinner/div/div[2]");
    public static final By xno_duration_field=By.xpath("(//input[@name='demo'])[2]");
    public static final By xno_of_bowling_lane=By.cssSelector("#main-contentHome > div:nth-child(2) > div.container.bowlinglanecont.ng-scope > div > div.col-xs-12.searchCriteriaMain > form > div:nth-child(4) > div > dropdowncustom > div > div > input");
    public static final By xadults_3=By.xpath("(/html/body//div/form/div[3]/div/double-spinner//div/dropdowncustom//div)[7]");
    public static final By xadults_19=By.xpath("(/html/body//div/form/div[3]/div/double-spinner//div/dropdowncustom//div)[23]");
    public static final By xdone_bttn=By.xpath("(/html/body//div/form/div[3]/div/double-spinner//div/input)[4]");
    public static final By xno_of_bowlers_max_range_error_mssg=By.xpath("//*[@id='main-contentHome']//div[contains(text(),'Max numbers of participant is 20')]");
    //5th sept,2018
    public static final By xchilds_2=By.xpath("(/html/body//div/form/div[3]/div/double-spinner/div/div[2]/div[2]/dropdowncustom//div)[6]");
    public static final By xdate_slct=By.xpath("//*[@id='datePicker_table']/tbody/tr[5]/td[4]/div");//tr is for changing week td is for changing days
    public static final By xdate_slct2=By.xpath("//*[@id='datePicker_table']/tbody/tr[2]/td[4]/div");
    public static final By xlane_count1=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),'01')])[5]");
    public static final By xlane_count2=By.xpath("(//*[@id=\"main-contentHome\"]//div[contains(text(),'02')])[3]");
    public static final By xlane_count3=By.xpath("(//*[@id=\"main-contentHome\"]//div[contains(text(),'03')])[3]");
    public static final By xlane_count4=By.xpath("(//*[@id=\"main-contentHome\"]//div[contains(text(),'04')])[3]");
    public static final By xlane_count5=By.xpath("(//*[@id=\"main-contentHome\"]//div[contains(text(),'05')])[3]");
    public static final By xlane_count6=By.xpath("(//*[@id=\"main-contentHome\"]//div[contains(text(),'06')])[3]");
    public static final By xduration_1_hr=By.xpath("//*[@id='main-contentHome']//div[contains(text(),'1 Hr')]");
    public static final By xduration_2_hr=By.xpath("//*[@id='main-contentHome']//div[contains(text(),'2 Hr')]");
    public static final By xduration_3_hr=By.xpath("//*[@id='main-contentHome']//div[contains(text(),'3 Hr')]");
    public static final By xduration_4_hr=By.xpath("//*[@id='main-contentHome']//div[contains(text(),'4 Hr')]");
    public static final By xclose_bttn=By.xpath("//*[@id='datePicker_root']//button[contains(text(),'Close')]");
    public static final By xtime_slct=By.xpath("//*[@id='storeTimeModal']//form//div/ul/li[7]/input");//changing li number enables changing the time slots
    public static final By xgo_to_cart_bttn2=By.xpath("(//*[@id='main-contentHome']//input[contains(@value,'GO TO CART')])[2]");//right side card button in order summary page
    public static final By xgo_to_cart_bttn1=By.xpath("(//*[@id='main-contentHome']//input[contains(@value,'GO TO CART')])[1]");
    public static final By xcontinue_shopping_1=By.xpath("(//*[@id='main-contentHome']//input[contains(@value,'CONTINUE SHOPPING')])[1]");
    public static final By xcontinue_shopping_2=By.xpath("(//*[@id='main-contentHome']//input[contains(@value,'CONTINUE SHOPPING')])[2]");
    public static final By xmodify_bttn=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'MODIFY')])[1]");//modify button in cart page 
    public static final By xdelete_icon_bttn=By.xpath("//*[@id='main-contentHome']/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/div[4]/div[2]/span");//delete icon button in cart page(same x path with different nos is applicable for information fields 
    public static final By xbowling_event_info_in_cart_page=By.xpath("(//*[@id='main-contentHome']//div[starts-with(@class,'ng-scope')])[6]");
    public static final By xbowling_store_info_in_cart_page=By.xpath("(//*[@id='main-contentHome']//div[starts-with(@class,'ng-scope')])[5]");
    public static final By xcheckout_bttn1=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'GO TO CHECKOUT')])[2]");//checkout button in cart page to the bottom
    public static final By xcheckout_bttn2=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'GO TO CHECKOUT')])[1]");//checkout button in cart page to the right
    public static final By xcheckout_heading1=By.xpath("//h1[starts-with(text(),'Checkout')]");//checkoutheading 1 in checkout page
    public static final By xcheckout_heading2=By.xpath("//h2[starts-with(text(),'Tell us about yourself')]");//checkoutheading 2 in checkout page
    public static final By xemail_checkout=By.cssSelector("#emailField");//email field in checkout page
    public static final By xph_no_checkout=By.cssSelector("#phone-field");//phone number field in checkout page
    public static final By xgo_to_payment_bttn=By.xpath("(/html/body//div/form/div/div[5]//div/input)[2]");
    public static final By xmake_payment_bttn=By.cssSelector("#payonline > div.ng-scope > form > div.col-xs-12.col-sm-6.col-md-offset-4.text-center.col-md-4.margin-bottom-15.hidden-xs > input");//make payment button make payment page
    public static final By xnamefield_card=By.cssSelector("#firstname");//payment page
    public static final By xcard_no=By.cssSelector("#cardNo");//payment page
    public static final By xexpiry_month1=By.cssSelector("#payonline > div.ng-scope > form > div:nth-child(1) > div > div > div:nth-child(3) > div > div > div:nth-child(1) > dropdowncustom > div > div > input");//payment page
    public static final By xexpiry_month2=By.xpath("(//*[@id=\"payonline\"]/div[4]/form//div/dropdowncustom//div)[12]");//payment page	
    public static final By xexpiry_year1=By.cssSelector("#payonline > div.ng-scope > form > div:nth-child(1) > div > div > div:nth-child(3) > div > div > div:nth-child(2) > dropdowncustom > div > div > input");//payment page
    public static final By xexpiry_year2=By.xpath("(//*[@id=\"payonline\"]/div[4]/form//div/dropdowncustom//div)[21]");//payment page
    public static final By xCVV=By.cssSelector("#cvvNo");//payment page
    public static final By xtotal_amount_make_payment_page=By.xpath("(//div[@class='col-xs-12 col-sm-3 pull-right actualpayableamount tobepaid ng-binding'])[1]");//payment page
    
    //6th sept,2018 
    //*****************************************************************************************************************************************************************
    //FUNLEAGUE flow in mainevent production site
    public static final By xjoin_funleague_bttn=By.xpath("(/html/body//div/a/input)[5]");//the no. in the bracket indicates different buttons in different events in the home page eg-bday,funleague ...etc
    public static final By xfind_fun_league_heading1=By.xpath("/html/body//div/h1");
    public static final By xfind_fun_league_heading2=By.xpath("(/html/body//div/p)[1]");
    public static final By xfind_fun_league_heading3=By.xpath("/html/body//div/h2");
    public static final By xfind_fun_league_heading4=By.xpath("(/html/body//div/p)[2]");
    public static final By xproductionpopupclose2=By.cssSelector("#onesignal-popover-cancel-button");
    public static final By xfind_location=By.cssSelector("body > div.menu-main.ng-scope > div:nth-child(2) > div.container.ng-scope > div > div:nth-child(2) > div > form > div:nth-child(3) > div > input.btn.btn-p.btn-l.hidden-xs");
    public static final By xheading1=By.xpath("/html/body/div[2]/div[1]/div/h1");//choose league time page
    public static final By xheading2=By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/h2");
    public static final By xheading3=By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/p[1]");
    public static final By xfunleague_time_bttn=By.xpath("/html/body//div/div/ul/li[1]/input");//li number indicates the 3 time buttons in the chooseleaguetime page
    public static final By xleague_details_heading1=By.xpath("/html/body//h1");
    public static final By xleague_details_heading2=By.xpath("(/html/body//div)[52]");
    public static final By xteam_name_field=By.cssSelector("#teamName");
    public static final By xpname1=By.cssSelector("#name0");
    public static final By xpname2=By.cssSelector("#name1");
    public static final By xpname3=By.cssSelector("#name2");
    public static final By xpname4=By.cssSelector("#name3");
    public static final By xgenderdd1=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[1]");
    public static final By xgenderdd2=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[3]");
    public static final By xgenderdd3=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[5]");
    public static final By xgenderdd4=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[7]");
    public static final By xshoesizedd1=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[2]");
    public static final By xshoesizedd2=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[4]");
    public static final By xshoesizedd3=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[6]");
    public static final By xshoesizedd4=By.xpath("(/html/body//div/form[1]//div/dropdowncustom/div/div/input)[8]");
    public static final By xddmale1=By.xpath("(/html/body//form[1]/div[4]/div[2]/div/dropdowncustom//div)[5]");//first div is for consecutive male sex from the drop down starting from 4 and last number in the bracket is for different sex.
    public static final By xddmale2=By.xpath("(/html/body//form[1]/div[5]/div[2]/div/dropdowncustom//div)[5]");
    public static final By xddmale3=By.xpath("(/html/body//form[1]/div[6]/div[2]/div/dropdowncustom//div)[5]");
    public static final By xddmale4=By.xpath("(/html/body//form[1]/div[7]/div[2]/div/dropdowncustom//div)[5]");
    public static final By xddfemale1=By.xpath("(/html/body//form[1]/div[4]/div[2]/div/dropdowncustom//div)[6]");
    public static final By xddfemale2=By.xpath("(/html/body//form[1]/div[5]/div[2]/div/dropdowncustom//div)[6]");
    public static final By xddfemale3=By.xpath("(/html/body//form[1]/div[6]/div[2]/div/dropdowncustom//div)[6]");
    public static final By xddfemale4=By.xpath("(/html/body//form[1]/div[7]/div[2]/div/dropdowncustom//div)[6]");
    public static final By xddboys1=By.xpath("(/html/body//form[1]/div[6]/div[2]/div/dropdowncustom//div)[7]");
    public static final By xddgirls1=By.xpath("(/html/body//form[1]/div[7]/div[2]/div/dropdowncustom//div)[8]");
    public static final By xddshoesize4=By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form[1]/div[4]/div[3]/div/dropdowncustom/div/div/div/div[9]");
    public static final By xddshoesize8=By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form[1]/div[5]/div[3]/div/dropdowncustom/div/div/div/div[16]");
    public static final By xddshoesize10=By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form[1]/div[6]/div[3]/div/dropdowncustom/div/div/div/div[4]");
    public static final By xddshoesize12=By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form[1]/div[7]/div[3]/div/dropdowncustom/div/div/div/div[6]");
    public static final By x3rowfuncard_50$=By.xpath("(/html/body//div/form[1]/div[6]/div[5]//div)[5]");
    public static final By xcontinue_bttn=By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form[1]/div[8]/div/input");
    public static final By xgo_to_cart_funleague=By.xpath("(/html/body//div/input[2])[1]");//button to the right
    public static final By xdelete_icon_bttn_funleague=By.xpath("(/html/body//div/span)[8]");
    //7th sept,2018 
    //*****************************************************************************************************************************************************************
    //BIRTHDAY BOOKING flow in mainevent production site
    public static final By xbook_bttn1=By.xpath("(/html/body//div/a/input)[3]");//the no. in the bracket indicates different buttons in different events in the home page eg-bday,funleague ...etc
    public static final By xbook_bttn2=By.xpath("//*[@id='hero-cta']");
    public static final By xbook_bday_place_heading1=By.xpath("/html/body//div/h1");
    public static final By xbook_bday_place_heading2=By.xpath("(/html/body//div/p)[1]");
    public static final By xbook_bday_place_heading3=By.xpath("/html/body//div/h2");
    public static final By xbook_bday_place_heading4=By.xpath("(/html/body//div/p)[2]");
    public static final By xlocation_bar_bday=By.cssSelector("#locationParty");
    public static final By xfind_mevent_bttn_bday=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'FIND A MAIN EVENT')])[1]");
    public static final By xexternalclickfindpage_bday=By.cssSelector("#main-contentHome > div.progress-page.ng-isolate-scope.party");
    public static final By xactivetype_city_field2=By.cssSelector("#locationParty");
    public static final By xcity_field2=By.xpath("//*[@id='locationParty']");
    //-----------select package page-----------------------------
    public static final By xslc_pkg_page_heading1=By.xpath("/html/body//div/h1");
    public static final By xslct_pkg_address_info=By.cssSelector("#main-contentHome > div:nth-child(2) > div.container-fluid.default-hidden.party-show-result.ng-scope.show-result > div > div > div"); 
    public static final By xultimate_party_pack_heading=By.xpath("//*[@id='main-contentHome']//span[starts-with(text(),'Ultimate ')]");////*[@id='main-contentHome']//span[starts-with(text(),'FUNtastic ')]
    public static final By xultimate_party_packprice_heading=By.xpath("//*[@id='main-contentHome']//span[starts-with(text(),'$29.95 PER PERSON')]");//no in the bracket is the different prices in the different packages per person.
    public static final By xultimate_party_pack_subheading1=By.xpath("//*[@id='main-contentHome']//li[starts-with(text(),'• 3 H')]");
    public static final By xultimate_party_pack_subheading2=By.xpath("//*[@id='main-contentHome']//li[starts-with(text(),'• 4')]");
    public static final By xultimate_party_pack_subheading3=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• $10 FUNcard ')])[1]");
    public static final By xultimate_party_pack_subheading4=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• 1,000 ')])[1]");
    public static final By xultimate_party_pack_subheading5=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• Reserved ')])[1]");
    public static final By xultimate_party_pack_subheading6=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• Choose ')])[1]");
    public static final By xultimate_party_pack_subheading7=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• A dedicated ')])[1]");
    public static final By xultimate_party_pack_subheading8=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• Free kids ')])[1]");
    public static final By xultimate_party_pack_subheading9=By.xpath("(//*[@id='main-contentHome']//li[starts-with(text(),'• FREE Date Night')])[1]");
    public static final By xslct_the_pkg_bttn=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'BOOK NOW')])[1]");//no. in the bracket denote the select package button of different packages 
    public static final By xfuntastic_pkg_bttn=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'BOOK NOW')])[2]");
    public static final By xcmp_pkg_bttn=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Compare packages')]");
    public static final By xselect_diff_mainevent_bday_flow=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Select')]");
    
    public static final By xconditions_txt_pkg_popup=By.xpath("//*[@id='storeGuestModal']/div/div/form/div/ul/li[1]/div[3]");
    public static final By xguest_count_dd=By.xpath("(//*[@id='storeGuestModal']//input[starts-with(@type,'text')])[1]");
    public static final By xguest_count_dd_10=By.xpath("(//*[@id='storeGuestModal']//div[starts-with(text(),'10')])[1]");
    public static final By xtxt_under_date_field=By.xpath("//*[@id='storeGuestModal']/div/div/form/div/ul/li[2]/div/small");
    public static final By xdate_picker_field=By.cssSelector("#datePicker");
    public static final By xdate_slct_bday=By.xpath("//*[@id='datePicker_table']/tbody/tr[5]/td[3]/div");
    public static final By xdate_cross_bttn=By.xpath("//*[@id='storeGuestModal']/div/div/button");
    public static final By xdate_close_bttn=By.xpath("//*[@id='datePicker_root']/div/div/div/div/div[3]/button[3]");
    public static final By xproceed_bttn=By.cssSelector("#storeGuestModal > div > div > form > div > div > input");
    public static final By xcmp_pkg_popup_close_bttn=By.xpath("//*[@id='comparePackage']/div/div/div[1]/button");
    //configure package xpaths and css selectors
    public static final By xmain_hdng=By.xpath("//*[@id='main-contentHome']//h2[starts-with(text(),'4 Activities & 1 Food Option Included')]");
    public static final By xslct_activity_tab1=By.xpath("//*[@id='collapse_0']/p");
    public static final By xslct_activity_tab2=By.xpath("//*[@id='collapse_1']/p");
    public static final By xslct_activity_tab3=By.xpath("//*[@id='collapse_2']/p");
    public static final By xslct_activity_tab4=By.xpath("//*[@id='collapse_3']/p");
    public static final By xactivities1_tab_bttnbowling=By.xpath("(//*[@id='collapse0']/div/div[1]/slick//div/button)[2]");//selecting bowling activity from activities 1 collapse changing the number changes the tab button present in the 4 activities present there
    public static final By xactivities1_tab_bttnlazer=By.xpath("(//*[@id='collapse0']/div/div[1]/slick//div/button)[1]");
    public static final By xactivities1_tab_bttnxtra_gplay=By.xpath("(//*[@id='collapse0']/div/div[1]/slick//div/button)[3]");
    public static final By xactivities1_tab_bttn_gravity_ropes=By.xpath("(//*[@id='collapse0']/div/div[1]/slick//div/button)[4]");
    public static final By xactivities2_tab_bttnbowling=By.xpath("(//*[@id='collapse1']/div/div[1]/slick//div/button)[2]");
    public static final By xactivities2_tab_bttnlazer=By.xpath("(//*[@id='collapse1']/div/div[1]/slick//div/button)[1]");
    public static final By xactivities2_tab_bttnxtra_gplay=By.xpath("(//*[@id='collapse1']/div/div[1]/slick//div/button)[3]");
    public static final By xactivities2_tab_bttn_gravity_ropes=By.xpath("(//*[@id='collapse1']//div/button)[4]");
    public static final By xactivities3_tab_bttnbowling=By.xpath("(//*[@id='collapse2']/div/div[1]/slick//div/button)[2]");
    public static final By xactivities3_tab_bttnlazer=By.xpath("(//*[@id='collapse2']/div/div[1]/slick//div/button)[1]");
    public static final By xactivities3_tab_bttnxtra_gplay=By.xpath("(//*[@id='collapse2']/div/div[1]/slick//div/button)[3]");
    public static final By xactivities3_tab_bttn_gravity_ropes=By.xpath("(//*[@id='collapse2']/div/div[1]/slick//div/button)[4]");
    public static final By xactivities4_tab_bttnbowling=By.xpath("(//*[@id='collapse3']/div/div[1]/slick//div/button)[2]");
    public static final By xactivities4_tab_bttnlazer=By.xpath("(//*[@id='collapse3']/div/div[1]/slick//div/button)[1]");
    public static final By xactivities4_tab_bttnxtra_gplay=By.xpath("(//*[@id='collapse3']/div/div[1]/slick//div/button)[3]");
    public static final By xactivities4_tab_bttn_gravity_ropes=By.xpath("(//*[@id='collapse3']/div/div[1]/slick//div/button)[4]");
    public static final By xslct_your_food_tab=By.xpath("//*[@id='collapse_food']/p");
    public static final By xslct_bttn_of_food=By.xpath("(//*[@id='collapsefoods']/div/div[2]//div/button)[1]");//changing the number will change the food dish among 18 different dish's are available
    public static final By xsee_av_times_bttn=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'SEE AVAILABLE TIMES')])[1]");
    public static final By xmssg_under_av_bttn=By.xpath("(//*[@id='main-contentHome']//label[starts-with(text(),'Please select all your activities and food.')])[1]");
    public static final By xslct_a_diff_mainevent_bttn_config_pkg=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Select a different Main Event')]");
    public static final By xslct_a_diff_pkg_bttn_config_pkg=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Select a different Package')]");
    public static final By xchange_bttn_config_pkg=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Change')]");
    public static final By xtell_us_about_party_close_bttn=By.xpath("//*[@id='storeGuestModal']/div/div/button");
    //select your party time xpaths
    public static final By xheading_slct_your_party_time=By.xpath("//*[@id='storeTimeModal']//h2[starts-with(text(),'SELECT YOUR PARTY TIME')]");
    public static final By xcrossbttn_slct_your_party_time=By.xpath("//*[@id='storeTimeModal']/div/button");
    public static final By xstorename_slct_your_party_time=By.xpath("//*[@id='storeTimeModal']//span[1][starts-with(text(),'MAIN EVENT Knoxville')]");
    public static final By xselect_party_time_cross_bttn=By.xpath("//*[@id='storeTimeModal']/div/button");
    public static final By xpkgdetails_slct_your_party_time=By.xpath("//*[@id='storeTimeModal']//span[starts-with(text(),'Ultimate BIRTHDAY')]");
    public static final By xfeb=By.xpath("//*[@id='storeTimeModal']/div/form/div/div[1]/div[2]/div/div[2]");
    //partyordersummary xpaths
    public static final By xselect_diff_store_partyordersummary=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Select a different Main Event')]");
    public static final By xselect_diff_pkg_partyordersummary=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Select a different Package')]");
    public static final By xselect_diff_guestcount_partyordersummary=By.xpath("(//*[@id='main-contentHome']//a[starts-with(text(),'Change')])[1]");
    public static final By xselect_diff_time_partyordersummary=By.xpath("(//*[@id='main-contentHome']//a[starts-with(text(),'Change')])[2]");
    public static final By xstorename_partyordersummary=By.xpath("//*[@id='main-contentHome']//span[starts-with(text(),'MAIN EVENT Knoxville')]");
    public static final By xpkgname1_partyordersummary=By.xpath("(//*[@id='main-contentHome']//span[starts-with(text(),'Ultimate BIRTHDAY')])[1]");
    public static final By xpkgname2_partyordersummary=By.xpath("(//*[@id='main-contentHome']//span[starts-with(text(),'Ultimate BIRTHDAY')])[2]");
    public static final By xcalenderdetails_partyordersummary=By.xpath("//*[@id='main-contentHome']//div[starts-with(@class,'inside-calender')]");
    public static final By xpkgpriceperperson_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(@class,'package-price-big ng-binding')])[1]");
    public static final By xpkgpricefor_1st_addon_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(@class,'package-price-big ng-binding')])[2]");
    public static final By xpkgdet1_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Ultimate')])[1]");
    public static final By xquant1_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[5]");
    public static final By xpkgdet2_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Bowling')])[2]");
    public static final By xquant2_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[6]");
    public static final By xpkgdet3_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Gravity Ropes')])[1]");
    public static final By xquant3_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[7]");
    public static final By xpkgdet4_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Laser Tag')])[1]");
    public static final By xquant4_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[8]");
    public static final By xpkgdet5_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Extra Game Play')])[1]");
    public static final By xquant5_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[9]");
    public static final By xpkgdet6_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Bowling Pin Trophy')])[2]");
    public static final By xquant6_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[10]");
    public static final By xpkgdet7_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'Cheese Pizza')])[1]");
    public static final By xquant7_partyordersummary=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'1')])[11]");
    public static final By xsalesTax_withaddon=By.xpath("(//div[@class='subitems col-sm-6 text-right ng-binding'])[1]");
    public static final By xserviceTax_withaddon=By.xpath("(//div[@class='subitems col-sm-6 text-right ng-binding'])[2]");
    public static final By xtotalwithaddon=By.xpath("(//*[@id='main-contentHome']//div[starts-with(text(),'$365.63')])[1]");
    public static final By xsalesTax_withoutaddon=By.xpath("(//div[@class='subitems col-sm-6 text-right ng-binding'])[1]");
    public static final By xserviceTax_withoutaddon=By.xpath("(//div[@class='subitems col-sm-6 text-right ng-binding'])[2]");
    public static final By xamount_due_today=By.xpath("(//div[@class='subitems col-sm-6 text-right ng-binding'])[4]");
    public static final By xamount_paylater=By.xpath("(//div[@class='subitems col-sm-6 text-right ng-binding'])[4]");
    public static final By xtotalwithoutaddon=By.xpath("(//div[@class='col-md-4 text-right mainTotal ng-binding'])");
    public static final By xgotocart1_partyordersummary=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'GO TO CART')])[1]");
    public static final By xgotocart2_partyordersummary=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'GO TO CART')])[2]");
    public static final By xCONTINUESHOPPING1_partyordersummary=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'CONTINUE SHOPPING')])[1]");
    public static final By xCONTINUESHOPPING2_partyordersummary=By.xpath("(//*[@id='main-contentHome']//input[starts-with(@value,'CONTINUE SHOPPING')])[2]");
    public static final By xbowling_pin_trophy_text=By.xpath("//div[starts-with(text(),'Bowling Pin Trophy')]");
    public static final By xgoodie_bag_text=By.xpath("//div[starts-with(text(),'Goodie Bag')]");
    public static final By xbowling_pin_trophy_bttn=By.xpath("(//button[starts-with(text(),'SELECT')])[1]");
    public static final By xgoodie_bag_bttn=By.xpath("(//button[starts-with(text(),'SELECT')])[2]");
    public static final By xterms_and_conditions_party_ordersummary=By.xpath("(//label[@class='agreeTerms'])[1]");
    //public static final By xcrossbttn_slct_your_party_time=By.xpath("//*[@id='storeTimeModal']/div/button");
    //public static final By xcrossbttn_slct_your_party_time=By.xpath("//*[@id='storeTimeModal']/div/button");
    
    
    //cart page for Birthday Booking Flow
    public static final By xpkg_and_guest_details=By.xpath("(//span[@class='store-name'])");
    public static final By xstore_name=By.xpath("//div[@class='package-heading-big ng-binding']");
    public static final By xtotal_amount=By.xpath("(//div[@class='col-md-6 col-lg-6 col-xs-6 padding-0 ng-binding'])[1]");
    
    
    
    //Home page xpaths and css selectors 
    public static final By xHEADER_MAIN_EVENT_LOGO=By.xpath("//*[@id='maineventlogo']");
    public static final By xLOCATION_FINDER_ICON=By.xpath("//span[starts-with(text(),'FIND ME')]");
    public static final By xBOOK_NOW =By.xpath("//*[@id='booknowmenu'] ");
    public static final By xEAT_AND_DRINK_BUTTON =By.xpath("//*[@id='eatdrink']");
    public static final By xGAMES_AND_ACTIVITIES_BUTTON =By.xpath("//*[@id='gameactivity']");
    public static final By xPARTIES_AND_EVENT_BUTTON =By.xpath("//*[@id='partyevent']");
    public static final By xFUNCARD_BUTTON =By.xpath("//*[@id='funcardsss']");
    public static final By xSPECIALS_BUTTON =By.xpath("//*[@id='spcl']");
    public static final By xACCOUNT_BUTTON =By.xpath("//*[@id='langDropdown']");
    public static final By xACCOUNT_BUTTON_under_parties =By.xpath("//*[@id='myNavbar']/div[1]/div[2]/div/div[5]/div/div/div/div/div/a[2]/div/div/img");
    public static final By xLOCATION_BUTTON =By.cssSelector("#loc-text");
    public static final By xLOCATION_BUTTON_prod =By.cssSelector("#loc-text");
    public static final By xGIFT_CARDS_BUTTON =By.xpath("//*[@id='myNavbar']/div[2]/div[1]/ul/li[1]/a");
    public static final By xCAREERS_BUTTON =By.xpath("(//a[@data-ng-click='careerClicked()'])[2]");
    public static final By xCART_ICON =By.xpath("//div[@data-ng-enter='goToCart()']");
    public static final By xBIRTHDAY_BOOK_NOW_BUTTON =By.xpath("//*[@id='main-contentHome']/div[1]/div/section[2]/div/div/div[1]/div/div[2]/a/input");
    public static final By xGROUP_EVENTS_VIEW_DETAILS_BUTTON =By.xpath("//*[@id='main-contentHome']/div[1]/div/section[2]/div/div/div[2]/div/div[2]/a/input");
    public static final By xCOMPANY_EVENTS_LEARN_MORE_BUTTON =By.xpath("//*[@id='main-contentHome']/div[1]/div/section[2]/div/div/div[4]/div/div[2]/a/input");
    public static final By xSpecials_view_details_bttn =By.cssSelector("#main-contentHome > div.home-container.ng-scope > div > section:nth-child(2) > div > div > div:nth-child(2) > div > div.btn-holder > a > input");
    public static final By xbook_online_notify_close_bttn =By.cssSelector("#landingHome > div > div > div > button");
    public static final By xlocation_field =By.cssSelector("#locationInHeader");
    public static final By xview_details =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.row > div:nth-child(1) > a:nth-child(2) > input");
    public static final By xgallery_bttn =By.cssSelector("#main-contentHome > div:nth-child(2) > div.locationstoredetails.ng-scope > div:nth-child(4) > div > div.container-fluid > ul > li:nth-child(3) > a");
    public static final By xstore_time_wed =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    public static final By xstore_time_thur =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(5) > td:nth-child(2)");
    public static final By xstore_time_fri =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(6) > td:nth-child(2)");
    public static final By xstore_time_sat =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(7) > td:nth-child(2)");
    public static final By xstore_time_sun =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(1) > td:nth-child(2)");
    public static final By xstore_time_mon =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(2) > td:nth-child(2)");
    public static final By xstore_time_tue =By.cssSelector("#storeInfo > div.col-lg-5.col-md-5.col-sm-12.col-xs-12.each-details-item.col-lg-offset-4 > div.storeworkinghours > table > tbody > tr:nth-child(3) > td:nth-child(2)");
    public static final By xshow_hours_expand_bttn =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.row > div.col-xs-6.col-lg-6.col-md-6.col-sm-6.locationopeneventright > div");//2nd nth-child number directs to the show hours expand button serially like 1 will be 1st 2 will the 2nd store in the list
    public static final By xstore_show_hrs_wed =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(4) > td:nth-child(2)");//the 2nd last nth child number defines the store open close time serially 4-wednesday thus 5- thursday etc..
    public static final By xstore_show_hrs_thur =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(5) > td:nth-child(2)");
    public static final By xstore_show_hrs_fri =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(6) > td:nth-child(2)");
    public static final By xstore_show_hrs_sat =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(7) > td:nth-child(2)");
    public static final By xstore_show_hrs_sun =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(1) > td:nth-child(2)");
    public static final By xstore_show_hrs_mon =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(2) > td:nth-child(2)");
    public static final By xstore_show_hrs_tue =By.cssSelector("#main-contentHome > div:nth-child(1) > div > div.container-fluid > div > div > div:nth-child(1) > div.eventdetailsbody > div.eventalltime > table > tbody > tr:nth-child(3) > td:nth-child(2)");
    public static final By xcreate_an_account_bttn=By.xpath("//*[@id=\"myNavbar\"]//a[contains(text(),'Create an account')]");
    public static final By xregister_email=By.cssSelector("#RegisterEmail");   
    public static final By xregister_phoneno=By.cssSelector("#RegisterPhoneno");
    public static final By xregister_bttn_in_sign_in=By.xpath("//*[@value='REGISTER']");
    //*************(1/14/2019)**************
    public static final By xbday_under_book_now=By.xpath("(//a[starts-with(text(),'BIRTHDAY PARTIES')])[1]");
    public static final By xbowling_under_book_now=By.xpath("(//a[starts-with(text(),'BOWLING')])[1]");
    public static final By xcorporate_under_book_now=By.xpath("(//a[starts-with(text(),'COMPANY EVENTS')])[1]");
    public static final By xgroup_under_book_now=By.xpath("(//a[starts-with(text(),'GROUP EVENTS')])[1]");
    public static final By xkidsbday_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view kids-birthday-party')])[1]"); //1st implementation of alt tag related xpath using contains keyword
    public static final By xkidsbday_under_parties=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view kids-birthday-party')])[2]");
    public static final By xadultsbday_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view adults-birthday-party')])[1]");
    public static final By xadultsbday_under_parties=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view adults-birthday-party')])[2]");
    public static final By xcompnay_events_under_parties=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view holiday-parties')])[2]");
    public static final By xgroup_events_under_parties=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view group-events')]");
    public static final By xgroup_of_20_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view group-of-20')])[1]");
    public static final By xgroup_of_21_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view group-of-21+')])[1]");
    public static final By xteambulding_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view team-building')])[1]");
    public static final By xhalfdfday_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view half/fullday-meetings')])[1]");
    public static final By xeappreciation_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view employee-appreciation')])[1]");
    public static final By xholidayparty_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view holiday-parties')])[1]");
    public static final By xcompanypicnic_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view company-picnics')])[1]");
    public static final By xhappyhr_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view happy-hours')])[1]");
    public static final By xffbuyout_under_company_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view full-facility-buyout')])[1]");
    public static final By xschool_under_group_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view school')])[1]");
    public static final By xyouthevents_under_group_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view youth-events')])[1]");
    public static final By xlockins_under_group_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view lock-ins')])[1]");
    public static final By xendofseason_under_group_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view sport-endof-season')])[1]");
    public static final By xfundraiser_under_group_under_book_now=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view fundraisers')])[1]");
    public static final By xEAT_AND_DRINK=By.xpath("//*[@id='eatdrink']");
    public static final By xBar_under_EAT_AND_DRINK=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view bar')]");
    public static final By xDining_under_EAT_AND_DRINK=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view dinning')]");
    public static final By xEventMenu_under_EAT_AND_DRINK=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view event-menu')]");
    public static final By xGames_And_Activities=By.xpath("//*[@id='gameactivity']");
    public static final By xBowling_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view bowling')]");
    public static final By xArcade_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view arcade-games')]");
    public static final By xLaser_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view laser-tag')]");
    public static final By xBilliards_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view billiards')]");
    public static final By xGravity_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view gravity-ropes')]");
    public static final By xKaraoke_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view karaoke')]");
    public static final By xmini_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view mini-golf')]");
    public static final By xRock_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view rock-climbing')]");
    public static final By xVR_under_Games_And_Activities=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view virtual-reality')]");
    public static final By xParties_And_Events=By.xpath("//*[@id='partyevent']");
    public static final By xkidsbday_under_Parties_And_Events=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view kids-birthday-party')])[2]");
    public static final By xadultsbday_under_Parties_And_Events=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view adults-birthday-party')])[2]");
    public static final By xcorporate_under_Parties_And_Events=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view holiday-parties')])[2]");
    public static final By xgroupevents_under_Parties_And_Events=By.xpath("(//*[@id='myNavbar']//img[contains(@alt,'click to view group-events')])");
    public static final By xFuncards=By.xpath("//*[@id='funcardsss']");
    public static final By xbuy_under_Funcards=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view buy-funcard')]");
    public static final By xSIGNUP_under_Funcards=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view account-signup')]");
    public static final By xCHECKBALANCE_under_Funcards=By.xpath("//*[@id='myNavbar']//img[contains(@alt,'click to view check balance')]");
    public static final By xkids_bday_header=By.xpath("//*[@id='main-contentHome']//h1[contains(text(),'ALL-NEW VIP BIRTHDAY PARTY EXPERIENCE')]");
    public static final By xadults_bday_header=By.xpath("//*[@id='main-contentHome']//h1[contains(text(),'Adult Birthday Parties')]");
    //24 jan 2019
    public static final By xstore_location_fetch_in_ordersummary_page=By.xpath("//*[@id='main-contentHome']//span[contains(text(),'MAIN EVENT Knoxville')]");//bday flow same
    public static final By xduration_noofbowlers_lanes_fetch=By.xpath("//*[@id='main-contentHome']/div[2]/div[1]/div/div/ul/li[2]/div/span");
    public static final By xdate_fetch=By.xpath("//*[@id='main-contentHome']/div[2]/div[1]/div/div/ul/li[3]/div/span");//bday only time shown
    public static final By xaddon_heading_order_summary_page=By.xpath("(//*[@id='main-contentHome']//h2[contains(text(),'Increase your fun with our add-ons ')])[1]");//bday flow same
    public static final By xaddon_heading_10$order_summary_page=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),'$10 FUNcard for $10.00')])[1]");
    public static final By xaddon_heading_5$order_summary_page=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),'$5 FUNcard for $5.00')])[1]");
    public static final By xaddon_heading_10$seelct_bttn_order_summary_page=By.xpath("(//*[@id='main-contentHome']//button[contains(text(),'SELECT')])[1]");
    public static final By xaddon_heading_5$select_bttn_order_summary_page=By.xpath("(//*[@id='main-contentHome']//button[contains(text(),'SELECT')])[2]");
    public static final By xaddon_heading_10$increase_bttn_order_summary_page=By.cssSelector("#main-contentHome > div:nth-child(2) > div.packagelist-container.hidden-xs.ng-scope > div > div > div.col-xs-12.col-md-8.package-list > div.col-xs-12.addonsect > div > div > div > slick > div > div > div.col-md-4.col-sm-4.margin-bottom-15.ng-scope.slick-slide.slick-current.slick-active > div > div.addon-contents.margin-top-10 > div.col-lg-6.col-xs-12.padding0 > quantityspinner > div > div > div.spinnerPlus > span > img");
    public static final By xaddon_heading_10$decrease_bttn_order_summary_page=By.cssSelector("#main-contentHome > div:nth-child(2) > div.packagelist-container.hidden-xs.ng-scope > div > div > div.col-xs-12.col-md-8.package-list > div.col-xs-12.addonsect > div > div > div > slick > div > div > div.col-md-4.col-sm-4.margin-bottom-15.ng-scope.slick-slide.slick-current.slick-active > div > div.addon-contents.margin-top-10 > div.col-lg-6.col-xs-12.padding0 > quantityspinner > div > div > div.spinnerMinus > span > img");
    public static final By xaddon_heading_5$increase_bttn_order_summary_page=By.cssSelector("#main-contentHome > div:nth-child(2) > div.packagelist-container.hidden-xs.ng-scope > div > div > div.col-xs-12.col-md-8.package-list > div.col-xs-12.addonsect > div > div > div > slick > div > div > div:nth-child(2) > div > div.addon-contents.margin-top-10 > div.col-lg-6.col-xs-12.padding0 > quantityspinner > div > div > div.spinnerPlus > span > img");
    public static final By xaddon_heading_5$decrease_bttn_order_summary_page=By.cssSelector("#main-contentHome > div:nth-child(2) > div.packagelist-container.hidden-xs.ng-scope > div > div > div.col-xs-12.col-md-8.package-list > div.col-xs-12.addonsect > div > div > div > slick > div > div > div:nth-child(2) > div > div.addon-contents.margin-top-10 > div.col-lg-6.col-xs-12.padding0 > quantityspinner > div > div > div.spinnerMinus > span > img");
    public static final By xstore_location_change_bttn_ordersummarypage=By.xpath("(//*[@id='main-contentHome']//a[contains(text(),'Change')])[1]");//date change for bday flow
    public static final By xduration_change_bttn_ordersummarypage=By.xpath("(//*[@id='main-contentHome']//a[contains(text(),'Change')])[2]");
    public static final By xdate_change_bttn_ordersummarypage=By.xpath("(//*[@id='main-contentHome']//a[contains(text(),'Change')])[3]");
    public static final By xslct_bowling_time_popup_close_bttn=By.xpath("//*[@id='storeTimeModal']/div/button");
    //25 jan 2019
    public static final By x1bowling_lane_charge_per_hour=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]");
    public static final By xadult_bowling_shoe_quantity=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]");
    public static final By xchild_bowling_shoe_quantity=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div[2]");
    public static final By xadult_bowling_shoe_perunit_price=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[3]");
    public static final By xchild_bowling_shoe_perunit_price=By.xpath("//*[@id=\"main-contentHome\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div[3]");
    public static final By xadult_bowling_shoe_total_price=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[4]");
    public static final By xchild_bowling_shoe_total_price=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div[4]");
    public static final By xsub_total=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div[2]");
    public static final By xsales_tax=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[6]/div/div[4]");//bday flow diff
    public static final By xtotal=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[8]/div/div[2]");//bday diff
    public static final By xADD_ONSheading_SECTION_IN_TAX=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),'ADD ONS')])[1]");
    public static final By xADD_10$quantity_SECTION_IN_TAX=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),5)])[8]");
    public static final By xADD_10$unitprice_SECTION_IN_TAX=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),'$10.00')])[3]");
    public static final By xADD_10$totalprice_SECTION_IN_TAX=By.xpath("(//*[@id='main-contentHome']//div[contains(text(),5)])[9]");
    public static final By xADD_10$trash_bttn=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div/slick/div/div/div[1]/div/div[2]/div[1]/div[2]/div/span");
    public static final By xADD_5$quantity_SECTION_IN_TAX=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div[2]/div[2]");
    public static final By xADD_5$unitprice_SECTION_IN_TAX=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div[2]/div[3]");
    public static final By xADD_5$totalprice_SECTION_IN_TAX=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[4]/div/div[2]/div[4]");
    public static final By xADD_5$trash_bttn=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div/slick/div/div/div[2]/div/div[2]/div[1]/div[2]/div/span");
    //29th january 2019
    public static final By xtotal1=By.xpath("//*[@id='main-contentHome']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[9]/div/div[2]");
    //5th feburary 2019
    public static final By xterms_and_conditions=By.xpath("//*[@id='main-contentHome']//a[starts-with(text(),'Terms and Conditions.')]");
    public static final By xterms_and_conditions_close_bttn=By.xpath("//*[@id='commonModal']//button[starts-with(text(),'Close')]");
    public static final By xterms_and_conditions_checkbox=By.xpath("(//*[@id='main-contentHome']//label[starts-with(@for,'agreeTermsmob')])[1]");
    public static final By xterms_and_conditions_checkbox_cart_page=By.xpath("(//*[@id='main-contentHome']//label[starts-with(@for,'agreeTerms')])[1]");
    //Secure UAT xpaths
    public static final By xuser_id=By.xpath("/html//input[starts-with(@name,'SU_UserName')]");
    public static final By xpassword_secureUAT=By.xpath("/html//input[starts-with(@type,'password')]");
    public static final By xlogin_secureUAT=By.xpath("/html//button");
    
    //RTE validation script xpaths 5/29/2019
    public static final By xenter_location_field=By.id("locationInHeader");
    public static final By xfind_store_button=By.xpath("//input[@value='FIND STORES']");
    public static final By xstatic_google_map=By.xpath("//img[@alt='Google Map']");
    public static final By xseelct_store_button_in_dynamic_map=By.xpath("//input[@value='SELECT STORE']");
    public static final By xRTE_text=By.xpath("//div[@class='marquee ng-binding']");
}
