package com.back4me.meiyer.web.intercepter;


import org.apache.struts2.ServletActionContext;

import com.back4me.meiyer.pojo.user.Userinfo;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * ��¼������
 * @author YM20034
 *
 */
public class LoginIntercepter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Userinfo user=(Userinfo)ServletActionContext.getRequest().getSession().getAttribute("user");
		if (user==null) {
			ActionSupport action=(ActionSupport)invocation.getAction();
			action.addActionError("δ��¼�����¼���ڣ�");
			return "login";
		}else{
			return invocation.invoke();
		}
	}

}
