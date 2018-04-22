
public class AccessModifier {
	static int cnt = 0;
	
	void cnt() {
		this.cnt++;
		System.out.println(this.cnt);
	}
}
