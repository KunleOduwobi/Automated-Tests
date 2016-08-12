package funtionalTests;

public class Elements {

	public Elements() {

	}

	

	// LOGIN
	String facebookBtnId = "com.lenddo.mobile.paylater:id/btn_fbconnect_connect";
	String PIN1Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
	String PIN2Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]";
	String PIN3Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[3]";
	String PIN4Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]";

	
	// Facebook Login
	public String getFacebookBtnId() {
		return this.facebookBtnId;
	}

	public void setFacebookBtnId(String value) {
		this.facebookBtnId = value;
	}

	// Set, enter PIN
	// PIN1
	public String getPIN1Xpath() {
		return this.PIN1Xpath;
	}

	public void setPIN1Xpath(String value) {
		this.PIN1Xpath = value;
	}

	// PIN2
	public String getPIN2Xpath() {
		return this.PIN2Xpath;
	}

	public void setPIN2Xpath(String value) {
		this.PIN2Xpath = value;
	}

	// PIN3
	public String getPIN3Xpath() {
		return this.PIN3Xpath;
	}

	public void setPIN3Xpath(String value) {
		this.PIN3Xpath = value;
	}

	// PIN4
	public String getPIN4Xpath() {
		return this.PIN4Xpath;
	}

	public void setPIN4Xpath(String value) {
		this.PIN4Xpath = value;
	}
	
	
//	BANK INFORMATION
	String BVNXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]";
	String BVNId = "id: com.lenddo.mobile.paylater:id/edt_bank_bvn";

	String BanksXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]";
	String BanksId = "com.lenddo.mobile.paylater:id/spn_banks";

	String BankXpath = "//android.widget.ListView[1]/android.widget.CheckedTextView[2]";
	String BankText = "Access Bank";
//	resource-id: android:id/text1


	String AccountNameXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]";
	String AccountNameId = "com.lenddo.mobile.paylater:id/edt_bank_accountname";

	String AccountNumberXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.EditText[1]";
	String AccountNumberId = "com.lenddo.mobile.paylater:id/edt_bank_accountnumber";

	String NextBtnXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.Button[1]";
	String NextBtnId = "com.lenddo.mobile.paylater:id/btn_bankinfo_apply";

//	BVN
	public String getBVNXpath() {
		return this.BVNXpath;
	}

	public void setBVNXpath(String value) {
		this.BVNXpath = value;
	}
	
	public String getBVNId() {
		return this.BVNId;
	}

	public void setBVNId(String value) {
		this.BVNId = value;
	}
	
//	Banks
	public String getBanksXpath() {
		return this.BanksXpath;
	}

	public void setBanksXpath(String value) {
		this.BanksXpath = value;
	}
	
	public String getBanksId() {
		return this.BanksId;
	}

	public void setBanksId(String value) {
		this.BanksId = value;
	}
	
//	Bank
	public String getBankXpath() {
		return this.BankXpath;
	}

	public void setBankXpath(String value) {
		this.BankXpath = value;
	}
	
	public String getBankText() {
		return this.BankText;
	}

	public void setBankText(String value) {
		this.BankText = value;
	}
	
//	Account Name
	public String getAccountNameXpath() {
		return this.AccountNameXpath;
	}

	public void setAccountNameXpath(String value) {
		this.AccountNameXpath = value;
	}
	
	public String getAccountNameId() {
		return this.AccountNameId;
	}

	public void setAccountNameId(String value) {
		this.AccountNameId = value;
	}
	
//	Account Number
	public String getAccountNumberXpath() {
		return this.AccountNumberXpath;
	}

	public void setAccountNumberXpath(String value) {
		this.AccountNumberXpath = value;
	}
	
	public String getAccountNumberId() {
		return this.AccountNumberId;
	}

	public void setAccountNumberId(String value) {
		this.AccountNumberId = value;
	}
	
//	Next
	public String getNextBtnXpath() {
		return this.NextBtnXpath;
	}

	public void setNextBtnXpath(String value) {
		this.NextBtnXpath = value;
	}
	
	public String getNextBtnId() {
		return this.NextBtnId;
	}

	public void setNextBtnId(String value) {
		this.NextBtnId = value;
	}
	
	

}
