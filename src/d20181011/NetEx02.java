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

			InputStream is = s.getInputStream(); // socket���κ��� Stream(����)�� �޴´�.
			OutputStream os = s.getOutputStream(); // socket�� ���� Stream(����)�� ��������.

			// os.write(65); //ASCII�� ������ => A�� ���޵�

			// (��������)byte stream(I/O stream) -------| bridge |---------> (�޴���) char stream
			// InputStreamReader -->�������ʿ��� char�� ������ �ƽ�Ű �ڵ�� �ڵ���ȯ/�������ش�
			// outputStreamwriter

			// -------------------------------------------------------------
			// ������ ������ �޼����� �ޱ�
			InputStreamReader isr1 = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr1);

			// --------------------------------------------------------------
			// ������ Ű����� �� ����� ���� ��ü
			System.out.println("�Է��ϼ��� (���� : CRTL + Z):");
			InputStreamReader isr2 = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr2);

			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			// --------------------------------

			String msg = null;
			String message = null;

			while ((msg = keyboard.readLine()) != null) {
				System.out.println("���� �Է��� ���� " + msg);
				pw.println("Ŭ���̾�Ʈ�� �޼��� :" + msg);
				pw.flush();

				message = br.readLine();
				System.out.println("�������� ���ϵ� �޼��� :" + message);
			}

			// ������ �غ�Ǿ�� Ŭ���̾�Ʈ�� ���� �� �� ����
			// ���� �ִ�� = Thread��
			// ��Ƽ������ �����Ϸ��� ��Ƽ�����尡 �ʿ���.

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
