package com.back4me.meiyer.service.base;

import javax.annotation.Resource;

import com.back4me.meiyer.dao.CommentDao;
import com.back4me.meiyer.pojo.user.Userinfo;


/**
 * ҵ��������� ��ʵ��ҵ�����븴�ã�
 * @author YM20034
 *
 */
public abstract class BaseService {
	@Resource(name="UserDao")
	protected CommentDao<Userinfo> UserDao;

}
