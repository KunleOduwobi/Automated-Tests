package functionalTests;

public class Elements {

	public Elements() {

	}

	public void HelperTest() {
		System.out.println("Elements helper test successful");
	}

	// LOGIN
	private String facebookBtnId = "com.lenddo.mobile.paylater:id/btn_fbconnect_connect"; // android.widget.Button
	private String facebookBtnXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.RelativeLayout[1]/android.widget.Button[1]";
	private String PIN1Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android."
			+ "widget.LinearLayout[1]/android.widget.TextView[1]";
	private String PIN2Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget."
			+ "LinearLayout[1]/android.widget.TextView[2]";
	private String PIN3Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget."
			+ "LinearLayout[1]/android.widget.TextView[3]";
	private String PIN4Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget."
			+ "LinearLayout[2]/android.widget.TextView[1]";
	private String ConfirmPINTitleXpath = "//android.widget.LinearLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android.widget."
			+ "FrameLayout[1]/android.view.View[1]/android.widget."
			+ "RelativeLayout[1]/android.widget.TextView[1]";

	// Facebook Login
	public String getFacebookBtnId() {
		return this.facebookBtnId;
	}

	public void setFacebookBtnId(String value) {
		this.facebookBtnId = value;
	}

	public String getFacebookBtnXpath() {
		return this.facebookBtnXpath;
	}

	public void setFacebookBtnXpath(String value) {
		this.facebookBtnXpath = value;
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

	// PIN Page title
	public String getPINPageTitleXpath() {
		return this.ConfirmPINTitleXpath;
	}

	public void setPINPageTitleXpath(String value) {
		this.ConfirmPINTitleXpath = value;
	}

	// BANK INFORMATION

	private String BVNXpath = "//android.widget.LinearLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android.widget."
			+ "FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android."
			+ "widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]";
	private String BVNId = "id: com.lenddo.mobile.paylater:id/edt_bank_bvn";

	private String BanksXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view."
			+ "View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]";
	private String BanksId = "com.lenddo.mobile.paylater:id/spn_banks";

	private String BankXpath = "//android.widget.ListView[1]/android.widget.CheckedTextView[4]";

	private String BankText = "Diamond Bank";

	private String AccountNameXpath = "//android.widget.LinearLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]";
	private String AccountNameId = "com.lenddo.mobile.paylater:id/edt_bank_accountname";

	private String AccountNumberXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.EditText[1]";
	private String AccountNumberId = "com.lenddo.mobile.paylater:id/edt_bank_accountnumber";

	private String NextBtnXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.Button[1]";
	private String NextBtnId = "com.lenddo.mobile.paylater:id/btn_bankinfo_apply";

	// BVN
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

	// Banks
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

	// Bank
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

	// Account Name
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

	// Account Number
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

	// Next
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

	// USER DETAILS
	String BVN = "20160514520";

	public String getBVN() {
		return this.BVN;
	}

	public void setBVN(String value) {
		this.BVN = value;

	}

	// APPLY FOR LOAN
	// Step 1: Personal Info Xpath
	private String Step1Xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view."
			+ "View[1]/android.widget.LinearLayout[2]/android.widget.Button[1]";

	public String getStep1Xpath() {
		return Step1Xpath;
	}

	public void setStep1Xpath(String step1Xpath) {
		Step1Xpath = step1Xpath;
	}

	// First Name Xpath
	private String FirstNameXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget"
			+ ".LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget."
			+ "LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]";

	public String getFirstNameXpath() {
		return FirstNameXpath;
	}

	public void setFirstNameXpath(String firstNameXpath) {
		FirstNameXpath = firstNameXpath;
	}

	// First Name
	private String FisrtName = "Kunle";

	public String getFisrtName() {
		return FisrtName;
	}

	public void setFisrtName(String fisrtName) {
		FisrtName = fisrtName;
	}

	// Last Name Xpath
	private String LastNameXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget."
			+ "LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.EditText[1]";

	public String getLastNameXpath() {
		return LastNameXpath;
	}

	public void setLastNameXpath(String lastNameXpath) {
		LastNameXpath = lastNameXpath;
	}

	// Last Name
	private String LastName = "Oduwobi";

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	// Date of Birth Xpath
	private String DoBXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android.widget."
			+ "LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.EditText[1]";

	public String getDoBXpath() {
		return DoBXpath;
	}

	public void setDoBXpath(String doBXpath) {
		DoBXpath = doBXpath;
	}

	// Date of Birth
	private String DoB = "1985-08-01";

	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	// Year List Xpath
	private String YearListXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.DatePicker[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

	public String getYearListXpath() {
		return YearListXpath;
	}

	public void setYearListXpath(String yearListXpath) {
		YearListXpath = yearListXpath;
	}

	// Date Xpath
	private String DateXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget."
			+ "ViewAnimator[1]/android.widget.ListView[1]/android.view.View[1]/android.view.View[5]";

	public String getDateXpath() {
		return DateXpath;
	}

	public void setDateXpath(String dateXpath) {
		DateXpath = dateXpath;
	}

	// Submit Calender
	private String CalenderSubmit = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]";

	public String getCalenderSubmit() {
		return CalenderSubmit;
	}

	public void setCalenderSubmit(String calenderSubmit) {
		CalenderSubmit = calenderSubmit;
	}

	// Male Gender
	private String MaleGender = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]";

