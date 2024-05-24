package test2;
import java.util.ArrayList;  
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {
	private BookManager bookManager;

	
	@BeforeEach
	void setUp() throws Exception {
		bookManager = new BookManager();
	}

	@Test
	void testcase1() {
		bookManager.AddBook(1, "자바 기초", "Jane", 2021);
		bookManager.SearchBook(1);
		bookManager.AddBook(2, "파이썬", "Caleb", 2020);
		bookManager.RemoveBook(1);
		bookManager.SearchBook(1);
		bookManager.SearchBook(2);
	}
	@Test
	void testcase2() {
		bookManager.AddBook(1, "자바 기초", "Jane", 2021);
		bookManager.SearchBook(1);
		bookManager.AddBook(1, "자바 기초", "Jane", 2021);
		bookManager.AddBook(2, "자바 고급", "Jina", 2022);
		bookManager.AddBook(3, "파이썬", "Caleb", 2020);
		bookManager.RemoveBook(2);
		bookManager.SearchBook(1);
		bookManager.SearchBook(2);
		bookManager.SearchBook(3);
	}

}
