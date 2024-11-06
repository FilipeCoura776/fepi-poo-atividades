package br.com.redesocial;

public class TesteRedeSocial {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario(1, "Rodriguin", 30, 5);
		Usuario user2 = new Usuario(2, "Tencarlin", 42, 3);
		Usuario user3 = new Usuario(3, "Valmirin", 35, 1);
		Usuario user4 = new Usuario(4, "Camilin", 28, 5);
		
		user2.ativar();
		user2.desativar();
		user2.desativar();
		user2.ativar();
		
		Grupo grupo1 = new Grupo(1, "Grupo Serio", "O grupo mais serio da parada. Modo serio.");
		Grupo grupo2 = new Grupo(2, "baladinha do rodriguin", "grupo da baladinha do rodriguin dia 6");
		
		System.out.println("");
		
		grupo1.adicionarMembro(user1);
		grupo1.adicionarMembro(user2);
		grupo1.adicionarMembro(user3);
		grupo1.adicionarMembro(user4);
		grupo1.listarMembros();
		
		System.out.println("");
		
		grupo2.adicionarMembro(user1);
		grupo2.adicionarMembro(user3);
		grupo2.adicionarMembro(user4);
		grupo2.adicionarMembro(user2);
		grupo2.listarMembros();
		grupo2.removerMembro(user3);
		grupo2.removerMembro(user2);
		grupo2.listarMembros();
		
	}

}
