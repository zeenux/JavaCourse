package bankproject;


class Customer{

  public Customer(String fname, String lname, String cnic, String address, String accountID, String uuid){
    this.fname=fname;
    this.lname=lname;
    this.cnic=cnic;
    this.address=address;
    this.accountID=accountID;
    this.uuid=uuid;
  }
  private String fname, lname, address, uuid, accountID,cnic;

	/**
	* Returns value of fname
	* @return
	*/
	public String getFname() {
		return fname;
	}

	/**
	* Sets new value of fname
	* @param
	*/
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	* Returns value of lname
	* @return
	*/
	public String getLname() {
		return lname;
	}

	/**
	* Sets new value of lname
	* @param
	*/
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	* Returns value of address
	* @return
	*/
	public String getAddress() {
		return address;
	}

	/**
	* Sets new value of address
	* @param
	*/
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	* Returns value of uuid
	* @return
	*/
	public String getUuid() {
		return uuid;
	}

	/**
	* Sets new value of uuid
	* @param
	*/
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	* Returns value of accountID
	* @return
	*/
	public String getAccountID() {
		return accountID;
	}

	/**
	* Sets new value of accountID
	* @param
	*/
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	/**
	* Returns value of cnic
	* @return
	*/
	public String getCnic() {
		return cnic;
	}

	/**
	* Sets new value of cnic
	* @param
	*/
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
  public String toString(){
    return "FIRST NAME: "+this.fname+" \nLAST NAME:\t "+ lname+" \nADDRESS: \t"+ address +"\nACCOUNT_ID:\t"+ accountID+ "\nCNIC:\t" +cnic;
  }
}
