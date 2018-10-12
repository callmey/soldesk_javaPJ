package d20181011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.SwingConstants;

public class NetEx02 {
	public static void main(String[] args) {

		try {
			Socket s = new Socket("172.16.7.100", 5000);

			InputStream is = s.getInputStream(); // socket으로부터 Stream(정보)를 받는다.
			OutputStream os = s.getOutputStream(); // socket을 통해 Stream(정보)를 내보낸다.

			// os.write(65); //ASCII로 보내짐 => A가 전달됨

			// (보내는쪽)byte stream(I/O stream) -------| bridge |---------> (받는쪽) char stream
			// InputStreamReader -->보내는쪽에서 char로 보내도 아스키 코드로 자동변환/번역해준다
			// outputStreamwriter

			// -------------------------------------------------------------
			// 서버가 리턴한 메세지를 받기
			InputStreamReader isr1 = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr1);

			// --------------------------------------------------------------
			// 서버에 키보드로 쓴 결과를 보낼 객체
			System.out.println("입력하세요 (종료 : CRTL + Z):");
			InputStreamReader isr2 = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr2);

			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			// --------------------------------

			String msg = null;
			String message = null;

			while ((msg = keyboard.readLine()) != null) {
				System.out.println("내가 입력한 내용 " + msg);
				pw.println("클라이언트의 메세지 :" + msg);
				pw.flush();

				message = br.readLine();
				System.out.println("서버에서 리턴된 메세지 :" + message);
			}

			// 서버가 준비되어야 클라이언트가 접속 할 수 있음
			// 접속 최대수 = Thread수
			// 멀티서버로 구축하려면 멀티쓰레드가 필요함.

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
