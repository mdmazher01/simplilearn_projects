



import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class User {
	
		@Id
		@Column(name = "Id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String Id;
		
		

		@Column(name = "Name")
		private String Name;
	
		@Column(name = "Stock")
		private String Stock;
		
		@Column(name = "Price")
		private String Price;
	


		public String getId() {
			return Id;
		}

		public void setId(int id) {
			Id = Id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getStock() {
			return Stock;
		}

		public void setStock(String stock) {
			Stock = stock;
		}

		public String getPrice() {
			return Price;
		}

		public void setPrice(String price) {
			Price = price;
		}

		@Override
		public String toString() {
			return "User [Id=" + Id + ", Name=" + Name +", Stock=" + Stock +", Price=" + Price +"]";
		}
	
		public User(String Name, String Stock, String Price) {
			this.Name = Name;
			this.Stock = Stock;
			this.Price = Price;
			
		}
	
		User() {
	
		}
	
		
		

}
