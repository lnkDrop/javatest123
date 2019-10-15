package jdbctest;

import java.util.List;

public interface Dao {
	
	//添加
	public void add() ;
	//修改
	public void update() ;
	//删除
	public void delete(int id) ;
	//获取
	public User get(int id); 
	//查询
	public List<User> list() ;
	//分页查询
	public List<User> list(int start,int count) ;
}
