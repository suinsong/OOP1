
public class Book {


		
		private String strTitle;
		private String strAuthor;
		private int intPrice;
		
		
		
		public String getStrTitle() {
			return strTitle;
		}
		public void setStrTitle(String strTitle) {
			this.strTitle = strTitle;
		}
		public String getStrAuthor() {
			return strAuthor;
		}
		public void setStrAuthor(String strAuthor) {
			this.strAuthor = strAuthor;
		}
		public int getIntPrice() {
			return intPrice;
		}
		public void setIntPrice(int intPrice) {
			this.intPrice = intPrice;
		}
		@Override
		public String toString() {
			return "J68 [strTitle=" + strTitle + ", strAuthor=" + strAuthor + ", intPrice=" + intPrice + "]";
		}
		public Book(String strTitle, String strAuthor, int intPrice) {
			super();
			this.strTitle = strTitle;
			this.strAuthor = strAuthor;
			this.intPrice = intPrice;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
	}


