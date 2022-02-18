package practice;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getboardlist() {
		List<Board> list = new ArrayList<Board>();
		Board board = new Board("제목", "내용");

		for (int i = 0; i < 3; i++) {
			list.add(new Board(board.getTitle()+(i+1), board.getContent()+(i+1)));
		}
		return list;
	}

}
