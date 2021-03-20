package NS2_OutPut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class Leitor_de_Log_v2 {

	static double Time = 0;

	public static void main(String[] Args) throws IOException {

		int Row = 1, Cell = 0, Row2 = 1, Cell2 = 0, Row3 = 1, Cell3 = 0, Row4 = 1, Cell4 = 0;

		BufferedReader br = new BufferedReader(new FileReader("nsgatewayLinux.tr"));

		SXSSFWorkbook workbook = new SXSSFWorkbook();
		SXSSFSheet sheet = workbook.createSheet("Saida_NS2.35_Entrar");
		FileOutputStream LogExcel = new FileOutputStream("Entrar.xls");
		SXSSFRow row = sheet.createRow(0);
		SXSSFCell cell = row.createCell(0);

		SXSSFWorkbook workbook2 = new SXSSFWorkbook();
		SXSSFSheet sheet2 = workbook2.createSheet("Saida_NS2.35_Sair");
		FileOutputStream LogExcel2 = new FileOutputStream("Sair.xls");
		SXSSFRow row2 = sheet2.createRow(0);
		SXSSFCell cell2 = row2.createCell(0);

		SXSSFWorkbook workbook3 = new SXSSFWorkbook();
		SXSSFSheet sheet3 = workbook3.createSheet("Saida_NS2.35_Entregar");
		FileOutputStream LogExcel3 = new FileOutputStream("Entregar.xls");
		SXSSFRow row3 = sheet3.createRow(0);
		SXSSFCell cell3 = row3.createCell(0);

		SXSSFWorkbook workbook4 = new SXSSFWorkbook();
		SXSSFSheet sheet4 = workbook4.createSheet("Saida_NS2.35_Recebido");
		FileOutputStream LogExcel4 = new FileOutputStream("Recebido.xls");
		SXSSFRow row4 = sheet4.createRow(0);
		SXSSFCell cell4 = row4.createCell(0);

		cell.setCellValue("Operação");
		cell = row.createCell(1);
		cell.setCellValue("Tempo");
		cell = row.createCell(2);
		cell.setCellValue("Nó de Partida Inicial");
		cell = row.createCell(3);
		cell.setCellValue("Nó de Chegada Parcial");
		cell = row.createCell(4);
		cell.setCellValue("Protocolo");
		cell = row.createCell(5);
		cell.setCellValue("Tamanho do Pacote");
		cell = row.createCell(6);
		cell.setCellValue("Flags");
		cell = row.createCell(7);
		cell.setCellValue("ID do Fluxo");
		cell = row.createCell(8);
		cell.setCellValue("Nó Inicial e Porta de Partida");
		cell = row.createCell(9);
		cell.setCellValue("Nó de Destino e Porta de Chegada");
		cell = row.createCell(10);
		cell.setCellValue("Número Sequencial");
		cell = row.createCell(11);
		cell.setCellValue("ID do Pacote");

		cell2.setCellValue("Operação");
		cell2 = row2.createCell(1);
		cell2.setCellValue("Tempo");
		cell2 = row2.createCell(2);
		cell2.setCellValue("Nó de Partida Inicial");
		cell2 = row2.createCell(3);
		cell2.setCellValue("Nó de Chegada Parcial");
		cell2 = row2.createCell(4);
		cell2.setCellValue("Protocolo");
		cell2 = row2.createCell(5);
		cell2.setCellValue("Tamanho do Pacote");
		cell2 = row2.createCell(6);
		cell2.setCellValue("Flags");
		cell2 = row2.createCell(7);
		cell2.setCellValue("ID do Fluxo");
		cell2 = row2.createCell(8);
		cell2.setCellValue("Nó Inicial e Porta de Partida");
		cell2 = row2.createCell(9);
		cell2.setCellValue("Nó de Destino e Porta de Chegada");
		cell2 = row2.createCell(10);
		cell2.setCellValue("Número Sequencial");
		cell2 = row2.createCell(11);
		cell2.setCellValue("ID do Pacote");

		cell3.setCellValue("Operação");
		cell3 = row3.createCell(1);
		cell3.setCellValue("Tempo");
		cell3 = row3.createCell(2);
		cell3.setCellValue("Nó de Partida Inicial");
		cell3 = row3.createCell(3);
		cell3.setCellValue("Nó de Chegada Parcial");
		cell3 = row3.createCell(4);
		cell3.setCellValue("Protocolo");
		cell3 = row3.createCell(5);
		cell3.setCellValue("Tamanho do Pacote");
		cell3 = row3.createCell(6);
		cell3.setCellValue("Flags");
		cell3 = row3.createCell(7);
		cell3.setCellValue("ID do Fluxo");
		cell3 = row3.createCell(8);
		cell3.setCellValue("Nó Inicial e Porta de Partida");
		cell3 = row3.createCell(9);
		cell3.setCellValue("Nó de Destino e Porta de Chegada");
		cell3 = row3.createCell(10);
		cell3.setCellValue("Número Sequencial");
		cell3 = row3.createCell(11);
		cell3.setCellValue("ID do Pacote");

		cell4.setCellValue("Operação");
		cell4 = row4.createCell(1);
		cell4.setCellValue("Tempo");
		cell4 = row4.createCell(2);
		cell4.setCellValue("Nó de Partida Inicial");
		cell4 = row4.createCell(3);
		cell4.setCellValue("Nó de Chegada Parcial");
		cell4 = row4.createCell(4);
		cell4.setCellValue("Protocolo");
		cell4 = row4.createCell(5);
		cell4.setCellValue("Tamanho do Pacote");
		cell4 = row4.createCell(6);
		cell4.setCellValue("Flags");
		cell4 = row4.createCell(7);
		cell4.setCellValue("ID do Fluxo");
		cell4 = row4.createCell(8);
		cell4.setCellValue("Nó Inicial e Porta de Partida");
		cell4 = row4.createCell(9);
		cell4.setCellValue("Nó de Destino e Porta de Chegada");
		cell4 = row4.createCell(10);
		cell4.setCellValue("Número Sequencial");
		cell4 = row4.createCell(11);
		cell4.setCellValue("ID do Pacote");

		while (br.ready()) {
			row = sheet.createRow(Row);
			row2 = sheet2.createRow(Row2);
			row3 = sheet3.createRow(Row3);
			row4 = sheet4.createRow(Row4);

			String linha = br.readLine();
			Scanner scanner = new Scanner(linha);
			scanner.useDelimiter(" ");
			while (scanner.hasNext()) {

				String Operação = scanner.next();

				if (Operação.equals("+")) {
					cell = row.createCell(Cell);
					cell.setCellValue(Operação);
					Cell++;

					String Tempo = scanner.next();
					cell = row.createCell(Cell);
					try {
						double Aux = Double.parseDouble(Tempo);
						Time = Aux - Time;
						cell.setCellValue(Time);
						Time = Aux;
					} catch (Exception Ex) {
						cell.setCellValue(Tempo);
						System.out.println("Erro de Cálculo de Tempo na Row: " + (Row - 1));
						System.out.println("Erro de Exception: " + Ex);
					}
					Cell++;

					String NoPartidaParcial = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(NoPartidaParcial);
					Cell++;

					String NoChegadaParcial = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(NoChegadaParcial);
					Cell++;

					String Protocolo = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(Protocolo);
					Cell++;

					String TamanhoPacote = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(TamanhoPacote);
					Cell++;

					String Flags = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(Flags);
					Cell++;

					String IdDoFluxo = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(IdDoFluxo);
					Cell++;

					String NoInicialePortadePartida = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(NoInicialePortadePartida);
					Cell++;

					String NoDestinoePortadeChegada = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(NoDestinoePortadeChegada);
					Cell++;

					String NumeroSequencial = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(NumeroSequencial);
					Cell++;

					String IDPacote = scanner.next();
					cell = row.createCell(Cell);
					cell.setCellValue(IDPacote);
					Cell++;

					Cell = 0;
					Row++;
				}

				else if (Operação.equals("-")) {
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(Operação);
					Cell2++;

					String Tempo = scanner.next();
					cell2 = row2.createCell(Cell2);
					try {
						double Aux = Double.parseDouble(Tempo);
						Time = Aux - Time;
						cell2.setCellValue(Time);
						Time = Aux;
					} catch (Exception Ex) {
						cell2.setCellValue(Tempo);
						System.out.println("Erro de Cálculo de Tempo na Row: " + (Row2 - 1));
						System.out.println("Erro de Exception: " + Ex);
					}
					Cell2++;

					String NoPartidaParcial = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(NoPartidaParcial);
					Cell2++;

					String NoChegadaParcial = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(NoChegadaParcial);
					Cell2++;

					String Protocolo = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(Protocolo);
					Cell2++;

					String TamanhoPacote = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(TamanhoPacote);
					Cell2++;

					String Flags = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(Flags);
					Cell2++;

					String IdDoFluxo = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(IdDoFluxo);
					Cell2++;

					String NoInicialePortadePartida = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(NoInicialePortadePartida);
					Cell2++;

					String NoDestinoePortadeChegada = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(NoDestinoePortadeChegada);
					Cell2++;

					String NumeroSequencial = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(NumeroSequencial);
					Cell2++;

					String IDPacote = scanner.next();
					cell2 = row2.createCell(Cell2);
					cell2.setCellValue(IDPacote);
					Cell2++;

					Cell2 = 0;
					Row2++;
				}

				else if (Operação.equals("h")) {
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(Operação);
					Cell3++;

					String Tempo = scanner.next();
					cell3 = row3.createCell(Cell3);
					try {
						double Aux = Double.parseDouble(Tempo);
						Time = Aux - Time;
						cell3.setCellValue(Time);
						Time = Aux;
					} catch (Exception Ex) {
						cell3.setCellValue(Tempo);
						System.out.println("Erro de Cálculo de Tempo na Row: " + (Row3 - 1));
						System.out.println("Erro de Exception: " + Ex);
					}
					Cell3++;

					String NoPartidaParcial = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(NoPartidaParcial);
					Cell3++;

					String NoChegadaParcial = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(NoChegadaParcial);
					Cell3++;

					String Protocolo = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(Protocolo);
					Cell3++;

					String TamanhoPacote = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(TamanhoPacote);
					Cell3++;

					String Flags = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(Flags);
					Cell3++;

					String IdDoFluxo = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(IdDoFluxo);
					Cell3++;

					String NoInicialePortadePartida = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(NoInicialePortadePartida);
					Cell3++;

					String NoDestinoePortadeChegada = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(NoDestinoePortadeChegada);
					Cell3++;

					String NumeroSequencial = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(NumeroSequencial);
					Cell3++;

					String IDPacote = scanner.next();
					cell3 = row3.createCell(Cell3);
					cell3.setCellValue(IDPacote);
					Cell3++;

					Cell3 = 0;
					Row3++;
				}

				else if (Operação.equals("r")) {
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(Operação);
					Cell4++;

					String Tempo = scanner.next();
					cell4 = row4.createCell(Cell4);
					try {
						double Aux = Double.parseDouble(Tempo);
						Time = Aux - Time;
						cell4.setCellValue(Time);
						Time = Aux;
					} catch (Exception Ex) {
						cell4.setCellValue(Tempo);
						System.out.println("Erro de Cálculo de Tempo na Row: " + (Row4 - 1));
						System.out.println("Erro de Exception: " + Ex);
					}
					Cell4++;

					String NoPartidaParcial = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(NoPartidaParcial);
					Cell4++;

					String NoChegadaParcial = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(NoChegadaParcial);
					Cell4++;

					String Protocolo = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(Protocolo);
					Cell4++;

					String TamanhoPacote = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(TamanhoPacote);
					Cell4++;

					String Flags = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(Flags);
					Cell4++;

					String IdDoFluxo = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(IdDoFluxo);
					Cell4++;

					String NoInicialePortadePartida = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(NoInicialePortadePartida);
					Cell4++;

					String NoDestinoePortadeChegada = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(NoDestinoePortadeChegada);
					Cell4++;

					String NumeroSequencial = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(NumeroSequencial);
					Cell4++;

					String IDPacote = scanner.next();
					cell4 = row4.createCell(Cell4);
					cell4.setCellValue(IDPacote);
					Cell4++;

					Cell4 = 0;
					Row4++;
				}

			}

			scanner.close();
		}
		
		workbook.write(LogExcel);
		workbook.close();
		workbook2.write(LogExcel2);
		workbook2.close();
		workbook3.write(LogExcel3);
		workbook3.close();
		workbook4.write(LogExcel4);
		workbook4.close();
		br.close();
		System.out.println("Log Interpretado e Separado com Sucesso!");
		
	}

}
