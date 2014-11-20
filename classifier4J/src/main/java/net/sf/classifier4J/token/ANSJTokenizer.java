package net.sf.classifier4J.token;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.ansj.util.FilterModifWord;

public class ANSJTokenizer implements ITokenizer
{

	public String[] tokenize(String input)
	{
		List<Term> termList = ToAnalysis.parse(input);
		termList = FilterModifWord.modifResult(termList);
		List<String> words = new ArrayList<String>(termList.size());
		Iterator<Term> it = termList.iterator();
		while (it.hasNext())
		{
			String word = it.next().getName();
			words.add(word);
		}
		return words.toArray(new String[words.size()]);
	}

}
