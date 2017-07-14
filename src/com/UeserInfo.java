package com;

public class UeserInfo {
		private String userName;
		private String password;
		private String idCard;
		private int _id;
		private double money;

		/*public void UserInfo(){
			super();
		}*/
		public void UserInfo(int _id, Double money,String userName,String  password,String idCard){
			//super();
			this._id = _id;
			this.userName = userName;
			this.password = password;
			this.idCard = idCard;
			this.money = money;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getIdCard() {
			return idCard;
		}
		public void setIdCard(String idCard) {
			this.idCard = idCard;
		}
		public int get_id() {
			return _id;
		}
		public void set_id(int _id) {
			this._id = _id;
		}
		public double getMoney() {
			return money;
		}
		public void setMoney(double money) {
			this.money = money;
		}
}
