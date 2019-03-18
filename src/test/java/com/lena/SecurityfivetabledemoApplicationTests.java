package com.lena;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.lena.entity.TPermission;
import com.lena.entity.TRole;
import com.lena.entity.TRolePermission;
import com.lena.entity.TUserRole;
import com.lena.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityfivetabledemoApplicationTests {

	@Autowired
	private  TUserMapper tUserMapper;
	@Autowired
	private TRoleMapper tRoleMapper;
	@Autowired
	private TPermissionMapper tPermissionMapper;

	@Autowired
	private TUserRoleMapper tUserRoleMapper;

	@Autowired
	private TRolePermissionMapper tRolePermissionMapper;
	@Test
	public void contextLoads() {

		//获取用户Id
		Integer zhaoliuid = tUserMapper.selectByName("zhangqi").getId();

		List<TRole> roles = tUserMapper.findRoleByTUserId(zhaoliuid);
		System.out.println(roles);

		List<TPermission> permissions=tUserMapper.findPermissionByUserId(zhaoliuid);
		for (TPermission p:permissions
			 ) {
			System.out.println(p.getRemarks());
		}


		/*//在中间查询出
		List<TUserRole> userRoles = tUserRoleMapper.selectList(new EntityWrapper<TUserRole>()
				.eq("user_id", zhaoliuid));
		System.out.println(userRoles);
		List<TPermission> tPermissions=null;
		EntityWrapper<TRolePermission> tPermissionEntityWrapper = new EntityWrapper<>();
		for (TUserRole userrole:userRoles
			 ) {
			tPermissionEntityWrapper.eq("")
		}*/
		//tPermissionMapper.selectList(new EntityWrapper<TPermission>())



	}

}