	public String getMaleGender() {
		return MaleGender;
	}

	public void setMaleGender(String maleGender) {
		MaleGender = maleGender;
	}

	// Phone Number Xpath
	private String PhoneNumberXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]";

	public String getPhoneNumberXpath() {
		return PhoneNumberXpath;
	}

	public void setPhoneNumberXpath(String phoneNumberXpath) {
		PhoneNumberXpath = phoneNumberXpath;
	}

	// Phone Number
	private String PhoneNumber = "08039414600";

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	// Email Xpath
	private String EmailXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.EditText[1]";

	public String getEmailXpath() {
		return EmailXpath;
	}

	public void setEmailXpath(String emailXpath) {
		EmailXpath = emailXpath;
	}

	// Email
	private String Email = "kunle.oduwobi4@gmail.com";

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	// Marital Status List
	private String MaritalStatusList = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView[1]";

	public String getMaritalStatusList() {
		return MaritalStatusList;
	}

	public void setMaritalStatusList(String maritalStatusList) {
		MaritalStatusList = maritalStatusList;
	}

	// Select Marital Status
	private String Single = "//android.widget.ListView[1]/android.widget.CheckedTextView[2]";

	public String getSingle() {
		return Single;
	}

	public void setSingle(String single) {
		Single = single;
	}

	// List Number of Children
	private String ChildrenList = "//android.widget.LinearLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.Spinner[2]/android.widget.TextView[1]";

	public String getChildrenList() {
		return ChildrenList;
	}

	public void setChildrenList(String childrenList) {
		ChildrenList = childrenList;
	}

	// Number of Children
	private String NumberOfChildren = "//android.widget.ListView[1]/android.widget.CheckedTextView[2]";

	public String getNumberOfChildren() {
		return NumberOfChildren;
	}

	public void setNumberOfChildren(String numberOfChildren) {
		NumberOfChildren = numberOfChildren;
	}

	// Mother's Maiden Name Xpath
	private String MotherMaidenNameXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.EditText[1]";

	public String getMotherMaidenNameXpath() {
		return MotherMaidenNameXpath;
	}

	public void setMotherMaidenNameXpath(String motherMaidenNameXpath) {
		MotherMaidenNameXpath = motherMaidenNameXpath;
	}

	// Mother's Maiden name
	private String MotherMaidenName = "Kehinde";

	public String getMotherMaidenName() {
		return MotherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		MotherMaidenName = motherMaidenName;
	}

	// Save and Exit
	private String SaveAndExit = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "view.View[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]";

	public String getSaveAndExit() {
		return SaveAndExit;
	}

	public void setSaveAndExit(String saveAndExit) {
		SaveAndExit = saveAndExit;
	}

	private String Next = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "LinearLayout[1]/android.widget.FrameLayout[1]/android.view."
			+ "View[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]";

	public String getNext() {
		return Next;
	}

	public void setNext(String next) {
		Next = next;
	}

	// EDUCATION AND EMPLOYMENT
	// Level of Education
	private String EducationXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android."
			+ "widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView[1]";
	private String Education = "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android."
			+ "widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[1]/android.widget.LinearLayout[1]/android"
			+ ".widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView[1]";

	public String getEducationXpath() {
		return EducationXpath;
	}

	public void setEducationXpath(String educationXpath) {
		EducationXpath = educationXpath;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	// Employment Status
	private String EmploymentXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android."
			+ "widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget"
			+ ".LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[2]/android.widget.TextView[1]";
	private String Employment = "//android.widget.ListView[1]/android.widget.CheckedTextView[6]";

	public String getEmploymentXpath() {
		return EmploymentXpath;
	}

	public void setEmploymentXpath(String employmentXpath) {
		EmploymentXpath = employmentXpath;
	}

	public String getEmployment() {
		return Employment;
	}

	public void setEmployment(String employment) {
		Employment = employment;
	}

	// Source of Income
	private String IncomeXpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android"
			+ ".widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget."
			+ "LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[1]/android.widget.LinearLayout[1]/android"
			+ ".widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]";

	public String getIncomeXpath() {
		return IncomeXpath;
	}

	public void setIncomeXpath(String incomeXpath) {
		IncomeXpath = incomeXpath;
	}

	public String getIncome() {
		return Income;
	}

	public void setIncome(String income) {
		Income = income;
	}

	private String Income = "Allowance";
	
	
//	ADDRESS INFORMATION

}
