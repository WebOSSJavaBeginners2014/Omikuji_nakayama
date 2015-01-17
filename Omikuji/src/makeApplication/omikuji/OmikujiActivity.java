package makeApplication.omikuji;

import android.app.Activity;
import android.os.Bundle;

public class OmikujiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.omikuji);
/*
		TextView tv = (TextView) findViewById(R.id.hello_view);

		// くじ番号の取得
		Random rnd = new Random();
		int number = rnd.nextInt(20);

		// おみくじ棚の準備
		String[] omikujiShelf = new String[20];
		for (int i = 0; i < 20; i++){
			omikujiShelf[i] = "吉";
		}
		omikujiShelf[0] = "大吉";
		omikujiShelf[19] = "凶";

		// おみくじ棚から取得
		String str = omikujiShelf[number];

		tv.setText(str);
		*/
	}
}
