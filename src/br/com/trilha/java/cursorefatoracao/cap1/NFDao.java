package br.com.trilha.java.cursorefatoracao.cap1;

public class NFDao {

	public void salvaNoBanco(NotaFiscal nf) {
		String sql = "insert into notafiscal (cliente, valor)" + "values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);
	}
}
