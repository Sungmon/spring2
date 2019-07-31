package org.zerock.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

// @RunWith = ���� �׽�Ʈ �ڵ尡 �������� �����ϴ� ���� �̶�� ����!
// �׽�Ʈ�� �ʿ��� Ŭ������ ����. �������� SpringJUnit4ClassRunner.class�� ����� �ȴ�.
@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration = ������̼ǰ� �Ӽ����� ���ڿ� ����. ������ Ŭ������ ���ڿ��� �̿��ؼ� �ʿ��� ��ü���� ������ ���� ��ü�� ����Ѵ�. 
//�������� ����Ǹ鼭 � ���� ������ �о� �鿩�� �ϴ����� ����Ѵ�.
//'classpath' Ȥ�� 'file'�� ��������Ҽ� �ִ�.
//�� �������̼��� ������ ����ų �ÿ��� spring-test�� pom.xml�� �߰�������.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") 
//�α׸� ����ϴ� Logger�� ������ �����Ѵ�. ��ü�� ������� Log4j���̺귯���� ������ �����Ѵٸ� �ٷ� ����� �� �ִ�.
@Log4j 																	
public class SampleTests {												
	
	@Setter(onMethod_ = { @Autowired } ) //@Autowired�� �ش� �ν��Ͻ� ������ ���������κ��� �ڵ����� ������ �޶�� ǥ��
	private Restaurant restaurant;
	
	@Test
	//@Test = Junit���� �ش� �޼��尡 JUnit�󿡼� ���� �׽�Ʈ�� ������� �˷��ش�.
	public void testExist() {
		//assertNotNull�� �ش� ������ null�� �ƴϿ��߸� �׽�Ʈ�� ������Ų��.
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-------------------------------");
		log.info(restaurant.getChef());
	}
}
