package petshop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPetShop extends JFrame {

	private final PetShopRepositorio repositorio = new PetShopRepositorio();

	// ── Campos do formulário ───────────────────────────────
	private final JTextField campNome = new JTextField(10);
	private final JTextField campRaca = new JTextField(10);
	private final JTextField campIdade = new JTextField(10);
	private final JTextField campFaminto = new JTextField(10);
	private final JTextField campDono = new JTextField(10);
	private final JTextField campTelefone = new JTextField(10);

	// ── Área de resultado ──────────────────────────────────
	private final JTextArea areaResultado = new JTextArea(12, 50);

	// ── Botões ─────────────────────────────────────────────
	private final JButton btnCadastrar = new JButton("Cadastrar");
	private final JButton btnBuscar = new JButton("Buscar");
	private final JButton btnAtualizar = new JButton("Atualizar");
	private final JButton btnRemover = new JButton("Remover");
	private final JButton btnListar = new JButton("Listar");

	// ── Construtor ─────────────────────────────────────────
	public TelaPetShop() {
		super("Pet Shop — Gerenciador de Animais");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// O JFrame usa BorderLayout por padrão
		setLayout(new BorderLayout(8, 8));

		add(criarPainelFormulario(), BorderLayout.NORTH);
		add(criarAreaResultado(), BorderLayout.CENTER);
		add(criarPainelBotoes(), BorderLayout.SOUTH);

		configurarListeners();

		setSize(900, 600);
		pack();
		setLocationRelativeTo(null); // centraliza na tela

		setVisible(true);
	}

// ── Painel Norte: formulário ───────────────────────────
	private JPanel criarPainelFormulario() {
		JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 6));
		painel.setBorder(BorderFactory.createTitledBorder("Dados do Pet e Tutor"));

		painel.add(new JLabel("Nome: "));
		painel.add(campNome);
		painel.add(new JLabel("\nRaça: "));
		painel.add(campRaca);
		painel.add(new JLabel("\nIdade: "));
		painel.add(campIdade);
		painel.add(new JLabel("\nFaminto: "));
		painel.add(campFaminto);
		painel.add(new JLabel("\nDono: "));
		painel.add(campDono);
		painel.add(new JLabel("\nTelefone para contato: "));
		painel.add(campTelefone);

		return painel;
	}

	// ── Centro: área de texto com scroll ──────────────────
	private JScrollPane criarAreaResultado() {
		areaResultado.setEditable(false);
		areaResultado.setFont(new Font("Monospaced", Font.PLAIN, 13));
		areaResultado.setBorder(BorderFactory.createEmptyBorder(6, 8, 6, 8));
		exibirTexto("Bem-vindo ao sistema do Pet Shop!\n"
				+ "Preencha os campos acima e use os botões para gerenciar os pets.\n");
		return new JScrollPane(areaResultado);
	}

	// ── Painel Sul: botões ─────────────────────────────────
	private JPanel criarPainelBotoes() {
		JPanel painel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 8));
		painel.add(btnCadastrar);
		painel.add(btnBuscar);
		painel.add(btnAtualizar);
		painel.add(btnRemover);
		painel.add(btnListar);
		return painel;
	}

	// ── ActionListeners ────────────────────────────────────
	private void configurarListeners() {

		// ---- CADASTRAR ----
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				String raca = campRaca.getText().trim();
				String idadeStr = campIdade.getText().trim();
				String famintoStr = campFaminto.getText().trim();
				String dono = campDono.getText().trim();
				String telefone = campTelefone.getText().trim();

				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
					return;
				}
				if (raca.isEmpty())
					raca = "Indefinida";

				int idade = Integer.parseInt(idadeStr);
				boolean faminto = Boolean.parseBoolean(famintoStr);

				Cachorro novo = new Cachorro(nome, idade, faminto, dono, telefone, raca);

				repositorio.adicionar(novo);
				exibirTexto("Pet cadastrado com sucesso!\n\n" + novo.exibirDados());
				limparCampos();
			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				Animal a = repositorio.buscarPorNome(nome);
				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
				}
				if (nome == null) {
					exibirTexto("O animal não foi encontrado!");

				}
				exibirTexto("O animal foi encontrado!\n" + a.exibirDados());

			}
		});

		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				boolean a = repositorio.remover(nome);
				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
				}
				exibirTexto("O animal foi encontrado e removido!");

			}
		});
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}

	// ── Métodos auxiliares ─────────────────────────────────

	/** Exibe texto na área de resultado, substituindo o conteúdo anterior. */
	private void exibirTexto(String texto) {
		areaResultado.setText(texto);
	}

	/** Limpa todos os campos do formulário. */
	private void limparCampos() {
		campNome.setText("");
		campRaca.setText("");
		campIdade.setText("");
		campDono.setText("");
		campFaminto.setText("");
		campTelefone.setText("");
		campNome.requestFocus();
	}

}
