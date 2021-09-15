package ch11;


//캡슐화
public class MakeReport {

		StringBuffer buffer = new StringBuffer();
		private String line = "========================================\n";
		private String title ="이름 \t  주소\t\t  전화번호 \n";
		private void makeHeader() {
			buffer.append(line);
			buffer.append(title);
			buffer.append(line);

		}
		
		private void generateBody() {
			buffer.append("강민서\t");
			buffer.append("용인시 처인구\t");
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
