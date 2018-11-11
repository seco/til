package examples.boot.sunnyboard;

import examples.boot.sunnyboard.domain.Board;
import examples.boot.sunnyboard.repository.BoardRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SunnyboardApplicationTests {
	@Autowired //인터페이스를만든객체를스프링부트가자동으로만들어준다.
	BoardRepository boardRepository;

	Long id;

	@Test
	public void contextLoads() {
		//해당.메소드가.실행될.때.문제가.없다는.것은.모든.설정이.잘되어있다.
	}

	@Before
	public void init() throws Exception {
		Board board = new Board();
		board.setName("kim");
		board.setTitle("setTitle");
		board.setContent("Kim count");
		board.setReadCount(0);

		// 리턴받은 객체는 id에 값이 할당되어 있다. 영속성이 부여된 객체
		board = boardRepository.save(board);
		id = board.getId();
	}

	@After


	@Test
	public void saveBoard() throws Exception {
		Board board = new Board();
		board.setName("kim");
		board.setTitle("setTitle");
		board.setContent("Kim count");
		board.setReadCount(0);

		// 리턴받은 객체는 id에 값이 할당되어 있다. 영속성이 부여된 객체
		board = boardRepository.save(board);

		Board result = boardRepository.getOne(board.getId());
		System.out.println(result.getId() + ", " + result.getName());
	}

}
