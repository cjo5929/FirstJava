package ch11;


//ĸ��ȭ
public class MakeReport {

		StringBuffer buffer = new StringBuffer();
		private String line = "========================================\n";
		private String title ="�̸� \t  �ּ�\t\t  ��ȭ��ȣ \n";
		private void makeHeader() {
			buffer.append(line);
			buffer.append(title);
			buffer.append(line);

		}
		
		private void generateBody() {
			buffer.append("���μ�\t");
			buffer.append("���ν� ó�α�\t");
			buffer.append("010-45-59\n");

			
		}
		
		private void makeFooter() {
			buffer.append(line);

		}
		
		public String getReport() {
			makeHeader();
			generateBody();
			makeFooter();
			
			return buffer.toString();
		}
	
}
