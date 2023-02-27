package Vizualizacao;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Modelo.Aberturas;

public class EntradaSaida {

	public static int solicitaOpcao() {// mstra uma lista, das a��es possiveis dentro do c�digo
		String[] opcoes = { "Construir casa", "Movimentar portas ou janelas", "Ver informa��es da casa",
				"Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado!");

	}

	public static String solicitaDescricao(String descricao, int ordem) {// solicita a descricao da casa ou das portas
																			// ou janelas
		if (ordem == 0) {
			return JOptionPane.showInputDialog("Imforma a descri��o da " + descricao);
		} else {
			return JOptionPane.showInputDialog("Informe a descri��o da " + ordem + " " + descricao);
		}
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informa a cor da casa");
	}

	public static int solicitaQtdeAberturas(String abertura) {
		return Integer.parseInt(JOptionPane.showInputDialog("Informa a quantidade de " + abertura));
	}

	public static int solicitaEstado(String tipoAbertura) {
		String[] opcoes = { "Fechada", "Aberta" };
		return JOptionPane.showOptionDialog(null, "Informa o estado da " + tipoAbertura, "Estado",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);

	}

	public static String solicitaTipoAbertura() {
		String[] opcoes = { "Porta", "Janela" };
		int tipoAbertura = JOptionPane.showOptionDialog(null, "Informa qual tipo de abertura deseja mover",
				"Mover abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		if (tipoAbertura == 0) {
			return "porta";
		} else {
			return "janela";
		}
	}

	public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas) {
		String tipoAbertura = listaDeAberturas.get(0).getClass().getName();	// colocamos todos os tipos de aberturas dentro da variavel
																			
		tipoAbertura = tipoAbertura.replaceAll("modelo.", "");
		int qtdeAbertura = listaDeAberturas.size();// colocamos o tamnho da array dentro da variavel
		String[] descricoesAberturas = new String[qtdeAbertura];//damos como parametro o tanho da lista

		for (int i = 0; i < qtdeAbertura; i++) {
			descricoesAberturas[i] = listaDeAberturas.get(i).getDescricao();//colocamos para dentro da variavel descricaoAberturas, todas as descri�oes das aberturas
		}

		String msg = "Escolha a " + tipoAbertura + " a se movimentar";// String para mostra ao usuario qual abertura ser� movimentada
		JComboBox exibicaoAberturas = new JComboBox(descricoesAberturas);//  
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION); 

		if (confirmacao == 0) {
			return exibicaoAberturas.getSelectedIndex();// retrona qual abertura ser� realizada a mudan�a
		} else {
			return -1;
		}
	}

	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma abertura ser� movimentada");
	}

	public static void exibeInfoCasa(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Inforama��es da casa", JOptionPane.INFORMATION_MESSAGE);
	}

}
