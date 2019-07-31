package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
// @Data = Lombok�� �̿��ؼ� getter/setter�� �ڵ������ϰ� 'onMethod'�Ӽ��� �̿��ؼ� setter�� @autowired �߰�.
//@ToString, @EqualsAndHashcode, @getter/setter, @RequiredArgsCosntructor ���� @Data�������̼ǿ� ���ԵǾ��ִ�.
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
