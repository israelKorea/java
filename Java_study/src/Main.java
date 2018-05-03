
public class Main {

	/*
	 * main硫붿냼�뱶�뒗 �봽濡쒓렇�옩 �떎�뻾�떆 �뙆�씪誘명꽣瑜� �엯�젰諛쏆쓣 �닔 �엳�쓬
	 * >> String[] args �넻�빐�꽌 ���옣�맖
	 * String : 臾몄옄�뿴�쓣 �굹���궡�뒗 �옄諛붿쓽 �옄猷뚰삎
	 * args[] : String�옄猷뚰삎�뿉 ���븳 蹂��닔紐낆쑝濡� args�뮘�뿉 []媛� �엳�뼱�꽌 諛곗뿴�엫
	 * 
	 * ex. C:\> java Test a b c
	 * �떎�뻾 �떆, �엯�젰媛� �닚�꽌��濡� a b c媛� ���옣�맂�떎
	 * */
	public static void main(String[] args) {
		// 2018.4.22 at midnight
		/*
		 * public : �젒洹쇱젣�뼱�옄
		 * static : 硫붿냼�뱶 static �꽑�뼵�떆, �씤�뒪�꽩�뒪 �깮�꽦�뾾�씠 �떎�뻾 媛��뒫
		 * void : 由ы꽩媛믪씠 �뾾�쓬
		 * Sysout : �몴以�異쒕젰�쑝濡� �뜲�씠�꽣瑜� 蹂대궡�뒗 �옄諛붿쓽 �궡�옣 硫붿냼�뱶
		 * public, static �벑�� �씤�뒪�꽩�뒪, 媛앹껜 �벑�쓣 �븣怨� 吏싳뼱�빞 �븳�떎
		 * */
		System.out.println("hello world!");
		/*
		Variable var = new Variable();
		var.var1();
		var.type();
		*/
		/*AccessModifier am = new AccessModifier();
		 am.cnt();
		AccessModifier am1 = new AccessModifier();
		am1.cnt();*/
		
		Instance ist = new Instance();
		ist.instance_main();
	}
}
