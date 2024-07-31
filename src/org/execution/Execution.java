package org.execution;

import org.base.Base;
import org.repository.Repository;
import org.testdata.TestData;

public class Execution extends Repository
// all data are passed and starts the execution ... all data arev in encrypted form ie abstraction--- all implementation details are hidden from user .
{
public static void main(String[] args) throws InterruptedException {
	Base.browserlaunch(TestData.cBrowser);
	Base.maxwindow();
	//Base.getUrl(TestData.facebookUrl);
	Base.getUrl("https://netbanking.hdfcbank.com/netbanking/");
	Base.wait(2000);
	Base.click(Repository.tagname("frame"));
	Base.frameindex(driver, 0);
	Base.wait(2000);
	//Base.inputText(Repository.id(TestData.fbpassvalue),TestData.pass );
	//Base.wait(2000);
	//Base.click(Repository.xpath(TestData.loginbtn));
	Base.inputText(Repository.xpath("//input[@type='text']"), "vishnu");
	//Base.alertsaccept(driver);
}
}
