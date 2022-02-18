package practice;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getboardlist();		
		for (Board board : list) {
			
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}
}

