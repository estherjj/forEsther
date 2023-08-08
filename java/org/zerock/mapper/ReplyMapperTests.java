package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;
	
//	@Test
//	public void test() {
//		log.info(mapper);
//	}
	
	private Long[] bnoArr = {30L, 31L, 32L, 33L, 34L};
	
//	@Test
//	public void testCreate() {
//		IntStream.range(1, 10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			vo.setBno(bnoArr[i%5]);
//			vo.setReply("댁슬 테스트" + i);
//			vo.setReplyer("replyer" + i);
//			
//			mapper.insert(vo);
//		});
//	}
	
//	@Test
//	public void testRead() {
//		Long selectRno = 5L;
//		ReplyVO vo = mapper.read(selectRno);
//		log.info(vo);
//	}
	
//	@Test
//	public void testDelete() {
//		int selectRno = 5;
//		mapper.delete(selectRno);
//	}
	
//	@Test
//	public void testUpdate() {
//		Long selectRno = 7L;
//		ReplyVO vo = mapper.read(selectRno);
//		vo.setReply("Update Reply");
//		
//		int count = mapper.update(vo);
//		log.info("update count: " + count);
//	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		replies.forEach(reply -> log.info(reply));
	}

}