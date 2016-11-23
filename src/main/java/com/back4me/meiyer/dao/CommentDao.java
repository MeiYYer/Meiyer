package com.back4me.meiyer.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 * ͨ��dao�ӿ�
 * @author YM20034
 *
 */
public interface CommentDao<T> {
	/**
	 * ��
	 * @param obj
	 */
	public void save(T obj);
	
	/**
	 * 
	 * ɾ��
	 * @param obj
	 */
	public void delect(T obj);
	
	/**
	 * 
	 * �޸�
	 * @param obj
	 */
	public void update(T obj);
	
	/**
	 * 
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	public T queryById(Serializable id);
	
	
	/**
	 * ��ѯ����
	 * @return
	 */
	public List<T> findAll();
	
	
	/**
	 * 
	 * ������ѯ
	 * @param queryNmae
	 * @param value
	 * @return
	 */
	public List<T> findNameQuery(String queryNmae, Object...value);//����hql��ѯ
	
	public List<T> findByCriteria(DetachedCriteria detachedCriteria);//����������ѯ

}
