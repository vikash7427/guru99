package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//stdrules:To Provide TestData & Objects related to whole application
	public WebDriver driver;
	//*************TestData
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String FN  = "Radhe";
	public String LN  = "Shyam";
	//*************Objects
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_Login     = "Submit";
	public String link_logout   = "Logout";
	public String frm_empInf    = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String txt_FN        = "txtEmpFirstName";
	public String txt_LN        = "txtEmpLastName";
	public String btn_Save      = "btnEdit";
	}

