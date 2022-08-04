package example;

public class Split_String {

	public static void main(String[] args) {

		String text1 = " To stop climate change, save marine life\r\n" + "\r\n" + "Social affairs\r\n" + "\r\n"
				+ " Climate crisis is an ocean crisis, said Sylvia Earle, marine biologist and National Geographic explorer-in-residence, during a forum Thursday in Seoul.  “It took time for climate scientists to recognize the inextricable connection between the atmosphere and the ocean, between climate and the ocean, between Earth’s living systems and climate. Now we know that the climate crisis is an ocean crisis,” she said.  Earle, who spent “thousands of hours” over five decades o ";
		String text2 = "인구가 점점 줄어 인구 절벽이 심화될 거라는 이야기, 그 우려가 점차 현실이 되고 있습니다.\r\n" + "\r\n"
				+ "조금씩 줄어들던 인구 수는 2021년, 사상 처음으로 감소했습니다. 대한민국 정부가 수립되고, 1949년에 집계를 시작한 이후 첫 인구 감소입니다.\r\n" + "\r\n"
				+ "통계청이 오늘(28일) 발표한 '2021 인구주택총조사'를 보면 우리나라 총인구는 5천174만 명으로 2020년보다 9만 천 명 줄어든 것으로 나타났습니다. 내국인 4만 5천 명이 줄었고, 외국인 4만 6천 명이 감소했습니다.\r\n"
				+ "\r\n"
				+ "연평균 인구 성장률도 -0.2%로 사상 처음으로 마이너스를 기록했습니다. 인구성장률은 1960년 연평균 3.0%에서 지속적으로 감소했는데, 1995년 이후부터는 1% 미만대로 떨어지기도 했습니다. 그래도 2020년까지는 플러스 성장을 지속했는데, 2021년 처음으로 마이너스 인구 증가를 기록한 겁니다.\r\n";

//		String[] words = text1.split("[^a-zA-Z]+");

		String[] words = text2.split("[^가-힣]+");

		for (String w : words) {
			if (w.length() < 2)
				continue;
			System.out.println(w);

		}
	}

}
