package com.lena.service.impl;

import com.lena.entity.TUser;
import com.lena.mapper.TUserMapper;
import com.lena.service.ITUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lena
 * @since 2019-03-16
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
