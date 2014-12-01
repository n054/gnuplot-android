package org.mklab.matx.android.customView;

/**
 * @author kawabata
 * 予測変換の結果を追加するインターフェイス
 */
public interface AddPredictionMessage {
	/**
	 * 関数を追加で入力する。
	 * 
	 * @param function
	 *            表示する関数
	 * @param count
	 */
	public  void addFunction(String function, int count);
	

	/**
	 * 変数を追加で入力する
	 * 
	 * @param var 変数
	 *            
	 */
	public  void addvariable(String var,int count);

	
	/**
	 * 画面にメッセージを表示し、カーソルを最後に移動する
	 * 
	 * @param message
	 *            追加表示するメッセージ
	 */
	public  void cerateMessage(String message);



}
