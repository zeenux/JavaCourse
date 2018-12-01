package bankproject;
abstract class Bank
{
  private String bankName, bankAddress, branchNo;
  public abstract boolean deposit();
  public abstract boolean withdraw();

  /**
	* Returns value of bankName
	* @return
	*/
	public String getBankName() {
		return bankName;
	}

	/**
	* Sets new value of bankName
	* @param
	*/
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	* Returns value of bankAddress
	* @return
	*/
	public String getBankAddress() {
		return bankAddress;
	}

	/**
	* Sets new value of bankAddress
	* @param
	*/
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	/**
	* Returns value of branchNo
	* @return
	*/
	public String getBranchNo() {
		return branchNo;
	}

	/**
	* Sets new value of branchNo
	* @param
	*/
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
}
