package Dao01;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Book;

public class InsertIntoInterface implements DaoInterface {

	private JdbcTemplate jtemp;
	
		public JdbcTemplate getJtemp() {
		return jtemp;
	}

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

		@Override
	public void insert(Book b) {
	
			Object[] args= {b.getTitle(),b.getAuthor(),b.getPages(),b.getCost(),b.getPub()};
	
	jtemp.update("insert into Book(title,author,pages,cost,pub) values(?,?,?,?,?)",args);
	                                                                              
		
		
		// TODO Auto-generated method stub
		
	}

}
