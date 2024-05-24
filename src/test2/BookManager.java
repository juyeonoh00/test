package test2;

import java.util.ArrayList;

public class BookManager {
	
	private ArrayList<Book> bookList;
	
	public BookManager() {
		bookList = new ArrayList<>();
	}
	public void AddBook(int id, String name, String author, int date) {
		for(Book book : bookList) {
			if (book.getId() == id) {
				System.out.println("해당 ID("+id+")는 이미 존재합니다.");
				return;
			}
		}
		System.out.println("Book{id: '"+id+"', 제목: '"+ name + "', 저자: '"+author+"', 출판년도: "+date+"}도서가 추가되었습니다");
		bookList.add(new Book(id, name, author, date));
	}
	public void SearchBook(int id) {
		for(Book book : bookList) {
			if (book.getId() == id) {
				System.out.println("검색결과:\n"+"Book{id: '"+ book.getId()+"', 제목: '"+ book.getName() + "', 저자: '"+book.getAuthor()+"', 출판년도: "+book.getDate()+"}");
				return;
			}
		}
		System.out.println("해당 ID("+id+")의 도서를 찾을 수 없습니다");
	}
	public void RemoveBook(int id) {
		for(Book book : bookList) {
			if (book.getId() == id) {
				System.out.println("Book{id: '"+ book.getId()+"', 제목: '"+ book.getName() + "', 저자: '"+book.getAuthor()+"', 출판년도: "+book.getDate()+"}도서를 삭제하였습니다.");		
				bookList.remove(id-1);
				return;
			}
		}
	}
}
