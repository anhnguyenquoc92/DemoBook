package com.example.demo.utility;

import java.util.List;

import com.example.demo.exception.bookexception.DuplicateBookIdException;
import com.example.demo.exception.bookexception.DuplicateCodeException;
import com.example.demo.exception.bookexception.ValidParamException;

public class ValidParam {
	public static void checkUniqueCode(List<String> codes, String code) {
		System.out.println("test merge 1");
		System.out.println("test merge 2");
	}

	public static void checkUniqueBookId(List<Integer> bookIds, int bookId) {
		System.out.println("test merge 2");
		System.out.println("test merge 1");
		if (bookIds.contains(bookId)) {
			throw new DuplicateBookIdException("BookId should be unique");
		}
	}

	public static void validBookId(int bookId) {
		System.out.println("test merge 3");
		if (bookId < 1) {
			throw new ValidParamException("Book id should be greater than 1");
		}
	}
}
