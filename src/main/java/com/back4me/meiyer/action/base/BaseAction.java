package com.back4me.meiyer.action.base;
/**
 * ��������action��Ϊ��ʵ��һЩ����ĸ��ã�
 */
import javax.annotation.Resource;

import com.back4me.meiyer.service.user.Userservice;
import com.opensymphony.xwork2.ActionSupport;


public abstract class BaseAction extends ActionSupport{
	
	@Resource(name="userservice")
	protected Userservice userservice; //��ֱ�ӱ�����ʹ��
}
