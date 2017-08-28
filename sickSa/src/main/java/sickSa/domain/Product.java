package sickSa.domain;

public class Product {
		
		private int pdt_id;
		private String pdt_name;
		private int pdt_price;
		private String pdt_imgsrc_L;
		private String pdt_imgsrc_S;
		private String pdt_description;
		private int pdct_id;
		
		public Product(){
			
		}
		
		public Product(int pdt_id, String pdt_name, int pdt_price, String pdt_imgsrc_L, String pdt_imgsrc_S,
				String pdt_description, int pdct_id) {
			super();
			this.pdt_id = pdt_id;
			this.pdt_name = pdt_name;
			this.pdt_price = pdt_price;
			this.pdt_imgsrc_L = pdt_imgsrc_L;
			this.pdt_imgsrc_S = pdt_imgsrc_S;
			this.pdt_description = pdt_description;
			this.pdct_id = pdct_id;
		}



		public int getPdt_id() {
			return pdt_id;
		}



		public void setPdt_id(int pdt_id) {
			this.pdt_id = pdt_id;
		}



		public String getPdt_name() {
			return pdt_name;
		}



		public void setPdt_name(String pdt_name) {
			this.pdt_name = pdt_name;
		}



		public int getPdt_price() {
			return pdt_price;
		}



		public void setPdt_price(int pdt_price) {
			this.pdt_price = pdt_price;
		}



		public String getPdt_imgsrc_L() {
			return pdt_imgsrc_L;
		}



		public void setPdt_imgsrc_L(String pdt_imgsrc_L) {
			this.pdt_imgsrc_L = pdt_imgsrc_L;
		}



		public String getPdt_imgsrc_S() {
			return pdt_imgsrc_S;
		}



		public void setPdt_imgsrc_S(String pdt_imgsrc_S) {
			this.pdt_imgsrc_S = pdt_imgsrc_S;
		}



		public String getPdt_description() {
			return pdt_description;
		}



		public void setPdt_description(String pdt_description) {
			this.pdt_description = pdt_description;
		}



		public int getPdct_id() {
			return pdct_id;
		}



		public void setPdct_id(int pdct_id) {
			this.pdct_id = pdct_id;
		}

		@Override
		public String toString() {
			return "Product [pdt_id=" + pdt_id + ", pdt_name=" + pdt_name + ", pdt_price=" + pdt_price
					+ ", pdt_imgsrc_L=" + pdt_imgsrc_L + ", pdt_imgsrc_S=" + pdt_imgsrc_S + ", pdt_description="
					+ pdt_description + ", pdct_id=" + pdct_id + "]";
		}

		
	}


