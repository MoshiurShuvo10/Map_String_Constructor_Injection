package beans;

import java.util.*;
import java.util.Map.Entry;

public class Question {
	
	private int questionId;
	private String question;
	private Map<String,String> answerMap ;

	public Question(int questionId, String question, Map<String, String> answerMap) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerMap = answerMap;
	}
	
	public void displayQuestionInfo() {
		System.out.println("ques id: "+questionId);
		System.out.println("Question: "+question);
		
		Set<Entry<String,String>> answers = answerMap.entrySet();
		Iterator<Entry<String,String>> iterator = answers.iterator();
		while(iterator.hasNext()) {
			Entry<String,String> entry = iterator.next();
			System.out.println(entry.getKey()+" => posted by "+entry.getValue());
		}
	}
}
