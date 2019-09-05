package kakao.T2019;

import java.util.*;

//��Ī����
public class Q6 {
	class Page {
		int idx;
		int basic, link;
		double score;

		public Page(int idx, int basic, int link, double score) {
			this.idx = idx;
			this.basic = basic;
			this.link = link;
			this.score = score;
		}
	}
	class Comp implements Comparator<Page>{
		public int compare(Page a, Page b) {
			if(a.score == b.score) {
				return a.idx - b.idx;
			} else if(a.score < b.score) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	public int solution(String word, String[] pages) {
		int wsize = word.length();
		Map<String, Integer>pageMap = new HashMap<>();
		List<Page> pageList = new ArrayList<>();
		word = word.toLowerCase();
		for(int i=0; i<pages.length; i++) {
			StringBuilder sb = new StringBuilder(pages[i].toLowerCase());
			int mid = 0, posl = 0, posr = 0;
			while(mid <= posl) {
				posl = sb.indexOf("<meta", posl+1); // +1 ���ؾ� �Ȱ����� ��ã�´�.
				posr = sb.indexOf(">", posl);
				mid = sb.lastIndexOf("https://", posr); //�ڿ������� ã�´�.
			}
			posr = sb.indexOf("\"", mid);
			String url = sb.substring(mid, posr);

			posl = sb.indexOf("<body>", posr);
			int basic = 0;
			for(int start = posl; ;) {
				start = sb.indexOf(word, start+1);
				if(start < 0) break;
				if(!Character.isLetter(sb.charAt(start-1)) && !Character.isLetter(sb.charAt(start+wsize))) {
					basic++;
					start += wsize;
				}
			}
			int link = 0;
			for(int start = posl; ;) {
				start = sb.indexOf("<a href", start+1);
				if(start < 0) break;
				link++;
			}
			pageMap.put(url, i);
			pageList.add(new Page(i, basic, link, (double)basic));
		}
		for(int i=0; i<pages.length; i++) {
			StringBuilder sb = new StringBuilder(pages[i].toLowerCase());
			for(int posl = 0, posr = 0; ;) {
				posl = sb.indexOf("<a href", posr);
				if(posl < 0) break;
				posl = sb.indexOf("https://", posl);
				posr = sb.indexOf("\"", posl);
				String linkurl = sb.substring(posl, posr);

				Integer value = pageMap.get(linkurl);
				if(value != null) {
					pageList.get(value).score += (double)pageList.get(i).basic / pageList.get(i).link;
				}
			}
		}
		pageList.sort(new Comp());
		return pageList.get(0).idx;
	}
}

