package Salesforce_POM;

import org.testng.annotations.Test;

public class Ten_Salesforce_POMTests extends Base_Functions{
	@Test
	public void TC1() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("<User@gmail.com>");
		loginpage.clickLogin();
	}
	@Test
	public void TC2() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		loginpage.clickLogin();
	}
	@Test
	public void TC3() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		loginpage.rememberMe();
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		home.Logout();
	}
	@Test
	public void TC8() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		home.DeveloperConsole();
	}
	@Test
	public void TC9() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		home.Logout();
	}
	@Test
	public void TC15() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		driver = home.allTabs();
		AllTabs tabs = new AllTabs(driver);
		driver = tabs.clickOnOppurtunities();
	}
	@Test
	public void TC17() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		driver = home.allTabs();
		AllTabs tabs = new AllTabs(driver);
		driver = tabs.clickOnOppurtunities();
		OppurtunitiesPage opp = new OppurtunitiesPage(driver);
		opp.clickPipeline();
	}
	@Test
	public void TC18() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		driver = home.allTabs();
		AllTabs tabs = new AllTabs(driver);
		driver = tabs.clickOnOppurtunities();
		OppurtunitiesPage opp = new OppurtunitiesPage(driver);
		opp.clickStuck();
	}
	@Test
	public void TC20() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		driver = home.allTabs();
		AllTabs tabs = new AllTabs(driver);
		driver = tabs.clickOnLeads();
	}
	@Test
	public void TC21() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		HomePage home = new HomePage(driver);
		driver = home.allTabs();
		AllTabs tabs = new AllTabs(driver);
		driver = tabs.clickOnLeads();
		LeadsPage leads = new LeadsPage(driver);
		leads.view();
	}
}
