package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
	//�����û�id,��ȡ�û�����
	User getUser(Integer id);
	
	//�����û�����
	void addScore(Integer id, Integer score);
}
