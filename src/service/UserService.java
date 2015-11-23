package service;

import org.apache.shiro.authz.annotation.RequiresPermissions;

public class UserService {
	@RequiresPermissions("user:delete")
	public void delete(String[] person){
		System.out.println("delete user");
	}

}
