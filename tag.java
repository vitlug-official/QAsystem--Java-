import java.io.IOException;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class tag
{
	 //Include here what words to select...
	static String[] select = {"NN","NNS","NP","NPS","NNP"};

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		// Initialize the tagger
		MaxentTagger tagger = new MaxentTagger("taggers/bidirectional-distsim-wsj-0-18.tagger");
		
		// The input string		 
		String sample = "Which is the highest peak in Europe?";
		 
		
		// The tagged string 
		String tagged = tagger.tagString(sample);
		
		String[] keywords = new String[10];
		
		//Now select the keywords
		String[] all=tagged.split(" ");
		
		int nk=0;
		for(int i=0;i<all.length;i++)
		{
			int pos=all[i].indexOf('/');
			
			String type = all[i].substring(pos+1);
			if(isKeyword(type))
			keywords[nk++]=all[i].substring(0,pos);
				
		}
		// Output the result

		System.out.println(tagged);
		//for(int i=0;i<all.length;i++)
			//System.out.println(all[i]);
		for(int i=0;i<keywords.length;i++)
			System.out.println(keywords[i]);
		}

	private static boolean isKeyword(String type)
	{
		for(int i=0;i<select.length;i++)
		{
			if(type.equals(select[i]))
				return true;
		}
		return false;
	}

}
