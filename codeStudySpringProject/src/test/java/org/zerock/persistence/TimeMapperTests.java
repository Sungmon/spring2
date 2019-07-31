package org.zerock.persistence;

// *spring�� �������̽��� �̿��ؼ� ��ü�� �����ߴ�*
// MyBatis-Spring�� ��� Mapper�������̽��� XML�� ���ÿ� �̿��Ҽ� �ִ�.
// MyBatis�� ���������� JDBC�� PreparedStatement�� �̿��ؼ� SQL�� ó���Ѵ�.
// PreparedStatement�� ���� ?���� �����µ� �̸� �ذ��ϱ� ���� log4jdbc-log4j2 ���̺귯���� ����Ѵ�.
// ���̺귯���� �߰��� �Ŀ��� 1. �α� ���� ������ �߰��ϴ� �۾� �� 2. JDBC�� ���� ������ �����ؾ� �Ѵ�.

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") 
@Log4j
public class TimeMapperTests {

	
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
	}
	
	@Test
	public void getTime2() {
		log.info("getTime2");
		log.info(timeMapper.getTime2());
	}
}
