package com.back4me.meiyer.service.user;

import com.back4me.meiyer.pojo.user.Userinfo;



/**
 * �û����� ҵ��ӿ�
 * @author YM20034
 *
 */
public interface Userservice {

	public Userinfo login(Userinfo user);//��¼

	public void editPassword(Userinfo user);//�޸����룡
	

}
