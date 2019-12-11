package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String string = "I am a string, Yes, I am.";
		System.out.println(string);
		String yourString = string.replaceAll("I", "You");
		System.out.println(yourString);
		
		String alphanumeric="abcDeeFafaferc111var999gr";
		
		//match all character
		System.out.println(alphanumeric.replaceAll(".", "Y"));
		
		//match start character
		System.out.println(alphanumeric.replaceAll("^abcDee", "YYY"));
		
		System.out.println(alphanumeric.matches("^hello"));
		System.out.println(alphanumeric.matches("abcDeeFafaferc111var999gr"));
		
		System.out.println(alphanumeric.replaceAll("111var999gr$", "The end"));
		
		System.out.println(alphanumeric.replaceAll("[aei]", "X"));
		System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
		
		System.out.println(alphanumeric.toUpperCase());
		System.out.println("harry".replaceAll("[H|h]arry", "Harry"));
		System.out.println(alphanumeric.replaceAll("[^ej]", "X"));
		
		System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]","X"));
		
		//replace numeric
		System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
		System.out.println(alphanumeric.replaceAll("\\d", "X"));
		
		//replace non-numeric
		System.out.println(alphanumeric.replaceAll("\\D", "X"));
		

		String hasWhiteSpace="I have blanks and\ta tab, and also a newline\n";
		System.out.println(hasWhiteSpace);
		//remove all white space
		System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
		
		//replace \n 
		System.out.println(hasWhiteSpace.replaceAll("\\t", "X"));
		
		//replace except whitespace \t \n
		System.out.println(hasWhiteSpace.replaceAll("\\S", "X"));
		System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
		
		//replace whitespace \t \n
		System.out.println(hasWhiteSpace.replaceAll("\\W", "X"));
		
		//Add character around each word
		System.out.println(hasWhiteSpace.replaceAll("\\b","X"));
		
		//Quantifiers
		System.out.println(alphanumeric.replaceAll("^abcDe{2}", "YYY"));
		System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY"));
		System.out.println(alphanumeric.replaceAll("^abcDe*", "YYY"));
		System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
		System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
		System.out.println(alphanumeric.replaceAll("h+i*j", "YYY"));
		
		StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
		htmlText.append("<h2>Sub-heading</h2>");
		htmlText.append("<p>This is one paragraph</p>");
		htmlText.append("<p>This is second paragraph</p>");
		htmlText.append("<h2>Summary</h2>");
		
		String h2Pattern="<h2>";
		Pattern pattern = Pattern.compile(h2Pattern);
		Matcher matcher = pattern.matcher(htmlText);
		System.out.println(matcher.matches());
		
		matcher.reset();
		int count=0;
		while(matcher.find()) {
			count++;
			System.out.println("Occurrence "+count+ " : "+matcher.start() + " to "+matcher.end());
		}
		
		String h2GroupPattern = "(<h2>.*?</h2>)";
		Pattern groupPattern = Pattern.compile(h2GroupPattern);
		Matcher groupMatcher = groupPattern.matcher(htmlText);
		System.out.println(groupMatcher.matches());
		groupMatcher.reset();
		
		while(groupMatcher.find()) {
			System.out.println("Occurrence "+groupMatcher.group(1));
		}
		
		String h2TextGroups="(<h2>)(.+?)(</h2>)";
		Pattern h2TextPattern = Pattern.compile(h2TextGroups);
		Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
		
		while(h2TextMatcher.find()) {
			System.out.println("Occurrence: "+h2TextMatcher.group(2));
		}
		
		String tvTest = "tstvtkt";
		String tNotVRegExp="t(?!v)";
		Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
		Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
		
		count=0;
		while(tNotVMatcher.find()) {
			count++;
			System.out.println("Occurence "+count+" : "+tNotVMatcher.start()+" to "+tNotVMatcher.end());
		}
		
		
		//example for us phone number check (800) 123-4567
		// ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
		
		String phone1="1234567890";
		String phone2="(123) 456-7890";
		String phone3="123 456-7890";
		String phone4="(123)456-7890";
		
		System.out.println("phone1 = "+phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
		System.out.println("phone2 = "+phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
		System.out.println("phone3 = "+phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
		System.out.println("phone4 = "+phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
		
		
		
		
		
		
	}
}
