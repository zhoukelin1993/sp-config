package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;

public interface OrderService {
	//���ݶ���id��ȡ����
	Order getOrder(String orderId);
	
	//���涩��
	void addOrder(Order order);
}
