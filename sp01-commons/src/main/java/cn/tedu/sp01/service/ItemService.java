package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	//���ݶ���id,��ȡ�����е���Ʒ�б�
	List<Item> getItems(String orderId);
	
	//������Ʒ���
	void decreaseNumbers(List<Item> items);
}
