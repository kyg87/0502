package com.newlecture.web.dao.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.newlecture.web.dao.MemberDao;
import com.newlecture.web.entity.Member;

public class SPringMemberDao extends SimpleJdbcDaoSupport implements MemberDao {

/*	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;*/
	
/*	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate =  new JdbcTemplate(dataSource);
	}*/

	private PlatformTransactionManager transactionManager;
	
	
	@Autowired
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public Member get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	/*@Transactional*/
	public int add(String code, String title, String content,int hit){
		
		String sql1 = "INSERT INTO NOTICE(CODE, TITLE, WRITER, HIT) VALUES('74','test1','KYG',0)";
		
		return 	getJdbcTemplate().update(sql1);
	}
/*	@Transactional(propagation =Propagation.REQUIRED,
			isolation = Isolation.DEFAULT )*/
	public int pointUp(){
		
		String sql2 = "UPDATE MEMBER SET POINT = POINT + 1 "
                + "WHERE MID = 'KYG'";
		
		return 	getJdbcTemplate().update(sql2);
	}
	
	@Override
	public List<Member> getList(String id) {
		// TODO Auto-generated method stub
		return getList(id,"","");
	}

	@Override
	@Transactional
	public List<Member> getList(String id, String pwd, String name) {
	      
	      String sql = "SELECT MID id, PWD FROM MEMBER WHERE MID LIKE ?";
	      
	      
	      
	      
	      /*transactionTemplate.execute(new TransactionCallbackWithoutResult() {
	         
	         @Override
	         protected void doInTransactionWithoutResult(
	               TransactionStatus status) {
	            
	            getJdbcTemplate().update(sql1);
	            getJdbcTemplate().update(sql2);
	            
	         }
	      });*/
	         
	      
	      //TransactionDefinition def = new DefaultTransactionDefinition();
	      //TransactionStatus status = transactionManager.getTransaction(def);
	      
	      /*getJdbcTemplate().update(sql1);
	      getJdbcTemplate().update(sql2);*/
	      
	      //transactionManager.commit(status);
	                        
	      return getJdbcTemplate().query(sql, 
	            new BeanPropertyRowMapper<Member>(Member.class),
	            String.format("%%%s%%", id));
	      
	      /*return getJdbcTemplate().query(sql, new RowMapper<Member>(){
	         public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
	            
	            Member m = new Member();
	            
	            m.setId(rs.getString("mid"));
	            m.setPwd(rs.getString("pwd"));
	            
	            return m;
	         }
	      });*/
	   }


	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
		return getList("", "", "");
	}

	@Override
	public int add(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
