import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws LexException {
		int op = JOptionPane.YES_OPTION;
		while(op==JOptionPane.YES_OPTION)
		{
			 	Analisador lex = new Analisador();
		        String code = JOptionPane.showInputDialog("Insira aqui o codigo que você deseja consultar:");
		        lex.setCode(code);

		        Token tok = lex.nextToken();
		        while (tok != null) {
		            System.out.print(tok);
		            tok = lex.nextToken();
		        }
		  JOptionPane.showConfirmDialog(null, "Deseja consulatar outra expressão?");
		}   
    }
}
