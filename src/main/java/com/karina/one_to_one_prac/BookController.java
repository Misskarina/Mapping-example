package com.karina.one_to_one_prac;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookRepository brepo;
	@Autowired
	StoryRepository srepo;
	
	@RequestMapping("/save")
	public String save()
	
	{
		Book b=new Book();
		b.setBookname("Rich dad poor dad");
		b.setPrice(3400);
	
		Story s=new Story();
		s.setStoryname("about money");
		s.setStorytype("motivational story");
		
		b.setStory(s);
		s.setBook(b);
		
		brepo.save(b);
		return"data saved";
		
	}
		@RequestMapping("saveall")
		public String saveAll()
		{
					
		Book b1=new Book();
		b1.setBookname("A passage of india");
		b1.setPrice(5000);
	
		Story s1=new Story();
		s1.setStoryname("about india");
		s1.setStorytype("novel");
		
		b1.setStory(s1);
		s1.setBook(b1);
		brepo.save(b1);
	
		Book b2=new Book();
		b2.setBookname("To kill a mocking bird");
		b2.setPrice(6000);
	
		Story s2=new Story();
		s2.setStoryname("about girl");
		s2.setStorytype("novel");
		
		b2.setStory(s2);
		s2.setBook(b2);
		brepo.save(b2);
		
		Book b3=new Book();
		b3.setBookname("Beloved");
		b3.setPrice(7400);
	
		Story s3=new Story();
		s3.setStoryname("about slave");
		s3.setStorytype("novel");
		
		b3.setStory(s3);
		s3.setBook(b3);
		brepo.save(b3);
		
		List<Book>list=Arrays.asList(b1,b2,b3);
		
		brepo.saveAll(list);
		return "data extended";
		
}
}